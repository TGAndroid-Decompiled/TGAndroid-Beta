package defpackage;

import java.io.EOFException;
public final class mq7 {
    public final nq7 a = new nq7();
    public final yw7 b = new yw7(0, new byte[65025]);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            nq7 nq7Var = this.a;
            if (i5 >= nq7Var.c) {
                break;
            }
            int[] iArr = nq7Var.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(vb3 vb3Var) {
        boolean z;
        boolean z2;
        int i;
        if (vb3Var != null) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        boolean z3 = this.e;
        yw7 yw7Var = this.b;
        if (z3) {
            this.e = false;
            yw7Var.K(0);
        }
        while (!this.e) {
            int i2 = this.c;
            nq7 nq7Var = this.a;
            if (i2 < 0) {
                if (nq7Var.b(vb3Var, -1L) && nq7Var.a(vb3Var, true)) {
                    int i3 = nq7Var.d;
                    if ((nq7Var.a & 1) == 1 && yw7Var.c == 0) {
                        i3 += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        vb3Var.m(i3, false);
                        this.c = i;
                        i2 = i;
                    } catch (EOFException unused) {
                        return false;
                    }
                }
                return false;
            }
            int a = a(i2);
            int i4 = this.c + this.d;
            if (a > 0) {
                yw7Var.c(yw7Var.c + a);
                try {
                    vb3Var.c(yw7Var.a, yw7Var.c, a, false);
                    yw7Var.M(yw7Var.c + a);
                    if (nq7Var.f[i4 - 1] != 255) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.e = z2;
                } catch (EOFException unused2) {
                }
            }
            if (i4 == nq7Var.c) {
                i4 = -1;
            }
            this.c = i4;
        }
        return true;
    }
}
