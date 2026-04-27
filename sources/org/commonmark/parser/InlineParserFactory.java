package org.commonmark.parser;

public interface InlineParserFactory {
    InlineParser create(InlineParserContext inlineParserContext);
}
