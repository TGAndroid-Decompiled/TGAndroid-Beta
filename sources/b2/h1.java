package b2;

import j$.util.Objects;
public final class h1 {
    public static final String h;
    public static final String f3005i;
    public static final String f3006j;
    public static final String f3007k;
    public static final String f3008l;
    public Object f3009a;
    public Object f3010b;
    public int f3011c;
    public long d;
    public long e;
    public boolean f3012f;
    public b f3013g = b.f2932c;

    static {
        String str = e2.d0.f7885a;
        h = Integer.toString(0, 36);
        f3005i = Integer.toString(1, 36);
        f3006j = Integer.toString(2, 36);
        f3007k = Integer.toString(3, 36);
        f3008l = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        a a2 = this.f3013g.a(i10);
        if (a2.f2913a != -1) {
            return a2.f2916f[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long j3) {
        int i10;
        a a2;
        int i11;
        b bVar = this.f3013g;
        long j10 = this.d;
        int i12 = bVar.f2933a;
        if (j3 != Long.MIN_VALUE && (j10 == -9223372036854775807L || j3 < j10)) {
            int i13 = 0;
            while (i13 < i12) {
                bVar.a(i13).getClass();
                bVar.a(i13).getClass();
                if (0 > j3 && ((i11 = (a2 = bVar.a(i13)).f2913a) == -1 || a2.a(-1) < i11)) {
                    break;
                }
                i13++;
            }
            if (i13 < i12) {
                if (i10 != 0) {
                    bVar.a(i13).getClass();
                    if (0 <= j10) {
                    }
                }
                return i13;
            }
        }
        return -1;
    }

    public final int c(long j3) {
        b bVar = this.f3013g;
        int i10 = bVar.f2933a;
        int i11 = i10 - 1;
        if (i11 == i10 - 1) {
            bVar.a(i11).getClass();
        }
        while (i11 >= 0 && j3 != Long.MIN_VALUE) {
            bVar.a(i11).getClass();
            if (j3 >= 0) {
                break;
            }
            i11--;
        }
        if (i11 >= 0) {
            a a2 = bVar.a(i11);
            int i12 = a2.f2913a;
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
        this.f3013g.a(i10).getClass();
        return 0L;
    }

    public final int e(int i10) {
        return this.f3013g.a(i10).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class.equals(obj.getClass())) {
            h1 h1Var = (h1) obj;
            if (Objects.equals(this.f3009a, h1Var.f3009a) && Objects.equals(this.f3010b, h1Var.f3010b) && this.f3011c == h1Var.f3011c && this.d == h1Var.d && this.e == h1Var.e && this.f3012f == h1Var.f3012f && Objects.equals(this.f3013g, h1Var.f3013g)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i10) {
        b bVar = this.f3013g;
        int i11 = bVar.f2933a;
        if (i10 == i11 - 1 && i10 == i11 - 1) {
            bVar.a(i10).getClass();
            return false;
        }
        return false;
    }

    public final boolean g(int i10) {
        this.f3013g.a(i10).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i10, long j3, long j10, b bVar, boolean z10) {
        this.f3009a = obj;
        this.f3010b = obj2;
        this.f3011c = i10;
        this.d = j3;
        this.e = j10;
        this.f3013g = bVar;
        this.f3012f = z10;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f3009a;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (217 + hashCode) * 31;
        Object obj2 = this.f3010b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        long j3 = this.d;
        long j10 = this.e;
        return this.f3013g.hashCode() + ((((((((((i11 + i10) * 31) + this.f3011c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f3012f ? 1 : 0)) * 31);
    }
}
