package j4;

import c3.i0;
import v7.u6;
public final class m {
    public final i0 f12685a;
    public boolean f12686b;
    public boolean f12687c;
    public boolean d;
    public int e;
    public int f12688f;
    public long f12689g;
    public long h;

    public m(i0 i0Var) {
        this.f12685a = i0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z10;
        if (this.f12687c) {
            int i12 = this.f12688f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f12687c = false;
                return;
            }
            this.f12688f = (i11 - i10) + i12;
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
        if (this.e == 182 && z10 && this.f12686b) {
            boolean z12 = this.d;
            long j11 = this.h;
            this.f12685a.c(j11, z12 ? 1 : 0, (int) (j10 - this.f12689g), i10, null);
        }
        if (this.e != 179) {
            this.f12689g = j10;
        }
    }
}
