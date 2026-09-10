package j4;
public final class m {
    public final c3.h0 f11622a;
    public boolean f11623b;
    public boolean f11624c;
    public boolean d;
    public int e;
    public int f11625f;
    public long f11626g;
    public long h;

    public m(c3.h0 h0Var) {
        this.f11622a = h0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z10;
        if (this.f11624c) {
            int i12 = this.f11625f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f11624c = false;
                return;
            }
            this.f11625f = (i11 - i10) + i12;
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
        if (this.e == 182 && z10 && this.f11623b) {
            boolean z12 = this.d;
            long j10 = this.h;
            this.f11622a.c(j10, z12 ? 1 : 0, (int) (j3 - this.f11626g), i10, null);
        }
        if (this.e != 179) {
            this.f11626g = j3;
        }
    }
}
