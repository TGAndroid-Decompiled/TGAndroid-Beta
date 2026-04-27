package org.commonmark.parser.block;

import org.commonmark.node.Block;
import org.commonmark.parser.InlineParser;

public interface BlockParser {
    void addLine(CharSequence charSequence);

    boolean canContain(Block block);

    boolean canHaveLazyContinuationLines();

    void closeBlock();

    Block getBlock();

    boolean isContainer();

    void parseInlines(InlineParser inlineParser);

    BlockContinue tryContinue(ParserState parserState);
}
