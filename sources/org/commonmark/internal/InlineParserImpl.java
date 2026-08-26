package org.commonmark.internal;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.zxing.BinaryBitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.commonmark.internal.inline.AsteriskDelimiterProcessor;
import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.Html5Entities;
import org.commonmark.internal.util.LinkScanner;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Code;
import org.commonmark.node.Emphasis;
import org.commonmark.node.Link;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.Node;
import org.commonmark.node.Text;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.delimiter.DelimiterProcessor;

public final class InlineParserImpl implements InlineParser {
    public final BinaryBitmap context;
    public final BitSet delimiterCharacters;
    public final HashMap delimiterProcessors;
    public int index;
    public String input;
    public Bracket lastBracket;
    public Delimiter lastDelimiter;
    public final BitSet specialCharacters;
    public static final Pattern PUNCTUATION = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern HTML_TAG = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern ESCAPABLE = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern ENTITY_HERE = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern TICKS = Pattern.compile("`+");
    public static final Pattern TICKS_HERE = Pattern.compile("^`+");
    public static final Pattern EMAIL_AUTOLINK = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern AUTOLINK = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern SPNL = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern UNICODE_WHITESPACE_CHAR = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern WHITESPACE = Pattern.compile("\\s+");
    public static final Pattern FINAL_SPACE = Pattern.compile(" *$");

    public final class DelimiterData {
        public boolean canClose;
        public boolean canOpen;
        public int count;

        public DelimiterData(int i, boolean z, boolean z2) {
            this.count = i;
            this.canOpen = z;
            this.canClose = z2;
        }

        public DelimiterData(int i) {
            switch (i) {
                case 3:
                    this.count = 0;
                    this.canClose = false;
                    this.canOpen = true;
                    break;
                default:
                    this.count = 100;
                    this.canClose = false;
                    break;
            }
        }
    }

    public InlineParserImpl(BinaryBitmap binaryBitmap) {
        ArrayList arrayList = (ArrayList) binaryBitmap.binarizer;
        HashMap map = new HashMap();
        addDelimiterProcessors(Arrays.asList(new AsteriskDelimiterProcessor(0), new AsteriskDelimiterProcessor(1)), map);
        addDelimiterProcessors(arrayList, map);
        this.delimiterProcessors = map;
        Set setKeySet = map.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.delimiterCharacters = bitSet;
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
        this.specialCharacters = bitSet2;
        this.context = binaryBitmap;
    }

