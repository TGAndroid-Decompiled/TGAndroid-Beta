package j2;

import ag.m;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b2.b1;
import b2.b2;
import b2.c1;
import b2.d1;
import b2.e1;
import b2.f1;
import b2.l1;
import b2.n1;
import b2.o1;
import b2.p0;
import b2.s0;
import b2.u0;
import b2.u1;
import b2.w1;
import b2.y0;
import b2.z0;
import e2.g0;
import e2.i0;
import e2.l0;
import e2.o;
import e2.r;
import e9.c2;
import e9.n0;
import e9.x1;
import i2.b0;
import i2.q;
import i2.z;
import java.io.IOException;
import java.util.List;
import u2.c0;
import u2.k0;
import u2.u;
import v7.t6;
public final class g implements d1, k0, n2.k {
    public final g0 f9351a;
    public final l1 f9352b;
    public final n1 f9353c;
    public final f d;
    public final SparseArray e;
    public r f9354f;
    public f1 h;
    public i0 f9355n;
    public boolean f9356r;

    public g(g0 g0Var) {
        g0Var.getClass();
        this.f9351a = g0Var;
        String str = l0.f6165a;
        Looper myLooper = Looper.myLooper();
        this.f9354f = new r((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        l1 l1Var = new l1();
        this.f9352b = l1Var;
        this.f9353c = new n1();
        ?? obj = new Object();
        obj.f9347a = l1Var;
        e9.l0 l0Var = n0.f6390b;
        obj.f9348b = x1.e;
        obj.f9349c = c2.h;
        this.d = obj;
        this.e = new SparseArray();
    }

    @Override
    public final void A(d2.d dVar) {
        a Q = Q();
        V(Q, 27, new c(Q, dVar, 14));
    }

    @Override
    public final void B(int i10, u2.g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        a T = T(i10, g0Var);
        V(T, 1003, new ig.c0(T, uVar, c0Var, iOException, z10));
    }

    @Override
    public final void C(int i10, p0 p0Var) {
        a Q = Q();
        V(Q, 1, new e(Q, p0Var, i10));
    }

    @Override
    public final void E(int i10, u2.g0 g0Var) {
        a T = T(i10, g0Var);
        V(T, 1027, new e(T, 6));
    }

    @Override
    public final void F(u0 u0Var) {
        a Q = Q();
        V(Q, 28, new c(Q, u0Var, 2));
    }

    @Override
    public final void G(int i10, u2.g0 g0Var, u uVar, c0 c0Var, int i11) {
        a T = T(i10, g0Var);
        V(T, 1000, new c(T, uVar, c0Var, i11));
    }

    @Override
    public final void H(y0 y0Var) {
        a Q;
        u2.g0 g0Var;
        if ((y0Var instanceof i2.l) && (g0Var = ((i2.l) y0Var).E) != null) {
            Q = S(g0Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new ig.c0(Q, y0Var, 2));
    }

    @Override
    public final void I(List list) {
        a Q = Q();
        V(Q, 27, new z(Q, list));
    }

    @Override
    public final void J(int i10, u2.g0 g0Var) {
        a T = T(i10, g0Var);
        V(T, 1025, new e(T, 14));
    }

    @Override
    public final void K(int i10, boolean z10) {
        a Q = Q();
        V(Q, -1, new c(Q, z10, i10, 0));
    }

    @Override
    public final void L(int i10, u2.g0 g0Var, u uVar, c0 c0Var) {
        a T = T(i10, g0Var);
        V(T, 1002, new c(T, (Object) uVar, (Object) c0Var, 24));
    }

    @Override
    public final void M(int i10, int i11) {
        a U = U();
        V(U, 24, new c(U, i10, i11));
    }

    @Override
    public final void N(w1 w1Var) {
        a Q = Q();
        V(Q, 2, new c(Q, w1Var, 8));
    }

    @Override
    public final void O(o1 o1Var, int i10) {
        f1 f1Var = this.h;
        f1Var.getClass();
        f fVar = this.d;
        fVar.d = f.o(f1Var, (n0) fVar.f9348b, (u2.g0) fVar.e, (l1) fVar.f9347a);
        fVar.G(f1Var.y0());
        a Q = Q();
        V(Q, 0, new e(Q, i10, 19));
    }

    @Override
    public final void P(boolean z10) {
        a Q = Q();
        V(Q, 7, new c(Q, z10));
    }

    public final a Q() {
        return S((u2.g0) this.d.d);
    }

    public final a R(o1 o1Var, int i10, u2.g0 g0Var) {
        u2.g0 g0Var2;
        boolean z10;
        if (o1Var.p()) {
            g0Var2 = null;
        } else {
            g0Var2 = g0Var;
        }
        this.f9351a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (o1Var.equals(this.h.y0()) && i10 == this.h.m0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = 0;
        if (g0Var2 != null && g0Var2.b()) {
            if (z10 && this.h.l0() == g0Var2.f49876b && this.h.N() == g0Var2.f49877c) {
                j10 = this.h.M0();
            }
        } else if (z10) {
            j10 = this.h.Z();
        } else if (!o1Var.p()) {
            j10 = l0.h0(o1Var.m(i10, this.f9353c, 0L).f2145l);
        }
        return new a(elapsedRealtime, o1Var, i10, g0Var2, j10, this.h.y0(), this.h.m0(), (u2.g0) this.d.d, this.h.M0(), this.h.q());
    }

    public final a S(u2.g0 g0Var) {
        o1 o1Var;
        this.h.getClass();
        if (g0Var == null) {
            o1Var = null;
        } else {
            o1Var = (o1) ((c2) this.d.f9349c).get(g0Var);
        }
        if (g0Var != null && o1Var != null) {
            return R(o1Var, o1Var.g(g0Var.f49875a, this.f9352b).f2109c, g0Var);
        }
        int m0 = this.h.m0();
        o1 y02 = this.h.y0();
        if (m0 >= y02.o()) {
            y02 = o1.f2172a;
        }
        return R(y02, m0, null);
    }

    public final a T(int i10, u2.g0 g0Var) {
        this.h.getClass();
        if (g0Var != null) {
            if (((o1) ((c2) this.d.f9349c).get(g0Var)) != null) {
                return S(g0Var);
            }
            return R(o1.f2172a, i10, g0Var);
        }
        o1 y02 = this.h.y0();
        if (i10 >= y02.o()) {
            y02 = o1.f2172a;
        }
        return R(y02, i10, null);
    }

    public final a U() {
        return S((u2.g0) this.d.f9350f);
    }

    public final void V(a aVar, int i10, o oVar) {
        this.e.put(i10, aVar);
        this.f9354f.e(i10, oVar);
    }

    public final void W(i2.i0 i0Var, Looper looper) {
        boolean z10;
        boolean z11 = true;
        if (this.h != null && !((n0) this.d.f9348b).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        t6.p(z10);
        i0Var.getClass();
        this.h = i0Var;
        this.f9355n = this.f9351a.a(looper, null);
        r rVar = this.f9354f;
        m mVar = new m(12, this, i0Var);
        rVar.getClass();
        g0 g0Var = this.f9351a;
        if (g0Var == null) {
            z11 = false;
        }
        t6.p(z11);
        this.f9354f = new r(rVar.d, looper, looper.getThread(), g0Var, mVar, rVar.f6193i);
    }

    @Override
    public final void a(int i10) {
        a U = U();
        V(U, 21, new e(U, i10, 1));
    }

    @Override
    public final void b(int i10, u2.g0 g0Var, int i11) {
        a T = T(i10, g0Var);
        V(T, 1022, new c(T, i11, 26, (char) 0));
    }

    @Override
    public final void c(int i10) {
        a Q = Q();
        V(Q, 8, new c(Q, i10, 13, (char) 0));
    }

    @Override
    public final void d(b2 b2Var) {
        a U = U();
        V(U, 25, new b0(U, b2Var));
    }

    @Override
    public final void e(boolean z10) {
        a U = U();
        V(U, 23, new e(U, z10, 9));
    }

    @Override
    public final void f(int i10) {
        a Q = Q();
        V(Q, 6, new c(Q, i10, 5, (char) 0));
    }

    @Override
    public final void i(s0 s0Var) {
        a Q = Q();
        V(Q, 15, new e(Q, s0Var, 15));
    }

    @Override
    public final void j(int i10, u2.g0 g0Var, Exception exc) {
        a T = T(i10, g0Var);
        V(T, 1024, new c(T, exc, 27));
    }

    @Override
    public final void k(boolean z10) {
        a Q = Q();
        V(Q, 3, new e(Q, z10, 2));
    }

    @Override
    public final void l(int i10, u2.g0 g0Var, oa.d dVar) {
        a T = T(i10, g0Var);
        V(T, 1023, new e(T, dVar, 13));
    }

    @Override
    public final void m(s0 s0Var) {
        a Q = Q();
        V(Q, 14, new c(Q, s0Var, 21));
    }

    @Override
    public final void n(int i10, u2.g0 g0Var, c0 c0Var) {
        a T = T(i10, g0Var);
        V(T, 1005, new e(T, c0Var, 5));
    }

    @Override
    public final void o(int i10, boolean z10) {
        a Q = Q();
        V(Q, 5, new c(Q, z10, i10, 9));
    }

    @Override
    public final void p(b1 b1Var) {
        a Q = Q();
        V(Q, 13, new e(Q, b1Var, 18));
    }

    @Override
    public final void q(float f7) {
        a U = U();
        V(U, 22, new e(U, f7));
    }

    @Override
    public final void r(int i10, u2.g0 g0Var, c0 c0Var) {
        a T = T(i10, g0Var);
        V(T, 1004, new m(13, T, c0Var));
    }

    @Override
    public final void s(e1 e1Var, e1 e1Var2, int i10) {
        if (i10 == 1) {
            this.f9356r = false;
        }
        f1 f1Var = this.h;
        f1Var.getClass();
        f fVar = this.d;
        fVar.d = f.o(f1Var, (n0) fVar.f9348b, (u2.g0) fVar.e, (l1) fVar.f9347a);
        a Q = Q();
        V(Q, 11, new q(Q, i10, e1Var, e1Var2));
    }

    @Override
    public final void t(int i10, u2.g0 g0Var, u uVar, c0 c0Var) {
        a T = T(i10, g0Var);
        V(T, 1001, new c(T, (Object) uVar, (Object) c0Var, 28));
    }

    @Override
    public final void u(int i10) {
        a Q = Q();
        V(Q, 4, new c(Q, i10, 12, (char) 0));
    }

    @Override
    public final void v(y0 y0Var) {
        a Q;
        u2.g0 g0Var;
        if ((y0Var instanceof i2.l) && (g0Var = ((i2.l) y0Var).E) != null) {
            Q = S(g0Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new c(Q, y0Var, 7));
    }

    @Override
    public final void w(u1 u1Var) {
        a Q = Q();
        V(Q, 19, new e(Q, u1Var, 8));
    }

    @Override
    public final void x(boolean z10) {
        a Q = Q();
        V(Q, 9, new e(Q, z10, 16));
    }

    @Override
    public final void y(b2.f fVar) {
        a U = U();
        V(U, 20, new c(U, fVar, 1));
    }

    @Override
    public final void z(z0 z0Var) {
        a Q = Q();
        V(Q, 12, new d2.c(Q, z0Var, 28));
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void D(c1 c1Var) {
    }

    @Override
    public final void g(boolean z10) {
    }

    @Override
    public final void h(int i10) {
    }
}
