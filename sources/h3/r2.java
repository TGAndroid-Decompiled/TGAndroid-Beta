package h3;

import android.util.Pair;
public abstract class r2 implements g {
    public static final o2 f9692a = new Object();

    static {
        int i9 = d5.f0.f4349a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
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

    public final int d(int i9, p2 p2Var, q2 q2Var, int i10, boolean z10) {
        int i11 = f(i9, p2Var, false).f9639c;
        if (m(i11, q2Var, 0L).B == i9) {
            int e10 = e(i11, i10, z10);
            if (e10 == -1) {
                return -1;
            }
            return m(e10, q2Var, 0L).A;
        }
        return i9 + 1;
    }

    public int e(int i9, int i10, boolean z10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i9 == c(z10)) {
                        return a(z10);
                    }
                    return i9 + 1;
                }
                throw new IllegalStateException();
            }
            return i9;
        } else if (i9 == c(z10)) {
            return -1;
        } else {
            return i9 + 1;
        }
    }

    public final boolean equals(Object obj) {
        int c10;
        if (this != obj) {
            if (obj instanceof r2) {
                r2 r2Var = (r2) obj;
                if (r2Var.o() == o() && r2Var.h() == h()) {
                    q2 q2Var = new q2();
                    p2 p2Var = new p2();
                    q2 q2Var2 = new q2();
                    p2 p2Var2 = new p2();
                    int i9 = 0;
                    while (true) {
                        if (i9 < o()) {
                            if (!m(i9, q2Var, 0L).equals(r2Var.m(i9, q2Var2, 0L))) {
                                break;
                            }
                            i9++;
                        } else {
                            int i10 = 0;
                            while (true) {
                                if (i10 < h()) {
                                    if (!f(i10, p2Var, true).equals(r2Var.f(i10, p2Var2, true))) {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    int a2 = a(true);
                                    if (a2 == r2Var.a(true) && (c10 = c(true)) == r2Var.c(true)) {
                                        while (a2 != c10) {
                                            int e10 = e(a2, 0, true);
                                            if (e10 == r2Var.e(a2, 0, true)) {
                                                a2 = e10;
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

    public abstract p2 f(int i9, p2 p2Var, boolean z10);

    public p2 g(Object obj, p2 p2Var) {
        return f(b(obj), p2Var, true);
    }

    public abstract int h();

    public final int hashCode() {
        q2 q2Var = new q2();
        p2 p2Var = new p2();
        int o6 = o() + 217;
        for (int i9 = 0; i9 < o(); i9++) {
            o6 = (o6 * 31) + m(i9, q2Var, 0L).hashCode();
        }
        int h = h() + (o6 * 31);
        for (int i10 = 0; i10 < h(); i10++) {
            h = (h * 31) + f(i10, p2Var, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(q2 q2Var, p2 p2Var, int i9, long j10) {
        Pair j11 = j(q2Var, p2Var, i9, j10, 0L);
        j11.getClass();
        return j11;
    }

    public final Pair j(q2 q2Var, p2 p2Var, int i9, long j10, long j11) {
        d5.a.h(i9, o());
        m(i9, q2Var, j11);
        if (j10 == -9223372036854775807L) {
            j10 = q2Var.f9667x;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = q2Var.A;
        f(i10, p2Var, false);
        while (i10 < q2Var.B && p2Var.f9640e != j10) {
            int i11 = i10 + 1;
            if (f(i11, p2Var, false).f9640e > j10) {
                break;
            }
            i10 = i11;
        }
        f(i10, p2Var, true);
        long j12 = j10 - p2Var.f9640e;
        long j13 = p2Var.d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        long max = Math.max(0L, j12);
        Object obj = p2Var.f9638b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i9, int i10, boolean z10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i9 == a(z10)) {
                        return c(z10);
                    }
                    return i9 - 1;
                }
                throw new IllegalStateException();
            }
            return i9;
        } else if (i9 == a(z10)) {
            return -1;
        } else {
            return i9 - 1;
        }
    }

    public abstract Object l(int i9);

    public abstract q2 m(int i9, q2 q2Var, long j10);

    public final void n(int i9, q2 q2Var) {
        m(i9, q2Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
