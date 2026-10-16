package j4;

import c3.i0;
import v7.u6;
public final class m {
    public final i0 f12689a;
    public boolean f12690b;
    public boolean f12691c;
    public boolean d;
    public int e;
    public int f12692f;
    public long f12693g;
    public long h;

    public m(i0 i0Var) {
        this.f12689a = i0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z10;
        if (this.f12691c) {
            int i12 = this.f12692f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f12691c = false;
                return;
            }
            this.f12692f = (i11 - i10) + i12;
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
        if (this.e == 182 && z10 && this.f12690b) {
            boolean z12 = this.d;
            long j11 = this.h;
            this.f12689a.c(j11, z12 ? 1 : 0, (int) (j10 - this.f12693g), i10, null);
        }
        if (this.e != 179) {
            this.f12693g = j10;
        }
    }
}
