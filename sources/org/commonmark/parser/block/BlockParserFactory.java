package org.commonmark.parser.block;

public interface BlockParserFactory {
    BlockStart tryStart(ParserState parserState, MatchedBlockParser matchedBlockParser);
}
