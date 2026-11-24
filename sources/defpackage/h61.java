package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
public class h61 extends FilterInputStream {
    public final byte a = 1;
    public long b;
    public long c;

    public h61(InputStream inputStream) {
        super(inputStream);
        this.c = -1L;
        this.b = 1048577L;
    }

    private final synchronized void a(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.c = this.b;
    }

    private final synchronized void b(int i) {
        this.c = this.b;
        super.mark(i);
    }

    private final synchronized void c() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.c != -1) {
                ((FilterInputStream) this).in.reset();
                this.b = this.c;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    private final synchronized void d() {
        super.reset();
        this.b = this.c;
    }

    @Override
    public final int available() {
        switch (this.a) {
            case 0:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.b);
            default:
                return super.available();
        }
    }

    @Override
    public final synchronized void mark(int i) {
        switch (this.a) {
            case 0:
                a(i);
                return;
            default:
                b(i);
                return;
        }
    }

    @Override
    public int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                long j = this.b;
                if (j == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
                if (read != -1) {
                    this.b -= read;
                }
                return read;
            default:
                long j2 = this.b;
                int read2 = super.read(bArr, i, i2);
                if (read2 > 0) {
                    this.b = j2 + read2;
                }
                return read2;
        }
    }

    @Override
    public final synchronized void reset() {
        switch (this.a) {
            case 0:
                c();
                return;
            default:
                d();
                return;
        }
    }

    @Override
    public long skip(long j) {
        switch (this.a) {
            case 0:
                long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.b));
                this.b -= skip;
                return skip;
            default:
                long j2 = this.b;
                long skip2 = super.skip(j);
                this.b = j2 + skip2;
                return skip2;
        }
    }

    public h61(InputStream inputStream, long j) {
        super(inputStream);
        this.b = j;
    }

    public h61(FilterInputStream filterInputStream) {
        this(filterInputStream, 0L);
    }

    @Override
    public int read() {
        switch (this.a) {
            case 0:
                if (this.b != 0) {
                    int read = ((FilterInputStream) this).in.read();
                    if (read != -1) {
                        this.b--;
                    }
                    return read;
                }
                return -1;
            default:
                int read2 = super.read();
                if (read2 >= 0) {
                    this.b++;
                }
                return read2;
        }
    }

    @Override
    public final int read(byte[] bArr) {
        switch (this.a) {
            case 1:
                return read(bArr, 0, bArr.length);
            default:
                return super.read(bArr);
        }
    }
}
