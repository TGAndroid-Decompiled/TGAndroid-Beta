package io.noties.markwon.inlineparser;

import org.commonmark.internal.Bracket;
import org.commonmark.node.Node;
import org.commonmark.node.Text;

public final class BangInlineProcessor extends InlineProcessor {
    public final int $r8$classId;

    @Override
    public final Node parse() {
        switch (this.$r8$classId) {
            case 0:
                int i = this.index + 1;
                this.index = i;
                if (peek() != '[') {
                    return null;
                }
                this.index++;
                Text text = text("![");
                MarkwonInlineParser markwonInlineParser = this.context;
                Bracket bracket = markwonInlineParser.lastBracket;
                Bracket bracket2 = new Bracket(text, i, bracket, markwonInlineParser.lastDelimiter, true);
                if (bracket != null) {
                    bracket.bracketAfter = true;
                }
                markwonInlineParser.lastBracket = bracket2;
                return text;
            default:
                int i2 = this.index;
                this.index = i2 + 1;
                Text text2 = text("[");
                MarkwonInlineParser markwonInlineParser2 = this.context;
                Bracket bracket3 = markwonInlineParser2.lastBracket;
                Bracket bracket4 = new Bracket(text2, i2, bracket3, markwonInlineParser2.lastDelimiter, false);
                if (bracket3 != null) {
                    bracket3.bracketAfter = true;
                }
                markwonInlineParser2.lastBracket = bracket4;
                return text2;
        }
    }

    @Override
    public final char specialCharacter() {
        switch (this.$r8$classId) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
