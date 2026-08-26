package io.noties.markwon.inlineparser;

import java.util.regex.Pattern;
import org.commonmark.node.Node;
import org.commonmark.node.Text;

public abstract class InlineProcessor {
    public Node block;
    public MarkwonInlineParser context;
    public int index;
    public String input;

    public final String match(Pattern pattern) {
        MarkwonInlineParser markwonInlineParser = this.context;
        markwonInlineParser.index = this.index;
        String strMatch = markwonInlineParser.match(pattern);
        this.index = this.context.index;
        return strMatch;
    }

    public abstract Node parse();

    public final char peek() {
        MarkwonInlineParser markwonInlineParser = this.context;
        markwonInlineParser.index = this.index;
        return markwonInlineParser.peek();
    }

    public abstract char specialCharacter();

    public final void spnl() {
        MarkwonInlineParser markwonInlineParser = this.context;
        markwonInlineParser.index = this.index;
        markwonInlineParser.match(MarkwonInlineParser.SPNL);
        this.index = this.context.index;
    }

    public final Text text(String str) {
        this.context.getClass();
        return new Text(str);
    }
}
