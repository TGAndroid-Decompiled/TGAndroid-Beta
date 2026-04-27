package org.commonmark.internal;

import org.commonmark.parser.block.BlockContinue;

public class BlockContinueImpl extends BlockContinue {
    private final boolean finalize;
    private final int newColumn;
    private final int newIndex;

    public BlockContinueImpl(int i, int i2, boolean z) {
        this.newIndex = i;
        this.newColumn = i2;
        this.finalize = z;
    }

    public int getNewIndex() {
        return this.newIndex;
    }

    public int getNewColumn() {
        return this.newColumn;
    }

    public boolean isFinalize() {
        return this.finalize;
    }
}
