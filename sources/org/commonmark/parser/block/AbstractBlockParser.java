package org.commonmark.parser.block;

import org.commonmark.ext.gfm.tables.internal.TableBlockParser;
import org.commonmark.internal.BlockContinueImpl;
import org.commonmark.internal.BlockQuoteParser;
import org.commonmark.internal.DocumentParser;
import org.commonmark.node.Block;
import org.commonmark.parser.InlineParser;

public abstract class AbstractBlockParser {
    public void addLine(CharSequence charSequence) {
    }

    public boolean canContain(Block block) {
        return this instanceof BlockQuoteParser;
    }

    public boolean canHaveLazyContinuationLines() {
        return this instanceof TableBlockParser;
    }

    public void closeBlock() {
    }

    public abstract Block getBlock();

    public boolean isContainer() {
        return this instanceof BlockQuoteParser;
    }

    public void parseInlines(InlineParser inlineParser) {
    }

    public abstract BlockContinueImpl tryContinue(DocumentParser documentParser);
}
