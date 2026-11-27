package defpackage;
public final class dk4 {
    public final ki0 a;
    public final oi0 b;
    public li0 c;
    public final int d;

    public dk4(mi0 mi0Var, oi0 oi0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = oi0Var;
        this.d = i;
        this.a = new ki0(mi0Var, j, j2, j3, j4, j5);
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    public static int c(cb3 cb3Var, long j, v11 v11Var) {
        if (j == cb3Var.d) {
            return 0;
        }
        v11Var.a = j;
        return 1;
    }

    public final int a(cb3 cb3Var, v11 v11Var) {
        boolean z;
        while (true) {
            li0 li0Var = this.c;
            li0Var.getClass();
            long j = li0Var.f;
            long j2 = li0Var.g;
            long j3 = li0Var.h;
            int i = ((j2 - j) > this.d ? 1 : ((j2 - j) == this.d ? 0 : -1));
            oi0 oi0Var = this.b;
            if (i <= 0) {
                this.c = null;
                oi0Var.f();
                return c(cb3Var, j, v11Var);
            }
            long j4 = j3 - cb3Var.d;
            if (j4 >= 0 && j4 <= 262144) {
                cb3Var.l((int) j4, false);
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return c(cb3Var, j3, v11Var);
            }
            cb3Var.f = 0;
            ni0 c = oi0Var.c(cb3Var, li0Var.b);
            int i2 = c.a;
            long j5 = c.b;
            long j6 = c.c;
            if (i2 != -3) {
                if (i2 != -2) {
                    if (i2 != -1) {
                        if (i2 == 0) {
                            long j7 = j6 - cb3Var.d;
                            if (j7 >= 0 && j7 <= 262144) {
                                cb3Var.l((int) j7, false);
                            }
                            this.c = null;
                            oi0Var.f();
                            return c(cb3Var, j6, v11Var);
                        }
                        grb.i("Invalid case");
                        return 0;
                    }
                    li0Var.e = j5;
                    li0Var.g = j6;
                    li0Var.h = li0.a(li0Var.b, li0Var.d, j5, li0Var.f, j6, li0Var.c);
                } else {
                    li0Var.d = j5;
                    li0Var.f = j6;
                    li0Var.h = li0.a(li0Var.b, j5, li0Var.e, j6, li0Var.g, li0Var.c);
                }
            } else {
                this.c = null;
                oi0Var.f();
                return c(cb3Var, j3, v11Var);
            }
        }
    }

    public final void d(long j) {
        li0 li0Var = this.c;
        if (li0Var != null && li0Var.a == j) {
            return;
        }
        ki0 ki0Var = this.a;
        this.c = new li0(j, ki0Var.a.c(j), ki0Var.c, ki0Var.d, ki0Var.e, ki0Var.f);
    }
}
