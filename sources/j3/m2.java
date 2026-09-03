package j3;
public final class m2 implements g {
    public static final String f9279n;
    public static final String f9280r;
    public static final String f9281s;
    public static final String v;
    public static final String f9282w;
    public Object f9283a;
    public Object f9284b;
    public int f9285c;
    public long d;
    public long f9286e;
    public boolean f9287f;
    public p4.b h = p4.b.f44229f;

    static {
        int i10 = h5.d0.f7237a;
        f9279n = Integer.toString(0, 36);
        f9280r = Integer.toString(1, 36);
        f9281s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f9282w = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        p4.a a2 = this.h.a(i10);
        if (a2.f44224b != -1) {
            return a2.f44227f[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: j3.m2.b(long):int");
    }

    public final int c(long j10) {
        p4.b bVar = this.h;
        long j11 = this.d;
        int i10 = bVar.f44234a - 1;
        int i11 = i10 - (bVar.b(i10) ? 1 : 0);
        while (i11 >= 0 && j10 != Long.MIN_VALUE) {
            p4.a a2 = bVar.a(i11);
            long j12 = a2.f44223a;
            if (j12 == Long.MIN_VALUE) {
                if (j11 != -9223372036854775807L && ((!a2.f44228n || a2.f44224b != -1) && j10 >= j11)) {
                    break;
                }
                i11--;
            } else if (j10 >= j12) {
                break;
            } else {
                i11--;
            }
        }
        if (i11 >= 0) {
            p4.a a10 = bVar.a(i11);
            int i12 = a10.f44224b;
            if (i12 != -1) {
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = a10.f44226e[i13];
                    if (i14 != 0 && i14 != 1) {
                    }
                }
            }
            return i11;
        }
        return -1;
    }

    public final long d(int i10) {
        return this.h.a(i10).f44223a;
    }

    public final int e(int i10, int i11) {
        p4.a a2 = this.h.a(i10);
        if (a2.f44224b != -1) {
            return a2.f44226e[i11];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m2.class.equals(obj.getClass())) {
            m2 m2Var = (m2) obj;
            if (h5.d0.a(this.f9283a, m2Var.f9283a) && h5.d0.a(this.f9284b, m2Var.f9284b) && this.f9285c == m2Var.f9285c && this.d == m2Var.d && this.f9286e == m2Var.f9286e && this.f9287f == m2Var.f9287f && h5.d0.a(this.h, m2Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i10) {
        return this.h.a(i10).a(-1);
    }

    public final boolean g(int i10) {
        p4.b bVar = this.h;
        if (i10 == bVar.f44234a - 1 && bVar.b(i10)) {
            return true;
        }
        return false;
    }

    public final boolean h(int i10) {
        return this.h.a(i10).f44228n;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f9283a;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (217 + hashCode) * 31;
        Object obj2 = this.f9284b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        long j10 = this.d;
        long j11 = this.f9286e;
        return this.h.hashCode() + ((((((((((i11 + i10) * 31) + this.f9285c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f9287f ? 1 : 0)) * 31);
    }

    public final void i(Object obj, Object obj2, int i10, long j10, long j11, p4.b bVar, boolean z4) {
        this.f9283a = obj;
        this.f9284b = obj2;
        this.f9285c = i10;
        this.d = j10;
        this.f9286e = j11;
        this.h = bVar;
        this.f9287f = z4;
    }
}
