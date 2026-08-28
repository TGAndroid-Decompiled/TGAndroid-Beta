package h3;

import android.util.Pair;
public final class k1 {
    public final p2 f9565a = new p2();
    public final q2 f9566b = new q2();
    public final i3.f f9567c;
    public final d5.c0 d;
    public long f9568e;
    public int f9569f;
    public boolean f9570g;
    public i1 h;
    public i1 f9571i;
    public i1 f9572j;
    public int f9573k;
    public Object f9574l;
    public long f9575m;

    public k1(i3.f fVar, d5.c0 c0Var) {
        this.f9567c = fVar;
        this.d = c0Var;
    }

    public static j4.d0 l(r2 r2Var, Object obj, long j10, long j11, q2 q2Var, p2 p2Var) {
        r2Var.g(obj, p2Var);
        r2Var.n(p2Var.f9639c, q2Var);
        int b10 = r2Var.b(obj);
        while (p2Var.d == 0) {
            k4.b bVar = p2Var.h;
            if (bVar.f14632a <= 0 || !p2Var.g(bVar.d) || p2Var.c(0L) != -1) {
                break;
            }
            int i9 = b10 + 1;
            if (b10 >= q2Var.B) {
                break;
            }
            r2Var.f(i9, p2Var, true);
            obj = p2Var.f9638b;
            obj.getClass();
            b10 = i9;
        }
        r2Var.g(obj, p2Var);
        Object obj2 = obj;
        int c10 = p2Var.c(j10);
        if (c10 == -1) {
            return new j4.d0(obj2, j11, p2Var.b(j10));
        }
        return new j4.b0(c10, p2Var.f(c10), -1, j11, obj2);
    }

    public final i1 a() {
        i1 i1Var = this.h;
        if (i1Var == null) {
            return null;
        }
        if (i1Var == this.f9571i) {
            this.f9571i = i1Var.f9500l;
        }
        i1Var.f();
        int i9 = this.f9573k - 1;
        this.f9573k = i9;
        if (i9 == 0) {
            this.f9572j = null;
            i1 i1Var2 = this.h;
            this.f9574l = i1Var2.f9492b;
            this.f9575m = i1Var2.f9495f.f9515a.d;
        }
        this.h = this.h.f9500l;
        j();
        return this.h;
    }

    public final void b() {
        if (this.f9573k == 0) {
            return;
        }
        i1 i1Var = this.h;
        d5.a.j(i1Var);
        this.f9574l = i1Var.f9492b;
        this.f9575m = i1Var.f9495f.f9515a.d;
        while (i1Var != null) {
            i1Var.f();
            i1Var = i1Var.f9500l;
        }
        this.h = null;
        this.f9572j = null;
        this.f9571i = null;
        this.f9573k = 0;
        j();
    }

