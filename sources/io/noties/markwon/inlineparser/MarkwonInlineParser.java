package io.noties.markwon.inlineparser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.commonmark.internal.Bracket;
import org.commonmark.internal.Delimiter;
import org.commonmark.internal.inline.AsteriskDelimiterProcessor;
import org.commonmark.internal.inline.UnderscoreDelimiterProcessor;
import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.LinkScanner;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.Node;
import org.commonmark.node.Text;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.InlineParserContext;
import org.commonmark.parser.InlineParserFactory;
import org.commonmark.parser.delimiter.DelimiterProcessor;

public class MarkwonInlineParser implements InlineParser, MarkwonInlineParserContext {
    private Node block;
    private final Map delimiterProcessors;
    private int index;
    private final InlineParserContext inlineParserContext;
    private final Map inlineProcessors;
    private String input;
    private Bracket lastBracket;
    private Delimiter lastDelimiter;
    private final boolean referencesEnabled;
    private final BitSet specialCharacters;
    private static final Pattern PUNCTUATION = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    private static final Pattern SPNL = Pattern.compile("^ *(?:\n *)?");
    private static final Pattern UNICODE_WHITESPACE_CHAR = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    static final Pattern ESCAPABLE = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    static final Pattern WHITESPACE = Pattern.compile("\\s+");

    public interface FactoryBuilder {
        FactoryBuilder addInlineProcessor(InlineProcessor inlineProcessor);

        InlineParserFactory build();
    }

    public static FactoryBuilder factoryBuilder() {
        return new FactoryBuilderImpl().includeDefaults();
    }

    public MarkwonInlineParser(InlineParserContext inlineParserContext, boolean z, List list, List list2) {
        this.inlineParserContext = inlineParserContext;
        this.referencesEnabled = z;
        Map mapCalculateInlines = calculateInlines(list);
        this.inlineProcessors = mapCalculateInlines;
        Map mapCalculateDelimiterProcessors = calculateDelimiterProcessors(list2);
        this.delimiterProcessors = mapCalculateDelimiterProcessors;
        this.specialCharacters = calculateSpecialCharacters(mapCalculateInlines.keySet(), mapCalculateDelimiterProcessors.keySet());
    }

