package j4;

import c3.j0;
import v7.u6;
public final class m {
    public final j0 f14101a;
    public boolean f14102b;
    public boolean f14103c;
    public boolean d;
    public int e;
    public int f14104f;
    public long f14105g;
    public long h;

    public m(j0 j0Var) {
        this.f14101a = j0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z10;
        if (this.f14103c) {
            int i12 = this.f14104f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f14103c = false;
                return;
            }
            this.f14104f = (i11 - i10) + i12;
        }
    }

    public final void b(int i10, long j10, boolean z10) {
        boolean z11;
        if (this.h != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.p(z11);
        if (this.e == 182 && z10 && this.f14102b) {
            boolean z12 = this.d;
            long j11 = this.h;
            this.f14101a.c(j11, z12 ? 1 : 0, (int) (j10 - this.f14105g), i10, null);
        }
        if (this.e != 179) {
            this.f14105g = j10;
        }
    }
}
