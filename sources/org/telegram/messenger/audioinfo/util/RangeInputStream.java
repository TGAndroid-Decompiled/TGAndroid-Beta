package org.telegram.messenger.audioinfo.util;

import java.io.InputStream;

public class RangeInputStream extends PositionInputStream {
    private final long endPosition;

    public RangeInputStream(InputStream inputStream, long j, long j2) {
        super(inputStream, j);
        this.endPosition = j + j2;
    }

    public long getRemainingLength() {
        return this.endPosition - getPosition();
    }

    @Override
    public int read() {
        if (getPosition() == this.endPosition) {
            return -1;
        }
        return super.read();
    }

    @Override
    public int read(byte[] bArr, int i, int i2) {
        long position = getPosition() + i2;
        long j = this.endPosition;
        if (position <= j || (i2 = (int) (j - getPosition())) != 0) {
            return super.read(bArr, i, i2);
        }
        return -1;
    }

    @Override
    public long skip(long j) {
        long position = getPosition() + j;
        long j2 = this.endPosition;
        if (position > j2) {
            j = (int) (j2 - getPosition());
        }
        return super.skip(j);
    }
}
