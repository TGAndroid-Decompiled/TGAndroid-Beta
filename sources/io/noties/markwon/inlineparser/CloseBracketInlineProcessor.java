package io.noties.markwon.inlineparser;

import java.util.regex.Pattern;
import org.commonmark.internal.Bracket;
import org.commonmark.internal.util.Escaping;
import org.commonmark.node.Image;
import org.commonmark.node.Link;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.Node;

public class CloseBracketInlineProcessor extends InlineProcessor {
    private static final Pattern WHITESPACE = MarkwonInlineParser.WHITESPACE;

    @Override
    public char specialCharacter() {
        return ']';
    }

    @Override
    protected Node parse() {
        String destination;
        String title;
        boolean z;
        Node link;
        Node next;
        Bracket bracketLastBracket;
        int i;
        int i2;
        LinkReferenceDefinition linkReferenceDefinition;
        boolean z2 = true;
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
        String strSubstring = null;
        if (peek() == '(') {
            this.index++;
            spnl();
            destination = parseLinkDestination();
            if (destination != null) {
                spnl();
                Pattern pattern = WHITESPACE;
                String str = this.input;
                int i4 = this.index;
                if (pattern.matcher(str.substring(i4 - 1, i4)).matches()) {
                    title = parseLinkTitle();
                    spnl();
                } else {
                    title = null;
                }
                if (peek() == ')') {
                    this.index++;
                    z = true;
                } else {
                    this.index = i3;
                }
                if (z) {
                    z2 = z;
                } else {
                    i = this.index;
                    parseLinkLabel();
                    i2 = this.index - i;
                    if (i2 > 2) {
                        strSubstring = this.input.substring(i, i2 + i);
                    } else if (!bracketLastBracket2.bracketAfter) {
                        strSubstring = this.input.substring(bracketLastBracket2.index, i3);
                    }
                    if (strSubstring != null) {
                        linkReferenceDefinition = this.context.getLinkReferenceDefinition(Escaping.normalizeReference(strSubstring));
                        if (linkReferenceDefinition != null) {
                            destination = linkReferenceDefinition.getDestination();
                            title = linkReferenceDefinition.getTitle();
                        } else {
                            z2 = z;
                        }
                    } else {
                        z2 = z;
                    }
                }
                if (z2) {
                    if (bracketLastBracket2.image) {
                        link = new Image(destination, title);
                    } else {
                        link = new Link(destination, title);
                    }
                    next = bracketLastBracket2.node.getNext();
                    while (next != null) {
                        Node next2 = next.getNext();
                        link.appendChild(next);
                        next = next2;
                    }
                    processDelimiters(bracketLastBracket2.previousDelimiter);
                    InlineParserUtils.mergeChildTextNodes(link);
                    bracketLastBracket2.node.unlink();
                    removeLastBracket();
                    if (!bracketLastBracket2.image) {
                        for (bracketLastBracket = lastBracket(); bracketLastBracket != null; bracketLastBracket = bracketLastBracket.previous) {
                            if (!bracketLastBracket.image) {
                                bracketLastBracket.allowed = false;
                            }
                        }
                    }
                    return link;
                }
                this.index = i3;
                removeLastBracket();
                return text("]");
            }
            title = null;
        } else {
            destination = null;
            title = null;
        }
        z = false;
        if (z) {
            i = this.index;
            parseLinkLabel();
            i2 = this.index - i;
            if (i2 > 2) {
                strSubstring = this.input.substring(i, i2 + i);
            } else if (!bracketLastBracket2.bracketAfter) {
                strSubstring = this.input.substring(bracketLastBracket2.index, i3);
            }
            if (strSubstring != null) {
                linkReferenceDefinition = this.context.getLinkReferenceDefinition(Escaping.normalizeReference(strSubstring));
                if (linkReferenceDefinition != null) {
                    destination = linkReferenceDefinition.getDestination();
                    title = linkReferenceDefinition.getTitle();
                } else {
                    z2 = z;
                }
            } else {
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            if (bracketLastBracket2.image) {
                link = new Image(destination, title);
            } else {
                link = new Link(destination, title);
            }
            next = bracketLastBracket2.node.getNext();
            while (next != null) {
                Node next3 = next.getNext();
                link.appendChild(next);
                next = next3;
            }
            processDelimiters(bracketLastBracket2.previousDelimiter);
            InlineParserUtils.mergeChildTextNodes(link);
            bracketLastBracket2.node.unlink();
            removeLastBracket();
            if (!bracketLastBracket2.image) {
                while (bracketLastBracket != null) {
                    if (!bracketLastBracket.image) {
                        bracketLastBracket.allowed = false;
                    }
                }
            }
            return link;
        }
        this.index = i3;
        removeLastBracket();
        return text("]");
    }
}
