package m2;

import a8.b8;
import a8.ma;
import ai.n1;
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
import kg.f1;
import l2.m;
import l2.x;
import l2.z;
import q2.k;
import x2.c0;
import x2.k0;
import x2.u;
public final class d implements a1, k0, k {
    public final g0 f20578a;
    public final i1 f20579b;
    public final k1 f20580c;
    public final b8 d;
    public final SparseArray f20581e;
    public r f20582f;
    public c1 h;
    public i0 f20583n;
    public boolean f20584r;

    public d(g0 g0Var) {
        g0Var.getClass();
        this.f20578a = g0Var;
        String str = l0.f13778a;
        Looper myLooper = Looper.myLooper();
        this.f20582f = new r((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        i1 i1Var = new i1();
        this.f20579b = i1Var;
        this.f20580c = new k1();
        ?? obj = new Object();
        obj.f341a = i1Var;
        h9.g0 g0Var2 = h9.i0.f13995b;
        obj.f342b = s1.f14058e;
        obj.f343c = x1.h;
        this.d = obj;
        this.f20581e = new SparseArray();
    }

    @Override
    public final void A(int i7, x2.g0 g0Var, u uVar, c0 c0Var) {
        a T = T(i7, g0Var);
        V(T, 1002, new li.c(T, uVar, c0Var));
    }

    @Override
    public final void B(List list) {
        a Q = Q();
        V(Q, 27, new x(Q, list));
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
        b8Var.s(c1Var.z0());
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
        this.f20578a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (l1Var.equals(this.h.z0()) && i7 == this.h.p0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j3 = 0;
        if (g0Var2 != null && g0Var2.b()) {
            if (z10 && this.h.o0() == g0Var2.f60217b && this.h.P() == g0Var2.f60218c) {
                j3 = this.h.n();
            }
        } else if (z10) {
            j3 = this.h.b0();
        } else if (!l1Var.p()) {
            j3 = l0.h0(l1Var.m(i7, this.f20580c, 0L).f10477l);
        }
        return new a(elapsedRealtime, l1Var, i7, g0Var2, j3, this.h.z0(), this.h.p0(), (x2.g0) this.d.d, this.h.n(), this.h.s());
    }

    public final a S(x2.g0 g0Var) {
        l1 l1Var;
        this.h.getClass();
        if (g0Var == null) {
            l1Var = null;
        } else {
            l1Var = (l1) ((x1) this.d.f343c).get(g0Var);
        }
        if (g0Var != null && l1Var != null) {
            return R(l1Var, l1Var.g(g0Var.f60216a, this.f20579b).f10426c, g0Var);
        }
        int p02 = this.h.p0();
        l1 z02 = this.h.z0();
        if (p02 >= z02.o()) {
            z02 = l1.f10498a;
        }
        return R(z02, p02, null);
    }

    public final a T(int i7, x2.g0 g0Var) {
        this.h.getClass();
        if (g0Var != null) {
            if (((l1) ((x1) this.d.f343c).get(g0Var)) != null) {
                return S(g0Var);
            }
            return R(l1.f10498a, i7, g0Var);
        }
        l1 z02 = this.h.z0();
        if (i7 >= z02.o()) {
            z02 = l1.f10498a;
        }
        return R(z02, i7, null);
    }

    public final a U() {
        return S((x2.g0) this.d.f345f);
    }

    public final void V(a aVar, int i7, o oVar) {
        this.f20581e.put(i7, aVar);
        this.f20582f.e(i7, oVar);
    }

    public final void W(l2.g0 g0Var, Looper looper) {
        boolean z10;
        boolean z11 = true;
        if (this.h != null && !((h9.i0) this.d.f342b).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        ma.p(z10);
        g0Var.getClass();
        this.h = g0Var;
        this.f20583n = this.f20578a.a(looper, null);
        r rVar = this.f20582f;
        ab.g gVar = new ab.g(26, this, g0Var);
        rVar.getClass();
        g0 g0Var2 = this.f20578a;
        if (g0Var2 == null) {
            z11 = false;
        }
        ma.p(z11);
        this.f20582f = new r(rVar.d, looper, looper.getThread(), g0Var2, gVar, rVar.f13811i);
    }

    @Override
    public final void a(int i7) {
        a U = U();
        V(U, 21, new c(U, i7, 5));
    }

    @Override
    public final void b(e2.x1 x1Var) {
        a U = U();
        V(U, 25, new z(U, x1Var));
    }

    @Override
    public final void c(boolean z10) {
        a U = U();
        V(U, 23, new c(U, z10, 13));
    }

    @Override
    public final void d(int i7) {
        a Q = Q();
        V(Q, 6, new li.c(Q, i7, 9, (char) 0));
    }

    @Override
    public final void e(int i7) {
        a Q = Q();
        V(Q, 8, new li.c(Q, i7, 17, (char) 0));
    }

    @Override
    public final void h(boolean z10) {
        a Q = Q();
        V(Q, 3, new c(Q, z10, 6));
    }

    @Override
    public final void i(int i7, x2.g0 g0Var, c0 c0Var) {
        a T = T(i7, g0Var);
        V(T, 1004, new ab.g(27, T, c0Var));
    }

    @Override
    public final void j(int i7, boolean z10) {
        a Q = Q();
        V(Q, 5, new li.c(Q, z10, i7, 13));
    }

    @Override
    public final void k(float f10) {
        a U = U();
        V(U, 22, new c(U, f10));
    }

    @Override
    public final void l(int i7, x2.g0 g0Var, nb.a aVar) {
        a T = T(i7, g0Var);
        V(T, 1023, new c(T, aVar, 17));
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
        if ((v0Var instanceof m) && (g0Var = ((m) v0Var).F) != null) {
            Q = S(g0Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new li.c(Q, v0Var, 11));
    }

    @Override
    public final void r(int i7, x2.g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        a T = T(i7, g0Var);
        V(T, 1003, new f1(T, uVar, c0Var, iOException, z10));
    }

    @Override
    public final void s(b1 b1Var, b1 b1Var2, int i7) {
        if (i7 == 1) {
            this.f20584r = false;
        }
        c1 c1Var = this.h;
        c1Var.getClass();
        b8 b8Var = this.d;
        b8Var.d = b8.f(c1Var, (h9.i0) b8Var.f342b, (x2.g0) b8Var.f344e, (i1) b8Var.f341a);
        a Q = Q();
        V(Q, 11, new n1(Q, i7, b1Var, b1Var2));
    }

    @Override
    public final void t(boolean z10) {
        a Q = Q();
        V(Q, 9, new c(Q, z10, 20));
    }

    @Override
    public final void u(e2.s1 s1Var) {
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
        if ((v0Var instanceof m) && (g0Var = ((m) v0Var).F) != null) {
            Q = S(g0Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new f1(Q, v0Var, 13));
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
    public final void f(boolean z10) {
    }

    @Override
    public final void g(int i7) {
    }
}
