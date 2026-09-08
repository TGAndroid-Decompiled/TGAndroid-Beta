package j4;

import c3.h0;
public final class m {
    public final h0 f13368a;
    public boolean f13369b;
    public boolean f13370c;
    public boolean d;
    public int f13371e;
    public int f13372f;
    public long f13373g;
    public long h;

    public m(h0 h0Var) {
        this.f13368a = h0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z10;
        if (this.f13370c) {
            int i12 = this.f13372f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f13370c = false;
                return;
            }
            this.f13372f = (i11 - i10) + i12;
        }
    }

    public final void b(int i10, long j3, boolean z10) {
        boolean z11;
        if (this.h != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.g(z11);
        if (this.f13371e == 182 && z10 && this.f13369b) {
            boolean z12 = this.d;
            long j10 = this.h;
            this.f13368a.c(j10, z12 ? 1 : 0, (int) (j3 - this.f13373g), i10, null);
        }
        if (this.f13371e != 179) {
            this.f13373g = j3;
        }
    }
}
