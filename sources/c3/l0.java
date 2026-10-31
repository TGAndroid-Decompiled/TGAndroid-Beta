package c3;

import v7.t6;
public final class l0 {
    public final byte[] f3673a = new byte[10];
    public boolean f3674b;
    public int f3675c;
    public long d;
    public int e;
    public int f3676f;
    public int f3677g;

    public final void a(k0 k0Var, j0 j0Var) {
        if (this.f3675c > 0) {
            k0Var.c(this.d, this.e, this.f3676f, this.f3677g, j0Var);
            this.f3675c = 0;
        }
    }

    public final void b(k0 k0Var, long j10, int i10, int i11, int i12, j0 j0Var) {
        boolean z10;
        if (this.f3677g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.o("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f3674b) {
            int i13 = this.f3675c;
            int i14 = i13 + 1;
            this.f3675c = i14;
            if (i13 == 0) {
                this.d = j10;
                this.e = i10;
                this.f3676f = 0;
            }
            this.f3676f += i11;
            this.f3677g = i12;
            if (i14 >= 16) {
                a(k0Var, j0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c10;
        if (!this.f3674b) {
            int i10 = 0;
            byte[] bArr = this.f3673a;
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
            this.f3674b = true;
        }
    }
}
