package j3;
public final class p2 implements g {
    public static final String f10670n;
    public static final String f10671r;
    public static final String f10672s;
    public static final String v;
    public static final String f10673w;
    public Object f10674a;
    public Object f10675b;
    public int f10676c;
    public long d;
    public long f10677e;
    public boolean f10678f;
    public m4.c h = m4.c.f16848f;

    static {
        int i10 = f5.d0.f6579a;
        f10670n = Integer.toString(0, 36);
        f10671r = Integer.toString(1, 36);
        f10672s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f10673w = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        m4.b a2 = this.h.a(i10);
        if (a2.f16843b != -1) {
            return a2.f16846f[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: j3.p2.b(long):int");
    }

    public final int c(long j10) {
        m4.c cVar = this.h;
        long j11 = this.d;
        int i10 = cVar.f16853a - 1;
        while (i10 >= 0 && j10 != Long.MIN_VALUE) {
            long j12 = cVar.a(i10).f16842a;
            if (j12 == Long.MIN_VALUE) {
                if (j11 != -9223372036854775807L && j10 >= j11) {
                    break;
                }
                i10--;
            } else if (j10 >= j12) {
                break;
            } else {
                i10--;
            }
        }
        if (i10 >= 0) {
            m4.b a2 = cVar.a(i10);
            int i11 = a2.f16843b;
            if (i11 != -1) {
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = a2.f16845e[i12];
                    if (i13 != 0 && i13 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final long d(int i10) {
        return this.h.a(i10).f16842a;
    }

    public final int e(int i10, int i11) {
        m4.b a2 = this.h.a(i10);
        if (a2.f16843b != -1) {
            return a2.f16845e[i11];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p2.class.equals(obj.getClass())) {
            p2 p2Var = (p2) obj;
            if (f5.d0.a(this.f10674a, p2Var.f10674a) && f5.d0.a(this.f10675b, p2Var.f10675b) && this.f10676c == p2Var.f10676c && this.d == p2Var.d && this.f10677e == p2Var.f10677e && this.f10678f == p2Var.f10678f && f5.d0.a(this.h, p2Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i10) {
        return this.h.a(i10).a(-1);
    }

    public final boolean g(int i10) {
        return this.h.a(i10).f16847n;
    }

    public final void h(Object obj, Object obj2, int i10, long j10, long j11, m4.c cVar, boolean z10) {
        this.f10674a = obj;
        this.f10675b = obj2;
        this.f10676c = i10;
        this.d = j10;
        this.f10677e = j11;
        this.h = cVar;
        this.f10678f = z10;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f10674a;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (217 + hashCode) * 31;
        Object obj2 = this.f10675b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        long j10 = this.d;
        long j11 = this.f10677e;
        return this.h.hashCode() + ((((((((((i11 + i10) * 31) + this.f10676c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f10678f ? 1 : 0)) * 31);
    }
}
