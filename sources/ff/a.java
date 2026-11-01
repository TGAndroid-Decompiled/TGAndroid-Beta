package ff;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
public class a extends FilterInputStream {
    public final int f7055a = 0;
    public long f7056b;
    public long f7057c;

    public a(FilterInputStream filterInputStream) {
        this(filterInputStream, 0L);
    }

    private final synchronized void a(int i10) {
        this.f7057c = this.f7056b;
        super.mark(i10);
    }

    private final synchronized void b(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f7057c = this.f7056b;
    }

    private final synchronized void c() {
        super.reset();
        this.f7056b = this.f7057c;
    }

    private final synchronized void d() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f7057c != -1) {
                ((FilterInputStream) this).in.reset();
                this.f7056b = this.f7057c;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override
    public int available() {
        switch (this.f7055a) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f7056b);
            default:
                return super.available();
        }
    }

    @Override
    public final synchronized void mark(int i10) {
        switch (this.f7055a) {
            case 0:
                a(i10);
                return;
            default:
                b(i10);
                return;
        }
    }

    @Override
    public int read(byte[] bArr) {
        switch (this.f7055a) {
            case 0:
                return read(bArr, 0, bArr.length);
            default:
                return super.read(bArr);
        }
    }

    @Override
    public final synchronized void reset() {
        switch (this.f7055a) {
            case 0:
                c();
                return;
            default:
                d();
                return;
        }
    }

    @Override
    public long skip(long j10) {
        switch (this.f7055a) {
            case 0:
                long j11 = this.f7056b;
                long skip = super.skip(j10);
                this.f7056b = j11 + skip;
                return skip;
            default:
                long skip2 = ((FilterInputStream) this).in.skip(Math.min(j10, this.f7056b));
                this.f7056b -= skip2;
                return skip2;
        }
    }

    public a(InputStream inputStream, long j10) {
        super(inputStream);
        this.f7056b = j10;
    }

    @Override
    public int read() {
        switch (this.f7055a) {
            case 0:
                int read = super.read();
                if (read >= 0) {
                    this.f7056b++;
                }
                return read;
            default:
                if (this.f7056b == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read();
                if (read2 != -1) {
                    this.f7056b--;
                }
                return read2;
        }
    }

    public a(InputStream inputStream) {
        super(inputStream);
        this.f7057c = -1L;
        this.f7056b = 1048577L;
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        switch (this.f7055a) {
            case 0:
                long j10 = this.f7056b;
                int read = super.read(bArr, i10, i11);
                if (read > 0) {
                    this.f7056b = j10 + read;
                }
                return read;
            default:
                long j11 = this.f7056b;
                if (j11 == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j11));
                if (read2 != -1) {
                    this.f7056b -= read2;
                }
                return read2;
        }
    }
}
