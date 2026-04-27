package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.Document;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.ParserState;

public class DocumentBlockParser extends AbstractBlockParser {
    private final Document document = new Document();

    @Override
    public void addLine(CharSequence charSequence) {
    }

    @Override
    public boolean canContain(Block block) {
        return true;
    }

    @Override
    public boolean isContainer() {
        return true;
    }

    @Override
    public Document getBlock() {
        return this.document;
    }

    @Override
    public BlockContinue tryContinue(ParserState parserState) {
        return BlockContinue.atIndex(parserState.getIndex());
    }
}
