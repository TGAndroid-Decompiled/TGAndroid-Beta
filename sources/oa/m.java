package oa;

import java.io.Writer;
public final class m extends Writer {
    @Override
    public final void close() {
        throw new AssertionError();
    }

    @Override
    public final void flush() {
        throw new AssertionError();
    }

    @Override
    public final void write(char[] cArr, int i9, int i10) {
        throw new AssertionError();
    }
}
