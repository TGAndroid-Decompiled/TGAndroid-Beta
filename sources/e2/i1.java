package e2;

import j$.util.Objects;
public final class i1 {
    public static final String h;
    public static final String f10422i;
    public static final String f10423j;
    public static final String f10424k;
    public static final String f10425l;
    public Object f10426a;
    public Object f10427b;
    public int f10428c;
    public long d;
    public long f10429e;
    public boolean f10430f;
    public c f10431g = c.f10336c;

    static {
        String str = h2.l0.f13778a;
        h = Integer.toString(0, 36);
        f10422i = Integer.toString(1, 36);
        f10423j = Integer.toString(2, 36);
        f10424k = Integer.toString(3, 36);
        f10425l = Integer.toString(4, 36);
    }

    public final long a(int i7, int i10) {
        a a10 = this.f10431g.a(i7);
        if (a10.f10300a != -1) {
            return a10.f10304f[i10];
        }
        return -9223372036854775807L;
    }

    public final int b(long j3) {
        int i7;
        a a10;
        int i10;
        c cVar = this.f10431g;
        long j10 = this.d;
        int i11 = cVar.f10338a;
        if (j3 != Long.MIN_VALUE && (j10 == -9223372036854775807L || j3 < j10)) {
            int i12 = 0;
            while (i12 < i11) {
                cVar.a(i12).getClass();
                cVar.a(i12).getClass();
                if (0 > j3 && ((i10 = (a10 = cVar.a(i12)).f10300a) == -1 || a10.a(-1) < i10)) {
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
        c cVar = this.f10431g;
        int i7 = cVar.f10338a;
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
            int i11 = a10.f10300a;
            if (i11 != -1) {
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = a10.f10303e[i12];
                    if (i13 != 0 && i13 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final long d(int i7) {
        this.f10431g.a(i7).getClass();
        return 0L;
    }

    public final int e(int i7) {
        return this.f10431g.a(i7).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i1.class.equals(obj.getClass())) {
                i1 i1Var = (i1) obj;
                if (Objects.equals(this.f10426a, i1Var.f10426a) && Objects.equals(this.f10427b, i1Var.f10427b) && this.f10428c == i1Var.f10428c && this.d == i1Var.d && this.f10429e == i1Var.f10429e && this.f10430f == i1Var.f10430f && Objects.equals(this.f10431g, i1Var.f10431g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean f(int i7) {
        c cVar = this.f10431g;
        int i10 = cVar.f10338a;
        if (i7 == i10 - 1 && i7 == i10 - 1) {
            cVar.a(i7).getClass();
            return false;
        }
        return false;
    }

    public final boolean g(int i7) {
        this.f10431g.a(i7).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i7, long j3, long j10, c cVar, boolean z10) {
        this.f10426a = obj;
        this.f10427b = obj2;
        this.f10428c = i7;
        this.d = j3;
        this.f10429e = j10;
        this.f10431g = cVar;
        this.f10430f = z10;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f10426a;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (217 + hashCode) * 31;
        Object obj2 = this.f10427b;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f10429e;
        return this.f10431g.hashCode() + ((((((((((i10 + i7) * 31) + this.f10428c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f10430f ? 1 : 0)) * 31);
    }
}
