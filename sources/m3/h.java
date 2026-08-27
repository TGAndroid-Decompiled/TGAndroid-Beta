package m3;

import d5.g0;
import h3.r0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class h implements l {

    public final com.google.android.exoplayer2.upstream.j f17611b;

    public final long f17612c;
    public long d;

    public int f17614f;
    public int h;

    public byte[] f17613e = new byte[65536];

    public final byte[] f17610a = new byte[4096];

    static {
        r0.a("goog.exo.extractor");
    }

    public h(com.google.android.exoplayer2.upstream.j jVar, long j10, long j11) {
        this.f17611b = jVar;
        this.d = j10;
        this.f17612c = j11;
    }

    public final boolean a(int i10, boolean z10) throws EOFException, InterruptedIOException {
        c(i10);
        int iF = this.h - this.f17614f;
        while (iF < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iF = f(this.f17613e, this.f17614f, i11, iF, z11);
            if (iF == -1) {
                return false;
            }
            this.h = this.f17614f + iF;
            i10 = i11;
            z10 = z11;
        }
        this.f17614f += i10;
        return true;
    }

    @Override
    public final void b(int i10, int i11, byte[] bArr) {
        g(bArr, i10, i11, false);
    }

    public final void c(int i10) {
        int i11 = this.f17614f + i10;
        byte[] bArr = this.f17613e;
        if (i11 > bArr.length) {
            this.f17613e = Arrays.copyOf(this.f17613e, g0.h(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    @Override
    public final boolean d(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iMin;
        int i12 = this.h;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f17613e, 0, bArr, i10, iMin);
            h(iMin);
        }
        int iF = iMin;
        while (iF < i11 && iF != -1) {
            iF = f(bArr, i10, i11, iF, z10);
        }
        if (iF != -1) {
            this.d += (long) iF;
        }
        return iF != -1;
    }

    @Override
    public final int e(int i10, int i11, byte[] bArr) throws EOFException, InterruptedIOException {
        h hVar;
        int iMin;
        c(i11);
        int i12 = this.h;
        int i13 = this.f17614f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            hVar = this;
            iMin = hVar.f(this.f17613e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            hVar.h += iMin;
        } else {
            hVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(hVar.f17613e, hVar.f17614f, bArr, i10, iMin);
        hVar.f17614f += iMin;
        return iMin;
    }

    public final int f(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f17611b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override
    public final boolean g(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f17613e, this.f17614f - i11, bArr, i10, i11);
        return true;
    }

    @Override
    public final long getLength() {
        return this.f17612c;
    }

    @Override
    public final long getPosition() {
        return this.d;
    }

    public final void h(int i10) {
        int i11 = this.h - i10;
        this.h = i11;
        this.f17614f = 0;
        byte[] bArr = this.f17613e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f17613e = bArr2;
    }

    @Override
    public final long i() {
        return this.d + ((long) this.f17614f);
    }

    @Override
    public final void j(int i10) throws EOFException, InterruptedIOException {
        a(i10, false);
    }

    @Override
    public final void q() {
        this.f17614f = 0;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        h hVar;
        int i12 = this.h;
        int iF = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f17613e, 0, bArr, i10, iMin);
            h(iMin);
            iF = iMin;
        }
        if (iF == 0) {
            hVar = this;
            iF = hVar.f(bArr, i10, i11, 0, true);
        } else {
            hVar = this;
        }
        if (iF != -1) {
            hVar.d += (long) iF;
        }
        return iF;
    }

    @Override
    public final void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        d(bArr, i10, i11, false);
    }

    @Override
    public final int skip(int i10) throws EOFException, InterruptedIOException {
        h hVar;
        int iMin = Math.min(this.h, i10);
        h(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f17610a;
            hVar = this;
            iMin = hVar.f(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            hVar = this;
        }
        if (iMin != -1) {
            hVar.d += (long) iMin;
        }
        return iMin;
    }

    @Override
    public final void t(int i10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.h, i10);
        h(iMin);
        int iF = iMin;
        while (iF < i10 && iF != -1) {
            byte[] bArr = this.f17610a;
            iF = f(bArr, -iF, Math.min(i10, bArr.length + iF), iF, false);
        }
        if (iF != -1) {
            this.d += (long) iF;
        }
    }
}
