package m2;

import a8.b8;
import a8.ja;
import ai.r1;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import e2.a1;
import e2.b1;
import e2.c1;
import e2.i1;
import e2.k1;
import e2.l1;
import e2.o0;
import e2.q0;
import e2.q1;
import e2.v0;
import e2.w0;
import e2.y0;
import e2.z0;
import h2.g0;
import h2.i0;
import h2.l0;
import h2.o;
import h2.r;
import h9.s1;
import h9.x1;
import java.io.IOException;
import java.util.List;
import l2.w;
import l2.y;
import li.p;
import q2.l;
import x2.b0;
import x2.f0;
import x2.j0;
import x2.t;
public final class e implements a1, j0, l {
    public final g0 f20124a;
    public final i1 f20125b;
    public final k1 f20126c;
    public final b8 d;
    public final SparseArray f20127e;
    public r f20128f;
    public c1 h;
    public i0 f20129n;
    public boolean f20130r;

    public e(g0 g0Var) {
        g0Var.getClass();
        this.f20124a = g0Var;
        String str = l0.f13471a;
        Looper myLooper = Looper.myLooper();
        this.f20128f = new r((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        i1 i1Var = new i1();
        this.f20125b = i1Var;
        this.f20126c = new k1();
        ?? obj = new Object();
        obj.f341a = i1Var;
        h9.g0 g0Var2 = h9.i0.f13686b;
        obj.f342b = s1.f13749e;
        obj.f343c = x1.h;
        this.d = obj;
        this.f20127e = new SparseArray();
    }

    @Override
    public final void A(int i7, f0 f0Var, t tVar, b0 b0Var) {
        a T = T(i7, f0Var);
        V(T, 1002, new p(T, tVar, b0Var));
    }

    @Override
    public final void B(List list) {
        a Q = Q();
        V(Q, 27, new w(Q, list));
    }

    @Override
    public final void C(int i7, f0 f0Var, b0 b0Var) {
        a T = T(i7, f0Var);
        V(T, 1005, new c(T, b0Var, 8));
    }

    @Override
    public final void D(int i7, boolean z10) {
        a Q = Q();
        V(Q, -1, new p(Q, z10, i7, 3));
    }

    @Override
    public final void E(q1 q1Var) {
        a Q = Q();
        V(Q, 19, new c(Q, q1Var, 11));
    }

    @Override
    public final void G(int i7, f0 f0Var, t tVar, b0 b0Var) {
        a T = T(i7, f0Var);
        V(T, 1001, new c(T, tVar, b0Var, 1));
    }

    @Override
    public final void H(w0 w0Var) {
        a Q = Q();
        V(Q, 12, new p(Q, w0Var, 1));
    }

    @Override
    public final void I(int i7, f0 f0Var, t tVar, b0 b0Var, int i10) {
        a T = T(i7, f0Var);
        V(T, 1000, new p(T, tVar, b0Var, i10));
    }

    @Override
    public final void J(int i7, int i10) {
        a U = U();
        V(U, 24, new p(U, i7, i10));
    }

    @Override
    public final void K(int i7, f0 f0Var, Exception exc) {
        a T = T(i7, f0Var);
        V(T, 1024, new c(T, exc, 0));
    }

    @Override
    public final void L(l1 l1Var, int i7) {
        c1 c1Var = this.h;
        c1Var.getClass();
        b8 b8Var = this.d;
        b8Var.d = b8.f(c1Var, (h9.i0) b8Var.f342b, (f0) b8Var.f344e, (i1) b8Var.f341a);
        b8Var.s(c1Var.y0());
        a Q = Q();
        V(Q, 0, new c(Q, i7, 22));
    }

    @Override
    public final void M(q0 q0Var) {
        a Q = Q();
        V(Q, 28, new p(Q, q0Var, 5));
    }

    @Override
    public final void N(int i7, f0 f0Var, int i10) {
        a T = T(i7, f0Var);
        V(T, 1022, new p(T, i10, 29, (char) 0));
    }

    @Override
    public final void O(y0 y0Var) {
        a Q = Q();
        V(Q, 13, new c(Q, y0Var, 21));
    }

    @Override
    public final void P(boolean z10) {
        a Q = Q();
        V(Q, 7, new p(Q, z10));
    }

    public final a Q() {
        return S((f0) this.d.d);
    }

    public final a R(l1 l1Var, int i7, f0 f0Var) {
        f0 f0Var2;
        boolean z10;
        if (l1Var.p()) {
            f0Var2 = null;
        } else {
            f0Var2 = f0Var;
        }
        this.f20124a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (l1Var.equals(this.h.y0()) && i7 == this.h.o0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j3 = 0;
        if (f0Var2 != null && f0Var2.b()) {
            if (z10 && this.h.n0() == f0Var2.f59524b && this.h.O() == f0Var2.f59525c) {
                j3 = this.h.l();
            }
        } else if (z10) {
            j3 = this.h.a0();
        } else if (!l1Var.p()) {
            j3 = l0.h0(l1Var.m(i7, this.f20126c, 0L).f10169l);
        }
        return new a(elapsedRealtime, l1Var, i7, f0Var2, j3, this.h.y0(), this.h.o0(), (f0) this.d.d, this.h.l(), this.h.r());
    }

    public final a S(f0 f0Var) {
        l1 l1Var;
        this.h.getClass();
        if (f0Var == null) {
            l1Var = null;
        } else {
            l1Var = (l1) ((x1) this.d.f343c).get(f0Var);
        }
        if (f0Var != null && l1Var != null) {
            return R(l1Var, l1Var.g(f0Var.f59523a, this.f20125b).f10118c, f0Var);
        }
        int o02 = this.h.o0();
        l1 y02 = this.h.y0();
        if (o02 >= y02.o()) {
            y02 = l1.f10190a;
        }
        return R(y02, o02, null);
    }

    public final a T(int i7, f0 f0Var) {
        this.h.getClass();
        if (f0Var != null) {
            if (((l1) ((x1) this.d.f343c).get(f0Var)) != null) {
                return S(f0Var);
            }
            return R(l1.f10190a, i7, f0Var);
        }
        l1 y02 = this.h.y0();
        if (i7 >= y02.o()) {
            y02 = l1.f10190a;
        }
        return R(y02, i7, null);
    }

    public final a U() {
        return S((f0) this.d.f345f);
    }

    public final void V(a aVar, int i7, o oVar) {
        this.f20127e.put(i7, aVar);
        this.f20128f.e(i7, oVar);
    }

    public final void W(l2.f0 f0Var, Looper looper) {
        boolean z10;
        boolean z11 = true;
        if (this.h != null && !((h9.i0) this.d.f342b).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        ja.p(z10);
        f0Var.getClass();
        this.h = f0Var;
        this.f20129n = this.f20124a.a(looper, null);
        r rVar = this.f20128f;
        ab.g gVar = new ab.g(28, this, f0Var);
        rVar.getClass();
        g0 g0Var = this.f20124a;
        if (g0Var == null) {
            z11 = false;
        }
        ja.p(z11);
        this.f20128f = new r(rVar.d, looper, looper.getThread(), g0Var, gVar, rVar.f13504i);
    }

    @Override
    public final void a(int i7) {
        a U = U();
        V(U, 21, new c(U, i7, 4));
    }

    @Override
    public final void b(e2.x1 x1Var) {
        a U = U();
        V(U, 25, new y(U, x1Var));
    }

    @Override
    public final void c(boolean z10) {
        a U = U();
        V(U, 23, new c(U, z10, 12));
    }

    @Override
    public final void d(int i7) {
        a Q = Q();
        V(Q, 6, new p(Q, i7, 8, (char) 0));
    }

    @Override
    public final void e(int i7) {
        a Q = Q();
        V(Q, 8, new p(Q, i7, 16, (char) 0));
    }

    @Override
    public final void h(boolean z10) {
        a Q = Q();
        V(Q, 3, new c(Q, z10, 5));
    }

    @Override
    public final void i(int i7, boolean z10) {
        a Q = Q();
        V(Q, 5, new p(Q, z10, i7, 12));
    }

    @Override
    public final void j(float f10) {
        a U = U();
        V(U, 22, new c(U, f10));
    }

    @Override
    public final void k(int i7, f0 f0Var, b0 b0Var) {
        a T = T(i7, f0Var);
        V(T, 1004, new ab.g(29, T, b0Var));
    }

    @Override
    public final void l(int i7) {
        a Q = Q();
        V(Q, 4, new p(Q, i7, 15, (char) 0));
    }

    @Override
    public final void m(o0 o0Var) {
        a Q = Q();
        V(Q, 15, new c(Q, o0Var, 18));
    }

    @Override
    public final void n(e2.e eVar) {
        a U = U();
        V(U, 20, new p(U, eVar, 4));
    }

    @Override
    public final void o(o0 o0Var) {
        a Q = Q();
        V(Q, 14, new p(Q, o0Var, 24));
    }

    @Override
    public final void p(int i7, f0 f0Var, nb.a aVar) {
        a T = T(i7, f0Var);
        V(T, 1023, new c(T, aVar, 16));
    }

    @Override
    public final void q(v0 v0Var) {
        a Q;
        f0 f0Var;
        if ((v0Var instanceof l2.l) && (f0Var = ((l2.l) v0Var).F) != null) {
            Q = S(f0Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new p(Q, v0Var, 10));
    }

    @Override
    public final void r(int i7, f0 f0Var, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        a T = T(i7, f0Var);
        V(T, 1003, new ki.e(T, tVar, b0Var, iOException, z10));
    }

    @Override
    public final void s(b1 b1Var, b1 b1Var2, int i7) {
        if (i7 == 1) {
            this.f20130r = false;
        }
        c1 c1Var = this.h;
        c1Var.getClass();
        b8 b8Var = this.d;
        b8Var.d = b8.f(c1Var, (h9.i0) b8Var.f342b, (f0) b8Var.f344e, (i1) b8Var.f341a);
        a Q = Q();
        V(Q, 11, new r1(Q, i7, b1Var, b1Var2));
    }

    @Override
    public final void t(boolean z10) {
        a Q = Q();
        V(Q, 9, new c(Q, z10, 19));
    }

    @Override
    public final void u(e2.s1 s1Var) {
        a Q = Q();
        V(Q, 2, new p(Q, s1Var, 11));
    }

    @Override
    public final void v(int i7, e2.l0 l0Var) {
        a Q = Q();
        V(Q, 1, new c(Q, l0Var, i7));
    }

    @Override
    public final void w(int i7, f0 f0Var) {
        a T = T(i7, f0Var);
        V(T, 1025, new c(T, 17));
    }

    @Override
    public final void x(g2.c cVar) {
        a Q = Q();
        V(Q, 27, new p(Q, cVar, 17));
    }

    @Override
    public final void y(v0 v0Var) {
        a Q;
        f0 f0Var;
        if ((v0Var instanceof l2.l) && (f0Var = ((l2.l) v0Var).F) != null) {
            Q = S(f0Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new ki.e(Q, v0Var, 9));
    }

    @Override
    public final void z(int i7, f0 f0Var) {
        a T = T(i7, f0Var);
        V(T, 1027, new c(T, 9));
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void F(z0 z0Var) {
    }

    @Override
    public final void f(boolean z10) {
    }

    @Override
    public final void g(int i7) {
    }
}
