package io.noties.markwon.inlineparser;

import org.commonmark.internal.Bracket;
import org.commonmark.node.Node;
import org.commonmark.node.Text;

public class OpenBracketInlineProcessor extends InlineProcessor {
    @Override
    public char specialCharacter() {
        return '[';
    }

    @Override
    protected Node parse() {
        int i = this.index;
        this.index = i + 1;
        Text text = text("[");
        addBracket(Bracket.link(text, i, lastBracket(), lastDelimiter()));
        return text;
    }
}
