package c3;
public final class i0 {
    public final byte[] f4069a = new byte[10];
    public boolean f4070b;
    public int f4071c;
    public long d;
    public int f4072e;
    public int f4073f;
    public int f4074g;

    public final void a(h0 h0Var, g0 g0Var) {
        if (this.f4071c > 0) {
            h0Var.c(this.d, this.f4072e, this.f4073f, this.f4074g, g0Var);
            this.f4071c = 0;
        }
    }

    public final void b(h0 h0Var, long j3, int i10, int i11, int i12, g0 g0Var) {
        boolean z10;
        if (this.f4074g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.f("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f4070b) {
            int i13 = this.f4071c;
            int i14 = i13 + 1;
            this.f4071c = i14;
            if (i13 == 0) {
                this.d = j3;
                this.f4072e = i10;
                this.f4073f = 0;
            }
            this.f4073f += i11;
            this.f4074g = i12;
            if (i14 >= 16) {
                a(h0Var, g0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c10;
        if (!this.f4070b) {
            int i10 = 0;
            byte[] bArr = this.f4069a;
            pVar.b(0, 10, bArr);
            pVar.m();
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
            this.f4070b = true;
        }
    }
}
