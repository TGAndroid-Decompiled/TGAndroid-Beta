package m4;

import a8.ia;
import f3.j0;
public final class m {
    public final j0 f19703a;
    public boolean f19704b;
    public boolean f19705c;
    public boolean d;
    public int f19706e;
    public int f19707f;
    public long f19708g;
    public long h;

    public m(j0 j0Var) {
        this.f19703a = j0Var;
    }

    public final void a(int i7, int i10, byte[] bArr) {
        boolean z9;
        if (this.f19705c) {
            int i11 = this.f19707f;
            int i12 = (i7 + 1) - i11;
            if (i12 < i10) {
                if (((bArr[i12] & 192) >> 6) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.d = z9;
                this.f19705c = false;
                return;
            }
            this.f19707f = (i10 - i7) + i11;
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
        if (this.f19706e == 182 && z9 && this.f19704b) {
            boolean z11 = this.d;
            long j10 = this.h;
            this.f19703a.c(j10, z11 ? 1 : 0, (int) (j3 - this.f19708g), i7, null);
        }
        if (this.f19706e != 179) {
            this.f19708g = j3;
        }
    }
}
