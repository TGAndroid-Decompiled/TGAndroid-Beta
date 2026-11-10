package e2;

import a8.ia;
import android.util.Pair;
public abstract class l1 {
    public static final h1 f10359a = new Object();
    public static final String f10360b;
    public static final String f10361c;
    public static final String d;

    static {
        String str = h2.m0.f14114a;
        f10360b = Integer.toString(0, 36);
        f10361c = Integer.toString(1, 36);
        d = Integer.toString(2, 36);
    }

    public int a(boolean z9) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z9) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i7, i1 i1Var, k1 k1Var, int i10, boolean z9) {
        int i11 = f(i7, i1Var, false).f10287c;
        if (m(i11, k1Var, 0L).f10341o == i7) {
            int e10 = e(i11, i10, z9);
            if (e10 == -1) {
                return -1;
            }
            return m(e10, k1Var, 0L).f10340n;
        }
        return i7 + 1;
    }

    public int e(int i7, int i10, boolean z9) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i7 == c(z9)) {
                        return a(z9);
                    }
                    return i7 + 1;
                }
                throw new IllegalStateException();
            }
            return i7;
        } else if (i7 == c(z9)) {
            return -1;
        } else {
            return i7 + 1;
        }
    }

    public boolean equals(Object obj) {
        int c10;
        if (this != obj) {
            if (obj instanceof l1) {
                l1 l1Var = (l1) obj;
                if (l1Var.o() == o() && l1Var.h() == h()) {
                    k1 k1Var = new k1();
                    i1 i1Var = new i1();
                    k1 k1Var2 = new k1();
                    i1 i1Var2 = new i1();
                    int i7 = 0;
                    while (true) {
                        if (i7 < o()) {
                            if (!m(i7, k1Var, 0L).equals(l1Var.m(i7, k1Var2, 0L))) {
                                break;
                            }
                            i7++;
                        } else {
                            int i10 = 0;
                            while (true) {
                                if (i10 < h()) {
                                    if (!f(i10, i1Var, true).equals(l1Var.f(i10, i1Var2, true))) {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    int a10 = a(true);
                                    if (a10 == l1Var.a(true) && (c10 = c(true)) == l1Var.c(true)) {
                                        while (a10 != c10) {
                                            int e10 = e(a10, 0, true);
                                            if (e10 == l1Var.e(a10, 0, true)) {
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

    public abstract i1 f(int i7, i1 i1Var, boolean z9);

    public i1 g(Object obj, i1 i1Var) {
        return f(b(obj), i1Var, true);
    }

    public abstract int h();

    public int hashCode() {
        k1 k1Var = new k1();
        i1 i1Var = new i1();
        int o4 = o() + 217;
        for (int i7 = 0; i7 < o(); i7++) {
            o4 = (o4 * 31) + m(i7, k1Var, 0L).hashCode();
        }
        int h = h() + (o4 * 31);
        for (int i10 = 0; i10 < h(); i10++) {
            h = (h * 31) + f(i10, i1Var, true).hashCode();
        }
        int a10 = a(true);
        while (a10 != -1) {
            h = (h * 31) + a10;
            a10 = e(a10, 0, true);
        }
        return h;
    }

    public final Pair i(k1 k1Var, i1 i1Var, int i7, long j3) {
        Pair j10 = j(k1Var, i1Var, i7, j3, 0L);
        j10.getClass();
        return j10;
    }

    public final Pair j(k1 k1Var, i1 i1Var, int i7, long j3, long j10) {
        ia.j(i7, o());
        m(i7, k1Var, j10);
        if (j3 == -9223372036854775807L) {
            j3 = k1Var.f10338l;
            if (j3 == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = k1Var.f10340n;
        f(i10, i1Var, false);
        while (i10 < k1Var.f10341o && i1Var.f10288e != j3) {
            int i11 = i10 + 1;
            if (f(i11, i1Var, false).f10288e > j3) {
                break;
            }
            i10 = i11;
        }
        f(i10, i1Var, true);
        long j11 = j3 - i1Var.f10288e;
        long j12 = i1Var.d;
        if (j12 != -9223372036854775807L) {
            j11 = Math.min(j11, j12 - 1);
        }
        long max = Math.max(0L, j11);
        Object obj = i1Var.f10286b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i7, int i10, boolean z9) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i7 == a(z9)) {
                        return c(z9);
                    }
                    return i7 - 1;
                }
                throw new IllegalStateException();
            }
            return i7;
        } else if (i7 == a(z9)) {
            return -1;
        } else {
            return i7 - 1;
        }
    }

    public abstract Object l(int i7);

    public abstract k1 m(int i7, k1 k1Var, long j3);

    public final void n(int i7, k1 k1Var) {
        m(i7, k1Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
