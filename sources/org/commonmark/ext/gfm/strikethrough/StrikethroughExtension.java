package org.commonmark.ext.gfm.strikethrough;

import org.commonmark.Extension;
import org.commonmark.ext.gfm.strikethrough.internal.StrikethroughDelimiterProcessor;
import org.commonmark.parser.Parser;

public class StrikethroughExtension implements Parser.ParserExtension, Extension {
    private StrikethroughExtension() {
    }

    public static Extension create() {
        return new StrikethroughExtension();
    }

    @Override
    public void extend(Parser.Builder builder) {
        builder.customDelimiterProcessor(new StrikethroughDelimiterProcessor());
    }
}
