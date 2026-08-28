package j4;

import android.net.Uri;
import java.util.Map;
public final class p implements com.google.android.exoplayer2.upstream.m {
    public final com.google.android.exoplayer2.upstream.m f13529a;
    public final int f13530b;
    public final p0 f13531c;
    public final byte[] d;
    public int f13532e;

    public p(com.google.android.exoplayer2.upstream.m mVar, int i9, p0 p0Var) {
        boolean z10;
        if (i9 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        this.f13529a = mVar;
        this.f13530b = i9;
        this.f13531c = p0Var;
        this.d = new byte[1];
        this.f13532e = i9;
    }

    @Override
    public final void addTransferListener(com.google.android.exoplayer2.upstream.y0 y0Var) {
        y0Var.getClass();
        this.f13529a.addTransferListener(y0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f13529a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f13529a.getUri();
    }

    @Override
    public final long open(com.google.android.exoplayer2.upstream.q qVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i9, int i10) {
        long max;
        int i11 = this.f13532e;
        com.google.android.exoplayer2.upstream.m mVar = this.f13529a;
        if (i11 == 0) {
            byte[] bArr2 = this.d;
            int i12 = 0;
            if (mVar.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int read = mVar.read(bArr3, i12, i14);
                        if (read != -1) {
                            i12 += read;
                            i14 -= read;
                        }
                    }
                    while (i13 > 0 && bArr3[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        d5.y yVar = new d5.y(bArr3, i13);
                        p0 p0Var = this.f13531c;
                        if (!p0Var.f13541w) {
                            max = p0Var.f13539r;
                        } else {
                            max = Math.max(p0Var.f13542x.l(true), p0Var.f13539r);
                        }
                        long j10 = max;
                        int a2 = yVar.a();
                        a1 a1Var = p0Var.v;
                        a1Var.getClass();
                        a1Var.d(a2, yVar);
                        a1Var.e(j10, 1, a2, 0, null);
                        p0Var.f13541w = true;
                    }
                }
                this.f13532e = this.f13530b;
            }
            return -1;
        }
        int read2 = mVar.read(bArr, i9, Math.min(this.f13532e, i10));
        if (read2 != -1) {
            this.f13532e -= read2;
        }
        return read2;
    }
}
