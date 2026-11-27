package defpackage;
public final class g6c {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(x1c x1cVar, w1c w1cVar) {
        if (this.c > 0) {
            x1cVar.a(this.d, this.e, this.f, this.g, w1cVar);
            this.c = 0;
        }
    }

    public final void b(x1c x1cVar, long j, int i, int i2, int i3, w1c w1cVar) {
        boolean z;
        if (this.g <= i2 + i3) {
            z = true;
        } else {
            z = false;
        }
        yve.o("TrueHD chunk samples must be contiguous in the sample queue.", z);
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
                a(x1cVar, w1cVar);
            }
        }
    }

    public final void c(f84 f84Var) {
        char c;
        if (!this.b) {
            int i = 0;
            byte[] bArr = this.a;
            f84Var.b(0, 10, bArr);
            f84Var.h();
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
