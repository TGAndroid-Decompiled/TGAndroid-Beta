package defpackage;

import android.util.Pair;
public abstract class aob {
    public static final wnb a = new Object();
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = g8c.a;
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
        if (obj == fj6.h) {
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

    public final int d(int i, xnb xnbVar, znb znbVar, int i2, boolean z) {
        int i3 = f(i, xnbVar, false).c;
        if (m(i3, znbVar, 0L).n == i) {
            int e = e(i3, i2, z);
            if (e == -1) {
                return -1;
            }
            return m(e, znbVar, 0L).m;
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
                    sdb.a();
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
            if (obj instanceof aob) {
                aob aobVar = (aob) obj;
                if (aobVar.o() == o() && aobVar.h() == h()) {
                    znb znbVar = new znb();
                    xnb xnbVar = new xnb();
                    znb znbVar2 = new znb();
                    xnb xnbVar2 = new xnb();
                    int i = 0;
                    while (true) {
                        if (i < o()) {
                            if (!m(i, znbVar, 0L).equals(aobVar.m(i, znbVar2, 0L))) {
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 0;
                            while (true) {
                                if (i2 < h()) {
                                    if (!f(i2, xnbVar, true).equals(aobVar.f(i2, xnbVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    int a2 = a(true);
                                    if (a2 == aobVar.a(true) && (c2 = c(true)) == aobVar.c(true)) {
                                        while (a2 != c2) {
                                            int e = e(a2, 0, true);
                                            if (e == aobVar.e(a2, 0, true)) {
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

    public xnb f(int i, xnb xnbVar, boolean z) {
        Integer num;
        Object obj;
        if (z) {
            num = 0;
            obj = fj6.h;
        } else {
            num = null;
            obj = null;
        }
        da daVar = da.c;
        xnbVar.h(num, obj, 0, -9223372036854775807L, 0L, true);
        return xnbVar;
    }

    public xnb g(Object obj, xnb xnbVar) {
        return f(b(obj), xnbVar, true);
    }

    public int h() {
        return 1;
    }

    public final int hashCode() {
        int i;
        znb znbVar = new znb();
        xnb xnbVar = new xnb();
        int o = o() + 217;
        int i2 = 0;
        while (true) {
            i = o * 31;
            if (i2 >= o()) {
                break;
            }
            o = i + m(i2, znbVar, 0L).hashCode();
            i2++;
        }
        int h = h() + i;
        for (int i3 = 0; i3 < h(); i3++) {
            h = (h * 31) + f(i3, xnbVar, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(znb znbVar, xnb xnbVar, int i, long j) {
        Pair j2 = j(znbVar, xnbVar, i, j, 0L);
        j2.getClass();
        return j2;
    }

    public final Pair j(znb znbVar, xnb xnbVar, int i, long j, long j2) {
        gre.j(i, o());
        m(i, znbVar, j2);
        if (j == -9223372036854775807L) {
            j = znbVar.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = znbVar.m;
        f(i2, xnbVar, false);
        while (i2 < znbVar.n && xnbVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, xnbVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, xnbVar, true);
        long j3 = j - xnbVar.e;
        long j4 = xnbVar.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = xnbVar.b;
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
                    sdb.a();
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
        return fj6.h;
    }

    public znb m(int i, znb znbVar, long j) {
        throw new IndexOutOfBoundsException();
    }

    public final void n(int i, znb znbVar) {
        m(i, znbVar, 0L);
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
