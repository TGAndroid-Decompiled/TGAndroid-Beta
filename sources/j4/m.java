package j4;

import c3.h0;
public final class m {
    public final h0 f12726a;
    public boolean f12727b;
    public boolean f12728c;
    public boolean d;
    public int e;
    public int f12729f;
    public long f12730g;
    public long h;

    public m(h0 h0Var) {
        this.f12726a = h0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z10;
        if (this.f12728c) {
            int i12 = this.f12729f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f12728c = false;
                return;
            }
            this.f12729f = (i11 - i10) + i12;
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
        if (this.e == 182 && z10 && this.f12727b) {
            boolean z12 = this.d;
            long j10 = this.h;
            this.f12726a.c(j10, z12 ? 1 : 0, (int) (j3 - this.f12730g), i10, null);
        }
        if (this.e != 179) {
            this.f12730g = j3;
        }
    }
}
