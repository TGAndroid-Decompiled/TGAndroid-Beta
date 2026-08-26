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
                addBracket(new Bracket(text, i, lastBracket(), lastDelimiter(), true));
                return text;
            default:
                int i2 = this.index;
                this.index = i2 + 1;
                Text text2 = text("[");
                addBracket(new Bracket(text2, i2, lastBracket(), lastDelimiter(), false));
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
