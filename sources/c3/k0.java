package c3;

import v7.u6;
public final class k0 {
    public final byte[] f4641a = new byte[10];
    public boolean f4642b;
    public int f4643c;
    public long d;
    public int e;
    public int f4644f;
    public int f4645g;

    public final void a(j0 j0Var, i0 i0Var) {
        if (this.f4643c > 0) {
            j0Var.c(this.d, this.e, this.f4644f, this.f4645g, i0Var);
            this.f4643c = 0;
        }
    }

    public final void b(j0 j0Var, long j10, int i10, int i11, int i12, i0 i0Var) {
        boolean z10;
        if (this.f4645g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.o("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f4642b) {
            int i13 = this.f4643c;
            int i14 = i13 + 1;
            this.f4643c = i14;
            if (i13 == 0) {
                this.d = j10;
                this.e = i10;
                this.f4644f = 0;
            }
            this.f4644f += i11;
            this.f4645g = i12;
            if (i14 >= 16) {
                a(j0Var, i0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c10;
        if (!this.f4642b) {
            int i10 = 0;
            byte[] bArr = this.f4641a;
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
            this.f4642b = true;
        }
    }
}
