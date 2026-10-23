package c3;

import v7.u6;
public final class m0 {
    public final byte[] f4650a = new byte[10];
    public boolean f4651b;
    public int f4652c;
    public long d;
    public int e;
    public int f4653f;
    public int f4654g;

    public final void a(l0 l0Var, k0 k0Var) {
        if (this.f4652c > 0) {
            l0Var.c(this.d, this.e, this.f4653f, this.f4654g, k0Var);
            this.f4652c = 0;
        }
    }

    public final void b(l0 l0Var, long j10, int i10, int i11, int i12, k0 k0Var) {
        boolean z10;
        if (this.f4654g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.o("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f4651b) {
            int i13 = this.f4652c;
            int i14 = i13 + 1;
            this.f4652c = i14;
            if (i13 == 0) {
                this.d = j10;
                this.e = i10;
                this.f4653f = 0;
            }
            this.f4653f += i11;
            this.f4654g = i12;
            if (i14 >= 16) {
                a(l0Var, k0Var);
            }
        }
    }

    public final void c(r rVar) {
        char c10;
        if (!this.f4651b) {
            int i10 = 0;
            byte[] bArr = this.f4650a;
            rVar.a(0, 10, bArr);
            rVar.q();
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
            this.f4651b = true;
        }
    }
}
