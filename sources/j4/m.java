package j4;

import c3.l0;
import v7.u6;
public final class m {
    public final l0 f14144a;
    public boolean f14145b;
    public boolean f14146c;
    public boolean d;
    public int e;
    public int f14147f;
    public long f14148g;
    public long h;

    public m(l0 l0Var) {
        this.f14144a = l0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z10;
        if (this.f14146c) {
            int i12 = this.f14147f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f14146c = false;
                return;
            }
            this.f14147f = (i11 - i10) + i12;
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
        if (this.e == 182 && z10 && this.f14145b) {
            boolean z12 = this.d;
            long j11 = this.h;
            this.f14144a.c(j11, z12 ? 1 : 0, (int) (j10 - this.f14148g), i10, null);
        }
        if (this.e != 179) {
            this.f14148g = j10;
        }
    }
}
