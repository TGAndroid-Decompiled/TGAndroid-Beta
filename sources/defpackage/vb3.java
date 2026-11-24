package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
public final class vb3 implements t84 {
    public final s73 b;
    public final long c;
    public long d;
    public int f;
    public int h;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        ct6.a("media3.extractor");
    }

    public vb3(s73 s73Var, long j, long j2) {
        this.b = s73Var;
        this.d = j;
        this.c = j2;
    }

    public final boolean a(int i, boolean z) {
        e(i);
        int i2 = this.h - this.f;
        while (i2 < i) {
            vb3 vb3Var = this;
            int i3 = i;
            boolean z2 = z;
            i2 = vb3Var.j(this.e, this.f, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            vb3Var.h = vb3Var.f + i2;
            this = vb3Var;
            i = i3;
            z = z2;
        }
        this.f += i;
        return true;
    }

    @Override
    public final void b(int i, int i2, byte[] bArr) {
        d(bArr, i, i2, false);
    }

    @Override
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.h;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            n(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = j(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        if (i4 == -1) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public final void e(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, hac.i(bArr.length << 1, 65536 + i2, i2 + 524288));
        }
    }

    @Override
    public final long f() {
        return this.d + this.f;
    }

    @Override
    public final void g(int i) {
        a(i, false);
    }

    @Override
    public final long getLength() {
        return this.c;
    }

    @Override
    public final long getPosition() {
        return this.d;
    }

    public final int h(int i, int i2, byte[] bArr) {
        vb3 vb3Var;
        int min;
        e(i2);
        int i3 = this.h;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            vb3Var = this;
            min = vb3Var.j(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            vb3Var.h += min;
        } else {
            vb3Var = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(vb3Var.e, vb3Var.f, bArr, i, min);
        vb3Var.f += min;
        return min;
    }

    @Override
    public final void i() {
        this.f = 0;
    }

    public final int j(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.b.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedIOException();
    }

    @Override
    public final void k(int i) {
        m(i, false);
    }

    public final int l(int i) {
        vb3 vb3Var;
        int min = Math.min(this.h, i);
        n(min);
        if (min == 0) {
            byte[] bArr = this.a;
            vb3Var = this;
            min = vb3Var.j(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            vb3Var = this;
        }
        if (min != -1) {
            vb3Var.d += min;
        }
        return min;
    }

    public final boolean m(int i, boolean z) {
        int min = Math.min(this.h, i);
        n(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.a;
            i2 = j(bArr, -i2, Math.min(i, bArr.length + i2), i2, z);
        }
        if (i2 != -1) {
            this.d += i2;
        }
        if (i2 != -1) {
            return true;
        }
        return false;
    }

    public final void n(int i) {
        byte[] bArr;
        int i2 = this.h - i;
        this.h = i2;
        this.f = 0;
        byte[] bArr2 = this.e;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[65536 + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.e = bArr;
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        vb3 vb3Var;
        int i3 = this.h;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            n(min);
            i4 = min;
        }
        if (i4 == 0) {
            vb3Var = this;
            i4 = vb3Var.j(bArr, i, i2, 0, true);
        } else {
            vb3Var = this;
        }
        if (i4 != -1) {
            vb3Var.d += i4;
        }
        return i4;
    }

    @Override
    public final void readFully(byte[] bArr, int i, int i2) {
        c(bArr, i, i2, false);
    }
}
