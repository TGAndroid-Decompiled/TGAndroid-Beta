package defpackage;
public final class g2c {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(wxb wxbVar, vxb vxbVar) {
        if (this.c > 0) {
            wxbVar.a(this.d, this.e, this.f, this.g, vxbVar);
            this.c = 0;
        }
    }

    public final void b(wxb wxbVar, long j, int i, int i2, int i3, vxb vxbVar) {
        boolean z;
        if (this.g <= i2 + i3) {
            z = true;
        } else {
            z = false;
        }
        gre.o("TrueHD chunk samples must be contiguous in the sample queue.", z);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(wxbVar, vxbVar);
            }
        }
    }

    public final void c(k74 k74Var) {
        char c;
        if (!this.b) {
            int i = 0;
            byte[] bArr = this.a;
            k74Var.b(0, 10, bArr);
            k74Var.h();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b = bArr[7];
                if ((b & 254) == 186) {
                    if ((b & 255) == 187) {
                        i = 1;
                    }
                    if (i != 0) {
                        c = '\t';
                    } else {
                        c = '\b';
                    }
                    i = 40 << ((bArr[c] >> 4) & 7);
                }
            }
            if (i == 0) {
                return;
            }
            this.b = true;
        }
    }
}
