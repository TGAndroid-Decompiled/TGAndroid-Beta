package m3;

import d5.f0;
import h3.r0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
public final class h implements l {
    public final com.google.android.exoplayer2.upstream.j f17235b;
    public final long f17236c;
    public long d;
    public int f17238f;
    public int h;
    public byte[] f17237e = new byte[65536];
    public final byte[] f17234a = new byte[4096];

    static {
        r0.a("goog.exo.extractor");
    }

    public h(com.google.android.exoplayer2.upstream.j jVar, long j10, long j11) {
        this.f17235b = jVar;
        this.d = j10;
        this.f17236c = j11;
    }

    public final boolean a(int i9, boolean z10) {
        b(i9);
        int i10 = this.h - this.f17238f;
        while (i10 < i9) {
            int i11 = i9;
            boolean z11 = z10;
            i10 = f(this.f17237e, this.f17238f, i11, i10, z11);
            if (i10 == -1) {
                return false;
            }
            this.h = this.f17238f + i10;
            i9 = i11;
            z10 = z11;
        }
        this.f17238f += i9;
        return true;
    }

    public final void b(int i9) {
        int i10 = this.f17238f + i9;
        byte[] bArr = this.f17237e;
        if (i10 > bArr.length) {
            this.f17237e = Arrays.copyOf(this.f17237e, f0.h(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    @Override
    public final void c(int i9, int i10, byte[] bArr) {
        g(bArr, i9, i10, false);
    }

    @Override
    public final boolean d(byte[] bArr, int i9, int i10, boolean z10) {
        int min;
        int i11 = this.h;
        if (i11 == 0) {
            min = 0;
        } else {
            min = Math.min(i11, i10);
            System.arraycopy(this.f17237e, 0, bArr, i9, min);
            h(min);
        }
        int i12 = min;
        while (i12 < i10 && i12 != -1) {
            i12 = f(bArr, i9, i10, i12, z10);
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
    public final int e(int i9, int i10, byte[] bArr) {
        h hVar;
        int min;
        b(i10);
        int i11 = this.h;
        int i12 = this.f17238f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            hVar = this;
            min = hVar.f(this.f17237e, i12, i10, 0, true);
            if (min == -1) {
                return -1;
            }
            hVar.h += min;
        } else {
            hVar = this;
            min = Math.min(i10, i13);
        }
        System.arraycopy(hVar.f17237e, hVar.f17238f, bArr, i9, min);
        hVar.f17238f += min;
        return min;
    }

    public final int f(byte[] bArr, int i9, int i10, int i11, boolean z10) {
        if (!Thread.interrupted()) {
            int read = this.f17235b.read(bArr, i9 + i11, i10 - i11);
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
    public final boolean g(byte[] bArr, int i9, int i10, boolean z10) {
        if (!a(i10, z10)) {
            return false;
        }
        System.arraycopy(this.f17237e, this.f17238f - i10, bArr, i9, i10);
        return true;
    }

    @Override
    public final long getLength() {
        return this.f17236c;
    }

    @Override
    public final long getPosition() {
        return this.d;
    }

    public final void h(int i9) {
        byte[] bArr;
        int i10 = this.h - i9;
        this.h = i10;
        this.f17238f = 0;
        byte[] bArr2 = this.f17237e;
        if (i10 < bArr2.length - 524288) {
            bArr = new byte[65536 + i10];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i9, bArr, 0, i10);
        this.f17237e = bArr;
    }

    @Override
    public final long k() {
        return this.d + this.f17238f;
    }

    @Override
    public final void n(int i9) {
        a(i9, false);
    }

    @Override
    public final int read(byte[] bArr, int i9, int i10) {
        h hVar;
        int i11 = this.h;
        int i12 = 0;
        if (i11 != 0) {
            int min = Math.min(i11, i10);
            System.arraycopy(this.f17237e, 0, bArr, i9, min);
            h(min);
            i12 = min;
        }
        if (i12 == 0) {
            hVar = this;
            i12 = hVar.f(bArr, i9, i10, 0, true);
        } else {
            hVar = this;
        }
        if (i12 != -1) {
            hVar.d += i12;
        }
        return i12;
    }

    @Override
    public final void readFully(byte[] bArr, int i9, int i10) {
        d(bArr, i9, i10, false);
    }

    @Override
    public final int skip(int i9) {
        h hVar;
        int min = Math.min(this.h, i9);
        h(min);
        if (min == 0) {
            byte[] bArr = this.f17234a;
            hVar = this;
            min = hVar.f(bArr, 0, Math.min(i9, bArr.length), 0, true);
        } else {
            hVar = this;
        }
        if (min != -1) {
            hVar.d += min;
        }
        return min;
    }

    @Override
    public final void t() {
        this.f17238f = 0;
    }

    @Override
    public final void u(int i9) {
        int min = Math.min(this.h, i9);
        h(min);
        int i10 = min;
        while (i10 < i9 && i10 != -1) {
            byte[] bArr = this.f17234a;
            i10 = f(bArr, -i10, Math.min(i9, bArr.length + i10), i10, false);
        }
        if (i10 != -1) {
            this.d += i10;
        }
    }
}
