package m4;

import a8.ia;
import f3.j0;
public final class m {
    public final j0 f19711a;
    public boolean f19712b;
    public boolean f19713c;
    public boolean d;
    public int f19714e;
    public int f19715f;
    public long f19716g;
    public long h;

    public m(j0 j0Var) {
        this.f19711a = j0Var;
    }

    public final void a(int i7, int i10, byte[] bArr) {
        boolean z9;
        if (this.f19713c) {
            int i11 = this.f19715f;
            int i12 = (i7 + 1) - i11;
            if (i12 < i10) {
                if (((bArr[i12] & 192) >> 6) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.d = z9;
                this.f19713c = false;
                return;
            }
            this.f19715f = (i10 - i7) + i11;
        }
    }

    public final void b(int i7, long j3, boolean z9) {
        boolean z10;
        if (this.h != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        ia.p(z10);
        if (this.f19714e == 182 && z9 && this.f19712b) {
            boolean z11 = this.d;
            long j10 = this.h;
            this.f19711a.c(j10, z11 ? 1 : 0, (int) (j3 - this.f19716g), i7, null);
        }
        if (this.f19714e != 179) {
            this.f19716g = j3;
        }
    }
}
