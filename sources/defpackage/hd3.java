package defpackage;
public final class hd3 extends jd3 implements Comparable {
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

    public hd3(int i, t1c t1cVar, int i2, gd3 gd3Var, int i3, String str, String str2) {
        super(i, t1cVar, i2);
        boolean z;
        boolean z2;
        j99 j99Var;
        int i4;
        int i5;
        int bitCount;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        this.f = qu6.c(i3, false);
        int i6 = this.d.e;
        int i7 = gd3Var.C;
        j99 j99Var2 = gd3Var.y;
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
            j99Var = po5.u(str2);
        } else if (j99Var2.isEmpty()) {
            j99Var = po5.u("");
        } else {
            j99Var = j99Var2;
        }
        int i9 = 0;
        while (true) {
            if (i9 < j99Var.d) {
                i4 = ld3.g(this.d, (String) j99Var.get(i9), gd3Var.D);
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
            i5 = gd3Var.A;
        }
        int i10 = this.d.f;
        eu7 eu7Var = ld3.l;
        if (i10 != 0 && i10 == i5) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i10 & i5);
        }
        this.w = bitCount;
        ko4 ko4Var = this.d;
        if ((ko4Var.f & 1088) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.E = z3;
        int f = ld3.f(ko4Var, gd3Var.z);
        this.x = f;
        if (ld3.h(str) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        int g = ld3.g(this.d, str, z4);
        this.y = g;
        if (i4 <= 0 && ((!j99Var2.isEmpty() || bitCount <= 0) && ((!j99Var2.isEmpty() || f == Integer.MAX_VALUE) && !this.h && ((!this.n || g <= 0) && !gd3Var.x)))) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (qu6.c(i3, gd3Var.B0) && z5) {
            z6 = true;
        }
        this.e = z6;
    }

    @Override
    public final int a() {
        return this.e ? 1 : 0;
    }

    @Override
    public final boolean b(jd3 jd3Var) {
        hd3 hd3Var = (hd3) jd3Var;
        return false;
    }

    @Override
    public final int compareTo(hd3 hd3Var) {
        pp2 c = pp2.a.c(this.f, hd3Var.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(hd3Var.r);
        qk7 qk7Var = qk7.b;
        qk7 qk7Var2 = qk7.c;
        pp2 b = c.b(valueOf, valueOf2, qk7Var2);
        int i = hd3Var.s;
        int i2 = this.s;
        pp2 a = b.a(i2, i);
        int i3 = hd3Var.w;
        int i4 = this.w;
        pp2 c2 = a.a(i4, i3).b(Integer.valueOf(this.x), Integer.valueOf(hd3Var.x), qk7Var2).c(this.h, hd3Var.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(hd3Var.n);
        if (i2 != 0) {
            qk7Var = qk7Var2;
        }
        pp2 a2 = c2.b(valueOf3, valueOf4, qk7Var).a(this.y, hd3Var.y);
        if (i4 == 0) {
            a2 = a2.d(this.E, hd3Var.E);
        }
        return a2.e();
    }
}
