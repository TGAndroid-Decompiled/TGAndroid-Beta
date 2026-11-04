package d2;

import android.util.Pair;
import b8.zb;
public abstract class n1 {
    public static final j1 f8245a = new Object();
    public static final String f8246b;
    public static final String f8247c;
    public static final String d;

    static {
        String str = g2.n0.f11873a;
        f8246b = Integer.toString(0, 36);
        f8247c = Integer.toString(1, 36);
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

    public final int d(int i3, k1 k1Var, m1 m1Var, int i10, boolean z10) {
        int i11 = f(i3, k1Var, false).f8163c;
        if (m(i11, m1Var, 0L).f8220o == i3) {
            int e10 = e(i11, i10, z10);
            if (e10 == -1) {
                return -1;
            }
            return m(e10, m1Var, 0L).f8219n;
        }
        return i3 + 1;
    }

    public int e(int i3, int i10, boolean z10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i3 == c(z10)) {
                        return a(z10);
                    }
                    return i3 + 1;
                }
                throw new IllegalStateException();
            }
            return i3;
        } else if (i3 == c(z10)) {
            return -1;
        } else {
            return i3 + 1;
        }
    }

    public boolean equals(Object obj) {
        int c2;
        if (this != obj) {
            if (obj instanceof n1) {
                n1 n1Var = (n1) obj;
                if (n1Var.o() == o() && n1Var.h() == h()) {
                    m1 m1Var = new m1();
                    k1 k1Var = new k1();
                    m1 m1Var2 = new m1();
                    k1 k1Var2 = new k1();
                    int i3 = 0;
                    while (true) {
                        if (i3 < o()) {
                            if (!m(i3, m1Var, 0L).equals(n1Var.m(i3, m1Var2, 0L))) {
                                break;
                            }
                            i3++;
                        } else {
                            int i10 = 0;
                            while (true) {
                                if (i10 < h()) {
                                    if (!f(i10, k1Var, true).equals(n1Var.f(i10, k1Var2, true))) {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    int a10 = a(true);
                                    if (a10 == n1Var.a(true) && (c2 = c(true)) == n1Var.c(true)) {
                                        while (a10 != c2) {
                                            int e10 = e(a10, 0, true);
                                            if (e10 == n1Var.e(a10, 0, true)) {
                                                a10 = e10;
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

    public abstract k1 f(int i3, k1 k1Var, boolean z10);

    public k1 g(Object obj, k1 k1Var) {
        return f(b(obj), k1Var, true);
    }

    public abstract int h();

    public int hashCode() {
        m1 m1Var = new m1();
        k1 k1Var = new k1();
        int o10 = o() + 217;
        for (int i3 = 0; i3 < o(); i3++) {
            o10 = (o10 * 31) + m(i3, m1Var, 0L).hashCode();
        }
        int h = h() + (o10 * 31);
        for (int i10 = 0; i10 < h(); i10++) {
            h = (h * 31) + f(i10, k1Var, true).hashCode();
        }
        int a10 = a(true);
        while (a10 != -1) {
            h = (h * 31) + a10;
            a10 = e(a10, 0, true);
        }
        return h;
    }

    public final Pair i(m1 m1Var, k1 k1Var, int i3, long j10) {
        Pair j11 = j(m1Var, k1Var, i3, j10, 0L);
        j11.getClass();
        return j11;
    }

    public final Pair j(m1 m1Var, k1 k1Var, int i3, long j10, long j11) {
        zb.j(i3, o());
        m(i3, m1Var, j11);
        if (j10 == -9223372036854775807L) {
            j10 = m1Var.f8217l;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = m1Var.f8219n;
        f(i10, k1Var, false);
        while (i10 < m1Var.f8220o && k1Var.f8164e != j10) {
            int i11 = i10 + 1;
            if (f(i11, k1Var, false).f8164e > j10) {
                break;
            }
            i10 = i11;
        }
        f(i10, k1Var, true);
        long j12 = j10 - k1Var.f8164e;
        long j13 = k1Var.d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        long max = Math.max(0L, j12);
        Object obj = k1Var.f8162b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i3, int i10, boolean z10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i3 == a(z10)) {
                        return c(z10);
                    }
                    return i3 - 1;
                }
                throw new IllegalStateException();
            }
            return i3;
        } else if (i3 == a(z10)) {
            return -1;
        } else {
            return i3 - 1;
        }
    }

    public abstract Object l(int i3);

    public abstract m1 m(int i3, m1 m1Var, long j10);

    public final void n(int i3, m1 m1Var) {
        m(i3, m1Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
