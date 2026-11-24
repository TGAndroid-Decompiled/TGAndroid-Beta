package defpackage;
public final class be3 extends de3 implements Comparable {
    public final boolean E;
    public final boolean e;
    public final boolean f;
    public final boolean h;
    public final boolean n;
    public final int r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    public be3(int i, uzb uzbVar, int i2, ae3 ae3Var, int i3, String str, String str2) {
        super(i, uzbVar, i2);
        boolean z;
        boolean z2;
        y79 y79Var;
        int i4;
        int i5;
        int bitCount;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        this.f = kt6.c(i3, false);
        int i6 = this.d.e;
        int i7 = ae3Var.C;
        y79 y79Var2 = ae3Var.y;
        int i8 = i6 & (~i7);
        if ((i8 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        if ((i8 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.n = z2;
        if (str2 != null) {
            y79Var = mo5.u(str2);
        } else if (y79Var2.isEmpty()) {
            y79Var = mo5.u("");
        } else {
            y79Var = y79Var2;
        }
        int i9 = 0;
        while (true) {
            if (i9 < y79Var.d) {
                i4 = fe3.g(this.d, (String) y79Var.get(i9), ae3Var.D);
                if (i4 > 0) {
                    break;
                }
                i9++;
            } else {
                i4 = 0;
                i9 = Integer.MAX_VALUE;
                break;
            }
        }
        this.r = i9;
        this.s = i4;
        if (str2 != null) {
            i5 = 1088;
        } else {
            i5 = ae3Var.A;
        }
        int i10 = this.d.f;
        at7 at7Var = fe3.l;
        if (i10 != 0 && i10 == i5) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i10 & i5);
        }
        this.w = bitCount;
        go4 go4Var = this.d;
        if ((go4Var.f & 1088) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.E = z3;
        int f = fe3.f(go4Var, ae3Var.z);
        this.x = f;
        if (fe3.h(str) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        int g = fe3.g(this.d, str, z4);
        this.y = g;
        if (i4 <= 0 && ((!y79Var2.isEmpty() || bitCount <= 0) && ((!y79Var2.isEmpty() || f == Integer.MAX_VALUE) && !this.h && ((!this.n || g <= 0) && !ae3Var.x)))) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (kt6.c(i3, ae3Var.B0) && z5) {
            z6 = true;
        }
        this.e = z6;
    }

    @Override
    public final int a() {
        return this.e ? 1 : 0;
    }

    @Override
    public final boolean b(de3 de3Var) {
        be3 be3Var = (be3) de3Var;
        return false;
    }

    @Override
    public final int compareTo(be3 be3Var) {
        hq2 c = hq2.a.c(this.f, be3Var.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(be3Var.r);
        jk7 jk7Var = jk7.b;
        jk7 jk7Var2 = jk7.c;
        hq2 b = c.b(valueOf, valueOf2, jk7Var2);
        int i = be3Var.s;
        int i2 = this.s;
        hq2 a = b.a(i2, i);
        int i3 = be3Var.w;
        int i4 = this.w;
        hq2 c2 = a.a(i4, i3).b(Integer.valueOf(this.x), Integer.valueOf(be3Var.x), jk7Var2).c(this.h, be3Var.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(be3Var.n);
        if (i2 != 0) {
            jk7Var = jk7Var2;
        }
        hq2 a2 = c2.b(valueOf3, valueOf4, jk7Var).a(this.y, be3Var.y);
        if (i4 == 0) {
            a2 = a2.d(this.E, be3Var.E);
        }
        return a2.e();
    }
}
