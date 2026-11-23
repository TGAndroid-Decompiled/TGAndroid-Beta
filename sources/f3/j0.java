package f3;

import a8.ma;
public final class j0 {
    public final byte[] f11164a = new byte[10];
    public boolean f11165b;
    public int f11166c;
    public long d;
    public int f11167e;
    public int f11168f;
    public int f11169g;

    public final void a(i0 i0Var, h0 h0Var) {
        if (this.f11166c > 0) {
            i0Var.c(this.d, this.f11167e, this.f11168f, this.f11169g, h0Var);
            this.f11166c = 0;
        }
    }

    public final void b(i0 i0Var, long j3, int i7, int i10, int i11, h0 h0Var) {
        boolean z10;
        if (this.f11169g <= i10 + i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.o("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f11165b) {
            int i12 = this.f11166c;
            int i13 = i12 + 1;
            this.f11166c = i13;
            if (i12 == 0) {
                this.d = j3;
                this.f11167e = i7;
                this.f11168f = 0;
            }
            this.f11168f += i10;
            this.f11169g = i11;
            if (i13 >= 16) {
                a(i0Var, h0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c10;
        if (!this.f11165b) {
            int i7 = 0;
            byte[] bArr = this.f11164a;
            pVar.b(0, 10, bArr);
            pVar.n();
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
            this.f11165b = true;
        }
    }
}
