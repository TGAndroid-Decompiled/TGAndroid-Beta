package b2;

import a8.yb;
import android.util.Pair;
public abstract class p1 {
    public static final l1 f3348a = new Object();
    public static final String f3349b;
    public static final String f3350c;
    public static final String d;

    static {
        String str = e2.n0.f9692a;
        f3349b = Integer.toString(0, 36);
        f3350c = Integer.toString(1, 36);
        d = Integer.toString(2, 36);
    }

    public int a(boolean z10) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i10, m1 m1Var, o1 o1Var, int i11, boolean z10) {
        int i12 = f(i10, m1Var, false).f3280c;
        if (m(i12, o1Var, 0L).f3336o == i10) {
            int e = e(i12, i11, z10);
            if (e == -1) {
                return -1;
            }
            return m(e, o1Var, 0L).f3335n;
        }
        return i10 + 1;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == c(z10)) {
                        return a(z10);
                    }
                    return i10 + 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        } else if (i10 == c(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public boolean equals(Object obj) {
        int c10;
        if (this != obj) {
            if (obj instanceof p1) {
                p1 p1Var = (p1) obj;
                if (p1Var.o() == o() && p1Var.h() == h()) {
                    o1 o1Var = new o1();
                    m1 m1Var = new m1();
                    o1 o1Var2 = new o1();
                    m1 m1Var2 = new m1();
                    int i10 = 0;
                    while (true) {
                        if (i10 < o()) {
                            if (!m(i10, o1Var, 0L).equals(p1Var.m(i10, o1Var2, 0L))) {
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 0;
                            while (true) {
                                if (i11 < h()) {
                                    if (!f(i11, m1Var, true).equals(p1Var.f(i11, m1Var2, true))) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    int a2 = a(true);
                                    if (a2 == p1Var.a(true) && (c10 = c(true)) == p1Var.c(true)) {
                                        while (a2 != c10) {
                                            int e = e(a2, 0, true);
                                            if (e == p1Var.e(a2, 0, true)) {
                                                a2 = e;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract m1 f(int i10, m1 m1Var, boolean z10);

    public m1 g(Object obj, m1 m1Var) {
        return f(b(obj), m1Var, true);
    }

    public abstract int h();

    public int hashCode() {
        o1 o1Var = new o1();
        m1 m1Var = new m1();
        int o10 = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            o10 = (o10 * 31) + m(i10, o1Var, 0L).hashCode();
        }
        int h = h() + (o10 * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            h = (h * 31) + f(i11, m1Var, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(o1 o1Var, m1 m1Var, int i10, long j10) {
        Pair j11 = j(o1Var, m1Var, i10, j10, 0L);
        j11.getClass();
        return j11;
    }

    public final Pair j(o1 o1Var, m1 m1Var, int i10, long j10, long j11) {
        yb.j(i10, o());
        m(i10, o1Var, j11);
        if (j10 == -9223372036854775807L) {
            j10 = o1Var.f3333l;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = o1Var.f3335n;
        f(i11, m1Var, false);
        while (i11 < o1Var.f3336o && m1Var.e != j10) {
            int i12 = i11 + 1;
            if (f(i12, m1Var, false).e > j10) {
                break;
            }
            i11 = i12;
        }
        f(i11, m1Var, true);
        long j12 = j10 - m1Var.e;
        long j13 = m1Var.d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        long max = Math.max(0L, j12);
        Object obj = m1Var.f3279b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == a(z10)) {
                        return c(z10);
                    }
                    return i10 - 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        } else if (i10 == a(z10)) {
            return -1;
        } else {
            return i10 - 1;
        }
    }

    public abstract Object l(int i10);

    public abstract o1 m(int i10, o1 o1Var, long j10);

    public final void n(int i10, o1 o1Var) {
        m(i10, o1Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
