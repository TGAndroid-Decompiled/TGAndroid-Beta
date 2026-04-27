package io.noties.markwon.inlineparser;

import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.inlineparser.MarkwonInlineParser;
import org.commonmark.parser.Parser;

public class MarkwonInlineParserPlugin extends AbstractMarkwonPlugin {
    private final MarkwonInlineParser.FactoryBuilder factoryBuilder;

    public static MarkwonInlineParserPlugin create() {
        return create(MarkwonInlineParser.factoryBuilder());
    }

    public static MarkwonInlineParserPlugin create(MarkwonInlineParser.FactoryBuilder factoryBuilder) {
        return new MarkwonInlineParserPlugin(factoryBuilder);
    }

    MarkwonInlineParserPlugin(MarkwonInlineParser.FactoryBuilder factoryBuilder) {
        this.factoryBuilder = factoryBuilder;
    }

    public void configureParser(Parser.Builder builder) {
        builder.inlineParserFactory(this.factoryBuilder.build());
    }

    public MarkwonInlineParser.FactoryBuilder factoryBuilder() {
        return this.factoryBuilder;
    }
}
