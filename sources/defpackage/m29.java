package defpackage;

import java.io.InputStream;
public final class m29 extends i51 {
    public final long d;

    public m29(InputStream inputStream, long j, long j2) {
        super(inputStream, j);
        this.d = j + j2;
    }

    public final long e() {
        return this.d - this.b;
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.b;
        long j2 = this.d;
        if (i2 + j > j2 && (i2 = (int) (j2 - j)) == 0) {
            return -1;
        }
        return super.read(bArr, i, i2);
    }

    @Override
    public final long skip(long j) {
        long j2 = this.b;
        long j3 = this.d;
        if (j2 + j > j3) {
            j = (int) (j3 - j2);
        }
        return super.skip(j);
    }

    @Override
    public final int read() {
        if (this.b == this.d) {
            return -1;
        }
        return super.read();
    }
}
