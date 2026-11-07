package m2;

import a8.b8;
import a8.ia;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import e2.a1;
import e2.b1;
import e2.c1;
import e2.i1;
import e2.k1;
import e2.l0;
import e2.l1;
import e2.o0;
import e2.q0;
import e2.q1;
import e2.s1;
import e2.v0;
import e2.w0;
import e2.x1;
import e2.y0;
import e2.z0;
import h2.g0;
import h2.i0;
import h2.m0;
import h2.o;
import h2.r;
import h9.t1;
import h9.y1;
import hi.x3;
import java.io.IOException;
import java.util.List;
import l2.b0;
import l2.l;
import l2.q;
import l2.y;
import l2.z;
import q2.k;
import x2.c0;
import x2.k0;
import x2.u;
public final class e implements a1, k0, k {
    public final g0 f19525a;
    public final i1 f19526b;
    public final k1 f19527c;
    public final b8 d;
    public final SparseArray f19528e;
    public r f19529f;
    public c1 h;
    public i0 f19530n;
    public boolean f19531r;

    public e(g0 g0Var) {
        g0Var.getClass();
        this.f19525a = g0Var;
        String str = m0.f14112a;
        Looper myLooper = Looper.myLooper();
        this.f19529f = new r((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        i1 i1Var = new i1();
        this.f19526b = i1Var;
        this.f19527c = new k1();
        ?? obj = new Object();
        obj.f335a = i1Var;
        h9.g0 g0Var2 = h9.i0.f14329b;
        obj.f336b = t1.f14397e;
        obj.f337c = y1.h;
        this.d = obj;
        this.f19528e = new SparseArray();
    }

    @Override
    public final void A(int i7, x2.g0 g0Var, u uVar, c0 c0Var) {
        a T = T(i7, g0Var);
        V(T, 1002, new c(T, (Object) uVar, (Object) c0Var, 21));
    }

    @Override
    public final void B(List list) {
        a Q = Q();
        V(Q, 27, new z(Q, list));
    }

    @Override
    public final void C(int i7, boolean z9) {
        a Q = Q();
        V(Q, -1, new x3(Q, z9, i7));
    }

    @Override
    public final void D(q1 q1Var) {
        a Q = Q();
        V(Q, 19, new d(Q, q1Var, 5));
    }

    @Override
    public final void E(int i7, x2.g0 g0Var, c0 c0Var) {
        a T = T(i7, g0Var);
        V(T, 1005, new d(T, c0Var, 2));
    }

    @Override
    public final void G(int i7, x2.g0 g0Var, u uVar, c0 c0Var) {
        a T = T(i7, g0Var);
        V(T, 1001, new c(T, (Object) uVar, (Object) c0Var, 25));
    }

    @Override
    public final void H(w0 w0Var) {
        a Q = Q();
        V(Q, 12, new x3(Q, w0Var, 25));
    }

    @Override
    public final void I(int i7, x2.g0 g0Var, u uVar, c0 c0Var, int i10) {
        a T = T(i7, g0Var);
        V(T, 1000, new c(T, uVar, c0Var, i10));
    }

    @Override
    public final void J(int i7, int i10) {
        a U = U();
        V(U, 24, new c(U, i7, i10));
    }

    @Override
    public final void K(int i7, x2.g0 g0Var, Exception exc) {
        a T = T(i7, g0Var);
        V(T, 1024, new c(T, exc, 24));
    }

    @Override
    public final void L(l1 l1Var, int i7) {
        c1 c1Var = this.h;
        c1Var.getClass();
        b8 b8Var = this.d;
        b8Var.d = b8.f(c1Var, (h9.i0) b8Var.f336b, (x2.g0) b8Var.f338e, (i1) b8Var.f335a);
        b8Var.s(c1Var.y0());
        a Q = Q();
        V(Q, 0, new d(Q, i7));
    }

    @Override
    public final void M(q0 q0Var) {
        a Q = Q();
        V(Q, 28, new x3(Q, q0Var, 29));
    }

    @Override
    public final void N(int i7, x2.g0 g0Var, int i10) {
        a T = T(i7, g0Var);
        V(T, 1022, new c(T, i10, 23, (char) 0));
    }

    @Override
    public final void O(y0 y0Var) {
        a Q = Q();
        V(Q, 13, new d(Q, y0Var, 15));
    }

    @Override
    public final void P(boolean z9) {
        a Q = Q();
        V(Q, 7, new c(Q, z9, 0, (byte) 0));
    }

    public final a Q() {
        return S((x2.g0) this.d.d);
    }

    public final a R(l1 l1Var, int i7, x2.g0 g0Var) {
        x2.g0 g0Var2;
        boolean z9;
        if (l1Var.p()) {
            g0Var2 = null;
        } else {
            g0Var2 = g0Var;
        }
        this.f19525a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (l1Var.equals(this.h.y0()) && i7 == this.h.o0()) {
            z9 = true;
        } else {
            z9 = false;
        }
        long j3 = 0;
        if (g0Var2 != null && g0Var2.b()) {
            if (z9 && this.h.n0() == g0Var2.f58241b && this.h.O() == g0Var2.f58242c) {
                j3 = this.h.l();
            }
        } else if (z9) {
            j3 = this.h.a0();
        } else if (!l1Var.p()) {
            j3 = m0.h0(l1Var.m(i7, this.f19527c, 0L).f10333l);
        }
        return new a(elapsedRealtime, l1Var, i7, g0Var2, j3, this.h.y0(), this.h.o0(), (x2.g0) this.d.d, this.h.l(), this.h.r());
    }

    public final a S(x2.g0 g0Var) {
        l1 l1Var;
        this.h.getClass();
        if (g0Var == null) {
            l1Var = null;
        } else {
            l1Var = (l1) ((y1) this.d.f337c).get(g0Var);
        }
        if (g0Var != null && l1Var != null) {
            return R(l1Var, l1Var.g(g0Var.f58240a, this.f19526b).f10282c, g0Var);
        }
        int o02 = this.h.o0();
        l1 y02 = this.h.y0();
        if (o02 >= y02.o()) {
            y02 = l1.f10354a;
        }
        return R(y02, o02, null);
    }

    public final a T(int i7, x2.g0 g0Var) {
        this.h.getClass();
        if (g0Var != null) {
            if (((l1) ((y1) this.d.f337c).get(g0Var)) != null) {
                return S(g0Var);
            }
            return R(l1.f10354a, i7, g0Var);
        }
        l1 y02 = this.h.y0();
        if (i7 >= y02.o()) {
            y02 = l1.f10354a;
        }
        return R(y02, i7, null);
    }

    public final a U() {
        return S((x2.g0) this.d.f339f);
    }

    public final void V(a aVar, int i7, o oVar) {
        this.f19528e.put(i7, aVar);
        this.f19529f.e(i7, oVar);
    }

    public final void W(l2.i0 i0Var, Looper looper) {
        boolean z9;
        boolean z10 = true;
        if (this.h != null && !((h9.i0) this.d.f336b).isEmpty()) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.p(z9);
        i0Var.getClass();
        this.h = i0Var;
        this.f19530n = this.f19525a.a(looper, null);
        r rVar = this.f19529f;
        ab.g gVar = new ab.g(26, this, i0Var);
        rVar.getClass();
        g0 g0Var = this.f19525a;
        if (g0Var == null) {
            z10 = false;
        }
        ia.p(z10);
        this.f19529f = new r(rVar.d, looper, looper.getThread(), g0Var, gVar, rVar.f14145i);
    }

    @Override
    public final void a(x1 x1Var) {
        a U = U();
        V(U, 25, new b0(U, x1Var));
    }

    @Override
    public final void b(int i7, x2.g0 g0Var, qb.a aVar) {
        a T = T(i7, g0Var);
        V(T, 1023, new d(T, aVar, 10));
    }

    @Override
    public final void c(int i7) {
        a U = U();
        V(U, 21, new c(U, i7, 28, (char) 0));
    }

    @Override
    public final void d(int i7, x2.g0 g0Var, c0 c0Var) {
        a T = T(i7, g0Var);
        V(T, 1004, new ab.g(27, T, c0Var));
    }

    @Override
    public final void e(int i7) {
        a Q = Q();
        V(Q, 8, new c(Q, i7, 10, (char) 0));
    }

    @Override
    public final void f(boolean z9) {
        a U = U();
        V(U, 23, new d(U, z9, 6));
    }

    @Override
    public final void g(int i7) {
        a Q = Q();
        V(Q, 6, new c(Q, i7, 2, (char) 0));
    }

    @Override
    public final void j(boolean z9) {
        a Q = Q();
        V(Q, 3, new c(Q, z9, 29, (byte) 0));
    }

    @Override
    public final void k(int i7, boolean z9) {
        a Q = Q();
        V(Q, 5, new c(Q, z9, i7));
    }

    @Override
    public final void l(float f10) {
        a U = U();
        V(U, 22, new d(U, f10));
    }

    @Override
    public final void m(int i7) {
        a Q = Q();
        V(Q, 4, new c(Q, i7, 9, (char) 0));
    }

    @Override
    public final void n(o0 o0Var) {
        a Q = Q();
        V(Q, 15, new d(Q, o0Var, 12));
    }

    @Override
    public final void o(e2.e eVar) {
        a U = U();
        V(U, 20, new x3(U, eVar, 28));
    }

    @Override
    public final void p(o0 o0Var) {
        a Q = Q();
        V(Q, 14, new c(Q, o0Var, 18));
    }

    @Override
    public final void q(v0 v0Var) {
        a Q;
        x2.g0 g0Var;
        if ((v0Var instanceof l) && (g0Var = ((l) v0Var).E) != null) {
            Q = S(g0Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new c(Q, v0Var, 4));
    }

    @Override
    public final void r(int i7, x2.g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z9) {
        a T = T(i7, g0Var);
        V(T, 1003, new y(T, uVar, c0Var, iOException, z9));
    }

    @Override
    public final void s(b1 b1Var, b1 b1Var2, int i7) {
        if (i7 == 1) {
            this.f19531r = false;
        }
        c1 c1Var = this.h;
        c1Var.getClass();
        b8 b8Var = this.d;
        b8Var.d = b8.f(c1Var, (h9.i0) b8Var.f336b, (x2.g0) b8Var.f338e, (i1) b8Var.f335a);
        a Q = Q();
        V(Q, 11, new q(Q, i7, b1Var, b1Var2));
    }

    @Override
    public final void t(boolean z9) {
        a Q = Q();
        V(Q, 9, new d(Q, z9, 13));
    }

    @Override
    public final void u(s1 s1Var) {
        a Q = Q();
        V(Q, 2, new c(Q, s1Var, 5));
    }

    @Override
    public final void v(int i7, l0 l0Var) {
        a Q = Q();
        V(Q, 1, new d(Q, l0Var, i7));
    }

    @Override
    public final void w(int i7, x2.g0 g0Var) {
        a T = T(i7, g0Var);
        V(T, 1025, new d(T, 11, (byte) 0));
    }

    @Override
    public final void x(g2.d dVar) {
        a Q = Q();
        V(Q, 27, new c(Q, dVar, 11));
    }

    @Override
    public final void y(v0 v0Var) {
        a Q;
        x2.g0 g0Var;
        if ((v0Var instanceof l) && (g0Var = ((l) v0Var).E) != null) {
            Q = S(g0Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new y(Q, v0Var, 13));
    }

    @Override
    public final void z(int i7, x2.g0 g0Var) {
        a T = T(i7, g0Var);
        V(T, 1027, new d(T, 3, (byte) 0));
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void F(z0 z0Var) {
    }

    @Override
    public final void h(boolean z9) {
    }

    @Override
    public final void i(int i7) {
    }
}
