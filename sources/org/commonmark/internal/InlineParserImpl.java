package org.commonmark.internal;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.commonmark.internal.inline.AsteriskDelimiterProcessor;
import org.commonmark.internal.inline.UnderscoreDelimiterProcessor;
import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.Html5Entities;
import org.commonmark.internal.util.LinkScanner;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Code;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.HtmlInline;
import org.commonmark.node.Link;
import org.commonmark.node.Node;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.Text;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.InlineParserContext;
import org.commonmark.parser.delimiter.DelimiterProcessor;

public class InlineParserImpl implements InlineParser {
    private final InlineParserContext context;
    private final BitSet delimiterCharacters;
    private final Map delimiterProcessors;
    private int index;
    private String input;
    private Bracket lastBracket;
    private Delimiter lastDelimiter;
    private final BitSet specialCharacters;
    private static final Pattern PUNCTUATION = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    private static final Pattern HTML_TAG = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    private static final Pattern ESCAPABLE = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    private static final Pattern ENTITY_HERE = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    private static final Pattern TICKS = Pattern.compile("`+");
    private static final Pattern TICKS_HERE = Pattern.compile("^`+");
    private static final Pattern EMAIL_AUTOLINK = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    private static final Pattern AUTOLINK = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    private static final Pattern SPNL = Pattern.compile("^ *(?:\n *)?");
    private static final Pattern UNICODE_WHITESPACE_CHAR = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    private static final Pattern WHITESPACE = Pattern.compile("\\s+");
    private static final Pattern FINAL_SPACE = Pattern.compile(" *$");

    public InlineParserImpl(InlineParserContext inlineParserContext) {
        Map mapCalculateDelimiterProcessors = calculateDelimiterProcessors(inlineParserContext.getCustomDelimiterProcessors());
        this.delimiterProcessors = mapCalculateDelimiterProcessors;
        BitSet bitSetCalculateDelimiterCharacters = calculateDelimiterCharacters(mapCalculateDelimiterProcessors.keySet());
        this.delimiterCharacters = bitSetCalculateDelimiterCharacters;
        this.specialCharacters = calculateSpecialCharacters(bitSetCalculateDelimiterCharacters);
        this.context = inlineParserContext;
    }

    public static BitSet calculateDelimiterCharacters(Set set) {
        BitSet bitSet = new BitSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        return bitSet;
    }

    public static BitSet calculateSpecialCharacters(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        return bitSet2;
    }

    public static Map calculateDelimiterProcessors(List list) {
        HashMap map = new HashMap();
        addDelimiterProcessors(Arrays.asList(new AsteriskDelimiterProcessor(), new UnderscoreDelimiterProcessor()), map);
        addDelimiterProcessors(list, map);
        return map;
    }

