package mf;

import com.google.firebase.messaging.d;
import java.io.InputStream;
public final class a extends d {
    public final long d;

    public a(InputStream inputStream, long j3, long j10) {
        super(inputStream, j3);
        this.d = j3 + j10;
    }

    public final long e() {
        return this.d - this.f6077b;
    }

    @Override
    public final int read() {
        if (this.f6077b == this.d) {
            return -1;
        }
        return super.read();
    }

    @Override
    public final long skip(long j3) {
        long j10 = this.f6077b;
        long j11 = this.d;
        if (j10 + j3 > j11) {
            j3 = (int) (j11 - j10);
        }
        return super.skip(j3);
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long j3 = this.f6077b;
        long j10 = this.d;
        if (i11 + j3 <= j10 || (i11 = (int) (j10 - j3)) != 0) {
            return super.read(bArr, i10, i11);
        }
        return -1;
    }
}
