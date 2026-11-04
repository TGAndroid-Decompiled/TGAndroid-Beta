package e3;

import b8.zb;
public final class j0 {
    public final byte[] f9479a = new byte[10];
    public boolean f9480b;
    public int f9481c;
    public long d;
    public int f9482e;
    public int f9483f;
    public int f9484g;

    public final void a(i0 i0Var, h0 h0Var) {
        if (this.f9481c > 0) {
            i0Var.d(this.d, this.f9482e, this.f9483f, this.f9484g, h0Var);
            this.f9481c = 0;
        }
    }

    public final void b(i0 i0Var, long j10, int i3, int i10, int i11, h0 h0Var) {
        boolean z10;
        if (this.f9484g <= i10 + i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.o("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f9480b) {
            int i12 = this.f9481c;
            int i13 = i12 + 1;
            this.f9481c = i13;
            if (i12 == 0) {
                this.d = j10;
                this.f9482e = i3;
                this.f9483f = 0;
            }
            this.f9483f += i10;
            this.f9484g = i11;
            if (i13 >= 16) {
                a(i0Var, h0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c2;
        if (!this.f9480b) {
            int i3 = 0;
            byte[] bArr = this.f9479a;
            pVar.c(0, 10, bArr);
            pVar.o();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b10 = bArr[7];
                if ((b10 & 254) == 186) {
                    if ((b10 & 255) == 187) {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        c2 = '\t';
                    } else {
                        c2 = '\b';
                    }
                    i3 = 40 << ((bArr[c2] >> 4) & 7);
                }
            }
            if (i3 == 0) {
                return;
            }
            this.f9480b = true;
        }
    }
}
