package f3;

import e2.m0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
public final class l implements p {
    public final e2.n f11061b;
    public final long f11062c;
    public long d;
    public int f11064f;
    public int h;
    public byte[] f11063e = new byte[65536];
    public final byte[] f11060a = new byte[4096];

    static {
        m0.a("media3.extractor");
    }

    public l(e2.n nVar, long j3, long j10) {
        this.f11061b = nVar;
        this.d = j3;
        this.f11062c = j10;
    }

    public final void a(int i7) {
        int i10 = this.f11064f + i7;
        byte[] bArr = this.f11063e;
        if (i10 > bArr.length) {
            this.f11063e = Arrays.copyOf(this.f11063e, h2.m0.i(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    @Override
    public final void b(int i7, int i10, byte[] bArr) {
        k(bArr, i7, i10, false);
    }

    @Override
    public final boolean c(byte[] bArr, int i7, int i10, boolean z9) {
        int min;
        int i11 = this.h;
        if (i11 == 0) {
            min = 0;
        } else {
            min = Math.min(i11, i10);
            System.arraycopy(this.f11063e, 0, bArr, i7, min);
            e(min);
        }
        int i12 = min;
        while (i12 < i10 && i12 != -1) {
            i12 = d(bArr, i7, i10, i12, z9);
        }
        if (i12 != -1) {
            this.d += i12;
        }
        if (i12 == -1) {
            return false;
        }
        return true;
    }

    public final int d(byte[] bArr, int i7, int i10, int i11, boolean z9) {
        if (!Thread.interrupted()) {
            int read = this.f11061b.read(bArr, i7 + i11, i10 - i11);
            if (read == -1) {
                if (i11 == 0 && z9) {
                    return -1;
                }
                throw new EOFException();
            }
            return i11 + read;
        }
        throw new InterruptedIOException();
    }

    public final void e(int i7) {
        byte[] bArr;
        int i10 = this.h - i7;
        this.h = i10;
        this.f11064f = 0;
        byte[] bArr2 = this.f11063e;
        if (i10 < bArr2.length - 524288) {
            bArr = new byte[65536 + i10];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i7, bArr, 0, i10);
        this.f11063e = bArr;
    }

    @Override
    public final long getLength() {
        return this.f11062c;
    }

    @Override
    public final long getPosition() {
        return this.d;
    }

    @Override
    public final int i(int i7, int i10, byte[] bArr) {
        l lVar;
        int min;
        a(i10);
        int i11 = this.h;
        int i12 = this.f11064f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            lVar = this;
            min = lVar.d(this.f11063e, i12, i10, 0, true);
            if (min == -1) {
                return -1;
            }
            lVar.h += min;
        } else {
            lVar = this;
            min = Math.min(i10, i13);
        }
        System.arraycopy(lVar.f11063e, lVar.f11064f, bArr, i7, min);
        lVar.f11064f += min;
        return min;
    }

    @Override
    public final boolean j(int i7, boolean z9) {
        int min = Math.min(this.h, i7);
        e(min);
        int i10 = min;
        while (i10 < i7 && i10 != -1) {
            byte[] bArr = this.f11060a;
            i10 = d(bArr, -i10, Math.min(i7, bArr.length + i10), i10, z9);
        }
        if (i10 != -1) {
            this.d += i10;
        }
        if (i10 != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean k(byte[] bArr, int i7, int i10, boolean z9) {
        if (!v(i10, z9)) {
            return false;
        }
        System.arraycopy(this.f11063e, this.f11064f - i10, bArr, i7, i10);
        return true;
    }

    @Override
    public final long l() {
        return this.d + this.f11064f;
    }

    @Override
    public final void m(int i7) {
        v(i7, false);
    }

    @Override
    public final void q() {
        this.f11064f = 0;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        l lVar;
        int i11 = this.h;
        int i12 = 0;
        if (i11 != 0) {
            int min = Math.min(i11, i10);
            System.arraycopy(this.f11063e, 0, bArr, i7, min);
            e(min);
            i12 = min;
        }
        if (i12 == 0) {
            lVar = this;
            i12 = lVar.d(bArr, i7, i10, 0, true);
        } else {
            lVar = this;
        }
        if (i12 != -1) {
            lVar.d += i12;
        }
        return i12;
    }

    @Override
    public final void readFully(byte[] bArr, int i7, int i10) {
        c(bArr, i7, i10, false);
    }

    @Override
    public final void s(int i7) {
        j(i7, false);
    }

    @Override
    public final int skip(int i7) {
        l lVar;
        int min = Math.min(this.h, i7);
        e(min);
        if (min == 0) {
            byte[] bArr = this.f11060a;
            lVar = this;
            min = lVar.d(bArr, 0, Math.min(i7, bArr.length), 0, true);
        } else {
            lVar = this;
        }
        if (min != -1) {
            lVar.d += min;
        }
        return min;
    }

    @Override
    public final boolean v(int i7, boolean z9) {
        a(i7);
        int i10 = this.h - this.f11064f;
        while (i10 < i7) {
            int i11 = i7;
            boolean z10 = z9;
            i10 = d(this.f11063e, this.f11064f, i11, i10, z10);
            if (i10 == -1) {
                return false;
            }
            this.h = this.f11064f + i10;
            i7 = i11;
            z9 = z10;
        }
        this.f11064f += i7;
        return true;
    }
}
