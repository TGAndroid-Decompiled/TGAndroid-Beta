package defpackage;

import android.util.Pair;
public abstract class asb {
    public static final wrb a = new Object();
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = gcc.a;
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
        if (obj == kl6.h) {
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

    public final int d(int i, xrb xrbVar, zrb zrbVar, int i2, boolean z) {
        int i3 = f(i, xrbVar, false).c;
        if (m(i3, zrbVar, 0L).n == i) {
            int e = e(i3, i2, z);
            if (e == -1) {
                return -1;
            }
            return m(e, zrbVar, 0L).m;
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
                    grb.g();
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
            if (obj instanceof asb) {
                asb asbVar = (asb) obj;
                if (asbVar.o() == o() && asbVar.h() == h()) {
                    zrb zrbVar = new zrb();
                    xrb xrbVar = new xrb();
                    zrb zrbVar2 = new zrb();
                    xrb xrbVar2 = new xrb();
                    int i = 0;
                    while (true) {
                        if (i < o()) {
                            if (!m(i, zrbVar, 0L).equals(asbVar.m(i, zrbVar2, 0L))) {
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 0;
                            while (true) {
                                if (i2 < h()) {
                                    if (!f(i2, xrbVar, true).equals(asbVar.f(i2, xrbVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    int a2 = a(true);
                                    if (a2 == asbVar.a(true) && (c2 = c(true)) == asbVar.c(true)) {
                                        while (a2 != c2) {
                                            int e = e(a2, 0, true);
                                            if (e == asbVar.e(a2, 0, true)) {
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

    public xrb f(int i, xrb xrbVar, boolean z) {
        Integer num;
        Object obj;
        if (z) {
            num = 0;
            obj = kl6.h;
        } else {
            num = null;
            obj = null;
        }
        ea eaVar = ea.c;
        xrbVar.h(num, obj, 0, -9223372036854775807L, 0L, true);
        return xrbVar;
    }

    public xrb g(Object obj, xrb xrbVar) {
        return f(b(obj), xrbVar, true);
    }

    public int h() {
        return 1;
    }

    public final int hashCode() {
        int i;
        zrb zrbVar = new zrb();
        xrb xrbVar = new xrb();
        int o = o() + 217;
        int i2 = 0;
        while (true) {
            i = o * 31;
            if (i2 >= o()) {
                break;
            }
            o = i + m(i2, zrbVar, 0L).hashCode();
            i2++;
        }
        int h = h() + i;
        for (int i3 = 0; i3 < h(); i3++) {
            h = (h * 31) + f(i3, xrbVar, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(zrb zrbVar, xrb xrbVar, int i, long j) {
        Pair j2 = j(zrbVar, xrbVar, i, j, 0L);
        j2.getClass();
        return j2;
    }

    public final Pair j(zrb zrbVar, xrb xrbVar, int i, long j, long j2) {
        yve.j(i, o());
        m(i, zrbVar, j2);
        if (j == -9223372036854775807L) {
            j = zrbVar.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = zrbVar.m;
        f(i2, xrbVar, false);
        while (i2 < zrbVar.n && xrbVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, xrbVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, xrbVar, true);
        long j3 = j - xrbVar.e;
        long j4 = xrbVar.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = xrbVar.b;
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
                    grb.g();
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
        return kl6.h;
    }

    public zrb m(int i, zrb zrbVar, long j) {
        throw new IndexOutOfBoundsException();
    }

    public final void n(int i, zrb zrbVar) {
        m(i, zrbVar, 0L);
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
