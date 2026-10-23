package b2;

import android.util.Pair;
import v7.u6;
public abstract class o1 {
    public static final k1 f3897a = new Object();
    public static final String f3898b;
    public static final String f3899c;
    public static final String d;

    static {
        String str = e2.m0.f8259a;
        f3898b = Integer.toString(0, 36);
        f3899c = Integer.toString(1, 36);
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

    public final int d(int i10, l1 l1Var, n1 n1Var, int i11, boolean z10) {
        int i12 = f(i10, l1Var, false).f3829c;
        if (m(i12, n1Var, 0L).f3885o == i10) {
            int e = e(i12, i11, z10);
            if (e == -1) {
                return -1;
            }
            return m(e, n1Var, 0L).f3884n;
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
            if (obj instanceof o1) {
                o1 o1Var = (o1) obj;
                if (o1Var.o() == o() && o1Var.h() == h()) {
                    n1 n1Var = new n1();
                    l1 l1Var = new l1();
                    n1 n1Var2 = new n1();
                    l1 l1Var2 = new l1();
                    int i10 = 0;
                    while (true) {
                        if (i10 < o()) {
                            if (!m(i10, n1Var, 0L).equals(o1Var.m(i10, n1Var2, 0L))) {
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 0;
                            while (true) {
                                if (i11 < h()) {
                                    if (!f(i11, l1Var, true).equals(o1Var.f(i11, l1Var2, true))) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    int a2 = a(true);
                                    if (a2 == o1Var.a(true) && (c10 = c(true)) == o1Var.c(true)) {
                                        while (a2 != c10) {
                                            int e = e(a2, 0, true);
                                            if (e == o1Var.e(a2, 0, true)) {
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

    public abstract l1 f(int i10, l1 l1Var, boolean z10);

    public l1 g(Object obj, l1 l1Var) {
        return f(b(obj), l1Var, true);
    }

    public abstract int h();

    public int hashCode() {
        n1 n1Var = new n1();
        l1 l1Var = new l1();
        int o10 = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            o10 = (o10 * 31) + m(i10, n1Var, 0L).hashCode();
        }
        int h = h() + (o10 * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            h = (h * 31) + f(i11, l1Var, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(n1 n1Var, l1 l1Var, int i10, long j10) {
        Pair j11 = j(n1Var, l1Var, i10, j10, 0L);
        j11.getClass();
        return j11;
    }

    public final Pair j(n1 n1Var, l1 l1Var, int i10, long j10, long j11) {
        u6.j(i10, o());
        m(i10, n1Var, j11);
        if (j10 == -9223372036854775807L) {
            j10 = n1Var.f3882l;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = n1Var.f3884n;
        f(i11, l1Var, false);
        while (i11 < n1Var.f3885o && l1Var.e != j10) {
            int i12 = i11 + 1;
            if (f(i12, l1Var, false).e > j10) {
                break;
            }
            i11 = i12;
        }
        f(i11, l1Var, true);
        long j12 = j10 - l1Var.e;
        long j13 = l1Var.d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        long max = Math.max(0L, j12);
        Object obj = l1Var.f3828b;
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

    public abstract n1 m(int i10, n1 n1Var, long j10);

    public final void n(int i10, n1 n1Var) {
        m(i10, n1Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
