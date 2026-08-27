package j4;

import android.net.Uri;
import java.util.Map;

public final class o implements com.google.android.exoplayer2.upstream.m {

    public final com.google.android.exoplayer2.upstream.m f12626a;

    public final int f12627b;

    public final o0 f12628c;
    public final byte[] d;

    public int f12629e;

    public o(com.google.android.exoplayer2.upstream.m mVar, int i10, o0 o0Var) {
        d5.a.f(i10 > 0);
        this.f12626a = mVar;
        this.f12627b = i10;
        this.f12628c = o0Var;
        this.d = new byte[1];
        this.f12629e = i10;
    }

    @Override
    public final void addTransferListener(com.google.android.exoplayer2.upstream.y0 y0Var) {
        y0Var.getClass();
        this.f12626a.addTransferListener(y0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f12626a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f12626a.getUri();
    }

    @Override
    public final long open(com.google.android.exoplayer2.upstream.q qVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f12629e;
        com.google.android.exoplayer2.upstream.m mVar = this.f12626a;
        if (i12 == 0) {
            byte[] bArr2 = this.d;
            int i13 = 0;
            if (mVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int i16 = mVar.read(bArr3, i13, i15);
                        if (i16 != -1) {
                            i13 += i16;
                            i15 -= i16;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        d5.z zVar = new d5.z(bArr3, i14);
                        o0 o0Var = this.f12628c;
                        long jMax = !o0Var.f12638w ? o0Var.f12636r : Math.max(o0Var.f12639x.i(true), o0Var.f12636r);
                        int iA = zVar.a();
                        a1 a1Var = o0Var.v;
                        a1Var.getClass();
                        a1Var.d(iA, zVar);
                        a1Var.e(jMax, 1, iA, 0, null);
                        o0Var.f12638w = true;
                    }
                }
                this.f12629e = this.f12627b;
            }
            return -1;
        }
        int i17 = mVar.read(bArr, i10, Math.min(this.f12629e, i11));
        if (i17 != -1) {
            this.f12629e -= i17;
        }
        return i17;
    }
}
