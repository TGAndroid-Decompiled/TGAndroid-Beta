package org.telegram.messenger.audioinfo.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
public class PositionInputStream extends FilterInputStream {
    private long position;
    private long positionMark;

    public PositionInputStream(InputStream inputStream) {
        this(inputStream, 0L);
    }

    public PositionInputStream(InputStream inputStream, long j) {
        super(inputStream);
        this.position = j;
    }

    @Override
    public synchronized void mark(int i) {
        this.positionMark = this.position;
        super.mark(i);
    }

    @Override
    public synchronized void reset() throws IOException {
        super.reset();
        this.position = this.positionMark;
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        if (read >= 0) {
            this.position++;
        }
        return read;
    }

    @Override
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.position;
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.position = j + read;
        }
        return read;
    }

    @Override
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override
    public long skip(long j) throws IOException {
        long j2 = this.position;
        long skip = super.skip(j);
        this.position = j2 + skip;
        return skip;
    }

    public long getPosition() {
        return this.position;
    }
}
