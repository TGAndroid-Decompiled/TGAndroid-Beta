package j3;

import android.util.Pair;
public abstract class o2 implements g {
    public static final l2 f9353a = new Object();

    static {
        int i10 = h5.d0.f7237a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public int a(boolean z4) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z4) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i10, m2 m2Var, n2 n2Var, int i11, boolean z4) {
        int i12 = f(i10, m2Var, false).f9285c;
        if (m(i12, n2Var, 0L).C == i10) {
            int e6 = e(i12, i11, z4);
            if (e6 == -1) {
                return -1;
            }
            return m(e6, n2Var, 0L).B;
        }
        return i10 + 1;
    }

    public int e(int i10, int i11, boolean z4) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == c(z4)) {
                        return a(z4);
                    }
                    return i10 + 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        } else if (i10 == c(z4)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public final boolean equals(Object obj) {
        int c3;
        if (this != obj) {
            if (obj instanceof o2) {
                o2 o2Var = (o2) obj;
                if (o2Var.o() == o() && o2Var.h() == h()) {
                    n2 n2Var = new n2();
                    m2 m2Var = new m2();
                    n2 n2Var2 = new n2();
                    m2 m2Var2 = new m2();
                    int i10 = 0;
                    while (true) {
                        if (i10 < o()) {
                            if (!m(i10, n2Var, 0L).equals(o2Var.m(i10, n2Var2, 0L))) {
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 0;
                            while (true) {
                                if (i11 < h()) {
                                    if (!f(i11, m2Var, true).equals(o2Var.f(i11, m2Var2, true))) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    int a2 = a(true);
                                    if (a2 == o2Var.a(true) && (c3 = c(true)) == o2Var.c(true)) {
                                        while (a2 != c3) {
                                            int e6 = e(a2, 0, true);
                                            if (e6 == o2Var.e(a2, 0, true)) {
                                                a2 = e6;
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

    public abstract m2 f(int i10, m2 m2Var, boolean z4);

    public m2 g(Object obj, m2 m2Var) {
        return f(b(obj), m2Var, true);
    }

    public abstract int h();

    public final int hashCode() {
        n2 n2Var = new n2();
        m2 m2Var = new m2();
        int o10 = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            o10 = (o10 * 31) + m(i10, n2Var, 0L).hashCode();
        }
        int h = h() + (o10 * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            h = (h * 31) + f(i11, m2Var, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(n2 n2Var, m2 m2Var, int i10, long j10) {
        Pair j11 = j(n2Var, m2Var, i10, j10, 0L);
        j11.getClass();
        return j11;
    }

    public final Pair j(n2 n2Var, m2 m2Var, int i10, long j10, long j11) {
        h5.a.h(i10, o());
        m(i10, n2Var, j11);
        if (j10 == -9223372036854775807L) {
            j10 = n2Var.f9343x;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = n2Var.B;
        f(i11, m2Var, false);
        while (i11 < n2Var.C && m2Var.f9286e != j10) {
            int i12 = i11 + 1;
            if (f(i12, m2Var, false).f9286e > j10) {
                break;
            }
            i11 = i12;
        }
        f(i11, m2Var, true);
        long j12 = j10 - m2Var.f9286e;
        long j13 = m2Var.d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        long max = Math.max(0L, j12);
        Object obj = m2Var.f9284b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i10, int i11, boolean z4) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == a(z4)) {
                        return c(z4);
                    }
                    return i10 - 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        } else if (i10 == a(z4)) {
            return -1;
        } else {
            return i10 - 1;
        }
    }

    public abstract Object l(int i10);

    public abstract n2 m(int i10, n2 n2Var, long j10);

    public final void n(int i10, n2 n2Var) {
        m(i10, n2Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
