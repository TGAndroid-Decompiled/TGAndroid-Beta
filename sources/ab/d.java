package ab;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
public class d extends FilterInputStream {
    public final int f914a = 1;
    public long f915b;
    public long f916c;

    public d(FilterInputStream filterInputStream) {
        this(filterInputStream, 0L);
    }

    private final synchronized void a(int i7) {
        ((FilterInputStream) this).in.mark(i7);
        this.f916c = this.f915b;
    }

    private final synchronized void b(int i7) {
        this.f916c = this.f915b;
        super.mark(i7);
    }

    private final synchronized void c() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f916c != -1) {
                ((FilterInputStream) this).in.reset();
                this.f915b = this.f916c;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    private final synchronized void d() {
        super.reset();
        this.f915b = this.f916c;
    }

    @Override
    public int available() {
        switch (this.f914a) {
            case 0:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f915b);
            default:
                return super.available();
        }
    }

    @Override
    public final synchronized void mark(int i7) {
        switch (this.f914a) {
            case 0:
                a(i7);
                return;
            default:
                b(i7);
                return;
        }
    }

    @Override
    public int read() {
        switch (this.f914a) {
            case 0:
                if (this.f915b == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read();
                if (read != -1) {
                    this.f915b--;
                }
                return read;
            default:
                int read2 = super.read();
                if (read2 >= 0) {
                    this.f915b++;
                }
                return read2;
        }
    }

    @Override
    public final synchronized void reset() {
        switch (this.f914a) {
            case 0:
                c();
                return;
            default:
                d();
                return;
        }
    }

    @Override
    public long skip(long j3) {
        switch (this.f914a) {
            case 0:
                long skip = ((FilterInputStream) this).in.skip(Math.min(j3, this.f915b));
                this.f915b -= skip;
                return skip;
            default:
                long j10 = this.f915b;
                long skip2 = super.skip(j3);
                this.f915b = j10 + skip2;
                return skip2;
        }
    }

    public d(InputStream inputStream, long j3) {
        super(inputStream);
        this.f915b = j3;
    }

    public d(InputStream inputStream) {
        super(inputStream);
        this.f916c = -1L;
        this.f915b = 1048577L;
    }

    @Override
    public int read(byte[] bArr, int i7, int i10) {
        switch (this.f914a) {
            case 0:
                long j3 = this.f915b;
                if (j3 == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read(bArr, i7, (int) Math.min(i10, j3));
                if (read != -1) {
                    this.f915b -= read;
                }
                return read;
            default:
                long j10 = this.f915b;
                int read2 = super.read(bArr, i7, i10);
                if (read2 > 0) {
                    this.f915b = j10 + read2;
                }
                return read2;
        }
    }

    @Override
    public int read(byte[] bArr) {
        switch (this.f914a) {
            case 1:
                return read(bArr, 0, bArr.length);
            default:
                return super.read(bArr);
        }
    }
}
