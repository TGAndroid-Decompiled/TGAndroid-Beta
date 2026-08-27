package h3;

import android.util.Pair;

public final class k1 {

    public final p2 f7995a = new p2();

    public final r2 f7996b = new r2();

    public final i3.f f7997c;
    public final d5.d0 d;

    public long f7998e;

    public int f7999f;

    public boolean f8000g;
    public i1 h;

    public i1 f8001i;

    public i1 f8002j;

    public int f8003k;

    public Object f8004l;

    public long f8005m;

    public k1(i3.f fVar, d5.d0 d0Var) {
        this.f7997c = fVar;
        this.d = d0Var;
    }

    public static j4.c0 l(s2 s2Var, Object obj, long j10, long j11, r2 r2Var, p2 p2Var) {
        s2Var.g(obj, p2Var);
        s2Var.n(p2Var.f8069c, r2Var);
        int iB = s2Var.b(obj);
        while (p2Var.d == 0) {
            k4.b bVar = p2Var.h;
            if (bVar.f14453a <= 0 || !p2Var.g(bVar.d) || p2Var.c(0L) != -1) {
                break;
            }
            int i10 = iB + 1;
            if (iB >= r2Var.B) {
                break;
            }
            s2Var.f(i10, p2Var, true);
            obj = p2Var.f8068b;
            obj.getClass();
            iB = i10;
        }
        s2Var.g(obj, p2Var);
        Object obj2 = obj;
        int iC = p2Var.c(j10);
        return iC == -1 ? new j4.c0(obj2, j11, p2Var.b(j10)) : new j4.c0(iC, p2Var.f(iC), -1, j11, obj2);
    }

    public final i1 a() {
        i1 i1Var = this.h;
        if (i1Var == null) {
            return null;
        }
        if (i1Var == this.f8001i) {
            this.f8001i = i1Var.f7930l;
        }
        i1Var.f();
        int i10 = this.f8003k - 1;
        this.f8003k = i10;
        if (i10 == 0) {
            this.f8002j = null;
            i1 i1Var2 = this.h;
            this.f8004l = i1Var2.f7922b;
            this.f8005m = i1Var2.f7925f.f7945a.d;
        }
        this.h = this.h.f7930l;
        j();
        return this.h;
    }

    public final void b() {
        if (this.f8003k == 0) {
            return;
        }
        i1 i1Var = this.h;
        d5.a.j(i1Var);
        this.f8004l = i1Var.f7922b;
        this.f8005m = i1Var.f7925f.f7945a.d;
        while (i1Var != null) {
            i1Var.f();
            i1Var = i1Var.f7930l;
        }
        this.h = null;
        this.f8002j = null;
        this.f8001i = null;
        this.f8003k = 0;
        j();
    }