    private static Map calculateInlines(List list) {
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InlineProcessor inlineProcessor = (InlineProcessor) it.next();
            char cSpecialCharacter = inlineProcessor.specialCharacter();
            List arrayList = (List) map.get(Character.valueOf(cSpecialCharacter));
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(Character.valueOf(cSpecialCharacter), arrayList);
            }
            arrayList.add(inlineProcessor);
        }
        return map;
    }

    private static BitSet calculateSpecialCharacters(Set set, Set set2) {
        BitSet bitSet = new BitSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            bitSet.set(((Character) it2.next()).charValue());
        }
        return bitSet;
    }

    private static Map calculateDelimiterProcessors(List list) {
        HashMap map = new HashMap();
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
        this.block = node;
        while (true) {
            Node inline = parseInline();
            if (inline != null) {
                node.appendChild(inline);
            } else {
                processDelimiters(null);
                InlineParserUtils.mergeChildTextNodes(node);
                return;
            }
        }
    }

    private void reset(String str) {
        this.input = str;
        this.index = 0;
        this.lastDelimiter = null;
        this.lastBracket = null;
    }

    private Node parseInline() {
        char cPeek = peek();
        Node string = null;
        if (cPeek == 0) {
            return null;
        }
        List list = (List) this.inlineProcessors.get(Character.valueOf(cPeek));
        if (list != null) {
            int i = this.index;
            Iterator it = list.iterator();
            while (it.hasNext() && (string = ((InlineProcessor) it.next()).parse(this)) == null) {
                this.index = i;
            }
        } else {
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) this.delimiterProcessors.get(Character.valueOf(cPeek));
            if (delimiterProcessor != null) {
                string = parseDelimiters(delimiterProcessor, cPeek);
            } else {
                string = parseString();
            }
        }
        if (string != null) {
            return string;
        }
        this.index++;
        return text(String.valueOf(cPeek));
    }

    @Override
    public String match(Pattern pattern) {
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

    @Override
    public Text text(String str) {
        return new Text(str);
    }

    @Override
    public Text text(String str, int i, int i2) {
        return new Text(str.substring(i, i2));
    }

    @Override
    public LinkReferenceDefinition getLinkReferenceDefinition(String str) {
        if (this.referencesEnabled) {
            return this.inlineParserContext.getLinkReferenceDefinition(str);
        }
        return null;
    }

    @Override
    public char peek() {
        if (this.index < this.input.length()) {
            return this.input.charAt(this.index);
        }
        return (char) 0;
    }

    @Override
    public Node block() {
        return this.block;
    }

    @Override
    public String input() {
        return this.input;
    }

    @Override
    public int index() {
        return this.index;
    }

    @Override
    public void setIndex(int i) {
        this.index = i;
    }

    @Override
    public Bracket lastBracket() {
        return this.lastBracket;
    }

    @Override
    public Delimiter lastDelimiter() {
        return this.lastDelimiter;
    }

    @Override
    public void addBracket(Bracket bracket) {
        Bracket bracket2 = this.lastBracket;
        if (bracket2 != null) {
            bracket2.bracketAfter = true;
        }
        this.lastBracket = bracket;
    }

    @Override
    public void removeLastBracket() {
        this.lastBracket = this.lastBracket.previous;
    }

    @Override
    public void spnl() {
        match(SPNL);
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

    @Override
    public String parseLinkDestination() {
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

    @Override
    public String parseLinkTitle() {
        int iScanLinkTitle = LinkScanner.scanLinkTitle(this.input, this.index);
        if (iScanLinkTitle == -1) {
            return null;
        }
        String strSubstring = this.input.substring(this.index + 1, iScanLinkTitle - 1);
        this.index = iScanLinkTitle;
        return Escaping.unescapeString(strSubstring);
    }

    @Override
    public int parseLinkLabel() {
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

    @Override
    public void processDelimiters(Delimiter delimiter) {
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
                    InlineParserUtils.mergeTextNodesBetweenExclusive(text, text2);
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

    static class FactoryBuilderImpl implements FactoryBuilder {
        private boolean referencesEnabled;
        private final List inlineProcessors = new ArrayList(3);
        private final List delimiterProcessors = new ArrayList(3);

        FactoryBuilderImpl() {
        }

        @Override
        public FactoryBuilder addInlineProcessor(InlineProcessor inlineProcessor) {
            this.inlineProcessors.add(inlineProcessor);
            return this;
        }

        public FactoryBuilder includeDefaults() {
            this.referencesEnabled = true;
            this.inlineProcessors.addAll(Arrays.asList(new AutolinkInlineProcessor(), new BackslashInlineProcessor(), new BackticksInlineProcessor(), new BangInlineProcessor(), new CloseBracketInlineProcessor(), new EntityInlineProcessor(), new HtmlInlineProcessor(), new NewLineInlineProcessor(), new OpenBracketInlineProcessor()));
            this.delimiterProcessors.addAll(Arrays.asList(new AsteriskDelimiterProcessor(), new UnderscoreDelimiterProcessor()));
            return this;
        }

        @Override
        public InlineParserFactory build() {
            return new InlineParserFactoryImpl(this.referencesEnabled, this.inlineProcessors, this.delimiterProcessors);
        }
    }

    static class InlineParserFactoryImpl implements InlineParserFactory {
        private final List delimiterProcessors;
        private final List inlineProcessors;
        private final boolean referencesEnabled;

        InlineParserFactoryImpl(boolean z, List list, List list2) {
            this.referencesEnabled = z;
            this.inlineProcessors = list;
            this.delimiterProcessors = list2;
        }

        @Override
        public InlineParser create(InlineParserContext inlineParserContext) {
            List arrayList;
            List customDelimiterProcessors = inlineParserContext.getCustomDelimiterProcessors();
            int size = customDelimiterProcessors != null ? customDelimiterProcessors.size() : 0;
            if (size > 0) {
                arrayList = new ArrayList(size + this.delimiterProcessors.size());
                arrayList.addAll(this.delimiterProcessors);
                arrayList.addAll(customDelimiterProcessors);
            } else {
                arrayList = this.delimiterProcessors;
            }
            return new MarkwonInlineParser(inlineParserContext, this.referencesEnabled, this.inlineProcessors, arrayList);
        }
    }
}
