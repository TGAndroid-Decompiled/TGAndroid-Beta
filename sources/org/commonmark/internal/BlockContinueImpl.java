package org.commonmark.internal;

public final class BlockContinueImpl {
    public final boolean finalize;
    public final int newColumn;
    public final int newIndex;

    public BlockContinueImpl(int i, int i2, boolean z) {
        this.newIndex = i;
        this.finalize = z;
        this.newColumn = i2;
    }

    public static BlockContinueImpl atIndex(int i) {
        return new BlockContinueImpl(i, -1, false);
    }
}
