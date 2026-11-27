package defpackage;

import java.math.RoundingMode;
public final class uh2 {
    public final uc0 a;
    public final x1c b;
    public final int c;
    public final int d;
    public final long e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public long[] n;
    public int[] o;

    public uh2(int i, uc0 uc0Var, x1c x1cVar, boolean z) {
        int i2;
        int i3;
        int i4 = uc0Var.d;
        this.a = uc0Var;
        this.f = z;
        int a = uc0Var.a();
        boolean z2 = true;
        if (a != 1 && a != 2) {
            z2 = false;
        }
        yve.f(z2);
        if (a == 2) {
            i2 = 1667497984;
        } else {
            i2 = 1651965952;
        }
        int i5 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = i2 | i5;
        long j = uc0Var.c;
        String str = gcc.a;
        this.e = gcc.b0(i4, uc0Var.b * 1000000, j, RoundingMode.DOWN);
        this.b = x1cVar;
        if (a == 2) {
            i3 = i5 | 1650720768;
        } else {
            i3 = -1;
        }
        this.d = i3;
        this.m = -1L;
        this.n = new long[512];
        this.o = new int[512];
        this.g = i4;
    }

    public final bz9 a(int i) {
        return new bz9((this.e / this.g) * this.o[i], this.n[i]);
    }

    public final yy9 b(long j) {
        if (this.l == 0) {
            bz9 bz9Var = new bz9(0L, this.m);
            return new yy9(bz9Var, bz9Var);
        }
        int i = (int) (j / (this.e / this.g));
        int e = gcc.e(this.o, i, true, true);
        if (this.o[e] == i) {
            bz9 a = a(e);
            return new yy9(a, a);
        }
        bz9 a2 = a(e);
        int i2 = e + 1;
        if (i2 < this.n.length) {
            return new yy9(a2, a(i2));
        }
        return new yy9(a2, a2);
    }
}
