package f3;

import a8.la;
public final class j0 {
    public final byte[] f11198a = new byte[10];
    public boolean f11199b;
    public int f11200c;
    public long d;
    public int f11201e;
    public int f11202f;
    public int f11203g;

    public final void a(i0 i0Var, h0 h0Var) {
        if (this.f11200c > 0) {
            i0Var.c(this.d, this.f11201e, this.f11202f, this.f11203g, h0Var);
            this.f11200c = 0;
        }
    }

    public final void b(i0 i0Var, long j3, int i7, int i10, int i11, h0 h0Var) {
        boolean z10;
        if (this.f11203g <= i10 + i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.o("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f11199b) {
            int i12 = this.f11200c;
            int i13 = i12 + 1;
            this.f11200c = i13;
            if (i12 == 0) {
                this.d = j3;
                this.f11201e = i7;
                this.f11202f = 0;
            }
            this.f11202f += i10;
            this.f11203g = i11;
            if (i13 >= 16) {
                a(i0Var, h0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c10;
        if (!this.f11199b) {
            int i7 = 0;
            byte[] bArr = this.f11198a;
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
            this.f11199b = true;
        }
    }
}
