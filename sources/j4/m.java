package j4;

import a8.yb;
import c3.j0;
public final class m {
    public final j0 f15357a;
    public boolean f15358b;
    public boolean f15359c;
    public boolean d;
    public int e;
    public int f15360f;
    public long f15361g;
    public long h;

    public m(j0 j0Var) {
        this.f15357a = j0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z10;
        if (this.f15359c) {
            int i12 = this.f15360f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f15359c = false;
                return;
            }
            this.f15360f = (i11 - i10) + i12;
        }
    }

    public final void b(int i10, long j10, boolean z10) {
        boolean z11;
        if (this.h != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        yb.p(z11);
        if (this.e == 182 && z10 && this.f15358b) {
            boolean z12 = this.d;
            long j11 = this.h;
            this.f15357a.c(j11, z12 ? 1 : 0, (int) (j10 - this.f15361g), i10, null);
        }
        if (this.e != 179) {
            this.f15361g = j10;
        }
    }
}
