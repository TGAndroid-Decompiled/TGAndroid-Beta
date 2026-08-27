package j4;

import android.util.Pair;
import h3.p2;
import h3.r2;
import h3.s2;

public final class w extends l1 {

    public final boolean f12695l;

    public final r2 f12696m;

    public final p2 f12697n;

    public u f12698o;

    public t f12699p;

    public boolean f12700q;

    public boolean f12701r;

    public boolean f12702s;

    public w(a aVar, boolean z10) {
        super(aVar);
        this.f12695l = z10 && aVar.i();
        this.f12696m = new r2();
        this.f12697n = new p2();
        s2 s2VarG = aVar.g();
        if (s2VarG == null) {
            this.f12698o = new u(new v(aVar.h()), r2.D, u.f12683e);
        } else {
            this.f12698o = new u(s2VarG, null, null);
            this.f12702s = true;
        }
    }

    @Override
    public final t b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        t tVar = new t(c0Var, rVar, j10);
        d5.a.i(tVar.d == null);
        a aVar = this.f12614k;
        tVar.d = aVar;
        if (!this.f12701r) {
            this.f12699p = tVar;
            if (!this.f12700q) {
                this.f12700q = true;
                w(null, aVar);
            }
            return tVar;
        }
        Object obj = c0Var.f12503a;
        if (this.f12698o.d != null && obj.equals(u.f12683e)) {
            obj = this.f12698o.d;
        }
        tVar.c(c0Var.b(obj));
        return tVar;
    }

    public final void B(long j10) {
        t tVar = this.f12699p;
        int iB = this.f12698o.b(tVar.f12667a.f12503a);
        if (iB == -1) {
            return;
        }
        u uVar = this.f12698o;
        p2 p2Var = this.f12697n;
        uVar.f(iB, p2Var, false);
        long j11 = p2Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        tVar.h = j10;
    }

    @Override
    public final void n(z zVar) {
        t tVar = (t) zVar;
        if (tVar.f12670e != null) {
            a aVar = tVar.d;
            aVar.getClass();
            aVar.n(tVar.f12670e);
        }
        if (zVar == this.f12699p) {
            this.f12699p = null;
        }
    }

    @Override
    public final void p() {
        this.f12701r = false;
        this.f12700q = false;
        super.p();
    }

    @Override
    public final c0 x(c0 c0Var) {
        Object obj = c0Var.f12503a;
        Object obj2 = this.f12698o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = u.f12683e;
        }
        return c0Var.b(obj);
    }

    @Override
    public final void y(s2 s2Var) {
        long j10;
        u uVar;
        c0 c0VarB;
        u uVar2;
        if (this.f12701r) {
            u uVar3 = this.f12698o;
            this.f12698o = new u(s2Var, uVar3.f12684c, uVar3.d);
            t tVar = this.f12699p;
            if (tVar != null) {
                B(tVar.h);
            }
        } else {
            if (!s2Var.p()) {
                r2 r2Var = this.f12696m;
                s2Var.n(0, r2Var);
                long j11 = r2Var.f8121x;
                Object obj = r2Var.f8112a;
                t tVar2 = this.f12699p;
                if (tVar2 != null) {
                    long j12 = tVar2.f12668b;
                    u uVar4 = this.f12698o;
                    Object obj2 = tVar2.f12667a.f12503a;
                    p2 p2Var = this.f12697n;
                    uVar4.g(obj2, p2Var);
                    long j13 = p2Var.f8070e + j12;
                    this.f12698o.m(0, r2Var, 0L);
                    if (j13 != r2Var.f8121x) {
                        j10 = j13;
                    } else {
                        j10 = j11;
                    }
                } else {
                    j10 = j11;
                }
                Pair pairI = s2Var.i(this.f12696m, this.f12697n, 0, j10);
                Object obj3 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.f12702s) {
                    u uVar5 = this.f12698o;
                    uVar = new u(s2Var, uVar5.f12684c, uVar5.d);
                } else {
                    uVar = new u(s2Var, obj, obj3);
                }
                this.f12698o = uVar;
                t tVar3 = this.f12699p;
                if (tVar3 != null) {
                    B(jLongValue);
                    c0 c0Var = tVar3.f12667a;
                    Object obj4 = c0Var.f12503a;
                    if (this.f12698o.d != null && obj4.equals(u.f12683e)) {
                        obj4 = this.f12698o.d;
                    }
                    c0VarB = c0Var.b(obj4);
                }
                this.f12702s = true;
                this.f12701r = true;
                m(this.f12698o);
                if (c0VarB != null) {
                    t tVar4 = this.f12699p;
                    tVar4.getClass();
                    tVar4.c(c0VarB);
                }
            }
            if (this.f12702s) {
                u uVar6 = this.f12698o;
                uVar2 = new u(s2Var, uVar6.f12684c, uVar6.d);
            } else {
                uVar2 = new u(s2Var, r2.D, u.f12683e);
            }
            this.f12698o = uVar2;
        }
        c0VarB = null;
        this.f12702s = true;
        this.f12701r = true;
        m(this.f12698o);
        if (c0VarB != null) {
            t tVar5 = this.f12699p;
            tVar5.getClass();
            tVar5.c(c0VarB);
        }
    }

    @Override
    public final void z() {
        if (this.f12695l) {
            return;
        }
        this.f12700q = true;
        w(null, this.f12614k);
    }

    @Override
    public final void j() {
    }
}
