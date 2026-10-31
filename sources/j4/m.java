package j4;

import c3.k0;
import v7.t6;
public final class m {
    public final k0 f9519a;
    public boolean f9520b;
    public boolean f9521c;
    public boolean d;
    public int e;
    public int f9522f;
    public long f9523g;
    public long h;

    public m(k0 k0Var) {
        this.f9519a = k0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z10;
        if (this.f9521c) {
            int i12 = this.f9522f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f9521c = false;
                return;
            }
            this.f9522f = (i11 - i10) + i12;
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
        if (this.e == 182 && z10 && this.f9520b) {
            boolean z12 = this.d;
            long j11 = this.h;
            this.f9519a.c(j11, z12 ? 1 : 0, (int) (j10 - this.f9523g), i10, null);
        }
        if (this.e != 179) {
            this.f9523g = j10;
        }
    }
}
