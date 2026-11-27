package defpackage;

import j$.util.Objects;
public final class xrb {
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;

    static {
        String str = gcc.a;
        g = "0";
        h = "1";
        i = "2";
        j = "3";
        k = "4";
        l = "5";
        m = "6";
    }

    public xrb() {
        ea eaVar = ea.c;
    }

    public final long a(int i2, int i3) {
        ca a = ea.c.a(i2);
        if (a.a != -1) {
            return a.e[i3];
        }
        return -9223372036854775807L;
    }

    public final int b(long j2) {
        int i2;
        ca a;
        int i3;
        ea eaVar = ea.c;
        long j3 = this.d;
        int i4 = eaVar.a;
        if (j2 != Long.MIN_VALUE && (j3 == -9223372036854775807L || j2 < j3)) {
            int i5 = 0;
            while (i5 < i4) {
                eaVar.a(i5).getClass();
                eaVar.a(i5).getClass();
                if (0 > j2 && ((i3 = (a = eaVar.a(i5)).a) == -1 || a.a(-1) < i3)) {
                    break;
                }
                i5++;
            }
            if (i5 < i4) {
                if (i2 != 0) {
                    eaVar.a(i5).getClass();
                    if (0 <= j3) {
                    }
                }
                return i5;
            }
        }
        return -1;
    }

    public final int c(long j2) {
        ea eaVar = ea.c;
        int i2 = eaVar.a;
        int i3 = i2 - 1;
        if (i3 == i2 - 1) {
            eaVar.a(i3).getClass();
        }
        while (i3 >= 0 && j2 != Long.MIN_VALUE) {
            eaVar.a(i3).getClass();
            if (j2 >= 0) {
                break;
            }
            i3--;
        }
        if (i3 >= 0) {
            ca a = eaVar.a(i3);
            int i4 = a.a;
            if (i4 != -1) {
                for (int i5 = 0; i5 < i4; i5++) {
                    int i6 = a.d[i5];
                    if (i6 != 0 && i6 != 1) {
                    }
                }
            }
            return i3;
        }
        return -1;
    }

    public final long d(int i2) {
        ea.c.a(i2).getClass();
        return 0L;
    }

    public final int e(int i2) {
        return ea.c.a(i2).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && xrb.class.equals(obj.getClass())) {
                xrb xrbVar = (xrb) obj;
                if (Objects.equals(this.a, xrbVar.a) && Objects.equals(this.b, xrbVar.b) && this.c == xrbVar.c && this.d == xrbVar.d && this.e == xrbVar.e && this.f == xrbVar.f) {
                    ea eaVar = ea.c;
                    if (eaVar.equals(eaVar)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean f(int i2) {
        ea eaVar = ea.c;
        int i3 = eaVar.a;
        if (i2 == i3 - 1 && i2 == i3 - 1) {
            eaVar.a(i2).getClass();
            return false;
        }
        return false;
    }

    public final boolean g(int i2) {
        ea.c.a(i2).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i2, long j2, long j3, boolean z) {
        ea eaVar = ea.c;
        this.a = obj;
        this.b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.f = z;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        int i2 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i3 = (217 + hashCode) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        long j2 = this.d;
        long j3 = this.e;
        return ea.c.hashCode() + ((((((((((i3 + i2) * 31) + this.c) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