    public static void addDelimiterProcessorForChar(char c, DelimiterProcessor delimiterProcessor, HashMap map) {
        if (((DelimiterProcessor) map.put(Character.valueOf(c), delimiterProcessor)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void addDelimiterProcessors(List list, HashMap map) {
        StaggeredDelimiterProcessor staggeredDelimiterProcessor;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) it.next();
            char openingCharacter = delimiterProcessor.getOpeningCharacter();
            char closingCharacter = delimiterProcessor.getClosingCharacter();
            if (openingCharacter == closingCharacter) {
                DelimiterProcessor delimiterProcessor2 = (DelimiterProcessor) map.get(Character.valueOf(openingCharacter));
                if (delimiterProcessor2 == null || delimiterProcessor2.getOpeningCharacter() != delimiterProcessor2.getClosingCharacter()) {
                    addDelimiterProcessorForChar(openingCharacter, delimiterProcessor, map);
                } else {
                    if (delimiterProcessor2 instanceof StaggeredDelimiterProcessor) {
                        staggeredDelimiterProcessor = (StaggeredDelimiterProcessor) delimiterProcessor2;
                    } else {
                        StaggeredDelimiterProcessor staggeredDelimiterProcessor2 = new StaggeredDelimiterProcessor(openingCharacter);
                        staggeredDelimiterProcessor2.add(delimiterProcessor2);
                        staggeredDelimiterProcessor = staggeredDelimiterProcessor2;
                    }
                    staggeredDelimiterProcessor.add(delimiterProcessor);
                    map.put(Character.valueOf(openingCharacter), staggeredDelimiterProcessor);
                }
            } else {
                addDelimiterProcessorForChar(openingCharacter, delimiterProcessor, map);
                addDelimiterProcessorForChar(closingCharacter, delimiterProcessor, map);
            }
        }
    }

    public static void mergeIfNeeded(Text text, Text text2, int i) {
        if (text == null || text2 == null || text == text2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(text.literal);
        Node node = (Node) text.next;
        Node node2 = (Node) text2.next;
        while (node != node2) {
            sb.append(((Text) node).literal);
            Node node3 = (Node) node.next;
            node.unlink();
            node = node3;
        }
        text.literal = sb.toString();
    }

    public static void mergeTextNodesInclusive(Node node, Node node2) {
        Text text = null;
        Text text2 = null;
        int length = 0;
        while (node != null) {
            if (node instanceof Text) {
                text2 = (Text) node;
                if (text == null) {
                    text = text2;
                }
                length = text2.literal.length() + length;
            } else {
                mergeIfNeeded(text, text2, length);
                text = null;
                text2 = null;
                length = 0;
            }
            if (node == node2) {
                break;
            } else {
                node = (Node) node.next;
            }
        }
        mergeIfNeeded(text, text2, length);
    }

    public final String match$1(Pattern pattern) {
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
    public final void parse(String str, Node node) {
        Emphasis emphasis;
        ?? r11;
        ?? text;
        ?? r6;
        Node text2;
        ?? text3;
        Object text4;
        Link link;
        String strMatch$1;
        ?? text5;
        String strUnescapeString;
        String strUnescapeString2;
        boolean z;
        boolean z2;
        Node node2;
        Node node3;
        Node node4;
        Bracket bracket;
        int i;
        int i2;
        String strSubstring;
        LinkReferenceDefinition linkReferenceDefinition;
        int iScanLinkLabelContent;
        boolean z3;
        boolean z4;
        ?? delimiterData;
        Node node5;
        Node node6;
        int i3 = 1;
        this.input = str.trim();
        this.index = 0;
        Code code = null;
        this.lastDelimiter = null;
        this.lastBracket = null;
        ?? r7 = 0;
        while (true) {
            char cPeek$1 = peek$1();
            if (cPeek$1 == 0) {
                r6 = code;
            } else {
                if (cPeek$1 != '\n') {
                    if (cPeek$1 == '!') {
                        int i4 = this.index + 1;
                        this.index = i4;
                        if (peek$1() == '[') {
                            this.index++;
                            Text text6 = new Text("![");
                            Bracket bracket2 = this.lastBracket;
                            Bracket bracket3 = new Bracket(text6, i4, bracket2, this.lastDelimiter, true);
                            if (bracket2 != null) {
                                bracket2.bracketAfter = true;
                            }
                            this.lastBracket = bracket3;
                            text3 = text6;
                        } else {
                            text2 = new Text("!");
                            text3 = text2;
                        }
                    } else if (cPeek$1 == '&') {
                        String strMatch$2 = match$1(ENTITY_HERE);
                        if (strMatch$2 != null) {
                            text4 = new Text(Html5Entities.entityToString(strMatch$2));
                            text3 = text4;
                        } else {
                            text3 = 0;
                        }
                    } else if (cPeek$1 == '<') {
                        String strMatch$3 = match$1(EMAIL_AUTOLINK);
                        if (strMatch$3 != null) {
                            String strM = SurfaceContainer$$ExternalSyntheticOutline0.m(1, 1, strMatch$3);
                            link = new Link(0, SurfaceContainer$$ExternalSyntheticOutline0.m("mailto:", strM), null);
                            link.appendChild(new Text(strM));
                        } else {
                            String strMatch$4 = match$1(AUTOLINK);
                            if (strMatch$4 != null) {
                                String strM2 = SurfaceContainer$$ExternalSyntheticOutline0.m(1, 1, strMatch$4);
                                link = new Link(0, strM2, null);
                                link.appendChild(new Text(strM2));
                            } else {
                                text3 = 0;
                            }
                            if (text3 == 0) {
                                strMatch$1 = match$1(HTML_TAG);
                                if (strMatch$1 != null) {
                                    Code code2 = new Code(1);
                                    code2.literal = strMatch$1;
                                    text4 = code2;
                                    text3 = text4;
                                } else {
                                    text3 = 0;
                                }
                            }
                        }
                        text3 = link;
                        if (text3 == 0) {
                            strMatch$1 = match$1(HTML_TAG);
                            if (strMatch$1 != null) {
                                Code code3 = new Code(1);
                                code3.literal = strMatch$1;
                                text4 = code3;
                                text3 = text4;
                            } else {
                                text3 = 0;
                            }
                        }
                    } else if (cPeek$1 != '`') {
                        switch (cPeek$1) {
                            case '[':
                                int i5 = this.index;
                                this.index = i5 + 1;
                                Text text7 = new Text("[");
                                Bracket bracket4 = this.lastBracket;
                                Bracket bracket5 = new Bracket(text7, i5, bracket4, this.lastDelimiter, false);
                                if (bracket4 != null) {
                                    bracket4.bracketAfter = true;
                                }
                                this.lastBracket = bracket5;
                                text4 = text7;
                                text3 = text4;
                                break;
                            case '\\':
                                this.index++;
                                if (peek$1() == '\n') {
                                    text2 = new Emphasis(1);
                                    this.index++;
                                } else {
                                    if (this.index < this.input.length()) {
                                        String str2 = this.input;
                                        int i6 = this.index;
                                        if (ESCAPABLE.matcher(str2.substring(i6, i6 + 1)).matches()) {
                                            String str3 = this.input;
                                            int i7 = this.index;
                                            text5 = new Text(str3.substring(i7, i7 + 1));
                                            this.index++;
                                            text3 = text5;
                                        }
                                    }
                                    text2 = new Text("\\");
                                }
                                text3 = text2;
                                break;
                            case ']':
                                int i8 = this.index + i3;
                                this.index = i8;
                                Bracket bracket6 = this.lastBracket;
                                if (bracket6 == null) {
                                    text5 = new Text("]");
                                } else if (bracket6.allowed) {
                                    if (peek$1() == '(') {
                                        this.index += i3;
                                        Pattern pattern = SPNL;
                                        match$1(pattern);
                                        int iScanLinkDestination = LinkScanner.scanLinkDestination(this.index, this.input);
                                        if (iScanLinkDestination == -1) {
                                            strUnescapeString = null;
                                        } else {
                                            String strSubstring2 = peek$1() == '<' ? this.input.substring(this.index + i3, iScanLinkDestination - 1) : this.input.substring(this.index, iScanLinkDestination);
                                            this.index = iScanLinkDestination;
                                            strUnescapeString = Escaping.unescapeString(strSubstring2);
                                        }
                                        if (strUnescapeString != null) {
                                            match$1(pattern);
                                            String str4 = this.input;
                                            int i9 = this.index;
                                            if (WHITESPACE.matcher(str4.substring(i9 - 1, i9)).matches()) {
                                                int iScanLinkTitle = LinkScanner.scanLinkTitle(this.index, this.input);
                                                if (iScanLinkTitle == -1) {
                                                    strUnescapeString2 = null;
                                                } else {
                                                    String strSubstring3 = this.input.substring(this.index + i3, iScanLinkTitle - 1);
                                                    this.index = iScanLinkTitle;
                                                    strUnescapeString2 = Escaping.unescapeString(strSubstring3);
                                                }
                                                match$1(pattern);
                                            } else {
                                                strUnescapeString2 = null;
                                            }
                                            if (peek$1() == ')') {
                                                this.index++;
                                                z = true;
                                            } else {
                                                this.index = i8;
                                                z = false;
                                            }
                                        }
                                        if (!z) {
                                            i = this.index;
                                            if (i < this.input.length() && this.input.charAt(this.index) == '[') {
                                                int i10 = this.index + 1;
                                                iScanLinkLabelContent = LinkScanner.scanLinkLabelContent(i10, this.input);
                                                int i11 = iScanLinkLabelContent - i10;
                                                if (iScanLinkLabelContent != -1 && i11 <= 999 && iScanLinkLabelContent < this.input.length() && this.input.charAt(iScanLinkLabelContent) == ']') {
                                                    this.index = iScanLinkLabelContent + 1;
                                                }
                                            }
                                            i2 = this.index - i;
                                            if (i2 > 2) {
                                                strSubstring = this.input.substring(i, i2 + i);
                                            } else if (bracket6.bracketAfter) {
                                                strSubstring = null;
                                            } else {
                                                strSubstring = this.input.substring(bracket6.index, i8);
                                            }
                                            if (strSubstring != null) {
                                                Pattern pattern2 = Escaping.BACKSLASH_OR_AMP;
                                                linkReferenceDefinition = (LinkReferenceDefinition) ((Map) this.context.matrix).get(Escaping.WHITESPACE.matcher(strSubstring.substring(1, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                if (linkReferenceDefinition != null) {
                                                    strUnescapeString = linkReferenceDefinition.destination;
                                                    strUnescapeString2 = linkReferenceDefinition.title;
                                                    z = true;
                                                }
                                            }
                                        }
                                        if (z) {
                                            this.index = i8;
                                            this.lastBracket = (Bracket) this.lastBracket.previous;
                                            text2 = new Text("]");
                                            text3 = text2;
                                        } else {
                                            z2 = bracket6.image;
                                            if (z2) {
                                                text5 = new Link(1, strUnescapeString, strUnescapeString2);
                                            } else {
                                                text5 = new Link(0, strUnescapeString, strUnescapeString2);
                                            }
                                            Text text8 = (Text) bracket6.node;
                                            node2 = (Node) text8.next;
                                            while (node2 != null) {
                                                Node node7 = (Node) node2.next;
                                                text5.appendChild(node2);
                                                node2 = node7;
                                            }
                                            processDelimiters$1((Delimiter) bracket6.previousDelimiter);
                                            node3 = (Node) text5.firstChild;
                                            node4 = (Node) text5.lastChild;
                                            if (node3 != node4) {
                                                mergeTextNodesInclusive(node3, node4);
                                            }
                                            text8.unlink();
                                            bracket = (Bracket) this.lastBracket.previous;
                                            this.lastBracket = bracket;
                                            if (!z2) {
                                                while (bracket != null) {
                                                    if (!bracket.image) {
                                                        bracket.allowed = false;
                                                    }
                                                    bracket = (Bracket) bracket.previous;
                                                }
                                            }
                                        }
                                    } else {
                                        strUnescapeString = null;
                                    }
                                    strUnescapeString2 = null;
                                    z = false;
                                    if (!z) {
                                        i = this.index;
                                        if (i < this.input.length()) {
                                            int i12 = this.index + 1;
                                            iScanLinkLabelContent = LinkScanner.scanLinkLabelContent(i12, this.input);
                                            int i13 = iScanLinkLabelContent - i12;
                                            if (iScanLinkLabelContent != -1) {
                                                this.index = iScanLinkLabelContent + 1;
                                            }
                                        }
                                        i2 = this.index - i;
                                        if (i2 > 2) {
                                            strSubstring = this.input.substring(i, i2 + i);
                                        } else if (bracket6.bracketAfter) {
                                            strSubstring = this.input.substring(bracket6.index, i8);
                                        } else {
                                            strSubstring = null;
                                        }
                                        if (strSubstring != null) {
                                            Pattern pattern3 = Escaping.BACKSLASH_OR_AMP;
                                            linkReferenceDefinition = (LinkReferenceDefinition) ((Map) this.context.matrix).get(Escaping.WHITESPACE.matcher(strSubstring.substring(1, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                            if (linkReferenceDefinition != null) {
                                                strUnescapeString = linkReferenceDefinition.destination;
                                                strUnescapeString2 = linkReferenceDefinition.title;
                                                z = true;
                                            }
                                        }
                                    }
                                    if (z) {
                                        this.index = i8;
                                        this.lastBracket = (Bracket) this.lastBracket.previous;
                                        text2 = new Text("]");
                                        text3 = text2;
                                    } else {
                                        z2 = bracket6.image;
                                        if (z2) {
                                            text5 = new Link(1, strUnescapeString, strUnescapeString2);
                                        } else {
                                            text5 = new Link(0, strUnescapeString, strUnescapeString2);
                                        }
                                        Text text9 = (Text) bracket6.node;
                                        node2 = (Node) text9.next;
                                        while (node2 != null) {
                                            Node node8 = (Node) node2.next;
                                            text5.appendChild(node2);
                                            node2 = node8;
                                        }
                                        processDelimiters$1((Delimiter) bracket6.previousDelimiter);
                                        node3 = (Node) text5.firstChild;
                                        node4 = (Node) text5.lastChild;
                                        if (node3 != node4) {
                                            mergeTextNodesInclusive(node3, node4);
                                        }
                                        text9.unlink();
                                        bracket = (Bracket) this.lastBracket.previous;
                                        this.lastBracket = bracket;
                                        if (!z2) {
                                            while (bracket != null) {
                                                if (!bracket.image) {
                                                    bracket.allowed = false;
                                                }
                                                bracket = (Bracket) bracket.previous;
                                            }
                                        }
                                    }
                                } else {
                                    this.lastBracket = (Bracket) bracket6.previous;
                                    text5 = new Text("]");
                                }
                                text3 = text5;
                                break;
                            default:
                                if (!this.delimiterCharacters.get(cPeek$1)) {
                                    int i14 = this.index;
                                    int length = this.input.length();
                                    while (true) {
                                        int i15 = this.index;
                                        if (i15 != length && !this.specialCharacters.get(this.input.charAt(i15))) {
                                            this.index += i3;
                                        }
                                    }
                                    int i16 = this.index;
                                    if (i14 == i16) {
                                        text3 = code;
                                    } else {
                                        text3 = new Text(this.input.substring(i14, i16));
                                    }
                                } else {
                                    DelimiterProcessor delimiterProcessor = (DelimiterProcessor) this.delimiterProcessors.get(Character.valueOf(cPeek$1));
                                    int i17 = this.index;
                                    int i18 = 0;
                                    while (peek$1() == cPeek$1) {
                                        i18 += i3;
                                        this.index += i3;
                                    }
                                    if (i18 < delimiterProcessor.getMinLength()) {
                                        this.index = i17;
                                        delimiterData = code;
                                    } else {
                                        String strSubstring4 = i17 == 0 ? "\n" : this.input.substring(i17 - 1, i17);
                                        char cPeek$2 = peek$1();
                                        String strValueOf = cPeek$2 != 0 ? String.valueOf(cPeek$2) : "\n";
                                        Pattern pattern4 = PUNCTUATION;
                                        boolean zMatches = pattern4.matcher(strSubstring4).matches();
                                        Pattern pattern5 = UNICODE_WHITESPACE_CHAR;
                                        boolean zMatches2 = pattern5.matcher(strSubstring4).matches();
                                        boolean zMatches3 = pattern4.matcher(strValueOf).matches();
                                        boolean zMatches4 = pattern5.matcher(strValueOf).matches();
                                        boolean z5 = !zMatches4 && (!zMatches3 || zMatches2 || zMatches);
                                        boolean z6 = !zMatches2 && (!zMatches || zMatches4 || zMatches3);
                                        if (cPeek$1 == '_') {
                                            z4 = z5 && (!z6 || zMatches);
                                            z3 = z6 && (!z5 || zMatches3);
                                        } else {
                                            boolean z7 = z5 && cPeek$1 == delimiterProcessor.getOpeningCharacter();
                                            z3 = z6 && cPeek$1 == delimiterProcessor.getClosingCharacter();
                                            z4 = z7;
                                        }
                                        this.index = i17;
                                        delimiterData = new DelimiterData(i18, z4, z3);
                                    }
                                    if (delimiterData != 0) {
                                        int i19 = this.index;
                                        int i20 = delimiterData.count;
                                        int i21 = i19 + i20;
                                        this.index = i21;
                                        Text text10 = new Text(this.input.substring(i19, i21));
                                        Delimiter delimiter = this.lastDelimiter;
                                        Delimiter delimiter2 = new Delimiter(text10, cPeek$1, delimiterData.canOpen, delimiterData.canClose, delimiter);
                                        this.lastDelimiter = delimiter2;
                                        delimiter2.length = i20;
                                        delimiter2.originalLength = i20;
                                        if (delimiter != null) {
                                            delimiter.next = delimiter2;
                                        }
                                        text3 = text10;
                                    } else {
                                        text3 = code;
                                    }
                                }
                                break;
                        }
                    } else {
                        String strMatch$5 = match$1(TICKS_HERE);
                        if (strMatch$5 == null) {
                            text3 = 0;
                        } else {
                            int i22 = this.index;
                            while (true) {
                                String strMatch$6 = match$1(TICKS);
                                if (strMatch$6 == null) {
                                    this.index = i22;
                                    text4 = new Text(strMatch$5);
                                    text3 = text4;
                                } else if (strMatch$6.equals(strMatch$5)) {
                                    code = new Code(0);
                                    String strReplace = this.input.substring(i22, this.index - strMatch$5.length()).replace('\n', ' ');
                                    if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                                        int length2 = strReplace.length();
                                        if (Parsing.skip(' ', strReplace, 0, length2) != length2) {
                                            strReplace = SurfaceContainer$$ExternalSyntheticOutline0.m(1, 1, strReplace);
                                        }
                                    }
                                    code.literal = strReplace;
                                    text3 = code;
                                }
                            }
                        }
                    }
                    r11 = text3;
                } else {
                    this.index++;
                    if (r7 instanceof Text) {
                        Text text11 = (Text) r7;
                        if (text11.literal.endsWith(" ")) {
                            String str5 = text11.literal;
                            Matcher matcher = FINAL_SPACE.matcher(str5);
                            int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                            if (iEnd > 0) {
                                text11.literal = SurfaceContainer$$ExternalSyntheticOutline0.m(iEnd, 0, str5);
                            }
                            emphasis = iEnd >= 2 ? new Emphasis(1) : new Emphasis(2);
                        } else {
                            emphasis = new Emphasis(2);
                        }
                    } else {
                        emphasis = new Emphasis(2);
                    }
                    r11 = emphasis;
                }
                if (r11 != 0) {
                    r6 = r11;
                } else {
                    this.index++;
                    text = new Text(String.valueOf(cPeek$1));
                }
                if (text != 0) {
                    processDelimiters$1(null);
                    node5 = (Node) node.firstChild;
                    node6 = (Node) node.lastChild;
                    if (node5 == node6) {
                        return;
                    }
                    mergeTextNodesInclusive(node5, node6);
                    return;
                }
                node.appendChild(text);
                i3 = 1;
                code = null;
                r7 = text;
            }
            text = r6;
            if (text != 0) {
                processDelimiters$1(null);
                node5 = (Node) node.firstChild;
                node6 = (Node) node.lastChild;
                if (node5 == node6) {
                    return;
                }
                mergeTextNodesInclusive(node5, node6);
                return;
            }
            node.appendChild(text);
            i3 = 1;
            code = null;
            r7 = text;
        }
    }

    public final char peek$1() {
        if (this.index < this.input.length()) {
            return this.input.charAt(this.index);
        }
        return (char) 0;
    }

    public final void processDelimiters$1(Delimiter delimiter) {
        boolean z;
        Node node;
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
            HashMap map2 = this.delimiterProcessors;
            char c = delimiter2.delimiterChar;
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) map2.get(Character.valueOf(c));
            if (!delimiter2.canClose || delimiterProcessor == null) {
                delimiter2 = delimiter2.next;
            } else {
                char openingCharacter = delimiterProcessor.getOpeningCharacter();
                Delimiter delimiter4 = delimiter2.previous;
                int delimiterUse = 0;
                boolean z2 = false;
                while (true) {
                    if (delimiter4 == null || delimiter4 == delimiter || delimiter4 == map.get(Character.valueOf(c))) {
                        z = z2;
                        z2 = false;
                        break;
                    }
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
                if (z2) {
                    Text text = delimiter4.node;
                    delimiter4.length -= delimiterUse;
                    delimiter2.length -= delimiterUse;
                    text.literal = SurfaceContainer$$ExternalSyntheticOutline0.m(delimiterUse, 0, text.literal);
                    Text text2 = delimiter2.node;
                    text2.literal = SurfaceContainer$$ExternalSyntheticOutline0.m(delimiterUse, 0, text2.literal);
                    Delimiter delimiter5 = delimiter2.previous;
                    while (delimiter5 != null && delimiter5 != delimiter4) {
                        Delimiter delimiter6 = delimiter5.previous;
                        removeDelimiter$1(delimiter5);
                        delimiter5 = delimiter6;
                    }
                    if (text != text2 && (node = (Node) text.next) != text2) {
                        mergeTextNodesInclusive(node, (Node) text2.prev);
                    }
                    delimiterProcessor.process(text, text2, delimiterUse);
                    if (delimiter4.length == 0) {
                        delimiter4.node.unlink();
                        removeDelimiter$1(delimiter4);
                    }
                    if (delimiter2.length == 0) {
                        Delimiter delimiter7 = delimiter2.next;
                        text2.unlink();
                        removeDelimiter$1(delimiter2);
                        delimiter2 = delimiter7;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c), delimiter2.previous);
                        if (!delimiter2.canOpen) {
                            removeDelimiter$1(delimiter2);
                        }
                    }
                    delimiter2 = delimiter2.next;
                }
            }
        }
        while (true) {
            Delimiter delimiter8 = this.lastDelimiter;
            if (delimiter8 == null || delimiter8 == delimiter) {
                return;
            } else {
                removeDelimiter$1(delimiter8);
            }
        }
    }

    public final void removeDelimiter$1(Delimiter delimiter) {
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
}
