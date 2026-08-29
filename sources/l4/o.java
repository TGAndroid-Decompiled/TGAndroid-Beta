package l4;

import android.net.Uri;
import java.util.Map;
public final class o implements com.google.android.exoplayer2.upstream.m {
    public final com.google.android.exoplayer2.upstream.m f14385a;
    public final int f14386b;
    public final o0 f14387c;
    public final byte[] d;
    public int f14388e;

    public o(com.google.android.exoplayer2.upstream.m mVar, int i10, o0 o0Var) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        this.f14385a = mVar;
        this.f14386b = i10;
        this.f14387c = o0Var;
        this.d = new byte[1];
        this.f14388e = i10;
    }

    @Override
    public final void addTransferListener(com.google.android.exoplayer2.upstream.y0 y0Var) {
        y0Var.getClass();
        this.f14385a.addTransferListener(y0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f14385a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f14385a.getUri();
    }

    @Override
    public final long open(com.google.android.exoplayer2.upstream.q qVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.f14388e;
        com.google.android.exoplayer2.upstream.m mVar = this.f14385a;
        if (i12 == 0) {
            byte[] bArr2 = this.d;
            int i13 = 0;
            if (mVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int read = mVar.read(bArr3, i13, i15);
                        if (read != -1) {
                            i13 += read;
                            i15 -= read;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        f5.w wVar = new f5.w(bArr3, i14);
                        o0 o0Var = this.f14387c;
                        if (!o0Var.f14397w) {
                            max = o0Var.f14395r;
                        } else {
                            max = Math.max(o0Var.f14398x.i(true), o0Var.f14395r);
                        }
                        long j10 = max;
                        int a2 = wVar.a();
                        b1 b1Var = o0Var.v;
                        b1Var.getClass();
                        b1Var.d(a2, wVar);
                        b1Var.c(j10, 1, a2, 0, null);
                        o0Var.f14397w = true;
                    }
                }
                this.f14388e = this.f14386b;
            }
            return -1;
        }
        int read2 = mVar.read(bArr, i10, Math.min(this.f14388e, i11));
        if (read2 != -1) {
            this.f14388e -= read2;
        }
        return read2;
    }
}
