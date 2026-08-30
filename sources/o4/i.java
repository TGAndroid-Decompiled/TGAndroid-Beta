package o4;

import android.net.Uri;
import java.util.Map;
public final class i implements g5.m {
    public final g5.m f16350a;
    public final int f16351b;
    public final b0 f16352c;
    public final byte[] d;
    public int e;

    public i(g5.m mVar, int i10, b0 b0Var) {
        boolean z4;
        if (i10 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        this.f16350a = mVar;
        this.f16351b = i10;
        this.f16352c = b0Var;
        this.d = new byte[1];
        this.e = i10;
    }

    @Override
    public final void addTransferListener(g5.v0 v0Var) {
        v0Var.getClass();
        this.f16350a.addTransferListener(v0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f16350a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f16350a.getUri();
    }

    @Override
    public final long open(g5.p pVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.e;
        g5.m mVar = this.f16350a;
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
                        h5.w wVar = new h5.w(bArr3, i14);
                        b0 b0Var = this.f16352c;
                        if (!b0Var.f16301w) {
                            max = b0Var.f16299r;
                        } else {
                            max = Math.max(b0Var.f16302x.f(true), b0Var.f16299r);
                        }
                        long j10 = max;
                        int a2 = wVar.a();
                        k0 k0Var = b0Var.v;
                        k0Var.getClass();
                        k0Var.a(a2, wVar);
                        k0Var.c(j10, 1, a2, 0, null);
                        b0Var.f16301w = true;
                    }
                }
                this.e = this.f16351b;
            }
            return -1;
        }
        int read2 = mVar.read(bArr, i10, Math.min(this.e, i11));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}
