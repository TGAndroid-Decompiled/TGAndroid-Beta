package m4;

import a8.ja;
import f3.i0;
public final class m {
    public final i0 f20300a;
    public boolean f20301b;
    public boolean f20302c;
    public boolean d;
    public int f20303e;
    public int f20304f;
    public long f20305g;
    public long h;

    public m(i0 i0Var) {
        this.f20300a = i0Var;
    }

    public final void a(int i7, int i10, byte[] bArr) {
        boolean z10;
        if (this.f20302c) {
            int i11 = this.f20304f;
            int i12 = (i7 + 1) - i11;
            if (i12 < i10) {
                if (((bArr[i12] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f20302c = false;
                return;
            }
            this.f20304f = (i10 - i7) + i11;
        }
    }

    public final void b(int i7, long j3, boolean z10) {
        boolean z11;
        if (this.h != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        ja.p(z11);
        if (this.f20303e == 182 && z10 && this.f20301b) {
            boolean z12 = this.d;
            long j10 = this.h;
            this.f20300a.c(j10, z12 ? 1 : 0, (int) (j3 - this.f20305g), i7, null);
        }
        if (this.f20303e != 179) {
            this.f20305g = j3;
        }
    }
}
