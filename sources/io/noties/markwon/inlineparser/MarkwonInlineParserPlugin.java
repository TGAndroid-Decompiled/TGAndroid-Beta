package io.noties.markwon.inlineparser;

import io.noties.markwon.MarkwonPlugin;

public final class MarkwonInlineParserPlugin implements MarkwonPlugin {
    public final MarkwonInlineParser.FactoryBuilderImpl factoryBuilder;

    public MarkwonInlineParserPlugin(MarkwonInlineParser.FactoryBuilderImpl factoryBuilderImpl) {
        this.factoryBuilder = factoryBuilderImpl;
    }
}
