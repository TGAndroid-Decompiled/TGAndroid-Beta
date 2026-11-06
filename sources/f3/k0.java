package f3;

import a8.ia;
public final class k0 {
    public final byte[] f11049a = new byte[10];
    public boolean f11050b;
    public int f11051c;
    public long d;
    public int f11052e;
    public int f11053f;
    public int f11054g;

    public final void a(j0 j0Var, i0 i0Var) {
        if (this.f11051c > 0) {
            j0Var.c(this.d, this.f11052e, this.f11053f, this.f11054g, i0Var);
            this.f11051c = 0;
        }
    }

    public final void b(j0 j0Var, long j3, int i7, int i10, int i11, i0 i0Var) {
        boolean z9;
        if (this.f11054g <= i10 + i11) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.o("TrueHD chunk samples must be contiguous in the sample queue.", z9);
        if (this.f11050b) {
            int i12 = this.f11051c;
            int i13 = i12 + 1;
            this.f11051c = i13;
            if (i12 == 0) {
                this.d = j3;
                this.f11052e = i7;
                this.f11053f = 0;
            }
            this.f11053f += i10;
            this.f11054g = i11;
            if (i13 >= 16) {
                a(j0Var, i0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c10;
        if (!this.f11050b) {
            int i7 = 0;
            byte[] bArr = this.f11049a;
            pVar.b(0, 10, bArr);
            pVar.q();
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
            this.f11050b = true;
        }
    }
}
