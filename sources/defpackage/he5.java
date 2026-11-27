package defpackage;

import java.util.Collections;
public final class he5 implements av3 {
    public final oz9 a;
    public String b;
    public x1c c;
    public ge5 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final xj7 g = new xj7(32);
    public final xj7 h = new xj7(33);
    public final xj7 i = new xj7(34);
    public final xj7 j = new xj7(39);
    public final xj7 k = new xj7(40);
    public long m = -9223372036854775807L;
    public final ey7 n = new ey7();

    public he5(oz9 oz9Var) {
        this.a = oz9Var;
    }

    public final void a(int i, int i2, long j, long j2) {
        lo loVar = this.a.d;
        ge5 ge5Var = this.d;
        boolean z = this.e;
        boolean z2 = false;
        if (ge5Var.j && ge5Var.g) {
            ge5Var.m = ge5Var.c;
            ge5Var.j = false;
        } else if (ge5Var.h || ge5Var.g) {
            if (z && ge5Var.i) {
                ge5Var.a(i + ((int) (j - ge5Var.b)));
            }
            ge5Var.k = ge5Var.b;
            ge5Var.l = ge5Var.e;
            ge5Var.m = ge5Var.c;
            ge5Var.i = true;
        }
        if (!this.e) {
            xj7 xj7Var = this.g;
            xj7Var.b(i2);
            xj7 xj7Var2 = this.h;
            xj7Var2.b(i2);
            xj7 xj7Var3 = this.i;
            xj7Var3.b(i2);
            if (xj7Var.c && xj7Var2.c && xj7Var3.c) {
                String str = this.b;
                int i3 = xj7Var.e;
                byte[] bArr = new byte[xj7Var2.e + i3 + xj7Var3.e];
                System.arraycopy(xj7Var.d, 0, bArr, 0, i3);
                System.arraycopy(xj7Var2.d, 0, bArr, xj7Var.e, xj7Var2.e);
                System.arraycopy(xj7Var3.d, 0, bArr, xj7Var.e + xj7Var2.e, xj7Var3.e);
                String str2 = null;
                ck7 i4 = rfd.i(xj7Var2.d, 3, xj7Var2.e, null);
                zj7 zj7Var = i4.b;
                if (zj7Var != null) {
                    str2 = rk2.a(zj7Var.a, zj7Var.c, zj7Var.d, zj7Var.f, zj7Var.b, zj7Var.e);
                }
                jo4 jo4Var = new jo4();
                jo4Var.a = str;
                jo4Var.r = dg7.n("video/mp2t");
                jo4Var.s = dg7.n("video/hevc");
                jo4Var.k = str2;
                jo4Var.z = i4.e;
                jo4Var.A = i4.f;
                jo4Var.C = i4.g;
                jo4Var.D = i4.h;
                jo4Var.K = new bm2(i4.k, i4.l, i4.m, null, i4.c + 8, i4.d + 8);
                jo4Var.H = i4.i;
                jo4Var.u = i4.j;
                jo4Var.L = i4.a + 1;
                jo4Var.v = Collections.singletonList(bArr);
                ko4 ko4Var = new ko4(jo4Var);
                this.c.g(ko4Var);
                int i5 = ko4Var.v;
                if (i5 != -1) {
                    z2 = true;
                }
                yve.p(z2);
                loVar.l(i5);
                this.e = true;
            }
        }
        xj7 xj7Var4 = this.j;
        boolean b = xj7Var4.b(i2);
        ey7 ey7Var = this.n;
        if (b) {
            ey7Var.L(rfd.m(xj7Var4.e, xj7Var4.d), xj7Var4.d);
            ey7Var.O(5);
            loVar.a(j2, ey7Var);
        }
        xj7 xj7Var5 = this.k;
        if (xj7Var5.b(i2)) {
            ey7Var.L(rfd.m(xj7Var5.e, xj7Var5.d), xj7Var5.d);
            ey7Var.O(5);
            loVar.a(j2, ey7Var);
        }
    }

    @Override
    public final void b(ey7 ey7Var) {
        int i;
        int i2;
        this.c.getClass();
        String str = gcc.a;
        while (ey7Var.a() > 0) {
            int i3 = ey7Var.b;
            int i4 = ey7Var.c;
            byte[] bArr = ey7Var.a;
            this.l += ey7Var.a();
            this.c.e(ey7Var.a(), ey7Var);
            while (i3 < i4) {
                int b = rfd.b(bArr, i3, i4, this.f);
                if (b == i4) {
                    c(i3, i4, bArr);
                    return;
                }
                int i5 = (bArr[b + 3] & 126) >> 1;
                if (b > 0 && bArr[b - 1] == 0) {
                    b--;
                    i = 4;
                } else {
                    i = 3;
                }
                int i6 = b;
                int i7 = i;
                int i8 = i6 - i3;
                if (i8 > 0) {
                    c(i3, i6, bArr);
                }
                int i9 = i4 - i6;
                long j = this.l - i9;
                if (i8 < 0) {
                    i2 = -i8;
                } else {
                    i2 = 0;
                }
                a(i9, i2, j, this.m);
                i(i9, i5, j, this.m);
                i3 = i6 + i7;
            }
        }
    }

    public final void c(int i, int i2, byte[] bArr) {
        boolean z;
        ge5 ge5Var = this.d;
        if (ge5Var.f) {
            int i3 = ge5Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                if ((bArr[i4] & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                ge5Var.g = z;
                ge5Var.f = false;
            } else {
                ge5Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(i, i2, bArr);
            this.h.a(i, i2, bArr);
            this.i.a(i, i2, bArr);
        }
        this.j.a(i, i2, bArr);
        this.k.a(i, i2, bArr);
    }

    @Override
    public final void d() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        rfd.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        this.a.d.d(0);
        ge5 ge5Var = this.d;
        if (ge5Var != null) {
            ge5Var.f = false;
            ge5Var.g = false;
            ge5Var.h = false;
            ge5Var.i = false;
            ge5Var.j = false;
        }
    }

    @Override
    public final void f() {
        this.c.getClass();
        String str = gcc.a;
        this.a.d.d(0);
        a(0, 0, this.l, this.m);
        i(0, 48, this.l, this.m);
    }

    @Override
    public final void g(int i, long j) {
        this.m = j;
    }

    @Override
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.b = l6cVar.e;
        l6cVar.b();
        x1c e0 = g84Var.e0(l6cVar.d, 2);
        this.c = e0;
        this.d = new ge5(e0);
        this.a.b(g84Var, l6cVar);
    }

    public final void i(int i, int i2, long j, long j2) {
        boolean z;
        ge5 ge5Var = this.d;
        boolean z2 = this.e;
        boolean z3 = false;
        ge5Var.g = false;
        ge5Var.h = false;
        ge5Var.e = j2;
        ge5Var.d = 0;
        ge5Var.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (ge5Var.i && !ge5Var.j) {
                if (z2) {
                    ge5Var.a(i);
                }
                ge5Var.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                ge5Var.h = !ge5Var.j;
                ge5Var.j = true;
            }
        }
        if (i2 >= 16 && i2 <= 21) {
            z = true;
        } else {
            z = false;
        }
        ge5Var.c = z;
        if (z || i2 <= 9) {
            z3 = true;
        }
        ge5Var.f = z3;
        if (!this.e) {
            this.g.d(i2);
            this.h.d(i2);
            this.i.d(i2);
        }
        this.j.d(i2);
        this.k.d(i2);
    }

    @Override
    public final void e() {
    }
}
