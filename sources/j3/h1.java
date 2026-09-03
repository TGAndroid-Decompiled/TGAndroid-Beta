package j3;

import android.util.Pair;
public final class h1 {
    public final m2 f9169a = new m2();
    public final n2 f9170b = new n2();
    public final k3.f f9171c;
    public final h5.a0 d;
    public long f9172e;
    public int f9173f;
    public boolean f9174g;
    public f1 h;
    public f1 f9175i;
    public f1 f9176j;
    public int f9177k;
    public Object f9178l;
    public long f9179m;

    public h1(k3.f fVar, h5.a0 a0Var) {
        this.f9171c = fVar;
        this.d = a0Var;
    }

    public static o4.v m(o2 o2Var, Object obj, long j10, long j11, n2 n2Var, m2 m2Var) {
        int i10;
        o2Var.g(obj, m2Var);
        o2Var.n(m2Var.f9285c, n2Var);
        int b10 = o2Var.b(obj);
        Object obj2 = obj;
        while (true) {
            int i11 = m2Var.h.f44234a;
            if (i11 == 0) {
                break;
            }
            if ((i11 == 1 && m2Var.g(0)) || !m2Var.h(m2Var.h.d)) {
                break;
            }
            long j12 = 0;
            if (m2Var.c(0L) != -1) {
                break;
            }
            if (m2Var.d != 0) {
                if (m2Var.g(i11 - 1)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                int i12 = i11 - i10;
                for (int i13 = 0; i13 <= i12; i13++) {
                    j12 += m2Var.h.a(i13).h;
                }
                if (m2Var.d > j12) {
                    break;
                }
            }
            if (b10 > n2Var.C) {
                break;
            }
            o2Var.f(b10, m2Var, true);
            obj2 = m2Var.f9284b;
            obj2.getClass();
            b10++;
        }
        o2Var.g(obj2, m2Var);
        int c3 = m2Var.c(j10);
        if (c3 == -1) {
            return new o4.v(obj2, j11, m2Var.b(j10));
        }
        return new o4.u(c3, m2Var.f(c3), -1, j11, obj2);
    }

    public final f1 a() {
        f1 f1Var = this.h;
        if (f1Var == null) {
            return null;
        }
        if (f1Var == this.f9175i) {
            this.f9175i = f1Var.f9146l;
        }
        f1Var.f();
        int i10 = this.f9177k - 1;
        this.f9177k = i10;
        if (i10 == 0) {
            this.f9176j = null;
            f1 f1Var2 = this.h;
            this.f9178l = f1Var2.f9138b;
            this.f9179m = f1Var2.f9141f.f9153a.d;
        }
        this.h = this.h.f9146l;
        k();
        return this.h;
    }

    public final void b() {
        if (this.f9177k == 0) {
            return;
        }
        f1 f1Var = this.h;
        h5.a.j(f1Var);
        this.f9178l = f1Var.f9138b;
        this.f9179m = f1Var.f9141f.f9153a.d;
        while (f1Var != null) {
            f1Var.f();
            f1Var = f1Var.f9146l;
        }
        this.h = null;
        this.f9176j = null;
        this.f9175i = null;
        this.f9177k = 0;
        k();
    }

    public final g1 c(o2 o2Var, f1 f1Var, long j10) {
        Object obj;
        long j11;
        long j12;
        long j13;
        boolean z4;
        g1 g1Var = f1Var.f9141f;
        o4.v vVar = g1Var.f9153a;
        long j14 = g1Var.f9155c;
        int d = o2Var.d(o2Var.b(vVar.f16581a), this.f9169a, this.f9170b, this.f9173f, this.f9174g);
        if (d != -1) {
            m2 m2Var = this.f9169a;
            int i10 = o2Var.f(d, m2Var, true).f9285c;
            Object obj2 = m2Var.f9284b;
            obj2.getClass();
            long j15 = vVar.d;
            long j16 = 0;
            if (o2Var.m(i10, this.f9170b, 0L).B == d) {
                Pair j17 = o2Var.j(this.f9170b, this.f9169a, i10, -9223372036854775807L, Math.max(0L, j10));
                if (j17 == null) {
                    return null;
                }
                Object obj3 = j17.first;
                long longValue = ((Long) j17.second).longValue();
                f1 f1Var2 = f1Var.f9146l;
                if (f1Var2 != null && f1Var2.f9138b.equals(obj3)) {
                    j15 = f1Var2.f9141f.f9153a.d;
                } else {
                    j15 = this.f9172e;
                    this.f9172e = 1 + j15;
                }
                obj = obj3;
                j11 = longValue;
                j16 = -9223372036854775807L;
            } else {
                obj = obj2;
                j11 = 0;
            }
            o4.v m9 = m(o2Var, obj, j11, j15, this.f9170b, this.f9169a);
            if (j16 != -9223372036854775807L && j14 != -9223372036854775807L) {
                int i11 = o2Var.g(vVar.f16581a, m2Var).h.f44234a;
                int i12 = m2Var.h.d;
                if (i11 > 0 && m2Var.h(i12) && (i11 > 1 || m2Var.d(i12) != Long.MIN_VALUE)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (m9.a() && z4) {
                    j12 = j11;
                    j13 = j14;
                    return e(o2Var, m9, j13, j12);
                } else if (z4) {
                    j12 = j14;
                    j13 = j16;
                    return e(o2Var, m9, j13, j12);
                }
            }
            j12 = j11;
            j13 = j16;
            return e(o2Var, m9, j13, j12);
        }
        return null;
    }

    public final g1 d(o2 o2Var, f1 f1Var, long j10) {
        boolean z4;
        long j11;
        m2 m2Var;
        o2 o2Var2;
        long j12;
        g1 g1Var = f1Var.f9141f;
        long j13 = (f1Var.f9149o + g1Var.f9156e) - j10;
        if (g1Var.f9158g) {
            return c(o2Var, f1Var, j13);
        }
        o4.v vVar = g1Var.f9153a;
        Object obj = vVar.f16581a;
        int i10 = vVar.f16584e;
        m2 m2Var2 = this.f9169a;
        o2Var.g(obj, m2Var2);
        if (vVar.a()) {
            int i11 = vVar.f16582b;
            int i12 = m2Var2.h.a(i11).f44224b;
            if (i12 != -1) {
                int a2 = m2Var2.h.a(i11).a(vVar.f16583c);
                if (a2 < i12) {
                    return f(o2Var, vVar.f16581a, i11, a2, g1Var.f9155c, vVar.d);
                }
                long j14 = g1Var.f9155c;
                if (j14 == -9223372036854775807L) {
                    Pair j15 = o2Var.j(this.f9170b, m2Var2, m2Var2.f9285c, -9223372036854775807L, Math.max(0L, j13));
                    m2Var = m2Var2;
                    o2Var2 = o2Var;
                    if (j15 == null) {
                        return null;
                    }
                    j14 = ((Long) j15.second).longValue();
                } else {
                    m2Var = m2Var2;
                    o2Var2 = o2Var;
                }
                int i13 = vVar.f16582b;
                o2Var2.g(obj, m2Var);
                long d = m2Var.d(i13);
                if (d == Long.MIN_VALUE) {
                    j12 = m2Var.d;
                } else {
                    j12 = m2Var.h.a(i13).h + d;
                }
                return g(o2Var, vVar.f16581a, Math.max(j12, j14), g1Var.f9155c, vVar.d);
            }
            return null;
        } else if (i10 != -1 && m2Var2.g(i10)) {
            return c(o2Var, f1Var, j13);
        } else {
            int f10 = m2Var2.f(i10);
            if (m2Var2.h(i10) && m2Var2.e(i10, f10) == 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (f10 != m2Var2.h.a(i10).f44224b && !z4) {
                return f(o2Var, vVar.f16581a, vVar.f16584e, f10, g1Var.f9156e, vVar.d);
            }
            o2Var.g(obj, m2Var2);
            long d10 = m2Var2.d(i10);
            if (d10 == Long.MIN_VALUE) {
                j11 = m2Var2.d;
            } else {
                j11 = m2Var2.h.a(i10).h + d10;
            }
            return g(o2Var, vVar.f16581a, j11, g1Var.f9156e, vVar.d);
        }
    }

    public final g1 e(o2 o2Var, o4.v vVar, long j10, long j11) {
        o2Var.g(vVar.f16581a, this.f9169a);
        if (vVar.a()) {
            return f(o2Var, vVar.f16581a, vVar.f16582b, vVar.f16583c, j10, vVar.d);
        }
        return g(o2Var, vVar.f16581a, j11, j10, vVar.d);
    }

    public final g1 f(o2 o2Var, Object obj, int i10, int i11, long j10, long j11) {
        long j12;
        ?? uVar = new o4.u(i10, i11, -1, j11, obj);
        m2 m2Var = this.f9169a;
        long a2 = o2Var.g(obj, m2Var).a(i10, i11);
        if (i11 == m2Var.f(i10)) {
            j12 = m2Var.h.f44235b;
        } else {
            j12 = 0;
        }
        boolean h = m2Var.h(i10);
        if (a2 != -9223372036854775807L && j12 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new g1(uVar, j12, j10, -9223372036854775807L, a2, h, false, false, false);
    }

    public final j3.g1 g(j3.o2 r27, java.lang.Object r28, long r29, long r31, long r33) {
        throw new UnsupportedOperationException("Method not decompiled: j3.h1.g(j3.o2, java.lang.Object, long, long, long):j3.g1");
    }

    public final g1 h(o2 o2Var, g1 g1Var) {
        boolean z4;
        long j10;
        long j11;
        boolean z10;
        o4.v vVar = g1Var.f9153a;
        boolean a2 = vVar.a();
        int i10 = vVar.f16584e;
        if (!a2 && i10 == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i11 = vVar.f16582b;
        boolean j12 = j(o2Var, vVar);
        boolean i12 = i(o2Var, vVar, z4);
        Object obj = vVar.f16581a;
        m2 m2Var = this.f9169a;
        o2Var.g(obj, m2Var);
        if (!vVar.a() && i10 != -1) {
            j10 = m2Var.d(i10);
        } else {
            j10 = -9223372036854775807L;
        }
        if (vVar.a()) {
            j11 = m2Var.a(i11, vVar.f16583c);
        } else if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            j11 = j10;
        } else {
            j11 = m2Var.d;
        }
        if (vVar.a()) {
            z10 = m2Var.h(i11);
        } else if (i10 != -1 && m2Var.h(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new g1(vVar, g1Var.f9154b, g1Var.f9155c, j10, j11, z10, z4, j12, i12);
    }

    public final boolean i(o2 o2Var, o4.v vVar, boolean z4) {
        int b10 = o2Var.b(vVar.f16581a);
        if (!o2Var.m(o2Var.f(b10, this.f9169a, false).f9285c, this.f9170b, 0L).f9340r) {
            if (o2Var.d(b10, this.f9169a, this.f9170b, this.f9173f, this.f9174g) == -1 && z4) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(o2 o2Var, o4.v vVar) {
        boolean z4;
        if (!vVar.a() && vVar.f16584e == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        Object obj = vVar.f16581a;
        if (z4) {
            int i10 = o2Var.g(obj, this.f9169a).f9285c;
            if (o2Var.m(i10, this.f9170b, 0L).C == o2Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        o4.v vVar;
        s8.t tVar = s8.v.f47174b;
        com.google.android.gms.common.api.internal.w wVar = new com.google.android.gms.common.api.internal.w();
        for (f1 f1Var = this.h; f1Var != null; f1Var = f1Var.f9146l) {
            wVar.b(f1Var.f9141f.f9153a);
        }
        f1 f1Var2 = this.f9175i;
        if (f1Var2 == null) {
            vVar = null;
        } else {
            vVar = f1Var2.f9141f.f9153a;
        }
        this.d.c(new androidx.car.app.utils.b(this, wVar, vVar, 11));
    }

    public final boolean l(f1 f1Var) {
        boolean z4;
        boolean z10 = false;
        if (f1Var != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        if (f1Var.equals(this.f9176j)) {
            return false;
        }
        this.f9176j = f1Var;
        while (true) {
            f1Var = f1Var.f9146l;
            if (f1Var == null) {
                break;
            }
            if (f1Var == this.f9175i) {
                this.f9175i = this.h;
                z10 = true;
            }
            f1Var.f();
            this.f9177k--;
        }
        f1 f1Var2 = this.f9176j;
        if (f1Var2.f9146l != null) {
            f1Var2.b();
            f1Var2.f9146l = null;
            f1Var2.c();
        }
        k();
        return z10;
    }

    public final o4.v n(o2 o2Var, Object obj, long j10) {
        long j11;
        int b10;
        Object obj2 = obj;
        m2 m2Var = this.f9169a;
        int i10 = o2Var.g(obj2, m2Var).f9285c;
        Object obj3 = this.f9178l;
        if (obj3 != null && (b10 = o2Var.b(obj3)) != -1 && o2Var.f(b10, m2Var, false).f9285c == i10) {
            j11 = this.f9179m;
        } else {
            f1 f1Var = this.h;
            while (true) {
                if (f1Var != null) {
                    if (f1Var.f9138b.equals(obj2)) {
                        j11 = f1Var.f9141f.f9153a.d;
                        break;
                    }
                    f1Var = f1Var.f9146l;
                } else {
                    f1 f1Var2 = this.h;
                    while (true) {
                        if (f1Var2 != null) {
                            int b11 = o2Var.b(f1Var2.f9138b);
                            if (b11 != -1 && o2Var.f(b11, m2Var, false).f9285c == i10) {
                                j11 = f1Var2.f9141f.f9153a.d;
                                break;
                            }
                            f1Var2 = f1Var2.f9146l;
                        } else {
                            j11 = this.f9172e;
                            this.f9172e = 1 + j11;
                            if (this.h == null) {
                                this.f9178l = obj2;
                                this.f9179m = j11;
                            }
                        }
                    }
                }
            }
        }
        o2Var.g(obj2, m2Var);
        int i11 = m2Var.f9285c;
        n2 n2Var = this.f9170b;
        o2Var.n(i11, n2Var);
        boolean z4 = false;
        for (int b12 = o2Var.b(obj); b12 >= n2Var.B; b12--) {
            boolean z10 = true;
            o2Var.f(b12, m2Var, true);
            if (m2Var.h.f44234a <= 0) {
                z10 = false;
            }
            z4 |= z10;
            if (m2Var.c(m2Var.d) != -1) {
                obj2 = m2Var.f9284b;
                obj2.getClass();
            }
            if (z4 && (!z10 || m2Var.d != 0)) {
                break;
            }
        }
        return m(o2Var, obj2, j10, j11, this.f9170b, this.f9169a);
    }

    public final boolean o(o2 o2Var) {
        o2 o2Var2;
        f1 f1Var;
        f1 f1Var2 = this.h;
        if (f1Var2 == null) {
            return true;
        }
        int b10 = o2Var.b(f1Var2.f9138b);
        while (true) {
            o2Var2 = o2Var;
            b10 = o2Var2.d(b10, this.f9169a, this.f9170b, this.f9173f, this.f9174g);
            while (true) {
                f1Var = f1Var2.f9146l;
                if (f1Var == null || f1Var2.f9141f.f9158g) {
                    break;
                }
                f1Var2 = f1Var;
            }
            if (b10 == -1 || f1Var == null || o2Var2.b(f1Var.f9138b) != b10) {
                break;
            }
            f1Var2 = f1Var;
            o2Var = o2Var2;
        }
        boolean l10 = l(f1Var2);
        f1Var2.f9141f = h(o2Var2, f1Var2.f9141f);
        return !l10;
    }

    public final boolean p(o2 o2Var, long j10) {
        boolean l10;
        g1 g1Var;
        f1 f1Var = null;
        for (f1 f1Var2 = this.h; f1Var2 != null; f1Var2 = f1Var2.f9146l) {
            g1 g1Var2 = f1Var2.f9141f;
            if (f1Var == null) {
                g1Var = h(o2Var, g1Var2);
            } else {
                g1 d = d(o2Var, f1Var, j10);
                if (d == null) {
                    l10 = l(f1Var);
                } else if (g1Var2.f9154b == d.f9154b && g1Var2.f9153a.equals(d.f9153a)) {
                    g1Var = d;
                } else {
                    l10 = l(f1Var);
                }
                return !l10;
            }
            f1Var2.f9141f = g1Var.a(g1Var2.f9155c);
            f1Var = f1Var2;
        }
        return true;
    }
}
