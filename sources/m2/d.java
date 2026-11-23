package m2;

import a8.b8;
import a8.la;
import ai.v1;
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
import e2.s1;
import e2.v0;
import e2.w0;
import e2.x1;
import e2.y0;
import e2.z0;
import h2.g0;
import h2.i0;
import h2.l0;
import h2.o;
import h2.r;
import h9.t1;
import h9.y1;
import java.io.IOException;
import java.util.List;
import l2.f0;
import l2.l;
import l2.w;
import l2.y;
import q2.k;
import x2.c0;
import x2.k0;
import x2.u;
public final class d implements a1, k0, k {
    public final g0 f20516a;
    public final i1 f20517b;
    public final k1 f20518c;
    public final b8 d;
    public final SparseArray f20519e;
    public r f20520f;
    public c1 h;
    public i0 f20521n;
    public boolean f20522r;

    public d(g0 g0Var) {
        g0Var.getClass();
        this.f20516a = g0Var;
        String str = l0.f13815a;
        Looper myLooper = Looper.myLooper();
        this.f20520f = new r((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        i1 i1Var = new i1();
        this.f20517b = i1Var;
        this.f20518c = new k1();
        ?? obj = new Object();
        obj.f341a = i1Var;
        h9.g0 g0Var2 = h9.i0.f14035b;
        obj.f342b = t1.f14103e;
        obj.f343c = y1.h;
        this.d = obj;
        this.f20519e = new SparseArray();
    }

    @Override
    public final void A(int i7, x2.g0 g0Var, u uVar, c0 c0Var) {
        a T = T(i7, g0Var);
        V(T, 1002, new li.c(T, uVar, c0Var));
    }

    @Override
    public final void B(List list) {
        a Q = Q();
        V(Q, 27, new w(Q, list));
    }

    @Override
    public final void C(int i7, x2.g0 g0Var, c0 c0Var) {
        a T = T(i7, g0Var);
        V(T, 1005, new c(T, c0Var, 9));
    }

    @Override
    public final void D(int i7, boolean z10) {
        a Q = Q();
        V(Q, -1, new li.c(Q, z10, i7, 4));
    }

    @Override
    public final void E(q1 q1Var) {
        a Q = Q();
        V(Q, 19, new c(Q, q1Var, 12));
    }

    @Override
    public final void G(int i7, x2.g0 g0Var, u uVar, c0 c0Var) {
        a T = T(i7, g0Var);
        V(T, 1001, new c(T, uVar, c0Var, 2));
    }

    @Override
    public final void H(w0 w0Var) {
        a Q = Q();
        V(Q, 12, new li.c(Q, w0Var, 2));
    }

    @Override
    public final void I(int i7, x2.g0 g0Var, u uVar, c0 c0Var, int i10) {
        a T = T(i7, g0Var);
        V(T, 1000, new li.c(T, uVar, c0Var, i10));
    }

    @Override
    public final void J(int i7, int i10) {
        a U = U();
        V(U, 24, new li.c(U, i7, i10));
    }

    @Override
    public final void K(int i7, x2.g0 g0Var, Exception exc) {
        a T = T(i7, g0Var);
        V(T, 1024, new c(T, exc, 1));
    }

    @Override
    public final void L(l1 l1Var, int i7) {
        c1 c1Var = this.h;
        c1Var.getClass();
        b8 b8Var = this.d;
        b8Var.d = b8.f(c1Var, (h9.i0) b8Var.f342b, (x2.g0) b8Var.f344e, (i1) b8Var.f341a);
        b8Var.s(c1Var.y0());
        a Q = Q();
        V(Q, 0, new c(Q, i7, 23));
    }

    @Override
    public final void M(q0 q0Var) {
        a Q = Q();
        V(Q, 28, new li.c(Q, q0Var, 6));
    }

    @Override
    public final void N(int i7, x2.g0 g0Var, int i10) {
        a T = T(i7, g0Var);
        V(T, 1022, new c(T, i10, 0));
    }

    @Override
    public final void O(y0 y0Var) {
        a Q = Q();
        V(Q, 13, new c(Q, y0Var, 22));
    }

    @Override
    public final void P(boolean z10) {
        a Q = Q();
        V(Q, 7, new li.c(Q, z10));
    }

    public final a Q() {
        return S((x2.g0) this.d.d);
    }

    public final a R(l1 l1Var, int i7, x2.g0 g0Var) {
        x2.g0 g0Var2;
        boolean z10;
        if (l1Var.p()) {
            g0Var2 = null;
        } else {
            g0Var2 = g0Var;
        }
        this.f20516a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (l1Var.equals(this.h.y0()) && i7 == this.h.o0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j3 = 0;
        if (g0Var2 != null && g0Var2.b()) {
            if (z10 && this.h.n0() == g0Var2.f60134b && this.h.O() == g0Var2.f60135c) {
                j3 = this.h.l();
            }
        } else if (z10) {
            j3 = this.h.a0();
        } else if (!l1Var.p()) {
            j3 = l0.h0(l1Var.m(i7, this.f20518c, 0L).f10516l);
        }
        return new a(elapsedRealtime, l1Var, i7, g0Var2, j3, this.h.y0(), this.h.o0(), (x2.g0) this.d.d, this.h.l(), this.h.r());
    }

    public final a S(x2.g0 g0Var) {
        l1 l1Var;
        this.h.getClass();
        if (g0Var == null) {
            l1Var = null;
        } else {
            l1Var = (l1) ((y1) this.d.f343c).get(g0Var);
        }
        if (g0Var != null && l1Var != null) {
            return R(l1Var, l1Var.g(g0Var.f60133a, this.f20517b).f10465c, g0Var);
        }
        int o02 = this.h.o0();
        l1 y02 = this.h.y0();
        if (o02 >= y02.o()) {
            y02 = l1.f10537a;
        }
        return R(y02, o02, null);
    }

    public final a T(int i7, x2.g0 g0Var) {
        this.h.getClass();
        if (g0Var != null) {
            if (((l1) ((y1) this.d.f343c).get(g0Var)) != null) {
                return S(g0Var);
            }
            return R(l1.f10537a, i7, g0Var);
        }
        l1 y02 = this.h.y0();
        if (i7 >= y02.o()) {
            y02 = l1.f10537a;
        }
        return R(y02, i7, null);
    }

    public final a U() {
        return S((x2.g0) this.d.f345f);
    }

    public final void V(a aVar, int i7, o oVar) {
        this.f20519e.put(i7, aVar);
        this.f20520f.e(i7, oVar);
    }

    public final void W(f0 f0Var, Looper looper) {
        boolean z10;
        boolean z11 = true;
        if (this.h != null && !((h9.i0) this.d.f342b).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.p(z10);
        f0Var.getClass();
        this.h = f0Var;
        this.f20521n = this.f20516a.a(looper, null);
        r rVar = this.f20520f;
        ab.g gVar = new ab.g(26, this, f0Var);
        rVar.getClass();
        g0 g0Var = this.f20516a;
        if (g0Var == null) {
            z11 = false;
        }
        la.p(z11);
        this.f20520f = new r(rVar.d, looper, looper.getThread(), g0Var, gVar, rVar.f13848i);
    }

    @Override
    public final void a(x1 x1Var) {
        a U = U();
        V(U, 25, new y(U, x1Var));
    }

    @Override
    public final void b(int i7, x2.g0 g0Var, c0 c0Var) {
        a T = T(i7, g0Var);
        V(T, 1004, new ab.g(27, T, c0Var));
    }

    @Override
    public final void c(int i7, x2.g0 g0Var, nb.a aVar) {
        a T = T(i7, g0Var);
        V(T, 1023, new c(T, aVar, 17));
    }

    @Override
    public final void d(int i7) {
        a U = U();
        V(U, 21, new c(U, i7, 5));
    }

    @Override
    public final void e(int i7) {
        a Q = Q();
        V(Q, 8, new li.c(Q, i7, 17, (char) 0));
    }

    @Override
    public final void f(boolean z10) {
        a U = U();
        V(U, 23, new c(U, z10, 13));
    }

    @Override
    public final void g(int i7) {
        a Q = Q();
        V(Q, 6, new li.c(Q, i7, 9, (char) 0));
    }

    @Override
    public final void j(boolean z10) {
        a Q = Q();
        V(Q, 3, new c(Q, z10, 6));
    }

    @Override
    public final void k(int i7, boolean z10) {
        a Q = Q();
        V(Q, 5, new li.c(Q, z10, i7, 13));
    }

    @Override
    public final void l(float f10) {
        a U = U();
        V(U, 22, new c(U, f10));
    }

    @Override
    public final void m(int i7) {
        a Q = Q();
        V(Q, 4, new li.c(Q, i7, 16, (char) 0));
    }

    @Override
    public final void n(o0 o0Var) {
        a Q = Q();
        V(Q, 15, new c(Q, o0Var, 19));
    }

    @Override
    public final void o(e2.e eVar) {
        a U = U();
        V(U, 20, new li.c(U, eVar, 5));
    }

    @Override
    public final void p(o0 o0Var) {
        a Q = Q();
        V(Q, 14, new li.c(Q, o0Var, 25));
    }

    @Override
    public final void q(v0 v0Var) {
        a Q;
        x2.g0 g0Var;
        if ((v0Var instanceof l) && (g0Var = ((l) v0Var).F) != null) {
            Q = S(g0Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new li.c(Q, v0Var, 11));
    }

    @Override
    public final void r(int i7, x2.g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        a T = T(i7, g0Var);
        V(T, 1003, new kg.x1(T, uVar, c0Var, iOException, z10));
    }

    @Override
    public final void s(b1 b1Var, b1 b1Var2, int i7) {
        if (i7 == 1) {
            this.f20522r = false;
        }
        c1 c1Var = this.h;
        c1Var.getClass();
        b8 b8Var = this.d;
        b8Var.d = b8.f(c1Var, (h9.i0) b8Var.f342b, (x2.g0) b8Var.f344e, (i1) b8Var.f341a);
        a Q = Q();
        V(Q, 11, new v1(Q, i7, b1Var, b1Var2));
    }

    @Override
    public final void t(boolean z10) {
        a Q = Q();
        V(Q, 9, new c(Q, z10, 20));
    }

    @Override
    public final void u(s1 s1Var) {
        a Q = Q();
        V(Q, 2, new li.c(Q, s1Var, 12));
    }

    @Override
    public final void v(int i7, e2.l0 l0Var) {
        a Q = Q();
        V(Q, 1, new c(Q, l0Var, i7));
    }

    @Override
    public final void w(int i7, x2.g0 g0Var) {
        a T = T(i7, g0Var);
        V(T, 1025, new c(T, 18));
    }

    @Override
    public final void x(g2.c cVar) {
        a Q = Q();
        V(Q, 27, new li.c(Q, cVar, 18));
    }

    @Override
    public final void y(v0 v0Var) {
        a Q;
        x2.g0 g0Var;
        if ((v0Var instanceof l) && (g0Var = ((l) v0Var).F) != null) {
            Q = S(g0Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new kg.x1(Q, v0Var, 11));
    }

    @Override
    public final void z(int i7, x2.g0 g0Var) {
        a T = T(i7, g0Var);
        V(T, 1027, new c(T, 10));
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void F(z0 z0Var) {
    }

    @Override
    public final void h(boolean z10) {
    }

    @Override
    public final void i(int i7) {
    }
}
