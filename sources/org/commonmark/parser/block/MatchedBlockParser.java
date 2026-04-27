package org.commonmark.parser.block;

public interface MatchedBlockParser {
    BlockParser getMatchedBlockParser();

    CharSequence getParagraphContent();
}
