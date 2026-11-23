package f3;

import e2.m0;
import h2.l0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
public final class l implements p {
    public final e2.n f11215b;
    public final long f11216c;
    public long d;
    public int f11218f;
    public int h;
    public byte[] f11217e = new byte[65536];
    public final byte[] f11214a = new byte[4096];

    static {
        m0.a("media3.extractor");
    }

    public l(e2.n nVar, long j3, long j10) {
        this.f11215b = nVar;
        this.d = j3;
        this.f11216c = j10;
    }

    public final void a(int i7) {
        int i10 = this.f11218f + i7;
        byte[] bArr = this.f11217e;
        if (i10 > bArr.length) {
            this.f11217e = Arrays.copyOf(this.f11217e, l0.i(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    @Override
    public final void b(int i7, int i10, byte[] bArr) {
        g(bArr, i7, i10, false);
    }

    @Override
    public final boolean c(byte[] bArr, int i7, int i10, boolean z10) {
        int min;
        int i11 = this.h;
        if (i11 == 0) {
            min = 0;
        } else {
            min = Math.min(i11, i10);
            System.arraycopy(this.f11217e, 0, bArr, i7, min);
            h(min);
        }
        int i12 = min;
        while (i12 < i10 && i12 != -1) {
            i12 = e(bArr, i7, i10, i12, z10);
        }
        if (i12 != -1) {
            this.d += i12;
        }
        if (i12 == -1) {
            return false;
        }
        return true;
    }

    @Override
    public final int d(int i7, int i10, byte[] bArr) {
        l lVar;
        int min;
        a(i10);
        int i11 = this.h;
        int i12 = this.f11218f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            lVar = this;
            min = lVar.e(this.f11217e, i12, i10, 0, true);
            if (min == -1) {
                return -1;
            }
            lVar.h += min;
        } else {
            lVar = this;
            min = Math.min(i10, i13);
        }
        System.arraycopy(lVar.f11217e, lVar.f11218f, bArr, i7, min);
        lVar.f11218f += min;
        return min;
    }

    public final int e(byte[] bArr, int i7, int i10, int i11, boolean z10) {
        if (!Thread.interrupted()) {
            int read = this.f11215b.read(bArr, i7 + i11, i10 - i11);
            if (read == -1) {
                if (i11 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i11 + read;
        }
        throw new InterruptedIOException();
    }

    @Override
    public final boolean f(int i7, boolean z10) {
        int min = Math.min(this.h, i7);
        h(min);
        int i10 = min;
        while (i10 < i7 && i10 != -1) {
            byte[] bArr = this.f11214a;
            i10 = e(bArr, -i10, Math.min(i7, bArr.length + i10), i10, z10);
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
    public final boolean g(byte[] bArr, int i7, int i10, boolean z10) {
        if (!x(i10, z10)) {
            return false;
        }
        System.arraycopy(this.f11217e, this.f11218f - i10, bArr, i7, i10);
        return true;
    }

    @Override
    public final long getLength() {
        return this.f11216c;
    }

    @Override
    public final long getPosition() {
        return this.d;
    }

    public final void h(int i7) {
        byte[] bArr;
        int i10 = this.h - i7;
        this.h = i10;
        this.f11218f = 0;
        byte[] bArr2 = this.f11217e;
        if (i10 < bArr2.length - 524288) {
            bArr = new byte[65536 + i10];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i7, bArr, 0, i10);
        this.f11217e = bArr;
    }

    @Override
    public final long l() {
        return this.d + this.f11218f;
    }

    @Override
    public final void m(int i7) {
        x(i7, false);
    }

    @Override
    public final void n() {
        this.f11218f = 0;
    }

    @Override
    public final void r(int i7) {
        f(i7, false);
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        l lVar;
        int i11 = this.h;
        int i12 = 0;
        if (i11 != 0) {
            int min = Math.min(i11, i10);
            System.arraycopy(this.f11217e, 0, bArr, i7, min);
            h(min);
            i12 = min;
        }
        if (i12 == 0) {
            lVar = this;
            i12 = lVar.e(bArr, i7, i10, 0, true);
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
    public final int skip(int i7) {
        l lVar;
        int min = Math.min(this.h, i7);
        h(min);
        if (min == 0) {
            byte[] bArr = this.f11214a;
            lVar = this;
            min = lVar.e(bArr, 0, Math.min(i7, bArr.length), 0, true);
        } else {
            lVar = this;
        }
        if (min != -1) {
            lVar.d += min;
        }
        return min;
    }

    @Override
    public final boolean x(int i7, boolean z10) {
        a(i7);
        int i10 = this.h - this.f11218f;
        while (i10 < i7) {
            int i11 = i7;
            boolean z11 = z10;
            i10 = e(this.f11217e, this.f11218f, i11, i10, z11);
            if (i10 == -1) {
                return false;
            }
            this.h = this.f11218f + i10;
            i7 = i11;
            z10 = z11;
        }
        this.f11218f += i7;
        return true;
    }
}
