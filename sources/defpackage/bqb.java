package defpackage;

import android.util.Pair;
public abstract class bqb {
    public static final xpb a = new Object();
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = hac.a;
        b = "0";
        c = "1";
        d = "2";
    }

    public int a(boolean z) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public int b(Object obj) {
        if (obj == il6.h) {
            return 0;
        }
        return -1;
    }

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, ypb ypbVar, aqb aqbVar, int i2, boolean z) {
        int i3 = f(i, ypbVar, false).c;
        if (m(i3, aqbVar, 0L).n == i) {
            int e = e(i3, i2, z);
            if (e == -1) {
                return -1;
            }
            return m(e, aqbVar, 0L).m;
        }
        return i + 1;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == c(z)) {
                        return a(z);
                    }
                } else {
                    rjb.h();
                    return 0;
                }
            } else {
                return i;
            }
        } else if (i == c(z)) {
            return -1;
        }
        return i + 1;
    }

    public final boolean equals(Object obj) {
        int c2;
        if (this != obj) {
            if (obj instanceof bqb) {
                bqb bqbVar = (bqb) obj;
                if (bqbVar.o() == o() && bqbVar.h() == h()) {
                    aqb aqbVar = new aqb();
                    ypb ypbVar = new ypb();
                    aqb aqbVar2 = new aqb();
                    ypb ypbVar2 = new ypb();
                    int i = 0;
                    while (true) {
                        if (i < o()) {
                            if (!m(i, aqbVar, 0L).equals(bqbVar.m(i, aqbVar2, 0L))) {
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 0;
                            while (true) {
                                if (i2 < h()) {
                                    if (!f(i2, ypbVar, true).equals(bqbVar.f(i2, ypbVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    int a2 = a(true);
                                    if (a2 == bqbVar.a(true) && (c2 = c(true)) == bqbVar.c(true)) {
                                        while (a2 != c2) {
                                            int e = e(a2, 0, true);
                                            if (e == bqbVar.e(a2, 0, true)) {
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

    public ypb f(int i, ypb ypbVar, boolean z) {
        Integer num;
        Object obj;
        if (z) {
            num = 0;
            obj = il6.h;
        } else {
            num = null;
            obj = null;
        }
        da daVar = da.c;
        ypbVar.h(num, obj, 0, -9223372036854775807L, 0L, true);
        return ypbVar;
    }

    public ypb g(Object obj, ypb ypbVar) {
        return f(b(obj), ypbVar, true);
    }

    public int h() {
        return 1;
    }

    public final int hashCode() {
        int i;
        aqb aqbVar = new aqb();
        ypb ypbVar = new ypb();
        int o = o() + 217;
        int i2 = 0;
        while (true) {
            i = o * 31;
            if (i2 >= o()) {
                break;
            }
            o = i + m(i2, aqbVar, 0L).hashCode();
            i2++;
        }
        int h = h() + i;
        for (int i3 = 0; i3 < h(); i3++) {
            h = (h * 31) + f(i3, ypbVar, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(aqb aqbVar, ypb ypbVar, int i, long j) {
        Pair j2 = j(aqbVar, ypbVar, i, j, 0L);
        j2.getClass();
        return j2;
    }

    public final Pair j(aqb aqbVar, ypb ypbVar, int i, long j, long j2) {
        jte.j(i, o());
        m(i, aqbVar, j2);
        if (j == -9223372036854775807L) {
            j = aqbVar.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = aqbVar.m;
        f(i2, ypbVar, false);
        while (i2 < aqbVar.n && ypbVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, ypbVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, ypbVar, true);
        long j3 = j - ypbVar.e;
        long j4 = ypbVar.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = ypbVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == a(z)) {
                        return c(z);
                    }
                } else {
                    rjb.h();
                    return 0;
                }
            } else {
                return i;
            }
        } else if (i == a(z)) {
            return -1;
        }
        return i - 1;
    }

    public Object l(int i) {
        return il6.h;
    }

    public aqb m(int i, aqb aqbVar, long j) {
        throw new IndexOutOfBoundsException();
    }

    public final void n(int i, aqb aqbVar) {
        m(i, aqbVar, 0L);
    }

    public int o() {
        return 1;
    }

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
