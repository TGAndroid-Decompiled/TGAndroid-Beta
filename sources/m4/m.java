package m4;

import a8.ia;
import f3.j0;
public final class m {
    public final j0 f19706a;
    public boolean f19707b;
    public boolean f19708c;
    public boolean d;
    public int f19709e;
    public int f19710f;
    public long f19711g;
    public long h;

    public m(j0 j0Var) {
        this.f19706a = j0Var;
    }

    public final void a(int i7, int i10, byte[] bArr) {
        boolean z9;
        if (this.f19708c) {
            int i11 = this.f19710f;
            int i12 = (i7 + 1) - i11;
            if (i12 < i10) {
                if (((bArr[i12] & 192) >> 6) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.d = z9;
                this.f19708c = false;
                return;
            }
            this.f19710f = (i10 - i7) + i11;
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
        if (this.f19709e == 182 && z9 && this.f19707b) {
            boolean z11 = this.d;
            long j10 = this.h;
            this.f19706a.c(j10, z11 ? 1 : 0, (int) (j3 - this.f19711g), i7, null);
        }
        if (this.f19709e != 179) {
            this.f19711g = j3;
        }
    }
}
