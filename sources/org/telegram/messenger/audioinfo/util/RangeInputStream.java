package org.telegram.messenger.audioinfo.util;

import java.io.InputStream;

public final class RangeInputStream extends PositionInputStream {
    public final long endPosition;

    public RangeInputStream(InputStream inputStream, long j, long j2) {
        super(0, inputStream);
        this.position = j;
        this.endPosition = j + j2;
    }

    public final long getRemainingLength() {
        return this.endPosition - this.position;
    }

    @Override
    public final int read() {
        if (this.position == this.endPosition) {
            return -1;
        }
        return super.read();
    }

    @Override
    public final long skip(long j) {
        long j2 = this.position;
        long j3 = j2 + j;
        long j4 = this.endPosition;
        if (j3 > j4) {
            j = (int) (j4 - j2);
        }
        return super.skip(j);
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.position;
        long j2 = ((long) i2) + j;
        long j3 = this.endPosition;
        if (j2 <= j3 || (i2 = (int) (j3 - j)) != 0) {
            return super.read(bArr, i, i2);
        }
        return -1;
    }
}
