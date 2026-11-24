package defpackage;

import java.io.EOFException;
public final class jo7 {
    public final ko7 a = new ko7();
    public final xu7 b = new xu7(0, new byte[65025]);
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
            ko7 ko7Var = this.a;
            if (i5 >= ko7Var.c) {
                break;
            }
            int[] iArr = ko7Var.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(ja3 ja3Var) {
        boolean z;
        boolean z2;
        int i;
        if (ja3Var != null) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        boolean z3 = this.e;
        xu7 xu7Var = this.b;
        if (z3) {
            this.e = false;
            xu7Var.K(0);
        }
        while (!this.e) {
            int i2 = this.c;
            ko7 ko7Var = this.a;
            if (i2 < 0) {
                if (ko7Var.b(ja3Var, -1L) && ko7Var.a(ja3Var, true)) {
                    int i3 = ko7Var.d;
                    if ((ko7Var.a & 1) == 1 && xu7Var.c == 0) {
                        i3 += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        ja3Var.l(i3, false);
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
                xu7Var.c(xu7Var.c + a);
                try {
                    ja3Var.c(xu7Var.a, xu7Var.c, a, false);
                    xu7Var.M(xu7Var.c + a);
                    if (ko7Var.f[i4 - 1] != 255) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.e = z2;
                } catch (EOFException unused2) {
                }
            }
            if (i4 == ko7Var.c) {
                i4 = -1;
            }
            this.c = i4;
        }
        return true;
    }
}
