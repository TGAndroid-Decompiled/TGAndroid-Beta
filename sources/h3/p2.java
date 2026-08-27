package h3;

public final class p2 implements g {

    public static final String f8063n;

    public static final String f8064r;

    public static final String f8065s;
    public static final String v;

    public static final String f8066w;

    public Object f8067a;

    public Object f8068b;

    public int f8069c;
    public long d;

    public long f8070e;

    public boolean f8071f;
    public k4.b h = k4.b.f14448f;

    static {
        int i10 = d5.g0.f4795a;
        f8063n = Integer.toString(0, 36);
        f8064r = Integer.toString(1, 36);
        f8065s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f8066w = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        k4.a aVarA = this.h.a(i10);
        if (aVarA.f14443b != -1) {
            return aVarA.f14446f[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long j10) {
        k4.a aVarA;
        int i10;
        k4.b bVar = this.h;
        long j11 = this.d;
        int i11 = bVar.f14453a;
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i12 = bVar.d;
            while (i12 < i11 && ((bVar.a(i12).f14442a != Long.MIN_VALUE && bVar.a(i12).f14442a <= j10) || ((i10 = (aVarA = bVar.a(i12)).f14443b) != -1 && aVarA.a(-1) >= i10))) {
                i12++;
            }
            if (i12 < i11) {
                return i12;
            }
        }
        return -1;
    }

    public final int c(long j10) {
        k4.b bVar = this.h;
        long j11 = this.d;
        int i10 = bVar.f14453a - 1;
        while (i10 >= 0 && j10 != Long.MIN_VALUE) {
            long j12 = bVar.a(i10).f14442a;
            if (j12 != Long.MIN_VALUE) {
                if (j10 >= j12) {
                    break;
                }
                i10--;
            } else {
                if (j11 != -9223372036854775807L && j10 >= j11) {
                    break;
                }
                i10--;
            }
        }
        if (i10 >= 0) {
            k4.a aVarA = bVar.a(i10);
            int i11 = aVarA.f14443b;
            if (i11 != -1) {
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = aVarA.f14445e[i12];
                    if (i13 != 0 && i13 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final long d(int i10) {
        return this.h.a(i10).f14442a;
    }

    public final int e(int i10, int i11) {
        k4.a aVarA = this.h.a(i10);
        if (aVarA.f14443b != -1) {
            return aVarA.f14445e[i11];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p2.class.equals(obj.getClass())) {
            p2 p2Var = (p2) obj;
            if (d5.g0.a(this.f8067a, p2Var.f8067a) && d5.g0.a(this.f8068b, p2Var.f8068b) && this.f8069c == p2Var.f8069c && this.d == p2Var.d && this.f8070e == p2Var.f8070e && this.f8071f == p2Var.f8071f && d5.g0.a(this.h, p2Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i10) {
        return this.h.a(i10).a(-1);
    }

    public final boolean g(int i10) {
        return this.h.a(i10).f14447n;
    }

    public final void h(Object obj, Object obj2, int i10, long j10, long j11, k4.b bVar, boolean z10) {
        this.f8067a = obj;
        this.f8068b = obj2;
        this.f8069c = i10;
        this.d = j10;
        this.f8070e = j11;
        this.h = bVar;
        this.f8071f = z10;
    }

    public final int hashCode() {
        Object obj = this.f8067a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f8068b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f8069c) * 31;
        long j10 = this.d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f8070e;
        return this.h.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f8071f ? 1 : 0)) * 31);
    }
}
