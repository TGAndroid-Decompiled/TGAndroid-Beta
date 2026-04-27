package io.noties.markwon.inlineparser;

import java.util.regex.Pattern;

public class CloseBracketInlineProcessor extends InlineProcessor {
    private static final Pattern WHITESPACE = MarkwonInlineParser.WHITESPACE;

    @Override
    public char specialCharacter() {
        return ']';
    }

    @Override
    protected org.commonmark.node.Node parse() {
        throw new UnsupportedOperationException("Method not decompiled: io.noties.markwon.inlineparser.CloseBracketInlineProcessor.parse():org.commonmark.node.Node");
    }
}
