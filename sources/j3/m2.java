package j3;
public final class m2 implements g {
    public static final String f8680n;
    public static final String f8681r;
    public static final String f8682s;
    public static final String v;
    public static final String f8683w;
    public Object f8684a;
    public Object f8685b;
    public int f8686c;
    public long d;
    public long e;
    public boolean f8687f;
    public p4.b h = p4.b.f41065f;

    static {
        int i10 = h5.d0.f6924a;
        f8680n = Integer.toString(0, 36);
        f8681r = Integer.toString(1, 36);
        f8682s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f8683w = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        p4.a a2 = this.h.a(i10);
        if (a2.f41061b != -1) {
            return a2.f41063f[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: j3.m2.b(long):int");
    }

    public final int c(long j10) {
        p4.b bVar = this.h;
        long j11 = this.d;
        int i10 = bVar.f41070a - 1;
        int i11 = i10 - (bVar.b(i10) ? 1 : 0);
        while (i11 >= 0 && j10 != Long.MIN_VALUE) {
            p4.a a2 = bVar.a(i11);
            long j12 = a2.f41060a;
            if (j12 == Long.MIN_VALUE) {
                if (j11 != -9223372036854775807L && ((!a2.f41064n || a2.f41061b != -1) && j10 >= j11)) {
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
            int i12 = a10.f41061b;
            if (i12 != -1) {
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = a10.e[i13];
                    if (i14 != 0 && i14 != 1) {
                    }
                }
            }
            return i11;
        }
        return -1;
    }

    public final long d(int i10) {
        return this.h.a(i10).f41060a;
    }

    public final int e(int i10, int i11) {
        p4.a a2 = this.h.a(i10);
        if (a2.f41061b != -1) {
            return a2.e[i11];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m2.class.equals(obj.getClass())) {
            m2 m2Var = (m2) obj;
            if (h5.d0.a(this.f8684a, m2Var.f8684a) && h5.d0.a(this.f8685b, m2Var.f8685b) && this.f8686c == m2Var.f8686c && this.d == m2Var.d && this.e == m2Var.e && this.f8687f == m2Var.f8687f && h5.d0.a(this.h, m2Var.h)) {
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
        if (i10 == bVar.f41070a - 1 && bVar.b(i10)) {
            return true;
        }
        return false;
    }

    public final boolean h(int i10) {
        return this.h.a(i10).f41064n;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f8684a;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (217 + hashCode) * 31;
        Object obj2 = this.f8685b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        long j10 = this.d;
        long j11 = this.e;
        return this.h.hashCode() + ((((((((((i11 + i10) * 31) + this.f8686c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f8687f ? 1 : 0)) * 31);
    }

    public final void i(Object obj, Object obj2, int i10, long j10, long j11, p4.b bVar, boolean z4) {
        this.f8684a = obj;
        this.f8685b = obj2;
        this.f8686c = i10;
        this.d = j10;
        this.e = j11;
        this.h = bVar;
        this.f8687f = z4;
    }
}
