package org.commonmark.parser.block;

import org.commonmark.node.Block;
import org.commonmark.parser.InlineParser;

public abstract class AbstractBlockParser implements BlockParser {
    @Override
    public void addLine(CharSequence charSequence) {
    }

    @Override
    public boolean canContain(Block block) {
        return false;
    }

    @Override
    public boolean canHaveLazyContinuationLines() {
        return false;
    }

    @Override
    public void closeBlock() {
    }

    @Override
    public boolean isContainer() {
        return false;
    }

    @Override
    public void parseInlines(InlineParser inlineParser) {
    }
}
