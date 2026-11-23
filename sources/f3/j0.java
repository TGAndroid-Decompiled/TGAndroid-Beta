package f3;

import a8.la;
public final class j0 {
    public final byte[] f11201a = new byte[10];
    public boolean f11202b;
    public int f11203c;
    public long d;
    public int f11204e;
    public int f11205f;
    public int f11206g;

    public final void a(i0 i0Var, h0 h0Var) {
        if (this.f11203c > 0) {
            i0Var.c(this.d, this.f11204e, this.f11205f, this.f11206g, h0Var);
            this.f11203c = 0;
        }
    }

    public final void b(i0 i0Var, long j3, int i7, int i10, int i11, h0 h0Var) {
        boolean z10;
        if (this.f11206g <= i10 + i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.o("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f11202b) {
            int i12 = this.f11203c;
            int i13 = i12 + 1;
            this.f11203c = i13;
            if (i12 == 0) {
                this.d = j3;
                this.f11204e = i7;
                this.f11205f = 0;
            }
            this.f11205f += i10;
            this.f11206g = i11;
            if (i13 >= 16) {
                a(i0Var, h0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c10;
        if (!this.f11202b) {
            int i7 = 0;
            byte[] bArr = this.f11201a;
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
            this.f11202b = true;
        }
    }
}