    public final j1 c(r2 r2Var, i1 i1Var, long j10) {
        long j11;
        r2 r2Var2;
        long j12;
        long j13;
        Object obj;
        long j14;
        long j15;
        long j16;
        boolean z10;
        long j17;
        j1 j1Var = i1Var.f9495f;
        long j18 = i1Var.f9503o;
        long j19 = j1Var.f9518e;
        long j20 = j1Var.f9517c;
        j4.d0 d0Var = j1Var.f9515a;
        long j21 = (j18 + j19) - j10;
        boolean z11 = j1Var.f9520g;
        p2 p2Var = this.f9565a;
        if (z11) {
            long j22 = 0;
            int d = r2Var.d(r2Var.b(d0Var.f13426a), this.f9565a, this.f9566b, this.f9569f, this.f9570g);
            if (d != -1) {
                int i9 = r2Var.f(d, p2Var, true).f9639c;
                Object obj2 = p2Var.f9638b;
                obj2.getClass();
                long j23 = d0Var.d;
                if (r2Var.m(i9, this.f9566b, 0L).A == d) {
                    Pair j24 = r2Var.j(this.f9566b, this.f9565a, i9, -9223372036854775807L, Math.max(0L, j21));
                    if (j24 != null) {
                        Object obj3 = j24.first;
                        long longValue = ((Long) j24.second).longValue();
                        i1 i1Var2 = i1Var.f9500l;
                        if (i1Var2 != null && i1Var2.f9492b.equals(obj3)) {
                            j17 = i1Var2.f9495f.f9515a.d;
                        } else {
                            j17 = this.f9568e;
                            this.f9568e = 1 + j17;
                        }
                        obj = obj3;
                        j14 = longValue;
                        j23 = j17;
                        j22 = -9223372036854775807L;
                    } else {
                        return null;
                    }
                } else {
                    obj = obj2;
                    j14 = 0;
                }
                j4.d0 l10 = l(r2Var, obj, j14, j23, this.f9566b, this.f9565a);
                if (j22 != -9223372036854775807L && j20 != -9223372036854775807L) {
                    if (r2Var.g(d0Var.f13426a, p2Var).h.f14632a > 0 && p2Var.g(p2Var.h.d)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (l10.a() && z10) {
                        j15 = j14;
                        j16 = j20;
                    } else if (z10) {
                        j16 = j22;
                        j15 = j20;
                    }
                    return d(r2Var, l10, j16, j15);
                }
                j15 = j14;
                j16 = j22;
                return d(r2Var, l10, j16, j15);
            }
            return null;
        }
        boolean z12 = true;
        Object obj4 = d0Var.f13426a;
        int i10 = d0Var.f13429e;
        r2Var.g(obj4, p2Var);
        if (d0Var.a()) {
            int i11 = d0Var.f13427b;
            int i12 = p2Var.h.a(i11).f14622b;
            if (i12 != -1) {
                int a2 = p2Var.h.a(i11).a(d0Var.f13428c);
                if (a2 < i12) {
                    return e(r2Var, d0Var.f13426a, i11, a2, j1Var.f9517c, d0Var.d);
                }
                if (j20 == -9223372036854775807L) {
                    r2Var2 = r2Var;
                    Pair j25 = r2Var2.j(this.f9566b, p2Var, p2Var.f9639c, -9223372036854775807L, Math.max(0L, j21));
                    if (j25 == null) {
                        return null;
                    }
                    j12 = ((Long) j25.second).longValue();
                } else {
                    r2Var2 = r2Var;
                    j12 = j20;
                }
                int i13 = d0Var.f13427b;
                r2Var2.g(obj4, p2Var);
                long d9 = p2Var.d(i13);
                if (d9 == Long.MIN_VALUE) {
                    j13 = p2Var.d;
                } else {
                    j13 = d9 + p2Var.h.a(i13).h;
                }
                return f(r2Var2, d0Var.f13426a, Math.max(j13, j12), j1Var.f9517c, d0Var.d);
            }
            return null;
        }
        int f10 = p2Var.f(i10);
        z12 = (p2Var.g(i10) && p2Var.e(i10, f10) == 3) ? false : false;
        if (f10 != p2Var.h.a(i10).f14622b && !z12) {
            return e(r2Var, d0Var.f13426a, d0Var.f13429e, f10, j1Var.f9518e, d0Var.d);
        }
        r2Var.g(obj4, p2Var);
        long d10 = p2Var.d(i10);
        if (d10 == Long.MIN_VALUE) {
            j11 = p2Var.d;
        } else {
            j11 = d10 + p2Var.h.a(i10).h;
        }
        return f(r2Var, d0Var.f13426a, j11, j1Var.f9518e, d0Var.d);
    }

    public final j1 d(r2 r2Var, j4.d0 d0Var, long j10, long j11) {
        r2Var.g(d0Var.f13426a, this.f9565a);
        if (d0Var.a()) {
            return e(r2Var, d0Var.f13426a, d0Var.f13427b, d0Var.f13428c, j10, d0Var.d);
        }
        return f(r2Var, d0Var.f13426a, j11, j10, d0Var.d);
    }

    public final j1 e(r2 r2Var, Object obj, int i9, int i10, long j10, long j11) {
        long j12;
        ?? b0Var = new j4.b0(i9, i10, -1, j11, obj);
        p2 p2Var = this.f9565a;
        long a2 = r2Var.g(obj, p2Var).a(i9, i10);
        if (i10 == p2Var.f(i9)) {
            j12 = p2Var.h.f14633b;
        } else {
            j12 = 0;
        }
        boolean g10 = p2Var.g(i9);
        if (a2 != -9223372036854775807L && j12 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new j1(b0Var, j12, j10, -9223372036854775807L, a2, g10, false, false, false);
    }

    public final h3.j1 f(h3.r2 r26, java.lang.Object r27, long r28, long r30, long r32) {
        throw new UnsupportedOperationException("Method not decompiled: h3.k1.f(h3.r2, java.lang.Object, long, long, long):h3.j1");
    }

    public final j1 g(r2 r2Var, j1 j1Var) {
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        j4.d0 d0Var = j1Var.f9515a;
        boolean a2 = d0Var.a();
        int i9 = d0Var.f13429e;
        if (!a2 && i9 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = d0Var.f13427b;
        boolean i11 = i(r2Var, d0Var);
        boolean h = h(r2Var, d0Var, z10);
        Object obj = d0Var.f13426a;
        p2 p2Var = this.f9565a;
        r2Var.g(obj, p2Var);
        if (!d0Var.a() && i9 != -1) {
            j10 = p2Var.d(i9);
        } else {
            j10 = -9223372036854775807L;
        }
        if (d0Var.a()) {
            j11 = p2Var.a(i10, d0Var.f13428c);
        } else if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            j11 = j10;
        } else {
            j11 = p2Var.d;
        }
        if (d0Var.a()) {
            z11 = p2Var.g(i10);
        } else if (i9 != -1 && p2Var.g(i9)) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new j1(d0Var, j1Var.f9516b, j1Var.f9517c, j10, j11, z11, z10, i11, h);
    }

    public final boolean h(r2 r2Var, j4.d0 d0Var, boolean z10) {
        int b10 = r2Var.b(d0Var.f13426a);
        if (!r2Var.m(r2Var.f(b10, this.f9565a, false).f9639c, this.f9566b, 0L).f9664r) {
            if (r2Var.d(b10, this.f9565a, this.f9566b, this.f9569f, this.f9570g) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(r2 r2Var, j4.d0 d0Var) {
        boolean z10;
        if (!d0Var.a() && d0Var.f13429e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = d0Var.f13426a;
        if (z10) {
            int i9 = r2Var.g(obj, this.f9565a).f9639c;
            if (r2Var.m(i9, this.f9566b, 0L).B == r2Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        j4.d0 d0Var;
        o8.x xVar = o8.z.f19105b;
        o8.w wVar = new o8.w();
        for (i1 i1Var = this.h; i1Var != null; i1Var = i1Var.f9500l) {
            wVar.a(i1Var.f9495f.f9515a);
        }
        i1 i1Var2 = this.f9571i;
        if (i1Var2 == null) {
            d0Var = null;
        } else {
            d0Var = i1Var2.f9495f.f9515a;
        }
        this.d.c(new androidx.car.app.utils.b(this, wVar, d0Var, 29));
    }

    public final boolean k(i1 i1Var) {
        boolean z10;
        boolean z11 = false;
        if (i1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        if (i1Var.equals(this.f9572j)) {
            return false;
        }
        this.f9572j = i1Var;
        while (true) {
            i1Var = i1Var.f9500l;
            if (i1Var == null) {
                break;
            }
            if (i1Var == this.f9571i) {
                this.f9571i = this.h;
                z11 = true;
            }
            i1Var.f();
            this.f9573k--;
        }
        i1 i1Var2 = this.f9572j;
        if (i1Var2.f9500l != null) {
            i1Var2.b();
            i1Var2.f9500l = null;
            i1Var2.c();
        }
        j();
        return z11;
    }

    public final j4.d0 m(r2 r2Var, Object obj, long j10) {
        long j11;
        int b10;
        Object obj2 = obj;
        p2 p2Var = this.f9565a;
        int i9 = r2Var.g(obj2, p2Var).f9639c;
        Object obj3 = this.f9574l;
        if (obj3 != null && (b10 = r2Var.b(obj3)) != -1 && r2Var.f(b10, p2Var, false).f9639c == i9) {
            j11 = this.f9575m;
        } else {
            i1 i1Var = this.h;
            while (true) {
                if (i1Var != null) {
                    if (i1Var.f9492b.equals(obj2)) {
                        j11 = i1Var.f9495f.f9515a.d;
                        break;
                    }
                    i1Var = i1Var.f9500l;
                } else {
                    i1 i1Var2 = this.h;
                    while (true) {
                        if (i1Var2 != null) {
                            int b11 = r2Var.b(i1Var2.f9492b);
                            if (b11 != -1 && r2Var.f(b11, p2Var, false).f9639c == i9) {
                                j11 = i1Var2.f9495f.f9515a.d;
                                break;
                            }
                            i1Var2 = i1Var2.f9500l;
                        } else {
                            j11 = this.f9568e;
                            this.f9568e = 1 + j11;
                            if (this.h == null) {
                                this.f9574l = obj2;
                                this.f9575m = j11;
                            }
                        }
                    }
                }
            }
        }
        r2Var.g(obj2, p2Var);
        int i10 = p2Var.f9639c;
        q2 q2Var = this.f9566b;
        r2Var.n(i10, q2Var);
        boolean z10 = false;
        for (int b12 = r2Var.b(obj); b12 >= q2Var.A; b12--) {
            boolean z11 = true;
            r2Var.f(b12, p2Var, true);
            if (p2Var.h.f14632a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (p2Var.c(p2Var.d) != -1) {
                obj2 = p2Var.f9638b;
                obj2.getClass();
            }
            if (z10 && (!z11 || p2Var.d != 0)) {
                break;
            }
        }
        return l(r2Var, obj2, j10, j11, this.f9566b, this.f9565a);
    }

    public final boolean n(r2 r2Var) {
        r2 r2Var2;
        i1 i1Var;
        i1 i1Var2 = this.h;
        if (i1Var2 == null) {
            return true;
        }
        int b10 = r2Var.b(i1Var2.f9492b);
        while (true) {
            r2Var2 = r2Var;
            b10 = r2Var2.d(b10, this.f9565a, this.f9566b, this.f9569f, this.f9570g);
            while (true) {
                i1Var = i1Var2.f9500l;
                if (i1Var == null || i1Var2.f9495f.f9520g) {
                    break;
                }
                i1Var2 = i1Var;
            }
            if (b10 == -1 || i1Var == null || r2Var2.b(i1Var.f9492b) != b10) {
                break;
            }
            i1Var2 = i1Var;
            r2Var = r2Var2;
        }
        boolean k10 = k(i1Var2);
        i1Var2.f9495f = g(r2Var2, i1Var2.f9495f);
        return !k10;
    }

    public final boolean o(r2 r2Var, long j10) {
        boolean k10;
        j1 j1Var;
        i1 i1Var = null;
        for (i1 i1Var2 = this.h; i1Var2 != null; i1Var2 = i1Var2.f9500l) {
            j1 j1Var2 = i1Var2.f9495f;
            if (i1Var == null) {
                j1Var = g(r2Var, j1Var2);
            } else {
                j1 c10 = c(r2Var, i1Var, j10);
                if (c10 == null) {
                    k10 = k(i1Var);
                } else if (j1Var2.f9516b == c10.f9516b && j1Var2.f9515a.equals(c10.f9515a)) {
                    j1Var = c10;
                } else {
                    k10 = k(i1Var);
                }
                return !k10;
            }
            i1Var2.f9495f = j1Var.a(j1Var2.f9517c);
            i1Var = i1Var2;
        }
        return true;
    }
}
