package io.noties.markwon.inlineparser;

import org.commonmark.internal.Bracket;
import org.commonmark.node.Node;
import org.commonmark.node.Text;

public class BangInlineProcessor extends InlineProcessor {
    @Override
    public char specialCharacter() {
        return '!';
    }

    @Override
    protected Node parse() {
        int i = this.index;
        this.index = i + 1;
        if (peek() != '[') {
            return null;
        }
        this.index++;
        Text text = text("![");
        addBracket(Bracket.image(text, i + 1, lastBracket(), lastDelimiter()));
        return text;
    }
}
