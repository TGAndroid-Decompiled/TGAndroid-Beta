package defpackage;
public final class dk4 {
    public final jj0 a;
    public final nj0 b;
    public kj0 c;
    public final int d;

    public dk4(lj0 lj0Var, nj0 nj0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = nj0Var;
        this.d = i;
        this.a = new jj0(lj0Var, j, j2, j3, j4, j5);
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    public static int c(vb3 vb3Var, long j, u21 u21Var) {
        if (j == vb3Var.d) {
            return 0;
        }
        u21Var.a = j;
        return 1;
    }

    public final int a(vb3 vb3Var, u21 u21Var) {
        boolean z;
        while (true) {
            kj0 kj0Var = this.c;
            kj0Var.getClass();
            long j = kj0Var.f;
            long j2 = kj0Var.g;
            long j3 = kj0Var.h;
            int i = ((j2 - j) > this.d ? 1 : ((j2 - j) == this.d ? 0 : -1));
            nj0 nj0Var = this.b;
            if (i <= 0) {
                this.c = null;
                nj0Var.c();
                return c(vb3Var, j, u21Var);
            }
            long j4 = j3 - vb3Var.d;
            if (j4 >= 0 && j4 <= 262144) {
                vb3Var.m((int) j4, false);
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return c(vb3Var, j3, u21Var);
            }
            vb3Var.f = 0;
            mj0 b = nj0Var.b(vb3Var, kj0Var.b);
            int i2 = b.a;
            long j5 = b.b;
            long j6 = b.c;
            if (i2 != -3) {
                if (i2 != -2) {
                    if (i2 != -1) {
                        if (i2 == 0) {
                            long j7 = j6 - vb3Var.d;
                            if (j7 >= 0 && j7 <= 262144) {
                                vb3Var.m((int) j7, false);
                            }
                            this.c = null;
                            nj0Var.c();
                            return c(vb3Var, j6, u21Var);
                        }
                        dq9.m("Invalid case");
                        return 0;
                    }
                    kj0Var.e = j5;
                    kj0Var.g = j6;
                    kj0Var.h = kj0.a(kj0Var.b, kj0Var.d, j5, kj0Var.f, j6, kj0Var.c);
                } else {
                    kj0Var.d = j5;
                    kj0Var.f = j6;
                    kj0Var.h = kj0.a(kj0Var.b, j5, kj0Var.e, j6, kj0Var.g, kj0Var.c);
                }
            } else {
                this.c = null;
                nj0Var.c();
                return c(vb3Var, j3, u21Var);
            }
        }
    }

    public final void d(long j) {
        kj0 kj0Var = this.c;
        if (kj0Var != null && kj0Var.a == j) {
            return;
        }
        jj0 jj0Var = this.a;
        this.c = new kj0(j, jj0Var.a.c(j), jj0Var.c, jj0Var.d, jj0Var.e, jj0Var.f);
    }
}
