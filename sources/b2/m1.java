package b2;

import j$.util.Objects;
public final class m1 {
    public static final String h;
    public static final String f2207i;
    public static final String f2208j;
    public static final String f2209k;
    public static final String f2210l;
    public Object f2211a;
    public Object f2212b;
    public int f2213c;
    public long d;
    public long e;
    public boolean f2214f;
    public c f2215g = c.f2086c;

    static {
        String str = e2.m0.f8372a;
        h = Integer.toString(0, 36);
        f2207i = Integer.toString(1, 36);
        f2208j = Integer.toString(2, 36);
        f2209k = Integer.toString(3, 36);
        f2210l = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        a a2 = this.f2215g.a(i10);
        if (a2.f2067a != -1) {
            return a2.f2070f[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long j10) {
        int i10;
        a a2;
        int i11;
        c cVar = this.f2215g;
        long j11 = this.d;
        int i12 = cVar.f2087a;
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i13 = 0;
            while (i13 < i12) {
                cVar.a(i13).getClass();
                cVar.a(i13).getClass();
                if (0 > j10 && ((i11 = (a2 = cVar.a(i13)).f2067a) == -1 || a2.a(-1) < i11)) {
                    break;
                }
                i13++;
            }
            if (i13 < i12) {
                if (i10 != 0) {
                    cVar.a(i13).getClass();
                    if (0 <= j11) {
                    }
                }
                return i13;
            }
        }
        return -1;
    }

    public final int c(long j10) {
        c cVar = this.f2215g;
        int i10 = cVar.f2087a;
        int i11 = i10 - 1;
        if (i11 == i10 - 1) {
            cVar.a(i11).getClass();
        }
        while (i11 >= 0 && j10 != Long.MIN_VALUE) {
            cVar.a(i11).getClass();
            if (j10 >= 0) {
                break;
            }
            i11--;
        }
        if (i11 >= 0) {
            a a2 = cVar.a(i11);
            int i12 = a2.f2067a;
            if (i12 != -1) {
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = a2.e[i13];
                    if (i14 != 0 && i14 != 1) {
                    }
                }
            }
            return i11;
        }
        return -1;
    }

    public final long d(int i10) {
        this.f2215g.a(i10).getClass();
        return 0L;
    }

    public final int e(int i10) {
        return this.f2215g.a(i10).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && m1.class.equals(obj.getClass())) {
                m1 m1Var = (m1) obj;
                if (Objects.equals(this.f2211a, m1Var.f2211a) && Objects.equals(this.f2212b, m1Var.f2212b) && this.f2213c == m1Var.f2213c && this.d == m1Var.d && this.e == m1Var.e && this.f2214f == m1Var.f2214f && Objects.equals(this.f2215g, m1Var.f2215g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean f(int i10) {
        c cVar = this.f2215g;
        int i11 = cVar.f2087a;
        if (i10 == i11 - 1 && i10 == i11 - 1) {
            cVar.a(i10).getClass();
            return false;
        }
        return false;
    }

    public final boolean g(int i10) {
        this.f2215g.a(i10).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i10, long j10, long j11, c cVar, boolean z10) {
        this.f2211a = obj;
        this.f2212b = obj2;
        this.f2213c = i10;
        this.d = j10;
        this.e = j11;
        this.f2215g = cVar;
        this.f2214f = z10;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f2211a;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (217 + hashCode) * 31;
        Object obj2 = this.f2212b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        long j10 = this.d;
        long j11 = this.e;
        return this.f2215g.hashCode() + ((((((((((i11 + i10) * 31) + this.f2213c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f2214f ? 1 : 0)) * 31);
    }
}
