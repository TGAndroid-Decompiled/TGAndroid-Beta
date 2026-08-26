package io.noties.markwon.inlineparser;

import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.commonmark.internal.Bracket;
import org.commonmark.internal.util.Escaping;
import org.commonmark.node.Image;
import org.commonmark.node.Link;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.Node;
import org.commonmark.node.Text;

public final class CloseBracketInlineProcessor extends InlineProcessor {
    public static final Pattern WHITESPACE = MarkwonInlineParser.WHITESPACE;

    @Override
    public final Node parse() {
        String linkDestination;
        String linkTitle;
        boolean z;
        boolean z2;
        Node link;
        Node node;
        Node node2;
        Node node3;
        Bracket bracketLastBracket;
        int i;
        int i2;
        String strSubstring;
        LinkReferenceDefinition linkReferenceDefinition;
        boolean z3 = true;
        int i3 = this.index + 1;
        this.index = i3;
        Bracket bracketLastBracket2 = lastBracket();
        if (bracketLastBracket2 == null) {
            return text("]");
        }
        if (!bracketLastBracket2.allowed) {
            removeLastBracket();
            return text("]");
        }
        if (peek() == '(') {
            this.index++;
            spnl();
            linkDestination = parseLinkDestination();
            if (linkDestination != null) {
                spnl();
                String str = this.input;
                int i4 = this.index;
                if (WHITESPACE.matcher(str.substring(i4 - 1, i4)).matches()) {
                    linkTitle = parseLinkTitle();
                    spnl();
                } else {
                    linkTitle = null;
                }
                if (peek() == ')') {
                    this.index++;
                    z = true;
                } else {
                    this.index = i3;
                }
                if (z) {
                    z3 = z;
                } else {
                    i = this.index;
                    parseLinkLabel();
                    i2 = this.index - i;
                    if (i2 > 2) {
                        strSubstring = this.input.substring(i, i2 + i);
                    } else if (bracketLastBracket2.bracketAfter) {
                        strSubstring = null;
                    } else {
                        strSubstring = this.input.substring(bracketLastBracket2.index, i3);
                    }
                    if (strSubstring != null) {
                        Pattern pattern = Escaping.BACKSLASH_OR_AMP;
                        String strReplaceAll = Escaping.WHITESPACE.matcher(strSubstring.substring(1, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        MarkwonInlineParser markwonInlineParser = (MarkwonInlineParser) this.context;
                        linkReferenceDefinition = markwonInlineParser.referencesEnabled ? (LinkReferenceDefinition) ((Map) markwonInlineParser.inlineParserContext.defaultPublishableKey).get(strReplaceAll) : null;
                        if (linkReferenceDefinition != null) {
                            linkDestination = linkReferenceDefinition.destination;
                            linkTitle = linkReferenceDefinition.title;
                        } else {
                            z3 = z;
                        }
                    } else {
                        z3 = z;
                    }
                }
                if (z3) {
                    this.index = i3;
                    removeLastBracket();
                    return text("]");
                }
                z2 = bracketLastBracket2.image;
                if (z2) {
                    link = new Image(linkDestination, linkTitle);
                } else {
                    link = new Link(linkDestination, linkTitle);
                }
                Text text = bracketLastBracket2.node;
                node = text.next;
                while (node != null) {
                    Node node4 = node.next;
                    link.appendChild(node);
                    node = node4;
                }
                processDelimiters(bracketLastBracket2.previousDelimiter);
                node2 = link.firstChild;
                node3 = link.lastChild;
                if (node2 != node3) {
                    InlineParserUtils.mergeTextNodesInclusive(node2, node3);
                }
                text.unlink();
                removeLastBracket();
                if (!z2) {
                    for (bracketLastBracket = lastBracket(); bracketLastBracket != null; bracketLastBracket = bracketLastBracket.previous) {
                        if (!bracketLastBracket.image) {
                            bracketLastBracket.allowed = false;
                        }
                    }
                }
                return link;
            }
            linkTitle = null;
        } else {
            linkDestination = null;
            linkTitle = null;
        }
        z = false;
        if (z) {
            i = this.index;
            parseLinkLabel();
            i2 = this.index - i;
            if (i2 > 2) {
                strSubstring = this.input.substring(i, i2 + i);
            } else if (bracketLastBracket2.bracketAfter) {
                strSubstring = this.input.substring(bracketLastBracket2.index, i3);
            } else {
                strSubstring = null;
            }
            if (strSubstring != null) {
                Pattern pattern2 = Escaping.BACKSLASH_OR_AMP;
                String strReplaceAll2 = Escaping.WHITESPACE.matcher(strSubstring.substring(1, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                MarkwonInlineParser markwonInlineParser2 = (MarkwonInlineParser) this.context;
                if (markwonInlineParser2.referencesEnabled) {
                }
                if (linkReferenceDefinition != null) {
                    linkDestination = linkReferenceDefinition.destination;
                    linkTitle = linkReferenceDefinition.title;
                } else {
                    z3 = z;
                }
            } else {
                z3 = z;
            }
        } else {
            z3 = z;
        }
        if (z3) {
            this.index = i3;
            removeLastBracket();
            return text("]");
        }
        z2 = bracketLastBracket2.image;
        if (z2) {
            link = new Image(linkDestination, linkTitle);
        } else {
            link = new Link(linkDestination, linkTitle);
        }
        Text text2 = bracketLastBracket2.node;
        node = text2.next;
        while (node != null) {
            Node node5 = node.next;
            link.appendChild(node);
            node = node5;
        }
        processDelimiters(bracketLastBracket2.previousDelimiter);
        node2 = link.firstChild;
        node3 = link.lastChild;
        if (node2 != node3) {
            InlineParserUtils.mergeTextNodesInclusive(node2, node3);
        }
        text2.unlink();
        removeLastBracket();
        if (!z2) {
            while (bracketLastBracket != null) {
                if (!bracketLastBracket.image) {
                    bracketLastBracket.allowed = false;
                }
            }
        }
        return link;
    }

    @Override
    public final char specialCharacter() {
        return ']';
    }
}
