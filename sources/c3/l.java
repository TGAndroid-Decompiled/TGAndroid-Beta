package c3;

import b2.l0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
public final class l implements p {
    public final b2.k f4139b;
    public final long f4140c;
    public long d;
    public int f4142f;
    public int h;
    public byte[] f4141e = new byte[65536];
    public final byte[] f4138a = new byte[4096];

    static {
        l0.a("media3.extractor");
    }

    public l(b2.k kVar, long j3, long j10) {
        this.f4139b = kVar;
        this.d = j3;
        this.f4140c = j10;
    }

    @Override
    public final void a(int i10, int i11, byte[] bArr) {
        i(bArr, i10, i11, false);
    }

    public final void b(int i10) {
        int i11 = this.f4142f + i10;
        byte[] bArr = this.f4141e;
        if (i11 > bArr.length) {
            this.f4141e = Arrays.copyOf(this.f4141e, e2.d0.h(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    @Override
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        int min;
        int i12 = this.h;
        if (i12 == 0) {
            min = 0;
        } else {
            min = Math.min(i12, i11);
            System.arraycopy(this.f4141e, 0, bArr, i10, min);
            e(min);
        }
        int i13 = min;
        while (i13 < i11 && i13 != -1) {
            i13 = d(bArr, i10, i11, i13, z10);
        }
        if (i13 != -1) {
            this.d += i13;
        }
        if (i13 == -1) {
            return false;
        }
        return true;
    }

    public final int d(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int read = this.f4139b.read(bArr, i10 + i12, i11 - i12);
            if (read == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + read;
        }
        throw new InterruptedIOException();
    }

    public final void e(int i10) {
        byte[] bArr;
        int i11 = this.h - i10;
        this.h = i11;
        this.f4142f = 0;
        byte[] bArr2 = this.f4141e;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[65536 + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.f4141e = bArr;
    }

    @Override
    public final int g(int i10, int i11, byte[] bArr) {
        l lVar;
        int min;
        b(i11);
        int i12 = this.h;
        int i13 = this.f4142f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            lVar = this;
            min = lVar.d(this.f4141e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            lVar.h += min;
        } else {
            lVar = this;
            min = Math.min(i11, i14);
        }
        System.arraycopy(lVar.f4141e, lVar.f4142f, bArr, i10, min);
        lVar.f4142f += min;
        return min;
    }

    @Override
    public final long getLength() {
        return this.f4140c;
    }

    @Override
    public final long getPosition() {
        return this.d;
    }

    @Override
    public final boolean h(int i10, boolean z10) {
        int min = Math.min(this.h, i10);
        e(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            byte[] bArr = this.f4138a;
            i11 = d(bArr, -i11, Math.min(i10, bArr.length + i11), i11, z10);
        }
        if (i11 != -1) {
            this.d += i11;
        }
        if (i11 != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean i(byte[] bArr, int i10, int i11, boolean z10) {
        if (!v(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f4141e, this.f4142f - i11, bArr, i10, i11);
        return true;
    }

    @Override
    public final long j() {
        return this.d + this.f4142f;
    }

    @Override
    public final void l(int i10) {
        v(i10, false);
    }

    @Override
    public final void q() {
        this.f4142f = 0;
    }

    @Override
    public final void r(int i10) {
        h(i10, false);
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        l lVar;
        int i12 = this.h;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.f4141e, 0, bArr, i10, min);
            e(min);
            i13 = min;
        }
        if (i13 == 0) {
            lVar = this;
            i13 = lVar.d(bArr, i10, i11, 0, true);
        } else {
            lVar = this;
        }
        if (i13 != -1) {
            lVar.d += i13;
        }
        return i13;
    }

    @Override
    public final void readFully(byte[] bArr, int i10, int i11) {
        c(bArr, i10, i11, false);
    }

    @Override
    public final int skip(int i10) {
        l lVar;
        int min = Math.min(this.h, i10);
        e(min);
        if (min == 0) {
            byte[] bArr = this.f4138a;
            lVar = this;
            min = lVar.d(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            lVar = this;
        }
        if (min != -1) {
            lVar.d += min;
        }
        return min;
    }

    @Override
    public final boolean v(int i10, boolean z10) {
        b(i10);
        int i11 = this.h - this.f4142f;
        while (i11 < i10) {
            int i12 = i10;
            boolean z11 = z10;
            i11 = d(this.f4141e, this.f4142f, i12, i11, z11);
            if (i11 == -1) {
                return false;
            }
            this.h = this.f4142f + i11;
            i10 = i12;
            z10 = z11;
        }
        this.f4142f += i10;
        return true;
    }
}
