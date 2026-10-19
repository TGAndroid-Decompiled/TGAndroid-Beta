package c3;

import v7.u6;
public final class k0 {
    public final byte[] f4637a = new byte[10];
    public boolean f4638b;
    public int f4639c;
    public long d;
    public int e;
    public int f4640f;
    public int f4641g;

    public final void a(j0 j0Var, i0 i0Var) {
        if (this.f4639c > 0) {
            j0Var.c(this.d, this.e, this.f4640f, this.f4641g, i0Var);
            this.f4639c = 0;
        }
    }

    public final void b(j0 j0Var, long j10, int i10, int i11, int i12, i0 i0Var) {
        boolean z10;
        if (this.f4641g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.o("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f4638b) {
            int i13 = this.f4639c;
            int i14 = i13 + 1;
            this.f4639c = i14;
            if (i13 == 0) {
                this.d = j10;
                this.e = i10;
                this.f4640f = 0;
            }
            this.f4640f += i11;
            this.f4641g = i12;
            if (i14 >= 16) {
                a(j0Var, i0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c10;
        if (!this.f4638b) {
            int i10 = 0;
            byte[] bArr = this.f4637a;
            pVar.b(0, 10, bArr);
            pVar.q();
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
            this.f4638b = true;
        }
    }
}
