package c3;

import b2.l0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
public final class l implements p {
    public final b2.k f4090b;
    public final long f4091c;
    public long d;
    public int f4093f;
    public int h;
    public byte[] f4092e = new byte[65536];
    public final byte[] f4089a = new byte[4096];

    static {
        l0.a("media3.extractor");
    }

    public l(b2.k kVar, long j3, long j10) {
        this.f4090b = kVar;
        this.d = j3;
        this.f4091c = j10;
    }

    public final void a(int i10) {
        int i11 = this.f4093f + i10;
        byte[] bArr = this.f4092e;
        if (i11 > bArr.length) {
            this.f4092e = Arrays.copyOf(this.f4092e, e2.d0.h(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    @Override
    public final void b(int i10, int i11, byte[] bArr) {
        f(bArr, i10, i11, false);
    }

    @Override
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        int min;
        int i12 = this.h;
        if (i12 == 0) {
            min = 0;
        } else {
            min = Math.min(i12, i11);
            System.arraycopy(this.f4092e, 0, bArr, i10, min);
            j(min);
        }
        int i13 = min;
        while (i13 < i11 && i13 != -1) {
            i13 = i(bArr, i10, i11, i13, z10);
        }
        if (i13 != -1) {
            this.d += i13;
        }
        if (i13 == -1) {
            return false;
        }
        return true;
    }

    @Override
    public final int d(int i10, int i11, byte[] bArr) {
        l lVar;
        int min;
        a(i11);
        int i12 = this.h;
        int i13 = this.f4093f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            lVar = this;
            min = lVar.i(this.f4092e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            lVar.h += min;
        } else {
            lVar = this;
            min = Math.min(i11, i14);
        }
        System.arraycopy(lVar.f4092e, lVar.f4093f, bArr, i10, min);
        lVar.f4093f += min;
        return min;
    }

    @Override
    public final boolean e(int i10, boolean z10) {
        int min = Math.min(this.h, i10);
        j(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            byte[] bArr = this.f4089a;
            i11 = i(bArr, -i11, Math.min(i10, bArr.length + i11), i11, z10);
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
    public final boolean f(byte[] bArr, int i10, int i11, boolean z10) {
        if (!s(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f4092e, this.f4093f - i11, bArr, i10, i11);
        return true;
    }

    @Override
    public final long g() {
        return this.d + this.f4093f;
    }

    @Override
    public final long getLength() {
        return this.f4091c;
    }

    @Override
    public final long getPosition() {
        return this.d;
    }

    @Override
    public final void h(int i10) {
        s(i10, false);
    }

    public final int i(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int read = this.f4090b.read(bArr, i10 + i12, i11 - i12);
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

    public final void j(int i10) {
        byte[] bArr;
        int i11 = this.h - i10;
        this.h = i11;
        this.f4093f = 0;
        byte[] bArr2 = this.f4092e;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[65536 + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.f4092e = bArr;
    }

    @Override
    public final void m() {
        this.f4093f = 0;
    }

    @Override
    public final void o(int i10) {
        e(i10, false);
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        l lVar;
        int i12 = this.h;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.f4092e, 0, bArr, i10, min);
            j(min);
            i13 = min;
        }
        if (i13 == 0) {
            lVar = this;
            i13 = lVar.i(bArr, i10, i11, 0, true);
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
    public final boolean s(int i10, boolean z10) {
        a(i10);
        int i11 = this.h - this.f4093f;
        while (i11 < i10) {
            int i12 = i10;
            boolean z11 = z10;
            i11 = i(this.f4092e, this.f4093f, i12, i11, z11);
            if (i11 == -1) {
                return false;
            }
            this.h = this.f4093f + i11;
            i10 = i12;
            z10 = z11;
        }
        this.f4093f += i10;
        return true;
    }

    @Override
    public final int skip(int i10) {
        l lVar;
        int min = Math.min(this.h, i10);
        j(min);
        if (min == 0) {
            byte[] bArr = this.f4089a;
            lVar = this;
            min = lVar.i(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            lVar = this;
        }
        if (min != -1) {
            lVar.d += min;
        }
        return min;
    }
}
