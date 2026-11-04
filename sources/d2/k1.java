package d2;

import j$.util.Objects;
public final class k1 {
    public static final String h;
    public static final String f8157i;
    public static final String f8158j;
    public static final String f8159k;
    public static final String f8160l;
    public Object f8161a;
    public Object f8162b;
    public int f8163c;
    public long d;
    public long f8164e;
    public boolean f8165f;
    public c f8166g = c.f8039c;

    static {
        String str = g2.n0.f11873a;
        h = Integer.toString(0, 36);
        f8157i = Integer.toString(1, 36);
        f8158j = Integer.toString(2, 36);
        f8159k = Integer.toString(3, 36);
        f8160l = Integer.toString(4, 36);
    }

    public final long a(int i3, int i10) {
        a a10 = this.f8166g.a(i3);
        if (a10.f8016a != -1) {
            return a10.f8020f[i10];
        }
        return -9223372036854775807L;
    }

    public final int b(long j10) {
        int i3;
        a a10;
        int i10;
        c cVar = this.f8166g;
        long j11 = this.d;
        int i11 = cVar.f8041a;
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i12 = 0;
            while (i12 < i11) {
                cVar.a(i12).getClass();
                cVar.a(i12).getClass();
                if (0 > j10 && ((i10 = (a10 = cVar.a(i12)).f8016a) == -1 || a10.a(-1) < i10)) {
                    break;
                }
                i12++;
            }
            if (i12 < i11) {
                if (i3 != 0) {
                    cVar.a(i12).getClass();
                    if (0 <= j11) {
                    }
                }
                return i12;
            }
        }
        return -1;
    }

    public final int c(long j10) {
        c cVar = this.f8166g;
        int i3 = cVar.f8041a;
        int i10 = i3 - 1;
        if (i10 == i3 - 1) {
            cVar.a(i10).getClass();
        }
        while (i10 >= 0 && j10 != Long.MIN_VALUE) {
            cVar.a(i10).getClass();
            if (j10 >= 0) {
                break;
            }
            i10--;
        }
        if (i10 >= 0) {
            a a10 = cVar.a(i10);
            int i11 = a10.f8016a;
            if (i11 != -1) {
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = a10.f8019e[i12];
                    if (i13 != 0 && i13 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final long d(int i3) {
        this.f8166g.a(i3).getClass();
        return 0L;
    }

    public final int e(int i3) {
        return this.f8166g.a(i3).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k1.class.equals(obj.getClass())) {
                k1 k1Var = (k1) obj;
                if (Objects.equals(this.f8161a, k1Var.f8161a) && Objects.equals(this.f8162b, k1Var.f8162b) && this.f8163c == k1Var.f8163c && this.d == k1Var.d && this.f8164e == k1Var.f8164e && this.f8165f == k1Var.f8165f && Objects.equals(this.f8166g, k1Var.f8166g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean f(int i3) {
        c cVar = this.f8166g;
        int i10 = cVar.f8041a;
        if (i3 == i10 - 1 && i3 == i10 - 1) {
            cVar.a(i3).getClass();
            return false;
        }
        return false;
    }

    public final boolean g(int i3) {
        this.f8166g.a(i3).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i3, long j10, long j11, c cVar, boolean z10) {
        this.f8161a = obj;
        this.f8162b = obj2;
        this.f8163c = i3;
        this.d = j10;
        this.f8164e = j11;
        this.f8166g = cVar;
        this.f8165f = z10;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f8161a;
        int i3 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (217 + hashCode) * 31;
        Object obj2 = this.f8162b;
        if (obj2 != null) {
            i3 = obj2.hashCode();
        }
        long j10 = this.d;
        long j11 = this.f8164e;
        return this.f8166g.hashCode() + ((((((((((i10 + i3) * 31) + this.f8163c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f8165f ? 1 : 0)) * 31);
    }
}
