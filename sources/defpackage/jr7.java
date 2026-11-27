package defpackage;

import java.io.EOFException;
public final class jr7 {
    public final kr7 a = new kr7();
    public final ey7 b = new ey7(0, new byte[65025]);
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
            kr7 kr7Var = this.a;
            if (i5 >= kr7Var.c) {
                break;
            }
            int[] iArr = kr7Var.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(cb3 cb3Var) {
        boolean z;
        boolean z2;
        int i;
        if (cb3Var != null) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        boolean z3 = this.e;
        ey7 ey7Var = this.b;
        if (z3) {
            this.e = false;
            ey7Var.K(0);
        }
        while (!this.e) {
            int i2 = this.c;
            kr7 kr7Var = this.a;
            if (i2 < 0) {
                if (kr7Var.b(cb3Var, -1L) && kr7Var.a(cb3Var, true)) {
                    int i3 = kr7Var.d;
                    if ((kr7Var.a & 1) == 1 && ey7Var.c == 0) {
                        i3 += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        cb3Var.l(i3, false);
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
                ey7Var.c(ey7Var.c + a);
                try {
                    cb3Var.c(ey7Var.a, ey7Var.c, a, false);
                    ey7Var.M(ey7Var.c + a);
                    if (kr7Var.f[i4 - 1] != 255) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.e = z2;
                } catch (EOFException unused2) {
                }
            }
            if (i4 == kr7Var.c) {
                i4 = -1;
            }
            this.c = i4;
        }
        return true;
    }
}
