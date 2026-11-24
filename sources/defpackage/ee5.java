package defpackage;

import java.util.Collections;
public final class ee5 implements rv3 {
    public final xx9 a;
    public String b;
    public yzb c;
    public de5 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final rj7 g = new rj7(32);
    public final rj7 h = new rj7(33);
    public final rj7 i = new rj7(34);
    public final rj7 j = new rj7(39);
    public final rj7 k = new rj7(40);
    public long m = -9223372036854775807L;
    public final yw7 n = new yw7();

    public ee5(xx9 xx9Var) {
        this.a = xx9Var;
    }

    public final void a(int i, int i2, long j, long j2) {
        kp kpVar = this.a.d;
        de5 de5Var = this.d;
        boolean z = this.e;
        boolean z2 = false;
        if (de5Var.j && de5Var.g) {
            de5Var.m = de5Var.c;
            de5Var.j = false;
        } else if (de5Var.h || de5Var.g) {
            if (z && de5Var.i) {
                de5Var.a(i + ((int) (j - de5Var.b)));
            }
            de5Var.k = de5Var.b;
            de5Var.l = de5Var.e;
            de5Var.m = de5Var.c;
            de5Var.i = true;
        }
        if (!this.e) {
            rj7 rj7Var = this.g;
            rj7Var.b(i2);
            rj7 rj7Var2 = this.h;
            rj7Var2.b(i2);
            rj7 rj7Var3 = this.i;
            rj7Var3.b(i2);
            if (rj7Var.c && rj7Var2.c && rj7Var3.c) {
                String str = this.b;
                int i3 = rj7Var.e;
                byte[] bArr = new byte[rj7Var2.e + i3 + rj7Var3.e];
                System.arraycopy(rj7Var.d, 0, bArr, 0, i3);
                System.arraycopy(rj7Var2.d, 0, bArr, rj7Var.e, rj7Var2.e);
                System.arraycopy(rj7Var3.d, 0, bArr, rj7Var.e + rj7Var2.e, rj7Var3.e);
                String str2 = null;
                wj7 i4 = add.i(rj7Var2.d, 3, rj7Var2.e, null);
                tj7 tj7Var = i4.b;
                if (tj7Var != null) {
                    str2 = jl2.a(tj7Var.a, tj7Var.c, tj7Var.d, tj7Var.f, tj7Var.b, tj7Var.e);
                }
                fo4 fo4Var = new fo4();
                fo4Var.a = str;
                fo4Var.r = wf7.n("video/mp2t");
                fo4Var.s = wf7.n("video/hevc");
                fo4Var.k = str2;
                fo4Var.z = i4.e;
                fo4Var.A = i4.f;
                fo4Var.C = i4.g;
                fo4Var.D = i4.h;
                fo4Var.K = new tm2(i4.k, i4.l, i4.m, null, i4.c + 8, i4.d + 8);
                fo4Var.H = i4.i;
                fo4Var.u = i4.j;
                fo4Var.L = i4.a + 1;
                fo4Var.v = Collections.singletonList(bArr);
                go4 go4Var = new go4(fo4Var);
                this.c.g(go4Var);
                int i5 = go4Var.v;
                if (i5 != -1) {
                    z2 = true;
                }
                jte.p(z2);
                kpVar.l(i5);
                this.e = true;
            }
        }
        rj7 rj7Var4 = this.j;
        boolean b = rj7Var4.b(i2);
        yw7 yw7Var = this.n;
        if (b) {
            yw7Var.L(add.m(rj7Var4.e, rj7Var4.d), rj7Var4.d);
            yw7Var.O(5);
            kpVar.a(j2, yw7Var);
        }
        rj7 rj7Var5 = this.k;
        if (rj7Var5.b(i2)) {
            yw7Var.L(add.m(rj7Var5.e, rj7Var5.d), rj7Var5.d);
            yw7Var.O(5);
            kpVar.a(j2, yw7Var);
        }
    }

    @Override
    public final void b(yw7 yw7Var) {
        int i;
        int i2;
        this.c.getClass();
        String str = hac.a;
        while (yw7Var.a() > 0) {
            int i3 = yw7Var.b;
            int i4 = yw7Var.c;
            byte[] bArr = yw7Var.a;
            this.l += yw7Var.a();
            this.c.e(yw7Var.a(), yw7Var);
            while (i3 < i4) {
                int b = add.b(bArr, i3, i4, this.f);
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
        de5 de5Var = this.d;
        if (de5Var.f) {
            int i3 = de5Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                if ((bArr[i4] & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                de5Var.g = z;
                de5Var.f = false;
            } else {
                de5Var.d = (i2 - i) + i3;
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
        add.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        this.a.d.d(0);
        de5 de5Var = this.d;
        if (de5Var != null) {
            de5Var.f = false;
            de5Var.g = false;
            de5Var.h = false;
            de5Var.i = false;
            de5Var.j = false;
        }
    }

    @Override
    public final void f() {
        this.c.getClass();
        String str = hac.a;
        this.a.d.d(0);
        a(0, 0, this.l, this.m);
        i(0, 48, this.l, this.m);
    }

    @Override
    public final void g(int i, long j) {
        this.m = j;
    }

    @Override
    public final void h(u84 u84Var, l4c l4cVar) {
        l4cVar.a();
        l4cVar.b();
        this.b = l4cVar.e;
        l4cVar.b();
        yzb c0 = u84Var.c0(l4cVar.d, 2);
        this.c = c0;
        this.d = new de5(c0);
        this.a.b(u84Var, l4cVar);
    }

    public final void i(int i, int i2, long j, long j2) {
        boolean z;
        de5 de5Var = this.d;
        boolean z2 = this.e;
        boolean z3 = false;
        de5Var.g = false;
        de5Var.h = false;
        de5Var.e = j2;
        de5Var.d = 0;
        de5Var.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (de5Var.i && !de5Var.j) {
                if (z2) {
                    de5Var.a(i);
                }
                de5Var.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                de5Var.h = !de5Var.j;
                de5Var.j = true;
            }
        }
        if (i2 >= 16 && i2 <= 21) {
            z = true;
        } else {
            z = false;
        }
        de5Var.c = z;
        if (z || i2 <= 9) {
            z3 = true;
        }
        de5Var.f = z3;
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
