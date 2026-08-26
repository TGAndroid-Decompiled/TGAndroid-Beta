package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.Document;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.block.AbstractBlockParser;

public final class DocumentBlockParser extends AbstractBlockParser {
    public final int $r8$classId;
    public final Block document;

    public DocumentBlockParser(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.document = new ThematicBreak();
                break;
            default:
                this.document = new Document();
                break;
        }
    }

    @Override
    public void addLine(CharSequence charSequence) {
        int i = this.$r8$classId;
    }

    @Override
    public boolean canContain(Block block) {
        switch (this.$r8$classId) {
            case 0:
                return true;
            default:
                return super.canContain(block);
        }
    }

    @Override
    public final Block getBlock() {
        switch (this.$r8$classId) {
            case 0:
                return (Document) this.document;
            default:
                return (ThematicBreak) this.document;
        }
    }

    @Override
    public boolean isContainer() {
        switch (this.$r8$classId) {
            case 0:
                return true;
            default:
                return super.isContainer();
        }
    }

    @Override
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        switch (this.$r8$classId) {
            case 0:
                return BlockContinueImpl.atIndex(documentParser.index);
            default:
                return null;
        }
    }

    private final void addLine$org$commonmark$internal$DocumentBlockParser(CharSequence charSequence) {
    }
}
