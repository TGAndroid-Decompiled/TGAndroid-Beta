package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.ListBlock;
import org.commonmark.node.ListItem;
import org.commonmark.node.Paragraph;
import org.commonmark.parser.block.AbstractBlockParser;

public final class ListItemParser extends AbstractBlockParser {
    public final ListItem block = new ListItem();
    public final int contentIndent;
    public boolean hadBlankLine;

    public ListItemParser(int i) {
        this.contentIndent = i;
    }

    @Override
    public final boolean canContain(Block block) {
        if (!this.hadBlankLine) {
            return true;
        }
        Block block2 = (Block) this.block.parent;
        if (!(block2 instanceof ListBlock)) {
            return true;
        }
        ((ListBlock) block2).getClass();
        return true;
    }

    @Override
    public final Block getBlock() {
        return this.block;
    }

    @Override
    public final boolean isContainer() {
        return true;
    }

    @Override
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        if (documentParser.blank) {
            if (this.block.firstChild == null) {
                return null;
            }
            Block block = documentParser.getActiveBlockParser().getBlock();
            this.hadBlankLine = (block instanceof Paragraph) || (block instanceof ListItem);
            return BlockContinueImpl.atIndex(documentParser.nextNonSpace);
        }
        int i = documentParser.indent;
        int i2 = this.contentIndent;
        if (i >= i2) {
            return new BlockContinueImpl(-1, documentParser.column + i2, false);
        }
        return null;
    }
}
