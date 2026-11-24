package defpackage;
public final class oc3 extends qc3 implements Comparable {
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

    public oc3(int i, sxb sxbVar, int i2, nc3 nc3Var, int i3, String str, String str2) {
        super(i, sxbVar, i2);
        boolean z;
        boolean z2;
        w59 w59Var;
        int i4;
        int i5;
        int bitCount;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        this.f = ls6.c(i3, false);
        int i6 = this.d.e;
        int i7 = nc3Var.C;
        w59 w59Var2 = nc3Var.y;
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
            w59Var = mm5.u(str2);
        } else if (w59Var2.isEmpty()) {
            w59Var = mm5.u("");
        } else {
            w59Var = w59Var2;
        }
        int i9 = 0;
        while (true) {
            if (i9 < w59Var.d) {
                i4 = sc3.g(this.d, (String) w59Var.get(i9), nc3Var.D);
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
            i5 = nc3Var.A;
        }
        int i10 = this.d.f;
        yq7 yq7Var = sc3.l;
        if (i10 != 0 && i10 == i5) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i10 & i5);
        }
        this.w = bitCount;
        fm4 fm4Var = this.d;
        if ((fm4Var.f & 1088) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.E = z3;
        int f = sc3.f(fm4Var, nc3Var.z);
        this.x = f;
        if (sc3.h(str) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        int g = sc3.g(this.d, str, z4);
        this.y = g;
        if (i4 <= 0 && ((!w59Var2.isEmpty() || bitCount <= 0) && ((!w59Var2.isEmpty() || f == Integer.MAX_VALUE) && !this.h && ((!this.n || g <= 0) && !nc3Var.x)))) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (ls6.c(i3, nc3Var.B0) && z5) {
            z6 = true;
        }
        this.e = z6;
    }

    @Override
    public final int a() {
        return this.e ? 1 : 0;
    }

    @Override
    public final boolean b(qc3 qc3Var) {
        oc3 oc3Var = (oc3) qc3Var;
        return false;
    }

    @Override
    public final int compareTo(oc3 oc3Var) {
        wo2 c = wo2.a.c(this.f, oc3Var.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(oc3Var.r);
        hi7 hi7Var = hi7.b;
        hi7 hi7Var2 = hi7.c;
        wo2 b = c.b(valueOf, valueOf2, hi7Var2);
        int i = oc3Var.s;
        int i2 = this.s;
        wo2 a = b.a(i2, i);
        int i3 = oc3Var.w;
        int i4 = this.w;
        wo2 c2 = a.a(i4, i3).b(Integer.valueOf(this.x), Integer.valueOf(oc3Var.x), hi7Var2).c(this.h, oc3Var.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(oc3Var.n);
        if (i2 != 0) {
            hi7Var = hi7Var2;
        }
        wo2 a2 = c2.b(valueOf3, valueOf4, hi7Var).a(this.y, oc3Var.y);
        if (i4 == 0) {
            a2 = a2.d(this.E, oc3Var.E);
        }
        return a2.e();
    }
}
