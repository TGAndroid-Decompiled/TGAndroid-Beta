package defpackage;
public final class zh4 {
    public final ji0 a;
    public final ni0 b;
    public ki0 c;
    public final int d;

    public zh4(li0 li0Var, ni0 ni0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = ni0Var;
        this.d = i;
        this.a = new ji0(li0Var, j, j2, j3, j4, j5);
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    public static int c(ja3 ja3Var, long j, m11 m11Var) {
        if (j == ja3Var.d) {
            return 0;
        }
        m11Var.a = j;
        return 1;
    }

    public final int a(ja3 ja3Var, m11 m11Var) {
        boolean z;
        while (true) {
            ki0 ki0Var = this.c;
            ki0Var.getClass();
            long j = ki0Var.f;
            long j2 = ki0Var.g;
            long j3 = ki0Var.h;
            int i = ((j2 - j) > this.d ? 1 : ((j2 - j) == this.d ? 0 : -1));
            ni0 ni0Var = this.b;
            if (i <= 0) {
                this.c = null;
                ni0Var.f();
                return c(ja3Var, j, m11Var);
            }
            long j4 = j3 - ja3Var.d;
            if (j4 >= 0 && j4 <= 262144) {
                ja3Var.l((int) j4, false);
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return c(ja3Var, j3, m11Var);
            }
            ja3Var.f = 0;
            mi0 d = ni0Var.d(ja3Var, ki0Var.b);
            int i2 = d.a;
            long j5 = d.b;
            long j6 = d.c;
            if (i2 != -3) {
                if (i2 != -2) {
                    if (i2 != -1) {
                        if (i2 == 0) {
                            long j7 = j6 - ja3Var.d;
                            if (j7 >= 0 && j7 <= 262144) {
                                ja3Var.l((int) j7, false);
                            }
                            this.c = null;
                            ni0Var.f();
                            return c(ja3Var, j6, m11Var);
                        }
                        sc8.j("Invalid case");
                        return 0;
                    }
                    ki0Var.e = j5;
                    ki0Var.g = j6;
                    ki0Var.h = ki0.a(ki0Var.b, ki0Var.d, j5, ki0Var.f, j6, ki0Var.c);
                } else {
                    ki0Var.d = j5;
                    ki0Var.f = j6;
                    ki0Var.h = ki0.a(ki0Var.b, j5, ki0Var.e, j6, ki0Var.g, ki0Var.c);
                }
            } else {
                this.c = null;
                ni0Var.f();
                return c(ja3Var, j3, m11Var);
            }
        }
    }

    public final void d(long j) {
        ki0 ki0Var = this.c;
        if (ki0Var != null && ki0Var.a == j) {
            return;
        }
        ji0 ji0Var = this.a;
        this.c = new ki0(j, ji0Var.a.c(j), ji0Var.c, ji0Var.d, ji0Var.e, ji0Var.f);
    }
}
