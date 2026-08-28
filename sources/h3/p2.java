package h3;
public final class p2 implements g {
    public static final String f9633n;
    public static final String f9634r;
    public static final String f9635s;
    public static final String v;
    public static final String f9636w;
    public Object f9637a;
    public Object f9638b;
    public int f9639c;
    public long d;
    public long f9640e;
    public boolean f9641f;
    public k4.b h = k4.b.f14627f;

    static {
        int i9 = d5.f0.f4349a;
        f9633n = Integer.toString(0, 36);
        f9634r = Integer.toString(1, 36);
        f9635s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f9636w = Integer.toString(4, 36);
    }

    public final long a(int i9, int i10) {
        k4.a a2 = this.h.a(i9);
        if (a2.f14622b != -1) {
            return a2.f14625f[i10];
        }
        return -9223372036854775807L;
    }

    public final int b(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: h3.p2.b(long):int");
    }

    public final int c(long j10) {
        k4.b bVar = this.h;
        long j11 = this.d;
        int i9 = bVar.f14632a - 1;
        while (i9 >= 0 && j10 != Long.MIN_VALUE) {
            long j12 = bVar.a(i9).f14621a;
            if (j12 == Long.MIN_VALUE) {
                if (j11 != -9223372036854775807L && j10 >= j11) {
                    break;
                }
                i9--;
            } else if (j10 >= j12) {
                break;
            } else {
                i9--;
            }
        }
        if (i9 >= 0) {
            k4.a a2 = bVar.a(i9);
            int i10 = a2.f14622b;
            if (i10 != -1) {
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = a2.f14624e[i11];
                    if (i12 != 0 && i12 != 1) {
                    }
                }
            }
            return i9;
        }
        return -1;
    }

    public final long d(int i9) {
        return this.h.a(i9).f14621a;
    }

    public final int e(int i9, int i10) {
        k4.a a2 = this.h.a(i9);
        if (a2.f14622b != -1) {
            return a2.f14624e[i10];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p2.class.equals(obj.getClass())) {
            p2 p2Var = (p2) obj;
            if (d5.f0.a(this.f9637a, p2Var.f9637a) && d5.f0.a(this.f9638b, p2Var.f9638b) && this.f9639c == p2Var.f9639c && this.d == p2Var.d && this.f9640e == p2Var.f9640e && this.f9641f == p2Var.f9641f && d5.f0.a(this.h, p2Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i9) {
        return this.h.a(i9).a(-1);
    }

    public final boolean g(int i9) {
        return this.h.a(i9).f14626n;
    }

    public final void h(Object obj, Object obj2, int i9, long j10, long j11, k4.b bVar, boolean z10) {
        this.f9637a = obj;
        this.f9638b = obj2;
        this.f9639c = i9;
        this.d = j10;
        this.f9640e = j11;
        this.h = bVar;
        this.f9641f = z10;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f9637a;
        int i9 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (217 + hashCode) * 31;
        Object obj2 = this.f9638b;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        }
        long j10 = this.d;
        long j11 = this.f9640e;
        return this.h.hashCode() + ((((((((((i10 + i9) * 31) + this.f9639c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f9641f ? 1 : 0)) * 31);
    }
}
