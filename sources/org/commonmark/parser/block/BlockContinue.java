package org.commonmark.parser.block;

import org.commonmark.internal.BlockContinueImpl;

public abstract class BlockContinue {
    public static BlockContinue none() {
        return null;
    }

    protected BlockContinue() {
    }

    public static BlockContinue atIndex(int i) {
        return new BlockContinueImpl(i, -1, false);
    }

    public static BlockContinue atColumn(int i) {
        return new BlockContinueImpl(-1, i, false);
    }

    public static BlockContinue finished() {
        return new BlockContinueImpl(-1, -1, true);
    }
}
