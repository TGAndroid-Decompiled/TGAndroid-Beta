package j4;

import c3.k0;
import v7.t6;
public final class m {
    public final k0 f9520a;
    public boolean f9521b;
    public boolean f9522c;
    public boolean d;
    public int e;
    public int f9523f;
    public long f9524g;
    public long h;

    public m(k0 k0Var) {
        this.f9520a = k0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z10;
        if (this.f9522c) {
            int i12 = this.f9523f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f9522c = false;
                return;
            }
            this.f9523f = (i11 - i10) + i12;
        }
    }

    public final void b(int i10, long j10, boolean z10) {
        boolean z11;
        if (this.h != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        t6.p(z11);
        if (this.e == 182 && z10 && this.f9521b) {
            boolean z12 = this.d;
            long j11 = this.h;
            this.f9520a.c(j11, z12 ? 1 : 0, (int) (j10 - this.f9524g), i10, null);
        }
        if (this.e != 179) {
            this.f9524g = j10;
        }
    }
}
