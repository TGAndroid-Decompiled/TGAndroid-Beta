package c3;

import a8.yb;
public final class k0 {
    public final byte[] f6073a = new byte[10];
    public boolean f6074b;
    public int f6075c;
    public long d;
    public int e;
    public int f6076f;
    public int f6077g;

    public final void a(j0 j0Var, i0 i0Var) {
        if (this.f6075c > 0) {
            j0Var.c(this.d, this.e, this.f6076f, this.f6077g, i0Var);
            this.f6075c = 0;
        }
    }

    public final void b(j0 j0Var, long j10, int i10, int i11, int i12, i0 i0Var) {
        boolean z10;
        if (this.f6077g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.o("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f6074b) {
            int i13 = this.f6075c;
            int i14 = i13 + 1;
            this.f6075c = i14;
            if (i13 == 0) {
                this.d = j10;
                this.e = i10;
                this.f6076f = 0;
            }
            this.f6076f += i11;
            this.f6077g = i12;
            if (i14 >= 16) {
                a(j0Var, i0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c10;
        if (!this.f6074b) {
            int i10 = 0;
            byte[] bArr = this.f6073a;
            pVar.b(0, 10, bArr);
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
            this.f6074b = true;
        }
    }
}