    public final j1 c(s2 s2Var, i1 i1Var, long j10) {
        s2 s2Var2;
        long jLongValue;
        Object obj;
        long j11;
        long j12;
        long j13;
        long j14;
        j1 j1Var = i1Var.f7925f;
        long j15 = i1Var.f7933o;
        long j16 = j1Var.f7948e;
        long j17 = j1Var.f7947c;
        j4.c0 c0Var = j1Var.f7945a;
        long j18 = (j15 + j16) - j10;
        boolean z10 = j1Var.f7950g;
        p2 p2Var = this.f7995a;
        if (!z10) {
            Object obj2 = c0Var.f12503a;
            int i10 = c0Var.f12506e;
            s2Var.g(obj2, p2Var);
            if (!c0Var.a()) {
                int iF = p2Var.f(i10);
                boolean z11 = p2Var.g(i10) && p2Var.e(i10, iF) == 3;
                if (iF != p2Var.h.a(i10).f14443b && !z11) {
                    return e(s2Var, c0Var.f12503a, c0Var.f12506e, iF, j1Var.f7948e, c0Var.d);
                }
                s2Var.g(obj2, p2Var);
                long jD = p2Var.d(i10);
                return f(s2Var, c0Var.f12503a, jD == Long.MIN_VALUE ? p2Var.d : jD + p2Var.h.a(i10).h, j1Var.f7948e, c0Var.d);
            }
            int i11 = c0Var.f12504b;
            int i12 = p2Var.h.a(i11).f14443b;
            if (i12 == -1) {
                return null;
            }
            int iA = p2Var.h.a(i11).a(c0Var.f12505c);
            if (iA < i12) {
                return e(s2Var, c0Var.f12503a, i11, iA, j1Var.f7947c, c0Var.d);
            }
            if (j17 == -9223372036854775807L) {
                s2Var2 = s2Var;
                Pair pairJ = s2Var2.j(this.f7996b, p2Var, p2Var.f8069c, -9223372036854775807L, Math.max(0L, j18));
                if (pairJ == null) {
                    return null;
                }
                jLongValue = ((Long) pairJ.second).longValue();
            } else {
                s2Var2 = s2Var;
                jLongValue = j17;
            }
            int i13 = c0Var.f12504b;
            s2Var2.g(obj2, p2Var);
            long jD2 = p2Var.d(i13);
            return f(s2Var2, c0Var.f12503a, Math.max(jD2 == Long.MIN_VALUE ? p2Var.d : jD2 + p2Var.h.a(i13).h, jLongValue), j1Var.f7947c, c0Var.d);
        }
        long j19 = 0;
        int iD = s2Var.d(s2Var.b(c0Var.f12503a), this.f7995a, this.f7996b, this.f7999f, this.f8000g);
        if (iD == -1) {
            return null;
        }
        int i14 = s2Var.f(iD, p2Var, true).f8069c;
        Object obj3 = p2Var.f8068b;
        obj3.getClass();
        long j20 = c0Var.d;
        if (s2Var.m(i14, this.f7996b, 0L).A == iD) {
            Pair pairJ2 = s2Var.j(this.f7996b, this.f7995a, i14, -9223372036854775807L, Math.max(0L, j18));
            if (pairJ2 == null) {
                return null;
            }
            Object obj4 = pairJ2.first;
            long jLongValue2 = ((Long) pairJ2.second).longValue();
            i1 i1Var2 = i1Var.f7930l;
            if (i1Var2 == null || !i1Var2.f7922b.equals(obj4)) {
                j14 = this.f7998e;
                this.f7998e = 1 + j14;
            } else {
                j14 = i1Var2.f7925f.f7945a.d;
            }
            obj = obj4;
            j11 = jLongValue2;
            j20 = j14;
            j19 = -9223372036854775807L;
        } else {
            obj = obj3;
            j11 = 0;
        }
        j4.c0 c0VarL = l(s2Var, obj, j11, j20, this.f7996b, this.f7995a);
        if (j19 == -9223372036854775807L || j17 == -9223372036854775807L) {
            j12 = j11;
            j13 = j19;
        } else {
            boolean z12 = s2Var.g(c0Var.f12503a, p2Var).h.f14453a > 0 && p2Var.g(p2Var.h.d);
            if (c0VarL.a() && z12) {
                j12 = j11;
                j13 = j17;
            } else if (z12) {
                j13 = j19;
                j12 = j17;
            } else {
                j12 = j11;
                j13 = j19;
            }
        }
        return d(s2Var, c0VarL, j13, j12);
    }

    public final j1 d(s2 s2Var, j4.c0 c0Var, long j10, long j11) {
        s2Var.g(c0Var.f12503a, this.f7995a);
        return c0Var.a() ? e(s2Var, c0Var.f12503a, c0Var.f12504b, c0Var.f12505c, j10, c0Var.d) : f(s2Var, c0Var.f12503a, j11, j10, c0Var.d);
    }

    public final j1 e(s2 s2Var, Object obj, int i10, int i11, long j10, long j11) {
        j4.c0 c0Var = new j4.c0(i10, i11, -1, j11, obj);
        p2 p2Var = this.f7995a;
        long jA = s2Var.g(obj, p2Var).a(i10, i11);
        long jMax = i11 == p2Var.f(i10) ? p2Var.h.f14454b : 0L;
        boolean zG = p2Var.g(i10);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new j1(c0Var, jMax, j10, -9223372036854775807L, jA, zG, false, false, false);
    }