    private static void addDelimiterProcessors(Iterable iterable, Map map) {
        StaggeredDelimiterProcessor staggeredDelimiterProcessor;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) it.next();
            char openingCharacter = delimiterProcessor.getOpeningCharacter();
            char closingCharacter = delimiterProcessor.getClosingCharacter();
            if (openingCharacter == closingCharacter) {
                DelimiterProcessor delimiterProcessor2 = (DelimiterProcessor) map.get(Character.valueOf(openingCharacter));
                if (delimiterProcessor2 != null && delimiterProcessor2.getOpeningCharacter() == delimiterProcessor2.getClosingCharacter()) {
                    if (delimiterProcessor2 instanceof StaggeredDelimiterProcessor) {
                        staggeredDelimiterProcessor = (StaggeredDelimiterProcessor) delimiterProcessor2;
                    } else {
                        StaggeredDelimiterProcessor staggeredDelimiterProcessor2 = new StaggeredDelimiterProcessor(openingCharacter);
                        staggeredDelimiterProcessor2.add(delimiterProcessor2);
                        staggeredDelimiterProcessor = staggeredDelimiterProcessor2;
                    }
                    staggeredDelimiterProcessor.add(delimiterProcessor);
                    map.put(Character.valueOf(openingCharacter), staggeredDelimiterProcessor);
                } else {
                    addDelimiterProcessorForChar(openingCharacter, delimiterProcessor, map);
                }
            } else {
                addDelimiterProcessorForChar(openingCharacter, delimiterProcessor, map);
                addDelimiterProcessorForChar(closingCharacter, delimiterProcessor, map);
            }
        }
    }

    private static void addDelimiterProcessorForChar(char c, DelimiterProcessor delimiterProcessor, Map map) {
        if (((DelimiterProcessor) map.put(Character.valueOf(c), delimiterProcessor)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    @Override
    public void parse(String str, Node node) {
        reset(str.trim());
        Node inline = null;
        while (true) {
            inline = parseInline(inline);
            if (inline != null) {
                node.appendChild(inline);
            } else {
                processDelimiters(null);
                mergeChildTextNodes(node);
                return;
            }
        }
    }

    void reset(String str) {
        this.input = str;
        this.index = 0;
        this.lastDelimiter = null;
        this.lastBracket = null;
    }

    private Text text(String str, int i, int i2) {
        return new Text(str.substring(i, i2));
    }

    private Text text(String str) {
        return new Text(str);
    }

    private Node parseInline(Node node) {
        Node newline;
        char cPeek = peek();
        if (cPeek == 0) {
            return null;
        }
        if (cPeek == '\n') {
            newline = parseNewline(node);
        } else if (cPeek == '!') {
            newline = parseBang();
        } else if (cPeek == '&') {
            newline = parseEntity();
        } else if (cPeek == '<') {
            newline = parseAutolink();
            if (newline == null) {
                newline = parseHtmlInline();
            }
        } else if (cPeek == '`') {
            newline = parseBackticks();
        } else {
            switch (cPeek) {
                case '[':
                    newline = parseOpenBracket();
                    break;
                case '\\':
                    newline = parseBackslash();
                    break;
                case ']':
                    newline = parseCloseBracket();
                    break;
                default:
                    if (this.delimiterCharacters.get(cPeek)) {
                        newline = parseDelimiters((DelimiterProcessor) this.delimiterProcessors.get(Character.valueOf(cPeek)), cPeek);
                        break;
                    } else {
                        newline = parseString();
                        break;
                    }
            }
        }
        if (newline != null) {
            return newline;
        }
        this.index++;
        return text(String.valueOf(cPeek));
    }

    private String match(Pattern pattern) {
        if (this.index >= this.input.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.input);
        matcher.region(this.index, this.input.length());
        if (!matcher.find()) {
            return null;
        }
        this.index = matcher.end();
        return matcher.group();
    }

    private char peek() {
        if (this.index < this.input.length()) {
            return this.input.charAt(this.index);
        }
        return (char) 0;
    }

    private void spnl() {
        match(SPNL);
    }

    private Node parseNewline(Node node) {
        this.index++;
        if (node instanceof Text) {
            Text text = (Text) node;
            if (text.getLiteral().endsWith(" ")) {
                String literal = text.getLiteral();
                Matcher matcher = FINAL_SPACE.matcher(literal);
                int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (iEnd > 0) {
                    text.setLiteral(literal.substring(0, literal.length() - iEnd));
                }
                if (iEnd >= 2) {
                    return new HardLineBreak();
                }
                return new SoftLineBreak();
            }
        }
        return new SoftLineBreak();
    }

    private Node parseBackslash() {
        this.index++;
        if (peek() == '\n') {
            HardLineBreak hardLineBreak = new HardLineBreak();
            this.index++;
            return hardLineBreak;
        }
        if (this.index < this.input.length()) {
            Pattern pattern = ESCAPABLE;
            String str = this.input;
            int i = this.index;
            if (pattern.matcher(str.substring(i, i + 1)).matches()) {
                String str2 = this.input;
                int i2 = this.index;
                Text text = text(str2, i2, i2 + 1);
                this.index++;
                return text;
            }
        }
        return text("\\");
    }

    private Node parseBackticks() {
        String strMatch;
        String strMatch2 = match(TICKS_HERE);
        if (strMatch2 == null) {
            return null;
        }
        int i = this.index;
        do {
            strMatch = match(TICKS);
            if (strMatch == null) {
                this.index = i;
                return text(strMatch2);
            }
        } while (!strMatch.equals(strMatch2));
        Code code = new Code();
        String strReplace = this.input.substring(i, this.index - strMatch2.length()).replace('\n', ' ');
        if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && Parsing.hasNonSpace(strReplace)) {
            strReplace = strReplace.substring(1, strReplace.length() - 1);
        }
        code.setLiteral(strReplace);
        return code;
    }

    private Node parseDelimiters(DelimiterProcessor delimiterProcessor, char c) {
        DelimiterData delimiterDataScanDelimiters = scanDelimiters(delimiterProcessor, c);
        if (delimiterDataScanDelimiters == null) {
            return null;
        }
        int i = delimiterDataScanDelimiters.count;
        int i2 = this.index;
        int i3 = i2 + i;
        this.index = i3;
        Text text = text(this.input, i2, i3);
        Delimiter delimiter = new Delimiter(text, c, delimiterDataScanDelimiters.canOpen, delimiterDataScanDelimiters.canClose, this.lastDelimiter);
        this.lastDelimiter = delimiter;
        delimiter.length = i;
        delimiter.originalLength = i;
        Delimiter delimiter2 = delimiter.previous;
        if (delimiter2 != null) {
            delimiter2.next = delimiter;
        }
        return text;
    }

    private Node parseOpenBracket() {
        int i = this.index;
        this.index = i + 1;
        Text text = text("[");
        addBracket(Bracket.link(text, i, this.lastBracket, this.lastDelimiter));
        return text;
    }

    private Node parseBang() {
        int i = this.index;
        this.index = i + 1;
        if (peek() == '[') {
            this.index++;
            Text text = text("![");
            addBracket(Bracket.image(text, i + 1, this.lastBracket, this.lastDelimiter));
            return text;
        }
        return text("!");
    }

    private org.commonmark.node.Node parseCloseBracket() {
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.InlineParserImpl.parseCloseBracket():org.commonmark.node.Node");
    }

    private void addBracket(Bracket bracket) {
        Bracket bracket2 = this.lastBracket;
        if (bracket2 != null) {
            bracket2.bracketAfter = true;
        }
        this.lastBracket = bracket;
    }

    private void removeLastBracket() {
        this.lastBracket = this.lastBracket.previous;
    }

    private String parseLinkDestination() {
        String strSubstring;
        int iScanLinkDestination = LinkScanner.scanLinkDestination(this.input, this.index);
        if (iScanLinkDestination == -1) {
            return null;
        }
        if (peek() == '<') {
            strSubstring = this.input.substring(this.index + 1, iScanLinkDestination - 1);
        } else {
            strSubstring = this.input.substring(this.index, iScanLinkDestination);
        }
        this.index = iScanLinkDestination;
        return Escaping.unescapeString(strSubstring);
    }

    private String parseLinkTitle() {
        int iScanLinkTitle = LinkScanner.scanLinkTitle(this.input, this.index);
        if (iScanLinkTitle == -1) {
            return null;
        }
        String strSubstring = this.input.substring(this.index + 1, iScanLinkTitle - 1);
        this.index = iScanLinkTitle;
        return Escaping.unescapeString(strSubstring);
    }

    int parseLinkLabel() {
        if (this.index < this.input.length() && this.input.charAt(this.index) == '[') {
            int i = this.index + 1;
            int iScanLinkLabelContent = LinkScanner.scanLinkLabelContent(this.input, i);
            int i2 = iScanLinkLabelContent - i;
            if (iScanLinkLabelContent != -1 && i2 <= 999 && iScanLinkLabelContent < this.input.length() && this.input.charAt(iScanLinkLabelContent) == ']') {
                this.index = iScanLinkLabelContent + 1;
                return i2 + 2;
            }
        }
        return 0;
    }

    private Node parseAutolink() {
        String strMatch = match(EMAIL_AUTOLINK);
        if (strMatch != null) {
            String strSubstring = strMatch.substring(1, strMatch.length() - 1);
            Link link = new Link("mailto:" + strSubstring, null);
            link.appendChild(new Text(strSubstring));
            return link;
        }
        String strMatch2 = match(AUTOLINK);
        if (strMatch2 == null) {
            return null;
        }
        String strSubstring2 = strMatch2.substring(1, strMatch2.length() - 1);
        Link link2 = new Link(strSubstring2, null);
        link2.appendChild(new Text(strSubstring2));
        return link2;
    }

    private Node parseHtmlInline() {
        String strMatch = match(HTML_TAG);
        if (strMatch == null) {
            return null;
        }
        HtmlInline htmlInline = new HtmlInline();
        htmlInline.setLiteral(strMatch);
        return htmlInline;
    }

    private Node parseEntity() {
        String strMatch = match(ENTITY_HERE);
        if (strMatch != null) {
            return text(Html5Entities.entityToString(strMatch));
        }
        return null;
    }

    private Node parseString() {
        int i = this.index;
        int length = this.input.length();
        while (true) {
            int i2 = this.index;
            if (i2 == length || this.specialCharacters.get(this.input.charAt(i2))) {
                break;
            }
            this.index++;
        }
        int i3 = this.index;
        if (i != i3) {
            return text(this.input, i, i3);
        }
        return null;
    }

    private DelimiterData scanDelimiters(DelimiterProcessor delimiterProcessor, char c) {
        String strSubstring;
        boolean z;
        int i = this.index;
        boolean z2 = false;
        int i2 = 0;
        while (peek() == c) {
            i2++;
            this.index++;
        }
        if (i2 < delimiterProcessor.getMinLength()) {
            this.index = i;
            return null;
        }
        String strValueOf = "\n";
        if (i == 0) {
            strSubstring = "\n";
        } else {
            strSubstring = this.input.substring(i - 1, i);
        }
        char cPeek = peek();
        if (cPeek != 0) {
            strValueOf = String.valueOf(cPeek);
        }
        Pattern pattern = PUNCTUATION;
        boolean zMatches = pattern.matcher(strSubstring).matches();
        Pattern pattern2 = UNICODE_WHITESPACE_CHAR;
        boolean zMatches2 = pattern2.matcher(strSubstring).matches();
        boolean zMatches3 = pattern.matcher(strValueOf).matches();
        boolean zMatches4 = pattern2.matcher(strValueOf).matches();
        boolean z3 = !zMatches4 && (!zMatches3 || zMatches2 || zMatches);
        boolean z4 = !zMatches2 && (!zMatches || zMatches4 || zMatches3);
        if (c == '_') {
            z = z3 && (!z4 || zMatches);
            if (z4 && (!z3 || zMatches3)) {
                z2 = true;
            }
        } else {
            boolean z5 = z3 && c == delimiterProcessor.getOpeningCharacter();
            if (z4 && c == delimiterProcessor.getClosingCharacter()) {
                z2 = true;
            }
            z = z5;
        }
        this.index = i;
        return new DelimiterData(i2, z, z2);
    }

    private void processDelimiters(Delimiter delimiter) {
        boolean z;
        HashMap map = new HashMap();
        Delimiter delimiter2 = this.lastDelimiter;
        while (delimiter2 != null) {
            Delimiter delimiter3 = delimiter2.previous;
            if (delimiter3 == delimiter) {
                break;
            } else {
                delimiter2 = delimiter3;
            }
        }
        while (delimiter2 != null) {
            char c = delimiter2.delimiterChar;
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) this.delimiterProcessors.get(Character.valueOf(c));
            if (!delimiter2.canClose || delimiterProcessor == null) {
                delimiter2 = delimiter2.next;
            } else {
                char openingCharacter = delimiterProcessor.getOpeningCharacter();
                Delimiter delimiter4 = delimiter2.previous;
                int delimiterUse = 0;
                boolean z2 = false;
                while (delimiter4 != null && delimiter4 != delimiter && delimiter4 != map.get(Character.valueOf(c))) {
                    if (delimiter4.canOpen && delimiter4.delimiterChar == openingCharacter) {
                        delimiterUse = delimiterProcessor.getDelimiterUse(delimiter4, delimiter2);
                        z2 = true;
                        if (delimiterUse > 0) {
                            z = true;
                            break;
                        }
                    }
                    delimiter4 = delimiter4.previous;
                }
                z = z2;
                z2 = false;
                if (!z2) {
                    if (!z) {
                        map.put(Character.valueOf(c), delimiter2.previous);
                        if (!delimiter2.canOpen) {
                            removeDelimiterKeepNode(delimiter2);
                        }
                    }
                    delimiter2 = delimiter2.next;
                } else {
                    Text text = delimiter4.node;
                    Text text2 = delimiter2.node;
                    delimiter4.length -= delimiterUse;
                    delimiter2.length -= delimiterUse;
                    text.setLiteral(text.getLiteral().substring(0, text.getLiteral().length() - delimiterUse));
                    text2.setLiteral(text2.getLiteral().substring(0, text2.getLiteral().length() - delimiterUse));
                    removeDelimitersBetween(delimiter4, delimiter2);
                    mergeTextNodesBetweenExclusive(text, text2);
                    delimiterProcessor.process(text, text2, delimiterUse);
                    if (delimiter4.length == 0) {
                        removeDelimiterAndNode(delimiter4);
                    }
                    if (delimiter2.length == 0) {
                        Delimiter delimiter5 = delimiter2.next;
                        removeDelimiterAndNode(delimiter2);
                        delimiter2 = delimiter5;
                    }
                }
            }
        }
        while (true) {
            Delimiter delimiter6 = this.lastDelimiter;
            if (delimiter6 == null || delimiter6 == delimiter) {
                return;
            } else {
                removeDelimiterKeepNode(delimiter6);
            }
        }
    }

    private void removeDelimitersBetween(Delimiter delimiter, Delimiter delimiter2) {
        Delimiter delimiter3 = delimiter2.previous;
        while (delimiter3 != null && delimiter3 != delimiter) {
            Delimiter delimiter4 = delimiter3.previous;
            removeDelimiterKeepNode(delimiter3);
            delimiter3 = delimiter4;
        }
    }

    private void removeDelimiterAndNode(Delimiter delimiter) {
        delimiter.node.unlink();
        removeDelimiter(delimiter);
    }

    private void removeDelimiterKeepNode(Delimiter delimiter) {
        removeDelimiter(delimiter);
    }

    private void removeDelimiter(Delimiter delimiter) {
        Delimiter delimiter2 = delimiter.previous;
        if (delimiter2 != null) {
            delimiter2.next = delimiter.next;
        }
        Delimiter delimiter3 = delimiter.next;
        if (delimiter3 == null) {
            this.lastDelimiter = delimiter2;
        } else {
            delimiter3.previous = delimiter2;
        }
    }

    private void mergeTextNodesBetweenExclusive(Node node, Node node2) {
        if (node == node2 || node.getNext() == node2) {
            return;
        }
        mergeTextNodesInclusive(node.getNext(), node2.getPrevious());
    }

    private void mergeChildTextNodes(Node node) {
        if (node.getFirstChild() == node.getLastChild()) {
            return;
        }
        mergeTextNodesInclusive(node.getFirstChild(), node.getLastChild());
    }

    private void mergeTextNodesInclusive(Node node, Node node2) {
        Text text = null;
        Text text2 = null;
        int length = 0;
        while (node != null) {
            if (node instanceof Text) {
                text2 = (Text) node;
                if (text == null) {
                    text = text2;
                }
                length += text2.getLiteral().length();
            } else {
                mergeIfNeeded(text, text2, length);
                text = null;
                text2 = null;
                length = 0;
            }
            if (node == node2) {
                break;
            } else {
                node = node.getNext();
            }
        }
        mergeIfNeeded(text, text2, length);
    }

    private void mergeIfNeeded(Text text, Text text2, int i) {
        if (text == null || text2 == null || text == text2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(text.getLiteral());
        Node next = text.getNext();
        Node next2 = text2.getNext();
        while (next != next2) {
            sb.append(((Text) next).getLiteral());
            Node next3 = next.getNext();
            next.unlink();
            next = next3;
        }
        text.setLiteral(sb.toString());
    }

    private static class DelimiterData {
        final boolean canClose;
        final boolean canOpen;
        final int count;

        DelimiterData(int i, boolean z, boolean z2) {
            this.count = i;
            this.canOpen = z;
            this.canClose = z2;
        }
    }
}
