package f3;

import a8.ja;
public final class j0 {
    public final byte[] f10850a = new byte[10];
    public boolean f10851b;
    public int f10852c;
    public long d;
    public int f10853e;
    public int f10854f;
    public int f10855g;

    public final void a(i0 i0Var, h0 h0Var) {
        if (this.f10852c > 0) {
            i0Var.c(this.d, this.f10853e, this.f10854f, this.f10855g, h0Var);
            this.f10852c = 0;
        }
    }

    public final void b(i0 i0Var, long j3, int i7, int i10, int i11, h0 h0Var) {
        boolean z10;
        if (this.f10855g <= i10 + i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.o("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f10851b) {
            int i12 = this.f10852c;
            int i13 = i12 + 1;
            this.f10852c = i13;
            if (i12 == 0) {
                this.d = j3;
                this.f10853e = i7;
                this.f10854f = 0;
            }
            this.f10854f += i10;
            this.f10855g = i11;
            if (i13 >= 16) {
                a(i0Var, h0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c10;
        if (!this.f10851b) {
            int i7 = 0;
            byte[] bArr = this.f10850a;
            pVar.c(0, 10, bArr);
            pVar.l();
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
            this.f10851b = true;
        }
    }
}
