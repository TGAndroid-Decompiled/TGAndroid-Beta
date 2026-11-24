package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
public final class xa3 implements pe8, vz6, gs3 {
    public final bfb a;
    public final ypb b;
    public final aqb c;
    public final eq d;
    public final SparseArray e;
    public a86 f;
    public h74 h;
    public dfb n;
    public boolean r;

    public xa3(bfb bfbVar) {
        bfbVar.getClass();
        this.a = bfbVar;
        this.f = new a86(hac.z().getThread());
        ypb ypbVar = new ypb();
        this.b = ypbVar;
        this.c = new aqb();
        ?? obj = new Object();
        obj.a = ypbVar;
        ko5 ko5Var = mo5.b;
        obj.b = y79.e;
        obj.c = d89.h;
        this.d = obj;
        this.e = new SparseArray();
    }

    @Override
    public final void A(int i, qe8 qe8Var, qe8 qe8Var2) {
        if (i == 1) {
            this.r = false;
        }
        h74 h74Var = this.h;
        h74Var.getClass();
        eq eqVar = this.d;
        eqVar.d = eq.e(h74Var, (mo5) eqVar.b, (rz6) eqVar.e, (ypb) eqVar.a);
        tk Q = Q();
        V(Q, 11, new ta3(Q, i, qe8Var, qe8Var2));
    }

    @Override
    public final void B(jt6 jt6Var) {
        tk Q = Q();
        V(Q, 14, new ua3(Q, jt6Var, (byte) 4));
    }

    @Override
    public final void C(jt6 jt6Var) {
        tk Q = Q();
        V(Q, 15, new ua3(Q, jt6Var, (byte) 28));
    }

    @Override
    public final void D(bqb bqbVar, int i) {
        h74 h74Var = this.h;
        h74Var.getClass();
        eq eqVar = this.d;
        eqVar.d = eq.e(h74Var, (mo5) eqVar.b, (rz6) eqVar.e, (ypb) eqVar.a);
        eqVar.q(h74Var.y0());
        tk Q = Q();
        V(Q, 0, new wa3(Q, i));
    }