    public final j1 f(s2 s2Var, Object obj, long j10, long j11, long j12) {
        k4.a aVarA;
        int i10;
        boolean z10;
        long jD;
        long jMax = j10;
        p2 p2Var = this.f7995a;
        s2Var.g(obj, p2Var);
        int iB = p2Var.b(jMax);
        if (iB == -1) {
            k4.b bVar = p2Var.h;
            z10 = bVar.f14453a > 0 && p2Var.g(bVar.d);
        } else {
            if (p2Var.g(iB) && p2Var.d(iB) == p2Var.d && (i10 = (aVarA = p2Var.h.a(iB)).f14443b) != -1) {
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        iB = -1;
                    } else {
                        int i12 = aVarA.f14445e[i11];
                        if (i12 != 0 && i12 != 1) {
                            i11++;
                        }
                    }
                }
            }
        }
        j4.c0 c0Var = new j4.c0(obj, j12, iB);
        boolean z11 = !c0Var.a() && iB == -1;
        boolean zI = i(s2Var, c0Var);
        boolean zH = h(s2Var, c0Var, z11);
        boolean z12 = iB != -1 && p2Var.g(iB);
        if (iB != -1) {
            jD = p2Var.d(iB);
        } else {
            jD = z10 ? p2Var.d : -9223372036854775807L;
        }
        long j13 = (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? p2Var.d : jD;
        if (j13 != -9223372036854775807L && jMax >= j13) {
            jMax = Math.max(0L, j13 - ((long) ((zH || !z10) ? 1 : 0)));
        }
        return new j1(c0Var, jMax, j11, jD, j13, z12, z11, zI, zH);
    }

    public final j1 g(s2 s2Var, j1 j1Var) {
        long jA;
        boolean zG;
        j4.c0 c0Var = j1Var.f7945a;
        boolean zA = c0Var.a();
        int i10 = c0Var.f12506e;
        boolean z10 = !zA && i10 == -1;
        int i11 = c0Var.f12504b;
        boolean zI = i(s2Var, c0Var);
        boolean zH = h(s2Var, c0Var, z10);
        Object obj = c0Var.f12503a;
        p2 p2Var = this.f7995a;
        s2Var.g(obj, p2Var);
        long jD = (c0Var.a() || i10 == -1) ? -9223372036854775807L : p2Var.d(i10);
        if (c0Var.a()) {
            jA = p2Var.a(i11, c0Var.f12505c);
        } else {
            jA = (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? p2Var.d : jD;
        }
        if (c0Var.a()) {
            zG = p2Var.g(i11);
        } else {
            zG = i10 != -1 && p2Var.g(i10);
        }
        return new j1(c0Var, j1Var.f7946b, j1Var.f7947c, jD, jA, zG, z10, zI, zH);
    }

    public final boolean h(s2 s2Var, j4.c0 c0Var, boolean z10) {
        int iB = s2Var.b(c0Var.f12503a);
        if (!s2Var.m(s2Var.f(iB, this.f7995a, false).f8069c, this.f7996b, 0L).f8118r) {
            if (s2Var.d(iB, this.f7995a, this.f7996b, this.f7999f, this.f8000g) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(s2 s2Var, j4.c0 c0Var) {
        boolean z10 = !c0Var.a() && c0Var.f12506e == -1;
        Object obj = c0Var.f12503a;
        if (z10) {
            if (s2Var.m(s2Var.g(obj, this.f7995a).f8069c, this.f7996b, 0L).B == s2Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        p8.x xVar = p8.z.f45604b;
        p8.w wVar = new p8.w();
        for (i1 i1Var = this.h; i1Var != null; i1Var = i1Var.f7930l) {
            wVar.a(i1Var.f7925f.f7945a);
        }
        i1 i1Var2 = this.f8001i;
        this.d.c(new androidx.car.app.utils.a(this, wVar, i1Var2 == null ? null : i1Var2.f7925f.f7945a, 16));
    }

    public final boolean k(i1 i1Var) {
        boolean z10 = false;
        d5.a.i(i1Var != null);
        if (i1Var.equals(this.f8002j)) {
            return false;
        }
        this.f8002j = i1Var;
        while (true) {
            i1Var = i1Var.f7930l;
            if (i1Var == null) {
                break;
            }
            if (i1Var == this.f8001i) {
                this.f8001i = this.h;
                z10 = true;
            }
            i1Var.f();
            this.f8003k--;
        }
        i1 i1Var2 = this.f8002j;
        if (i1Var2.f7930l != null) {
            i1Var2.b();
            i1Var2.f7930l = null;
            i1Var2.c();
        }
        j();
        return z10;
    }

    public final j4.c0 m(s2 s2Var, Object obj, long j10) {
        long j11;
        int iB;
        Object obj2 = obj;
        p2 p2Var = this.f7995a;
        int i10 = s2Var.g(obj2, p2Var).f8069c;
        Object obj3 = this.f8004l;
        if (obj3 == null || (iB = s2Var.b(obj3)) == -1 || s2Var.f(iB, p2Var, false).f8069c != i10) {
            i1 i1Var = this.h;
            while (true) {
                if (i1Var == null) {
                    i1 i1Var2 = this.h;
                    while (true) {
                        if (i1Var2 == null) {
                            j11 = this.f7998e;
                            this.f7998e = 1 + j11;
                            if (this.h != null) {
                                break;
                            }
                            this.f8004l = obj2;
                            this.f8005m = j11;
                            break;
                        }
                        int iB2 = s2Var.b(i1Var2.f7922b);
                        if (iB2 != -1 && s2Var.f(iB2, p2Var, false).f8069c == i10) {
                            j11 = i1Var2.f7925f.f7945a.d;
                            break;
                        }
                        i1Var2 = i1Var2.f7930l;
                    }
                } else {
                    if (i1Var.f7922b.equals(obj2)) {
                        j11 = i1Var.f7925f.f7945a.d;
                        break;
                    }
                    i1Var = i1Var.f7930l;
                }
            }
        } else {
            j11 = this.f8005m;
        }
        s2Var.g(obj2, p2Var);
        int i11 = p2Var.f8069c;
        r2 r2Var = this.f7996b;
        s2Var.n(i11, r2Var);
        boolean z10 = false;
        for (int iB3 = s2Var.b(obj); iB3 >= r2Var.A; iB3--) {
            s2Var.f(iB3, p2Var, true);
            boolean z11 = p2Var.h.f14453a > 0;
            z10 |= z11;
            if (p2Var.c(p2Var.d) != -1) {
                obj2 = p2Var.f8068b;
                obj2.getClass();
            }
            if (z10 && (!z11 || p2Var.d != 0)) {
                break;
            }
        }
        return l(s2Var, obj2, j10, j11, this.f7996b, this.f7995a);
    }

    public final boolean n(s2 s2Var) {
        s2 s2Var2;
        i1 i1Var;
        i1 i1Var2 = this.h;
        if (i1Var2 == null) {
            return true;
        }
        int iB = s2Var.b(i1Var2.f7922b);
        while (true) {
            s2Var2 = s2Var;
            iB = s2Var2.d(iB, this.f7995a, this.f7996b, this.f7999f, this.f8000g);
            while (true) {
                i1Var = i1Var2.f7930l;
                if (i1Var == null || i1Var2.f7925f.f7950g) {
                    break;
                }
                i1Var2 = i1Var;
            }
            if (iB == -1 || i1Var == null || s2Var2.b(i1Var.f7922b) != iB) {
                break;
            }
            i1Var2 = i1Var;
            s2Var = s2Var2;
        }
        boolean zK = k(i1Var2);
        i1Var2.f7925f = g(s2Var2, i1Var2.f7925f);
        return !zK;
    }

    public final boolean o(s2 s2Var, long j10) {
        boolean zK;
        j1 j1VarG;
        i1 i1Var = null;
        for (i1 i1Var2 = this.h; i1Var2 != null; i1Var2 = i1Var2.f7930l) {
            j1 j1Var = i1Var2.f7925f;
            if (i1Var != null) {
                j1 j1VarC = c(s2Var, i1Var, j10);
                if (j1VarC == null) {
                    zK = k(i1Var);
                } else if (j1Var.f7946b == j1VarC.f7946b && j1Var.f7945a.equals(j1VarC.f7945a)) {
                    j1VarG = j1VarC;
                } else {
                    zK = k(i1Var);
                }
                return !zK;
            }
            j1VarG = g(s2Var, j1Var);
            i1Var2.f7925f = j1VarG.a(j1Var.f7947c);
            i1Var = i1Var2;
        }
        return true;
    }
}
