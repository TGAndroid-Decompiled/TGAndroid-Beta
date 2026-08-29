package j3;

import android.util.Pair;
public final class k1 {
    public final p2 f10602a = new p2();
    public final q2 f10603b = new q2();
    public final k3.f f10604c;
    public final f5.a0 d;
    public long f10605e;
    public int f10606f;
    public boolean f10607g;
    public i1 h;
    public i1 f10608i;
    public i1 f10609j;
    public int f10610k;
    public Object f10611l;
    public long f10612m;

    public k1(k3.f fVar, f5.a0 a0Var) {
        this.f10604c = fVar;
        this.d = a0Var;
    }

    public static l4.c0 l(r2 r2Var, Object obj, long j10, long j11, q2 q2Var, p2 p2Var) {
        r2Var.g(obj, p2Var);
        r2Var.n(p2Var.f10676c, q2Var);
        int b10 = r2Var.b(obj);
        while (p2Var.d == 0) {
            m4.c cVar = p2Var.h;
            if (cVar.f16853a <= 0 || !p2Var.g(cVar.d) || p2Var.c(0L) != -1) {
                break;
            }
            int i10 = b10 + 1;
            if (b10 >= q2Var.B) {
                break;
            }
            r2Var.f(i10, p2Var, true);
            obj = p2Var.f10675b;
            obj.getClass();
            b10 = i10;
        }
        r2Var.g(obj, p2Var);
        Object obj2 = obj;
        int c3 = p2Var.c(j10);
        if (c3 == -1) {
            return new l4.c0(obj2, j11, p2Var.b(j10));
        }
        return new l4.a0(c3, p2Var.f(c3), -1, j11, obj2);
    }

    public final i1 a() {
        i1 i1Var = this.h;
        if (i1Var == null) {
            return null;
        }
        if (i1Var == this.f10608i) {
            this.f10608i = i1Var.f10537l;
        }
        i1Var.f();
        int i10 = this.f10610k - 1;
        this.f10610k = i10;
        if (i10 == 0) {
            this.f10609j = null;
            i1 i1Var2 = this.h;
            this.f10611l = i1Var2.f10529b;
            this.f10612m = i1Var2.f10532f.f10552a.d;
        }
        this.h = this.h.f10537l;
        j();
        return this.h;
    }

