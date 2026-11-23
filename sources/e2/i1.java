package e2;

import j$.util.Objects;
public final class i1 {
    public static final String h;
    public static final String f10459i;
    public static final String f10460j;
    public static final String f10461k;
    public static final String f10462l;
    public Object f10463a;
    public Object f10464b;
    public int f10465c;
    public long d;
    public long f10466e;
    public boolean f10467f;
    public c f10468g = c.f10373c;

    static {
        String str = h2.l0.f13815a;
        h = Integer.toString(0, 36);
        f10459i = Integer.toString(1, 36);
        f10460j = Integer.toString(2, 36);
        f10461k = Integer.toString(3, 36);
        f10462l = Integer.toString(4, 36);
    }

    public final long a(int i7, int i10) {
        a a10 = this.f10468g.a(i7);
        if (a10.f10337a != -1) {
            return a10.f10341f[i10];
        }
        return -9223372036854775807L;
    }

    public final int b(long j3) {
        int i7;
        a a10;
        int i10;
        c cVar = this.f10468g;
        long j10 = this.d;
        int i11 = cVar.f10375a;
        if (j3 != Long.MIN_VALUE && (j10 == -9223372036854775807L || j3 < j10)) {
            int i12 = 0;
            while (i12 < i11) {
                cVar.a(i12).getClass();
                cVar.a(i12).getClass();
                if (0 > j3 && ((i10 = (a10 = cVar.a(i12)).f10337a) == -1 || a10.a(-1) < i10)) {
                    break;
                }
                i12++;
            }
            if (i12 < i11) {
                if (i7 != 0) {
                    cVar.a(i12).getClass();
                    if (0 <= j10) {
                    }
                }
                return i12;
            }
        }
        return -1;
    }

    public final int c(long j3) {
        c cVar = this.f10468g;
        int i7 = cVar.f10375a;
        int i10 = i7 - 1;
        if (i10 == i7 - 1) {
            cVar.a(i10).getClass();
        }
        while (i10 >= 0 && j3 != Long.MIN_VALUE) {
            cVar.a(i10).getClass();
            if (j3 >= 0) {
                break;
            }
            i10--;
        }
        if (i10 >= 0) {
            a a10 = cVar.a(i10);
            int i11 = a10.f10337a;
            if (i11 != -1) {
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = a10.f10340e[i12];
                    if (i13 != 0 && i13 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final long d(int i7) {
        this.f10468g.a(i7).getClass();
        return 0L;
    }

    public final int e(int i7) {
        return this.f10468g.a(i7).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i1.class.equals(obj.getClass())) {
                i1 i1Var = (i1) obj;
                if (Objects.equals(this.f10463a, i1Var.f10463a) && Objects.equals(this.f10464b, i1Var.f10464b) && this.f10465c == i1Var.f10465c && this.d == i1Var.d && this.f10466e == i1Var.f10466e && this.f10467f == i1Var.f10467f && Objects.equals(this.f10468g, i1Var.f10468g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean f(int i7) {
        c cVar = this.f10468g;
        int i10 = cVar.f10375a;
        if (i7 == i10 - 1 && i7 == i10 - 1) {
            cVar.a(i7).getClass();
            return false;
        }
        return false;
    }

    public final boolean g(int i7) {
        this.f10468g.a(i7).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i7, long j3, long j10, c cVar, boolean z10) {
        this.f10463a = obj;
        this.f10464b = obj2;
        this.f10465c = i7;
        this.d = j3;
        this.f10466e = j10;
        this.f10468g = cVar;
        this.f10467f = z10;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f10463a;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (217 + hashCode) * 31;
        Object obj2 = this.f10464b;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f10466e;
        return this.f10468g.hashCode() + ((((((((((i10 + i7) * 31) + this.f10465c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f10467f ? 1 : 0)) * 31);
    }
}
