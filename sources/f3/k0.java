package f3;

import a8.ma;
public final class k0 {
    public final byte[] f11174a = new byte[10];
    public boolean f11175b;
    public int f11176c;
    public long d;
    public int f11177e;
    public int f11178f;
    public int f11179g;

    public final void a(j0 j0Var, i0 i0Var) {
        if (this.f11176c > 0) {
            j0Var.c(this.d, this.f11177e, this.f11178f, this.f11179g, i0Var);
            this.f11176c = 0;
        }
    }

    public final void b(j0 j0Var, long j3, int i7, int i10, int i11, i0 i0Var) {
        boolean z10;
        if (this.f11179g <= i10 + i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.o("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f11175b) {
            int i12 = this.f11176c;
            int i13 = i12 + 1;
            this.f11176c = i13;
            if (i12 == 0) {
                this.d = j3;
                this.f11177e = i7;
                this.f11178f = 0;
            }
            this.f11178f += i10;
            this.f11179g = i11;
            if (i13 >= 16) {
                a(j0Var, i0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c10;
        if (!this.f11175b) {
            int i7 = 0;
            byte[] bArr = this.f11174a;
            pVar.b(0, 10, bArr);
            pVar.o();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b10 = bArr[7];
                if ((b10 & 254) == 186) {
                    if ((b10 & 255) == 187) {
                        i7 = 1;
                    }
                    if (i7 != 0) {
                        c10 = '\t';
                    } else {
                        c10 = '\b';
                    }
                    i7 = 40 << ((bArr[c10] >> 4) & 7);
                }
            }
            if (i7 == 0) {
                return;
            }
            this.f11175b = true;
        }
    }
}