    public final void b() {
        if (this.f10610k == 0) {
            return;
        }
        i1 i1Var = this.h;
        f5.a.j(i1Var);
        this.f10611l = i1Var.f10529b;
        this.f10612m = i1Var.f10532f.f10552a.d;
        while (i1Var != null) {
            i1Var.f();
            i1Var = i1Var.f10537l;
        }
        this.h = null;
        this.f10609j = null;
        this.f10608i = null;
        this.f10610k = 0;
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
        j1 j1Var = i1Var.f10532f;
        long j18 = i1Var.f10540o;
        long j19 = j1Var.f10555e;
        long j20 = j1Var.f10554c;
        l4.c0 c0Var = j1Var.f10552a;
        long j21 = (j18 + j19) - j10;
        boolean z11 = j1Var.f10557g;
        p2 p2Var = this.f10602a;
        if (z11) {
            long j22 = 0;
            int d = r2Var.d(r2Var.b(c0Var.f14262a), this.f10602a, this.f10603b, this.f10606f, this.f10607g);
            if (d != -1) {
                int i10 = r2Var.f(d, p2Var, true).f10676c;
                Object obj2 = p2Var.f10675b;
                obj2.getClass();
                long j23 = c0Var.d;
                if (r2Var.m(i10, this.f10603b, 0L).A == d) {
                    Pair j24 = r2Var.j(this.f10603b, this.f10602a, i10, -9223372036854775807L, Math.max(0L, j21));
                    if (j24 != null) {
                        Object obj3 = j24.first;
                        long longValue = ((Long) j24.second).longValue();
                        i1 i1Var2 = i1Var.f10537l;
                        if (i1Var2 != null && i1Var2.f10529b.equals(obj3)) {
                            j17 = i1Var2.f10532f.f10552a.d;
                        } else {
                            j17 = this.f10605e;
                            this.f10605e = 1 + j17;
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
                l4.c0 l10 = l(r2Var, obj, j14, j23, this.f10603b, this.f10602a);
                if (j22 != -9223372036854775807L && j20 != -9223372036854775807L) {
                    if (r2Var.g(c0Var.f14262a, p2Var).h.f16853a > 0 && p2Var.g(p2Var.h.d)) {
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
        Object obj4 = c0Var.f14262a;
        int i11 = c0Var.f14265e;
        r2Var.g(obj4, p2Var);
        if (c0Var.a()) {
            int i12 = c0Var.f14263b;
            int i13 = p2Var.h.a(i12).f16843b;
            if (i13 != -1) {
                int a2 = p2Var.h.a(i12).a(c0Var.f14264c);
                if (a2 < i13) {
                    return e(r2Var, c0Var.f14262a, i12, a2, j1Var.f10554c, c0Var.d);
                }
                if (j20 == -9223372036854775807L) {
                    r2Var2 = r2Var;
                    Pair j25 = r2Var2.j(this.f10603b, p2Var, p2Var.f10676c, -9223372036854775807L, Math.max(0L, j21));
                    if (j25 == null) {
                        return null;
                    }
                    j12 = ((Long) j25.second).longValue();
                } else {
                    r2Var2 = r2Var;
                    j12 = j20;
                }
                int i14 = c0Var.f14263b;
                r2Var2.g(obj4, p2Var);
                long d10 = p2Var.d(i14);
                if (d10 == Long.MIN_VALUE) {
                    j13 = p2Var.d;
                } else {
                    j13 = d10 + p2Var.h.a(i14).h;
                }
                return f(r2Var2, c0Var.f14262a, Math.max(j13, j12), j1Var.f10554c, c0Var.d);
            }
            return null;
        }
        int f9 = p2Var.f(i11);
        z12 = (p2Var.g(i11) && p2Var.e(i11, f9) == 3) ? false : false;
        if (f9 != p2Var.h.a(i11).f16843b && !z12) {
            return e(r2Var, c0Var.f14262a, c0Var.f14265e, f9, j1Var.f10555e, c0Var.d);
        }
        r2Var.g(obj4, p2Var);
        long d11 = p2Var.d(i11);
        if (d11 == Long.MIN_VALUE) {
            j11 = p2Var.d;
        } else {
            j11 = d11 + p2Var.h.a(i11).h;
        }
        return f(r2Var, c0Var.f14262a, j11, j1Var.f10555e, c0Var.d);
    }

    public final j1 d(r2 r2Var, l4.c0 c0Var, long j10, long j11) {
        r2Var.g(c0Var.f14262a, this.f10602a);
        if (c0Var.a()) {
            return e(r2Var, c0Var.f14262a, c0Var.f14263b, c0Var.f14264c, j10, c0Var.d);
        }
        return f(r2Var, c0Var.f14262a, j11, j10, c0Var.d);
    }

    public final j1 e(r2 r2Var, Object obj, int i10, int i11, long j10, long j11) {
        long j12;
        ?? a0Var = new l4.a0(i10, i11, -1, j11, obj);
        p2 p2Var = this.f10602a;
        long a2 = r2Var.g(obj, p2Var).a(i10, i11);
        if (i11 == p2Var.f(i10)) {
            j12 = p2Var.h.f16854b;
        } else {
            j12 = 0;
        }
        boolean g10 = p2Var.g(i10);
        if (a2 != -9223372036854775807L && j12 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new j1(a0Var, j12, j10, -9223372036854775807L, a2, g10, false, false, false);
    }

    public final j3.j1 f(j3.r2 r26, java.lang.Object r27, long r28, long r30, long r32) {
        throw new UnsupportedOperationException("Method not decompiled: j3.k1.f(j3.r2, java.lang.Object, long, long, long):j3.j1");
    }

    public final j1 g(r2 r2Var, j1 j1Var) {
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        l4.c0 c0Var = j1Var.f10552a;
        boolean a2 = c0Var.a();
        int i10 = c0Var.f14265e;
        if (!a2 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = c0Var.f14263b;
        boolean i12 = i(r2Var, c0Var);
        boolean h = h(r2Var, c0Var, z10);
        Object obj = c0Var.f14262a;
        p2 p2Var = this.f10602a;
        r2Var.g(obj, p2Var);
        if (!c0Var.a() && i10 != -1) {
            j10 = p2Var.d(i10);
        } else {
            j10 = -9223372036854775807L;
        }
        if (c0Var.a()) {
            j11 = p2Var.a(i11, c0Var.f14264c);
        } else if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            j11 = j10;
        } else {
            j11 = p2Var.d;
        }
        if (c0Var.a()) {
            z11 = p2Var.g(i11);
        } else if (i10 != -1 && p2Var.g(i10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new j1(c0Var, j1Var.f10553b, j1Var.f10554c, j10, j11, z11, z10, i12, h);
    }

    public final boolean h(r2 r2Var, l4.c0 c0Var, boolean z10) {
        int b10 = r2Var.b(c0Var.f14262a);
        if (!r2Var.m(r2Var.f(b10, this.f10602a, false).f10676c, this.f10603b, 0L).f10701r) {
            if (r2Var.d(b10, this.f10602a, this.f10603b, this.f10606f, this.f10607g) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(r2 r2Var, l4.c0 c0Var) {
        boolean z10;
        if (!c0Var.a() && c0Var.f14265e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = c0Var.f14262a;
        if (z10) {
            int i10 = r2Var.g(obj, this.f10602a).f10676c;
            if (r2Var.m(i10, this.f10603b, 0L).B == r2Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        l4.c0 c0Var;
        q8.x xVar = q8.z.f46511b;
        q8.w wVar = new q8.w();
        for (i1 i1Var = this.h; i1Var != null; i1Var = i1Var.f10537l) {
            wVar.a(i1Var.f10532f.f10552a);
        }
        i1 i1Var2 = this.f10608i;
        if (i1Var2 == null) {
            c0Var = null;
        } else {
            c0Var = i1Var2.f10532f.f10552a;
        }
        this.d.c(new androidx.car.app.utils.b(this, wVar, c0Var, 16));
    }

    public final boolean k(i1 i1Var) {
        boolean z10;
        boolean z11 = false;
        if (i1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        if (i1Var.equals(this.f10609j)) {
            return false;
        }
        this.f10609j = i1Var;
        while (true) {
            i1Var = i1Var.f10537l;
            if (i1Var == null) {
                break;
            }
            if (i1Var == this.f10608i) {
                this.f10608i = this.h;
                z11 = true;
            }
            i1Var.f();
            this.f10610k--;
        }
        i1 i1Var2 = this.f10609j;
        if (i1Var2.f10537l != null) {
            i1Var2.b();
            i1Var2.f10537l = null;
            i1Var2.c();
        }
        j();
        return z11;
    }

    public final l4.c0 m(r2 r2Var, Object obj, long j10) {
        long j11;
        int b10;
        Object obj2 = obj;
        p2 p2Var = this.f10602a;
        int i10 = r2Var.g(obj2, p2Var).f10676c;
        Object obj3 = this.f10611l;
        if (obj3 != null && (b10 = r2Var.b(obj3)) != -1 && r2Var.f(b10, p2Var, false).f10676c == i10) {
            j11 = this.f10612m;
        } else {
            i1 i1Var = this.h;
            while (true) {
                if (i1Var != null) {
                    if (i1Var.f10529b.equals(obj2)) {
                        j11 = i1Var.f10532f.f10552a.d;
                        break;
                    }
                    i1Var = i1Var.f10537l;
                } else {
                    i1 i1Var2 = this.h;
                    while (true) {
                        if (i1Var2 != null) {
                            int b11 = r2Var.b(i1Var2.f10529b);
                            if (b11 != -1 && r2Var.f(b11, p2Var, false).f10676c == i10) {
                                j11 = i1Var2.f10532f.f10552a.d;
                                break;
                            }
                            i1Var2 = i1Var2.f10537l;
                        } else {
                            j11 = this.f10605e;
                            this.f10605e = 1 + j11;
                            if (this.h == null) {
                                this.f10611l = obj2;
                                this.f10612m = j11;
                            }
                        }
                    }
                }
            }
        }
        r2Var.g(obj2, p2Var);
        int i11 = p2Var.f10676c;
        q2 q2Var = this.f10603b;
        r2Var.n(i11, q2Var);
        boolean z10 = false;
        for (int b12 = r2Var.b(obj); b12 >= q2Var.A; b12--) {
            boolean z11 = true;
            r2Var.f(b12, p2Var, true);
            if (p2Var.h.f16853a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (p2Var.c(p2Var.d) != -1) {
                obj2 = p2Var.f10675b;
                obj2.getClass();
            }
            if (z10 && (!z11 || p2Var.d != 0)) {
                break;
            }
        }
        return l(r2Var, obj2, j10, j11, this.f10603b, this.f10602a);
    }

    public final boolean n(r2 r2Var) {
        r2 r2Var2;
        i1 i1Var;
        i1 i1Var2 = this.h;
        if (i1Var2 == null) {
            return true;
        }
        int b10 = r2Var.b(i1Var2.f10529b);
        while (true) {
            r2Var2 = r2Var;
            b10 = r2Var2.d(b10, this.f10602a, this.f10603b, this.f10606f, this.f10607g);
            while (true) {
                i1Var = i1Var2.f10537l;
                if (i1Var == null || i1Var2.f10532f.f10557g) {
                    break;
                }
                i1Var2 = i1Var;
            }
            if (b10 == -1 || i1Var == null || r2Var2.b(i1Var.f10529b) != b10) {
                break;
            }
            i1Var2 = i1Var;
            r2Var = r2Var2;
        }
        boolean k9 = k(i1Var2);
        i1Var2.f10532f = g(r2Var2, i1Var2.f10532f);
        return !k9;
    }

    public final boolean o(r2 r2Var, long j10) {
        boolean k9;
        j1 j1Var;
        i1 i1Var = null;
        for (i1 i1Var2 = this.h; i1Var2 != null; i1Var2 = i1Var2.f10537l) {
            j1 j1Var2 = i1Var2.f10532f;
            if (i1Var == null) {
                j1Var = g(r2Var, j1Var2);
            } else {
                j1 c3 = c(r2Var, i1Var, j10);
                if (c3 == null) {
                    k9 = k(i1Var);
                } else if (j1Var2.f10553b == c3.f10553b && j1Var2.f10552a.equals(c3.f10552a)) {
                    j1Var = c3;
                } else {
                    k9 = k(i1Var);
                }
                return !k9;
            }
            i1Var2.f10532f = j1Var.a(j1Var2.f10554c);
            i1Var = i1Var2;
        }
        return true;
    }
}
