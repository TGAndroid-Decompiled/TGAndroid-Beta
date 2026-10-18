package b2;

import j$.util.Objects;
public final class l1 {
    public static final String h;
    public static final String f3820i;
    public static final String f3821j;
    public static final String f3822k;
    public static final String f3823l;
    public Object f3824a;
    public Object f3825b;
    public int f3826c;
    public long d;
    public long e;
    public boolean f3827f;
    public c f3828g = c.f3705c;

    static {
        String str = e2.m0.f8253a;
        h = Integer.toString(0, 36);
        f3820i = Integer.toString(1, 36);
        f3821j = Integer.toString(2, 36);
        f3822k = Integer.toString(3, 36);
        f3823l = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        a a2 = this.f3828g.a(i10);
        if (a2.f3685a != -1) {
            return a2.f3688f[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long j10) {
        int i10;
        a a2;
        int i11;
        c cVar = this.f3828g;
        long j11 = this.d;
        int i12 = cVar.f3706a;
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i13 = 0;
            while (i13 < i12) {
                cVar.a(i13).getClass();
                cVar.a(i13).getClass();
                if (0 > j10 && ((i11 = (a2 = cVar.a(i13)).f3685a) == -1 || a2.a(-1) < i11)) {
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
        c cVar = this.f3828g;
        int i10 = cVar.f3706a;
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
            int i12 = a2.f3685a;
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
        this.f3828g.a(i10).getClass();
        return 0L;
    }

    public final int e(int i10) {
        return this.f3828g.a(i10).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && l1.class.equals(obj.getClass())) {
                l1 l1Var = (l1) obj;
                if (Objects.equals(this.f3824a, l1Var.f3824a) && Objects.equals(this.f3825b, l1Var.f3825b) && this.f3826c == l1Var.f3826c && this.d == l1Var.d && this.e == l1Var.e && this.f3827f == l1Var.f3827f && Objects.equals(this.f3828g, l1Var.f3828g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean f(int i10) {
        c cVar = this.f3828g;
        int i11 = cVar.f3706a;
        if (i10 == i11 - 1 && i10 == i11 - 1) {
            cVar.a(i10).getClass();
            return false;
        }
        return false;
    }

    public final boolean g(int i10) {
        this.f3828g.a(i10).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i10, long j10, long j11, c cVar, boolean z10) {
        this.f3824a = obj;
        this.f3825b = obj2;
        this.f3826c = i10;
        this.d = j10;
        this.e = j11;
        this.f3828g = cVar;
        this.f3827f = z10;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f3824a;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (217 + hashCode) * 31;
        Object obj2 = this.f3825b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        long j10 = this.d;
        long j11 = this.e;
        return this.f3828g.hashCode() + ((((((((((i11 + i10) * 31) + this.f3826c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f3827f ? 1 : 0)) * 31);
    }
}
