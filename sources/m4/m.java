package m4;

import a8.ma;
import f3.j0;
public final class m {
    public final j0 f20754a;
    public boolean f20755b;
    public boolean f20756c;
    public boolean d;
    public int f20757e;
    public int f20758f;
    public long f20759g;
    public long h;

    public m(j0 j0Var) {
        this.f20754a = j0Var;
    }

    public final void a(int i7, int i10, byte[] bArr) {
        boolean z10;
        if (this.f20756c) {
            int i11 = this.f20758f;
            int i12 = (i7 + 1) - i11;
            if (i12 < i10) {
                if (((bArr[i12] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f20756c = false;
                return;
            }
            this.f20758f = (i10 - i7) + i11;
        }
    }

    public final void b(int i7, long j3, boolean z10) {
        boolean z11;
        if (this.h != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        ma.p(z11);
        if (this.f20757e == 182 && z10 && this.f20755b) {
            boolean z12 = this.d;
            long j10 = this.h;
            this.f20754a.c(j10, z12 ? 1 : 0, (int) (j3 - this.f20759g), i7, null);
        }
        if (this.f20757e != 179) {
            this.f20759g = j3;
        }
    }
}
