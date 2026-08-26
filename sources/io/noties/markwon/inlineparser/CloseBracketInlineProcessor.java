package io.noties.markwon.inlineparser;

import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.commonmark.internal.Bracket;
import org.commonmark.internal.Delimiter;
import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.LinkScanner;
import org.commonmark.node.Link;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.Node;
import org.commonmark.node.Text;

public final class CloseBracketInlineProcessor extends InlineProcessor {
    public static final Pattern WHITESPACE = MarkwonInlineParser.WHITESPACE;

    @Override
    public final Node parse() {
        String strUnescapeString;
        String strUnescapeString2;
        boolean z;
        boolean z2;
        Link link;
        Node node;
        Node node2;
        Node node3;
        Bracket bracket;
        int i;
        MarkwonInlineParser markwonInlineParser;
        int i2;
        LinkReferenceDefinition linkReferenceDefinition;
        int iScanLinkLabelContent;
        int i3 = this.index + 1;
        this.index = i3;
        MarkwonInlineParser markwonInlineParser2 = this.context;
        Bracket bracket2 = markwonInlineParser2.lastBracket;
        if (bracket2 == null) {
            return text("]");
        }
        if (!bracket2.allowed) {
            markwonInlineParser2.lastBracket = (Bracket) bracket2.previous;
            return text("]");
        }
        String strSubstring = null;
        if (peek() == '(') {
            this.index++;
            spnl();
            MarkwonInlineParser markwonInlineParser3 = this.context;
            int i4 = this.index;
            markwonInlineParser3.index = i4;
            int iScanLinkDestination = LinkScanner.scanLinkDestination(i4, markwonInlineParser3.input);
            if (iScanLinkDestination == -1) {
                strUnescapeString = null;
            } else {
                String strSubstring2 = markwonInlineParser3.peek() == '<' ? markwonInlineParser3.input.substring(markwonInlineParser3.index + 1, iScanLinkDestination - 1) : markwonInlineParser3.input.substring(markwonInlineParser3.index, iScanLinkDestination);
                markwonInlineParser3.index = iScanLinkDestination;
                strUnescapeString = Escaping.unescapeString(strSubstring2);
            }
            this.index = this.context.index;
            if (strUnescapeString != null) {
                spnl();
                String str = this.input;
                int i5 = this.index;
                if (WHITESPACE.matcher(str.substring(i5 - 1, i5)).matches()) {
                    MarkwonInlineParser markwonInlineParser4 = this.context;
                    int i6 = this.index;
                    markwonInlineParser4.index = i6;
                    int iScanLinkTitle = LinkScanner.scanLinkTitle(i6, markwonInlineParser4.input);
                    if (iScanLinkTitle == -1) {
                        strUnescapeString2 = null;
                    } else {
                        String strSubstring3 = markwonInlineParser4.input.substring(markwonInlineParser4.index + 1, iScanLinkTitle - 1);
                        markwonInlineParser4.index = iScanLinkTitle;
                        strUnescapeString2 = Escaping.unescapeString(strSubstring3);
                    }
                    this.index = this.context.index;
                    spnl();
                } else {
                    strUnescapeString2 = null;
                }
                if (peek() == ')') {
                    this.index++;
                    z = true;
                } else {
                    this.index = i3;
                }
                if (!z) {
                    i = this.index;
                    markwonInlineParser = this.context;
                    markwonInlineParser.index = i;
                    if (i < markwonInlineParser.input.length() && markwonInlineParser.input.charAt(markwonInlineParser.index) == '[') {
                        int i7 = markwonInlineParser.index + 1;
                        iScanLinkLabelContent = LinkScanner.scanLinkLabelContent(i7, markwonInlineParser.input);
                        int i8 = iScanLinkLabelContent - i7;
                        if (iScanLinkLabelContent != -1 && i8 <= 999 && iScanLinkLabelContent < markwonInlineParser.input.length() && markwonInlineParser.input.charAt(iScanLinkLabelContent) == ']') {
                            markwonInlineParser.index = iScanLinkLabelContent + 1;
                        }
                    }
                    int i9 = this.context.index;
                    this.index = i9;
                    i2 = i9 - i;
                    if (i2 > 2) {
                        strSubstring = this.input.substring(i, i2 + i);
                    } else if (!bracket2.bracketAfter) {
                        strSubstring = this.input.substring(bracket2.index, i3);
                    }
                    if (strSubstring != null) {
                        Pattern pattern = Escaping.BACKSLASH_OR_AMP;
                        String strReplaceAll = Escaping.WHITESPACE.matcher(strSubstring.substring(1, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        MarkwonInlineParser markwonInlineParser5 = this.context;
                        markwonInlineParser5.getClass();
                        linkReferenceDefinition = (LinkReferenceDefinition) ((Map) markwonInlineParser5.inlineParserContext.matrix).get(strReplaceAll);
                        if (linkReferenceDefinition != null) {
                            strUnescapeString = linkReferenceDefinition.destination;
                            strUnescapeString2 = linkReferenceDefinition.title;
                            z = true;
                        }
                    }
                }
                if (z) {
                    this.index = i3;
                    MarkwonInlineParser markwonInlineParser6 = this.context;
                    markwonInlineParser6.lastBracket = (Bracket) markwonInlineParser6.lastBracket.previous;
                    return text("]");
                }
                z2 = bracket2.image;
                if (z2) {
                    link = new Link(1, strUnescapeString, strUnescapeString2);
                } else {
                    link = new Link(0, strUnescapeString, strUnescapeString2);
                }
                Text text = (Text) bracket2.node;
                node = (Node) text.next;
                while (node != null) {
                    Node node4 = (Node) node.next;
                    link.appendChild(node);
                    node = node4;
                }
                MarkwonInlineParser markwonInlineParser7 = this.context;
                markwonInlineParser7.index = this.index;
                markwonInlineParser7.processDelimiters((Delimiter) bracket2.previousDelimiter);
                this.index = this.context.index;
                node2 = (Node) link.firstChild;
                node3 = (Node) link.lastChild;
                if (node2 != node3) {
                    InlineParserUtils.mergeTextNodesInclusive(node2, node3);
                }
                text.unlink();
                MarkwonInlineParser markwonInlineParser8 = this.context;
                bracket = (Bracket) markwonInlineParser8.lastBracket.previous;
                markwonInlineParser8.lastBracket = bracket;
                if (!z2) {
                    while (bracket != null) {
                        if (!bracket.image) {
                            bracket.allowed = false;
                        }
                        bracket = (Bracket) bracket.previous;
                    }
                }
                return link;
            }
            strUnescapeString2 = null;
        } else {
            strUnescapeString = null;
            strUnescapeString2 = null;
        }
        z = false;
        if (!z) {
            i = this.index;
            markwonInlineParser = this.context;
            markwonInlineParser.index = i;
            if (i < markwonInlineParser.input.length()) {
                int i10 = markwonInlineParser.index + 1;
                iScanLinkLabelContent = LinkScanner.scanLinkLabelContent(i10, markwonInlineParser.input);
                int i11 = iScanLinkLabelContent - i10;
                if (iScanLinkLabelContent != -1) {
                    markwonInlineParser.index = iScanLinkLabelContent + 1;
                }
            }
            int i12 = this.context.index;
            this.index = i12;
            i2 = i12 - i;
            if (i2 > 2) {
                strSubstring = this.input.substring(i, i2 + i);
            } else if (!bracket2.bracketAfter) {
                strSubstring = this.input.substring(bracket2.index, i3);
            }
            if (strSubstring != null) {
                Pattern pattern2 = Escaping.BACKSLASH_OR_AMP;
                String strReplaceAll2 = Escaping.WHITESPACE.matcher(strSubstring.substring(1, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                MarkwonInlineParser markwonInlineParser9 = this.context;
                markwonInlineParser9.getClass();
                linkReferenceDefinition = (LinkReferenceDefinition) ((Map) markwonInlineParser9.inlineParserContext.matrix).get(strReplaceAll2);
                if (linkReferenceDefinition != null) {
                    strUnescapeString = linkReferenceDefinition.destination;
                    strUnescapeString2 = linkReferenceDefinition.title;
                    z = true;
                }
            }
        }
        if (z) {
            this.index = i3;
            MarkwonInlineParser markwonInlineParser10 = this.context;
            markwonInlineParser10.lastBracket = (Bracket) markwonInlineParser10.lastBracket.previous;
            return text("]");
        }
        z2 = bracket2.image;
        if (z2) {
            link = new Link(1, strUnescapeString, strUnescapeString2);
        } else {
            link = new Link(0, strUnescapeString, strUnescapeString2);
        }
        Text text2 = (Text) bracket2.node;
        node = (Node) text2.next;
        while (node != null) {
            Node node5 = (Node) node.next;
            link.appendChild(node);
            node = node5;
        }
        MarkwonInlineParser markwonInlineParser11 = this.context;
        markwonInlineParser11.index = this.index;
        markwonInlineParser11.processDelimiters((Delimiter) bracket2.previousDelimiter);
        this.index = this.context.index;
        node2 = (Node) link.firstChild;
        node3 = (Node) link.lastChild;
        if (node2 != node3) {
            InlineParserUtils.mergeTextNodesInclusive(node2, node3);
        }
        text2.unlink();
        MarkwonInlineParser markwonInlineParser12 = this.context;
        bracket = (Bracket) markwonInlineParser12.lastBracket.previous;
        markwonInlineParser12.lastBracket = bracket;
        if (!z2) {
            while (bracket != null) {
                if (!bracket.image) {
                    bracket.allowed = false;
                }
                bracket = (Bracket) bracket.previous;
            }
        }
        return link;
    }

    @Override
    public final char specialCharacter() {
        return ']';
    }
}
