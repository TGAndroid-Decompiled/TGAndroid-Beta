package org.telegram.messenger.audioinfo.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PositionInputStream extends FilterInputStream {
    public final int $r8$classId;
    public long position;
    public long positionMark;

    public PositionInputStream(FilterInputStream filterInputStream) {
        super(filterInputStream);
        this.$r8$classId = 0;
        this.position = 0L;
    }

    private final synchronized void mark$com$google$firebase$messaging$ByteStreams$LimitedInputStream(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.positionMark = this.position;
    }

    private final synchronized void mark$org$telegram$messenger$audioinfo$util$PositionInputStream(int i) {
        this.positionMark = this.position;
        super.mark(i);
    }

    private final synchronized void reset$com$google$firebase$messaging$ByteStreams$LimitedInputStream() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.positionMark == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.position = this.positionMark;
    }

    private final synchronized void reset$org$telegram$messenger$audioinfo$util$PositionInputStream() {
        super.reset();
        this.position = this.positionMark;
    }

    @Override
    public int available() {
        switch (this.$r8$classId) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.position);
            default:
                return super.available();
        }
    }

    @Override
    public final synchronized void mark(int i) {
        switch (this.$r8$classId) {
            case 0:
                mark$org$telegram$messenger$audioinfo$util$PositionInputStream(i);
                break;
            default:
                mark$com$google$firebase$messaging$ByteStreams$LimitedInputStream(i);
                break;
        }
    }

    @Override
    public int read(byte[] bArr) {
        switch (this.$r8$classId) {
            case 0:
                return read(bArr, 0, bArr.length);
            default:
                return super.read(bArr);
        }
    }

    @Override
    public final synchronized void reset() {
        switch (this.$r8$classId) {
            case 0:
                reset$org$telegram$messenger$audioinfo$util$PositionInputStream();
                break;
            default:
                reset$com$google$firebase$messaging$ByteStreams$LimitedInputStream();
                break;
        }
    }

    @Override
    public long skip(long j) throws IOException {
        switch (this.$r8$classId) {
            case 0:
                long j2 = this.position;
                long jSkip = super.skip(j);
                this.position = j2 + jSkip;
                return jSkip;
            default:
                long jSkip2 = ((FilterInputStream) this).in.skip(Math.min(j, this.position));
                this.position -= jSkip2;
                return jSkip2;
        }
    }

    @Override
    public int read() throws IOException {
        switch (this.$r8$classId) {
            case 0:
                int i = super.read();
                if (i >= 0) {
                    this.position++;
                }
                return i;
            default:
                if (this.position == 0) {
                    return -1;
                }
                int i2 = ((FilterInputStream) this).in.read();
                if (i2 != -1) {
                    this.position--;
                }
                return i2;
        }
    }

    public PositionInputStream(int i, InputStream inputStream) {
        super(inputStream);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                super(inputStream);
                this.positionMark = -1L;
                this.position = 1048577L;
                break;
            default:
                break;
        }
    }

    @Override
    public int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.$r8$classId) {
            case 0:
                long j = this.position;
                int i3 = super.read(bArr, i, i2);
                if (i3 > 0) {
                    this.position = j + ((long) i3);
                }
                return i3;
            default:
                long j2 = this.position;
                if (j2 == 0) {
                    return -1;
                }
                int i4 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j2));
                if (i4 != -1) {
                    this.position -= (long) i4;
                }
                return i4;
        }
    }
}
