package io.noties.markwon.inlineparser;

import java.util.regex.Pattern;
import org.commonmark.internal.Bracket;
import org.commonmark.internal.Delimiter;
import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.LinkScanner;
import org.commonmark.node.Node;
import org.commonmark.node.Text;

public abstract class InlineProcessor {
    protected Node block;
    protected MarkwonInlineParserContext context;
    protected int index;
    protected String input;

    public void addBracket(Bracket bracket) {
        MarkwonInlineParser markwonInlineParser = (MarkwonInlineParser) this.context;
        Bracket bracket2 = markwonInlineParser.lastBracket;
        if (bracket2 != null) {
            bracket2.bracketAfter = true;
        }
        markwonInlineParser.lastBracket = bracket;
    }

    public Bracket lastBracket() {
        return ((MarkwonInlineParser) this.context).lastBracket;
    }

    public Delimiter lastDelimiter() {
        return ((MarkwonInlineParser) this.context).lastDelimiter;
    }

    public String match(Pattern pattern) {
        MarkwonInlineParserContext markwonInlineParserContext = this.context;
        ((MarkwonInlineParser) markwonInlineParserContext).index = this.index;
        String strMatch = ((MarkwonInlineParser) markwonInlineParserContext).match(pattern);
        this.index = ((MarkwonInlineParser) this.context).index;
        return strMatch;
    }

    public abstract Node parse();

    public Node parse(MarkwonInlineParserContext markwonInlineParserContext) {
        this.context = markwonInlineParserContext;
        MarkwonInlineParser markwonInlineParser = (MarkwonInlineParser) markwonInlineParserContext;
        this.block = markwonInlineParser.block;
        this.input = markwonInlineParser.input;
        this.index = markwonInlineParser.index;
        Node node = parse();
        markwonInlineParser.index = this.index;
        return node;
    }

    public String parseLinkDestination() {
        String strUnescapeString;
        MarkwonInlineParserContext markwonInlineParserContext = this.context;
        ((MarkwonInlineParser) markwonInlineParserContext).index = this.index;
        MarkwonInlineParser markwonInlineParser = (MarkwonInlineParser) markwonInlineParserContext;
        int iScanLinkDestination = LinkScanner.scanLinkDestination(markwonInlineParser.index, markwonInlineParser.input);
        if (iScanLinkDestination == -1) {
            strUnescapeString = null;
        } else {
            String strSubstring = markwonInlineParser.peek() == '<' ? markwonInlineParser.input.substring(markwonInlineParser.index + 1, iScanLinkDestination - 1) : markwonInlineParser.input.substring(markwonInlineParser.index, iScanLinkDestination);
            markwonInlineParser.index = iScanLinkDestination;
            strUnescapeString = Escaping.unescapeString(strSubstring);
        }
        this.index = ((MarkwonInlineParser) this.context).index;
        return strUnescapeString;
    }

    public int parseLinkLabel() {
        MarkwonInlineParserContext markwonInlineParserContext = this.context;
        ((MarkwonInlineParser) markwonInlineParserContext).index = this.index;
        MarkwonInlineParser markwonInlineParser = (MarkwonInlineParser) markwonInlineParserContext;
        int i = 0;
        if (markwonInlineParser.index < markwonInlineParser.input.length() && markwonInlineParser.input.charAt(markwonInlineParser.index) == '[') {
            int i2 = markwonInlineParser.index + 1;
            int iScanLinkLabelContent = LinkScanner.scanLinkLabelContent(i2, markwonInlineParser.input);
            int i3 = iScanLinkLabelContent - i2;
            if (iScanLinkLabelContent != -1 && i3 <= 999 && iScanLinkLabelContent < markwonInlineParser.input.length() && markwonInlineParser.input.charAt(iScanLinkLabelContent) == ']') {
                markwonInlineParser.index = iScanLinkLabelContent + 1;
                i = i3 + 2;
            }
        }
        this.index = ((MarkwonInlineParser) this.context).index;
        return i;
    }

    public String parseLinkTitle() {
        String strUnescapeString;
        MarkwonInlineParserContext markwonInlineParserContext = this.context;
        ((MarkwonInlineParser) markwonInlineParserContext).index = this.index;
        MarkwonInlineParser markwonInlineParser = (MarkwonInlineParser) markwonInlineParserContext;
        int iScanLinkTitle = LinkScanner.scanLinkTitle(markwonInlineParser.index, markwonInlineParser.input);
        if (iScanLinkTitle == -1) {
            strUnescapeString = null;
        } else {
            String strSubstring = markwonInlineParser.input.substring(markwonInlineParser.index + 1, iScanLinkTitle - 1);
            markwonInlineParser.index = iScanLinkTitle;
            strUnescapeString = Escaping.unescapeString(strSubstring);
        }
        this.index = ((MarkwonInlineParser) this.context).index;
        return strUnescapeString;
    }

    public char peek() {
        MarkwonInlineParserContext markwonInlineParserContext = this.context;
        ((MarkwonInlineParser) markwonInlineParserContext).index = this.index;
        return ((MarkwonInlineParser) markwonInlineParserContext).peek();
    }

    public void processDelimiters(Delimiter delimiter) {
        MarkwonInlineParserContext markwonInlineParserContext = this.context;
        ((MarkwonInlineParser) markwonInlineParserContext).index = this.index;
        ((MarkwonInlineParser) markwonInlineParserContext).processDelimiters(delimiter);
        this.index = ((MarkwonInlineParser) this.context).index;
    }

    public void removeLastBracket() {
        MarkwonInlineParser markwonInlineParser = (MarkwonInlineParser) this.context;
        markwonInlineParser.lastBracket = markwonInlineParser.lastBracket.previous;
    }

    public abstract char specialCharacter();

    public void spnl() {
        MarkwonInlineParserContext markwonInlineParserContext = this.context;
        ((MarkwonInlineParser) markwonInlineParserContext).index = this.index;
        ((MarkwonInlineParser) markwonInlineParserContext).match(MarkwonInlineParser.SPNL);
        this.index = ((MarkwonInlineParser) this.context).index;
    }

    public Text text(String str) {
        ((MarkwonInlineParser) this.context).getClass();
        return new Text(str);
    }

    public Text text(String str, int i, int i2) {
        ((MarkwonInlineParser) this.context).getClass();
        return new Text(str.substring(i, i2));
    }
}
