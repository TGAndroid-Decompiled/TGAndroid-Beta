package e3;

import d2.o0;
import g2.n0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
public final class l implements p {
    public final d2.o f9493b;
    public final long f9494c;
    public long d;
    public int f9496f;
    public int h;
    public byte[] f9495e = new byte[65536];
    public final byte[] f9492a = new byte[4096];

    static {
        o0.a("media3.extractor");
    }

    public l(d2.o oVar, long j10, long j11) {
        this.f9493b = oVar;
        this.d = j10;
        this.f9494c = j11;
    }

    public final void a(int i3) {
        int i10 = this.f9496f + i3;
        byte[] bArr = this.f9495e;
        if (i10 > bArr.length) {
            this.f9495e = Arrays.copyOf(this.f9495e, n0.i(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    public final int b(byte[] bArr, int i3, int i10, int i11, boolean z10) {
        if (!Thread.interrupted()) {
            int read = this.f9493b.read(bArr, i3 + i11, i10 - i11);
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
    public final void c(int i3, int i10, byte[] bArr) {
        h(bArr, i3, i10, false);
    }

    @Override
    public final boolean d(byte[] bArr, int i3, int i10, boolean z10) {
        int min;
        int i11 = this.h;
        if (i11 == 0) {
            min = 0;
        } else {
            min = Math.min(i11, i10);
            System.arraycopy(this.f9495e, 0, bArr, i3, min);
            f(min);
        }
        int i12 = min;
        while (i12 < i10 && i12 != -1) {
            i12 = b(bArr, i3, i10, i12, z10);
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
    public final int e(int i3, int i10, byte[] bArr) {
        l lVar;
        int min;
        a(i10);
        int i11 = this.h;
        int i12 = this.f9496f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            lVar = this;
            min = lVar.b(this.f9495e, i12, i10, 0, true);
            if (min == -1) {
                return -1;
            }
            lVar.h += min;
        } else {
            lVar = this;
            min = Math.min(i10, i13);
        }
        System.arraycopy(lVar.f9495e, lVar.f9496f, bArr, i3, min);
        lVar.f9496f += min;
        return min;
    }

    public final void f(int i3) {
        byte[] bArr;
        int i10 = this.h - i3;
        this.h = i10;
        this.f9496f = 0;
        byte[] bArr2 = this.f9495e;
        if (i10 < bArr2.length - 524288) {
            bArr = new byte[65536 + i10];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i3, bArr, 0, i10);
        this.f9495e = bArr;
    }

    @Override
    public final boolean g(int i3, boolean z10) {
        int min = Math.min(this.h, i3);
        f(min);
        int i10 = min;
        while (i10 < i3 && i10 != -1) {
            byte[] bArr = this.f9492a;
            i10 = b(bArr, -i10, Math.min(i3, bArr.length + i10), i10, z10);
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
    public final long getLength() {
        return this.f9494c;
    }

    @Override
    public final long getPosition() {
        return this.d;
    }

    @Override
    public final boolean h(byte[] bArr, int i3, int i10, boolean z10) {
        if (!w(i10, z10)) {
            return false;
        }
        System.arraycopy(this.f9495e, this.f9496f - i10, bArr, i3, i10);
        return true;
    }

    @Override
    public final long k() {
        return this.d + this.f9496f;
    }

    @Override
    public final void n(int i3) {
        w(i3, false);
    }

    @Override
    public final void o() {
        this.f9496f = 0;
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        l lVar;
        int i11 = this.h;
        int i12 = 0;
        if (i11 != 0) {
            int min = Math.min(i11, i10);
            System.arraycopy(this.f9495e, 0, bArr, i3, min);
            f(min);
            i12 = min;
        }
        if (i12 == 0) {
            lVar = this;
            i12 = lVar.b(bArr, i3, i10, 0, true);
        } else {
            lVar = this;
        }
        if (i12 != -1) {
            lVar.d += i12;
        }
        return i12;
    }

    @Override
    public final void readFully(byte[] bArr, int i3, int i10) {
        d(bArr, i3, i10, false);
    }

    @Override
    public final int skip(int i3) {
        l lVar;
        int min = Math.min(this.h, i3);
        f(min);
        if (min == 0) {
            byte[] bArr = this.f9492a;
            lVar = this;
            min = lVar.b(bArr, 0, Math.min(i3, bArr.length), 0, true);
        } else {
            lVar = this;
        }
        if (min != -1) {
            lVar.d += min;
        }
        return min;
    }

    @Override
    public final void u(int i3) {
        g(i3, false);
    }

    @Override
    public final boolean w(int i3, boolean z10) {
        a(i3);
        int i10 = this.h - this.f9496f;
        while (i10 < i3) {
            int i11 = i3;
            boolean z11 = z10;
            i10 = b(this.f9495e, this.f9496f, i11, i10, z11);
            if (i10 == -1) {
                return false;
            }
            this.h = this.f9496f + i10;
            i3 = i11;
            z10 = z11;
        }
        this.f9496f += i3;
        return true;
    }
}
