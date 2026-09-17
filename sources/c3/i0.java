package c3;
public final class i0 {
    public final byte[] f3771a = new byte[10];
    public boolean f3772b;
    public int f3773c;
    public long d;
    public int e;
    public int f3774f;
    public int f3775g;

    public final void a(h0 h0Var, g0 g0Var) {
        if (this.f3773c > 0) {
            h0Var.c(this.d, this.e, this.f3774f, this.f3775g, g0Var);
            this.f3773c = 0;
        }
    }

    public final void b(h0 h0Var, long j3, int i10, int i11, int i12, g0 g0Var) {
        boolean z10;
        if (this.f3775g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.f("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f3772b) {
            int i13 = this.f3773c;
            int i14 = i13 + 1;
            this.f3773c = i14;
            if (i13 == 0) {
                this.d = j3;
                this.e = i10;
                this.f3774f = 0;
            }
            this.f3774f += i11;
            this.f3775g = i12;
            if (i14 >= 16) {
                a(h0Var, g0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c10;
        if (!this.f3772b) {
            int i10 = 0;
            byte[] bArr = this.f3771a;
            pVar.a(0, 10, bArr);
            pVar.p();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b10 = bArr[7];
                if ((b10 & 254) == 186) {
                    if ((b10 & 255) == 187) {
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        c10 = '\t';
                    } else {
                        c10 = '\b';
                    }
                    i10 = 40 << ((bArr[c10] >> 4) & 7);
                }
            }
            if (i10 == 0) {
                return;
            }
            this.f3772b = true;
        }
    }
}