    @Override
    public final void E(u64 u64Var) {
        tk Q;
        rz6 rz6Var;
        if ((u64Var instanceof u64) && (rz6Var = u64Var.r) != null) {
            Q = R(rz6Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new u03(Q, u64Var, (byte) 19));
    }

    @Override
    public final void F(u64 u64Var) {
        tk Q;
        rz6 rz6Var;
        if ((u64Var instanceof u64) && (rz6Var = u64Var.r) != null) {
            Q = R(rz6Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new wm2(Q, u64Var, (byte) 16));
    }

    @Override
    public final void G(y79 y79Var) {
        tk Q = Q();
        V(Q, 27, new u03(Q, y79Var, (byte) 23));
    }

    @Override
    public final void H(int i, boolean z) {
        tk Q = Q();
        V(Q, -1, new u03(Q, z, i, (byte) 12));
    }

    @Override
    public final void I(int i, rz6 rz6Var) {
        tk T = T(i, rz6Var);
        V(T, 1027, new ua3(T, (byte) 19));
    }

    @Override
    public final void J(ce8 ce8Var) {
        tk Q = Q();
        V(Q, 12, new u03(Q, ce8Var, (byte) 10));
    }

    @Override
    public final void K(ne8 ne8Var) {
        tk Q = Q();
        V(Q, 13, new wa3(Q, ne8Var, (byte) 1));
    }

    @Override
    public final void L(nf7 nf7Var) {
        tk Q = Q();
        V(Q, 28, new u03(Q, nf7Var, (byte) 14));
    }

    @Override
    public final void M(int i, int i2) {
        tk U = U();
        V(U, 24, new ua3(U, i, i2));
    }

    @Override
    public final void N(int i, rz6 rz6Var, jk2 jk2Var) {
        tk T = T(i, rz6Var);
        V(T, 1023, new ua3(T, jk2Var, (byte) 26));
    }

    @Override
    public final void O(int i, rz6 rz6Var, ea6 ea6Var, ft6 ft6Var, int i2) {
        tk T = T(i, rz6Var);
        V(T, 1000, new ua3(T, ea6Var, ft6Var, i2));
    }

    @Override
    public final void P(boolean z) {
        tk Q = Q();
        V(Q, 7, new u03(Q, z));
    }

    public final tk Q() {
        return R((rz6) this.d.d);
    }

    public final tk R(rz6 rz6Var) {
        bqb bqbVar;
        this.h.getClass();
        if (rz6Var == null) {
            bqbVar = null;
        } else {
            bqbVar = (bqb) ((d89) this.d.c).get(rz6Var);
        }
        if (rz6Var != null && bqbVar != null) {
            return S(bqbVar, bqbVar.g(rz6Var.a, this.b).c, rz6Var);
        }
        int l0 = this.h.l0();
        bqb y0 = this.h.y0();
        if (l0 >= y0.o()) {
            y0 = bqb.a;
        }
        return S(y0, l0, null);
    }

    public final tk S(bqb bqbVar, int i, rz6 rz6Var) {
        rz6 rz6Var2;
        boolean z;
        if (bqbVar.p()) {
            rz6Var2 = null;
        } else {
            rz6Var2 = rz6Var;
        }
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (bqbVar.equals(this.h.y0()) && i == this.h.l0()) {
            z = true;
        } else {
            z = false;
        }
        long j = 0;
        if (rz6Var2 != null && rz6Var2.c()) {
            if (z && this.h.k0() == rz6Var2.b && this.h.L() == rz6Var2.c) {
                j = this.h.k();
            }
        } else if (z) {
            j = this.h.Y();
        } else if (!bqbVar.p()) {
            j = hac.i0(bqbVar.m(i, this.c, 0L).k);
        }
        return new tk(elapsedRealtime, bqbVar, i, rz6Var2, j, this.h.y0(), this.h.l0(), (rz6) this.d.d, this.h.k(), this.h.o());
    }

    public final tk T(int i, rz6 rz6Var) {
        this.h.getClass();
        if (rz6Var != null) {
            if (((bqb) ((d89) this.d.c).get(rz6Var)) != null) {
                return R(rz6Var);
            }
            return S(bqb.a, i, rz6Var);
        }
        bqb y0 = this.h.y0();
        if (i >= y0.o()) {
            y0 = bqb.a;
        }
        return S(y0, i, null);
    }

    public final tk U() {
        return R((rz6) this.d.f);
    }

    public final void V(tk tkVar, int i, x76 x76Var) {
        this.e.put(i, tkVar);
        this.f.e(i, x76Var);
    }

    public final void W(h74 h74Var, Looper looper) {
        boolean z;
        boolean z2 = true;
        if (this.h != null && !((mo5) this.d.b).isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        jte.p(z);
        this.h = h74Var;
        this.n = this.a.a(looper, null);
        a86 a86Var = this.f;
        x92 x92Var = new x92(this, h74Var, (byte) 16);
        bfb bfbVar = this.a;
        if (bfbVar == null) {
            z2 = false;
        }
        jte.p(z2);
        this.f = new a86(a86Var.d, looper, looper.getThread(), bfbVar, x92Var, a86Var.i);
    }

    @Override
    public final void a(jec jecVar) {
        tk U = U();
        V(U, 25, new va3(U, jecVar));
    }

    @Override
    public final void b(int i) {
        tk U = U();
        V(U, 21, new ua3(U, i, (byte) 14));
    }

    @Override
    public final void c(int i) {
        tk Q = Q();
        V(Q, 6, new u03(Q, i, (byte) 17));
    }

    @Override
    public final void f(boolean z) {
        tk U = U();
        V(U, 23, new ua3(U, z, (byte) 22));
    }

    @Override
    public final void g(int i) {
        tk Q = Q();
        V(Q, 8, new u03(Q, i, (byte) 26));
    }

    @Override
    public final void i(int i, rz6 rz6Var, Exception exc) {
        tk T = T(i, rz6Var);
        V(T, 1024, new ua3(T, exc, (byte) 10));
    }

    @Override
    public final void j(int i, rz6 rz6Var, ft6 ft6Var) {
        tk T = T(i, rz6Var);
        V(T, 1004, new x92((Object) T, (Object) ft6Var, (byte) 17));
    }

    @Override
    public final void k(int i, rz6 rz6Var, ft6 ft6Var) {
        tk T = T(i, rz6Var);
        V(T, 1005, new ua3(T, ft6Var, (byte) 18));
    }

    @Override
    public final void l(o00 o00Var) {
        tk U = U();
        V(U, 20, new u03(U, o00Var, (byte) 13));
    }

    @Override
    public final void m(d0c d0cVar) {
        tk Q = Q();
        V(Q, 19, new ua3(Q, d0cVar, (byte) 21));
    }

    @Override
    public final void n(int i, rz6 rz6Var, int i2) {
        tk T = T(i, rz6Var);
        V(T, 1022, new ua3(T, i2, (byte) 9));
    }

    @Override
    public final void o(boolean z) {
        tk Q = Q();
        V(Q, 3, new ua3(Q, z, (byte) 15));
    }

    @Override
    public final void p(int i, boolean z) {
        tk Q = Q();
        V(Q, 5, new u03(Q, z, i, (byte) 21));
    }

    @Override
    public final void q(float f) {
        tk U = U();
        V(U, 22, new wa3(U, f));
    }

    @Override
    public final void r(int i, bt6 bt6Var) {
        tk Q = Q();
        V(Q, 1, new wa3(Q, bt6Var, i));
    }

    @Override
    public final void s(int i, rz6 rz6Var, ea6 ea6Var, ft6 ft6Var) {
        tk T = T(i, rz6Var);
        V(T, 1002, new ua3(T, (Object) ea6Var, (Object) ft6Var, (byte) 7));
    }

    @Override
    public final void t(int i) {
        tk Q = Q();
        V(Q, 4, new u03(Q, i, (byte) 25));
    }

    @Override
    public final void u(int i, rz6 rz6Var, ea6 ea6Var, ft6 ft6Var) {
        tk T = T(i, rz6Var);
        V(T, 1001, new ua3(T, (Object) ea6Var, (Object) ft6Var, (byte) 11));
    }

    @Override
    public final void v(boolean z) {
        tk Q = Q();
        V(Q, 9, new ua3(Q, z, (byte) 29));
    }

    @Override
    public final void w(int i, rz6 rz6Var, ea6 ea6Var, ft6 ft6Var, IOException iOException, boolean z) {
        tk T = T(i, rz6Var);
        V(T, 1003, new wm2(T, ea6Var, ft6Var, iOException, z));
    }

    @Override
    public final void x(g53 g53Var) {
        tk Q = Q();
        V(Q, 27, new u03(Q, g53Var, (byte) 27));
    }

    @Override
    public final void y(int i, rz6 rz6Var) {
        tk T = T(i, rz6Var);
        V(T, 1025, new ua3(T, (byte) 27));
    }

    @Override
    public final void z(g0c g0cVar) {
        tk Q = Q();
        V(Q, 2, new u03(Q, g0cVar, (byte) 20));
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void d(oe8 oe8Var) {
    }

    @Override
    public final void e(boolean z) {
    }

    @Override
    public final void h(int i) {
    }
}
