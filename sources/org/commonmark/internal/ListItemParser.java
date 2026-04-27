package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.ListBlock;
import org.commonmark.node.ListItem;
import org.commonmark.node.Paragraph;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.ParserState;

public class ListItemParser extends AbstractBlockParser {
    private final ListItem block = new ListItem();
    private int contentIndent;
    private boolean hadBlankLine;

    @Override
    public boolean isContainer() {
        return true;
    }

    public ListItemParser(int i) {
        this.contentIndent = i;
    }

    @Override
    public boolean canContain(Block block) {
        if (!this.hadBlankLine) {
            return true;
        }
        Block parent = this.block.getParent();
        if (!(parent instanceof ListBlock)) {
            return true;
        }
        ((ListBlock) parent).setTight(false);
        return true;
    }

    @Override
    public Block getBlock() {
        return this.block;
    }

    @Override
    public BlockContinue tryContinue(ParserState parserState) {
        if (parserState.isBlank()) {
            if (this.block.getFirstChild() == null) {
                return BlockContinue.none();
            }
            Block block = parserState.getActiveBlockParser().getBlock();
            this.hadBlankLine = (block instanceof Paragraph) || (block instanceof ListItem);
            return BlockContinue.atIndex(parserState.getNextNonSpaceIndex());
        }
        if (parserState.getIndent() >= this.contentIndent) {
            return BlockContinue.atColumn(parserState.getColumn() + this.contentIndent);
        }
        return BlockContinue.none();
    }
}
