package h3;

import android.util.Pair;

public abstract class s2 implements g {

    public static final o2 f8156a = new o2();

    static {
        int i10 = d5.g0.f4795a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public int a(boolean z10) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i10, p2 p2Var, r2 r2Var, int i11, boolean z10) {
        int i12 = f(i10, p2Var, false).f8069c;
        if (m(i12, r2Var, 0L).B != i10) {
            return i10 + 1;
        }
        int iE = e(i12, i11, z10);
        if (iE == -1) {
            return -1;
        }
        return m(iE, r2Var, 0L).A;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof s2) {
                s2 s2Var = (s2) obj;
                if (s2Var.o() == o() && s2Var.h() == h()) {
                    r2 r2Var = new r2();
                    p2 p2Var = new p2();
                    r2 r2Var2 = new r2();
                    p2 p2Var2 = new p2();
                    for (int i10 = 0; i10 < o(); i10++) {
                        if (m(i10, r2Var, 0L).equals(s2Var.m(i10, r2Var2, 0L))) {
                        }
                    }
                    for (int i11 = 0; i11 < h(); i11++) {
                        if (f(i11, p2Var, true).equals(s2Var.f(i11, p2Var2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == s2Var.a(true) && (iC = c(true)) == s2Var.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == s2Var.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract p2 f(int i10, p2 p2Var, boolean z10);

    public p2 g(Object obj, p2 p2Var) {
        return f(b(obj), p2Var, true);
    }

    public abstract int h();

    public final int hashCode() {
        r2 r2Var = new r2();
        p2 p2Var = new p2();
        int iO = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            iO = (iO * 31) + m(i10, r2Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            iH = (iH * 31) + f(i11, p2Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(r2 r2Var, p2 p2Var, int i10, long j10) {
        Pair pairJ = j(r2Var, p2Var, i10, j10, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(r2 r2Var, p2 p2Var, int i10, long j10, long j11) {
        d5.a.h(i10, o());
        m(i10, r2Var, j11);
        if (j10 == -9223372036854775807L) {
            j10 = r2Var.f8121x;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = r2Var.A;
        f(i11, p2Var, false);
        while (i11 < r2Var.B && p2Var.f8070e != j10) {
            int i12 = i11 + 1;
            if (f(i12, p2Var, false).f8070e > j10) {
                break;
            }
            i11 = i12;
        }
        f(i11, p2Var, true);
        long jMin = j10 - p2Var.f8070e;
        long j12 = p2Var.d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = p2Var.f8068b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i10);

    public abstract r2 m(int i10, r2 r2Var, long j10);

    public final void n(int i10, r2 r2Var) {
        m(i10, r2Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
