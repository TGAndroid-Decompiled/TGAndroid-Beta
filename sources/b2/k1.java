package b2;

import android.util.Pair;
public abstract class k1 {
    public static final g1 f1774a = new Object();
    public static final String f1775b;
    public static final String f1776c;
    public static final String d;

    static {
        String str = e2.d0.f7188a;
        f1775b = Integer.toString(0, 36);
        f1776c = Integer.toString(1, 36);
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

    public final int d(int i10, h1 h1Var, j1 j1Var, int i11, boolean z10) {
        int i12 = f(i10, h1Var, false).f1707c;
        if (m(i12, j1Var, 0L).f1762o == i10) {
            int e = e(i12, i11, z10);
            if (e == -1) {
                return -1;
            }
            return m(e, j1Var, 0L).f1761n;
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
            if (obj instanceof k1) {
                k1 k1Var = (k1) obj;
                if (k1Var.o() == o() && k1Var.h() == h()) {
                    j1 j1Var = new j1();
                    h1 h1Var = new h1();
                    j1 j1Var2 = new j1();
                    h1 h1Var2 = new h1();
                    int i10 = 0;
                    while (true) {
                        if (i10 < o()) {
                            if (!m(i10, j1Var, 0L).equals(k1Var.m(i10, j1Var2, 0L))) {
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 0;
                            while (true) {
                                if (i11 < h()) {
                                    if (!f(i11, h1Var, true).equals(k1Var.f(i11, h1Var2, true))) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    int a2 = a(true);
                                    if (a2 == k1Var.a(true) && (c10 = c(true)) == k1Var.c(true)) {
                                        while (a2 != c10) {
                                            int e = e(a2, 0, true);
                                            if (e == k1Var.e(a2, 0, true)) {
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

    public abstract h1 f(int i10, h1 h1Var, boolean z10);

    public h1 g(Object obj, h1 h1Var) {
        return f(b(obj), h1Var, true);
    }

    public abstract int h();

    public int hashCode() {
        j1 j1Var = new j1();
        h1 h1Var = new h1();
        int o9 = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            o9 = (o9 * 31) + m(i10, j1Var, 0L).hashCode();
        }
        int h = h() + (o9 * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            h = (h * 31) + f(i11, h1Var, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(j1 j1Var, h1 h1Var, int i10, long j3) {
        Pair j10 = j(j1Var, h1Var, i10, j3, 0L);
        j10.getClass();
        return j10;
    }

    public final Pair j(j1 j1Var, h1 h1Var, int i10, long j3, long j10) {
        e2.d.c(i10, o());
        m(i10, j1Var, j10);
        if (j3 == -9223372036854775807L) {
            j3 = j1Var.f1759l;
            if (j3 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = j1Var.f1761n;
        f(i11, h1Var, false);
        while (i11 < j1Var.f1762o && h1Var.e != j3) {
            int i12 = i11 + 1;
            if (f(i12, h1Var, false).e > j3) {
                break;
            }
            i11 = i12;
        }
        f(i11, h1Var, true);
        long j11 = j3 - h1Var.e;
        long j12 = h1Var.d;
        if (j12 != -9223372036854775807L) {
            j11 = Math.min(j11, j12 - 1);
        }
        long max = Math.max(0L, j11);
        Object obj = h1Var.f1706b;
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

    public abstract j1 m(int i10, j1 j1Var, long j3);

    public final void n(int i10, j1 j1Var) {
        m(i10, j1Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
