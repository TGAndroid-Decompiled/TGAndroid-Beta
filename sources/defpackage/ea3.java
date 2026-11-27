package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
public final class ea3 implements bg8, zz6, nr3 {
    public final vgb a;
    public final xrb b;
    public final zrb c;
    public final fp d;
    public final SparseArray e;
    public e86 f;
    public s64 h;
    public xgb n;
    public boolean r;

    public ea3(vgb vgbVar) {
        vgbVar.getClass();
        this.a = vgbVar;
        this.f = new e86(gcc.z().getThread());
        xrb xrbVar = new xrb();
        this.b = xrbVar;
        this.c = new zrb();
        ?? obj = new Object();
        obj.a = xrbVar;
        no5 no5Var = po5.b;
        obj.b = j99.e;
        obj.c = o99.h;
        this.d = obj;
        this.e = new SparseArray();
    }

    @Override
    public final void A(int i, cg8 cg8Var, cg8 cg8Var2) {
        if (i == 1) {
            this.r = false;
        }
        s64 s64Var = this.h;
        s64Var.getClass();
        fp fpVar = this.d;
        fpVar.d = fp.e(s64Var, (po5) fpVar.b, (vz6) fpVar.e, (xrb) fpVar.a);
        uj Q = Q();
        V(Q, 11, new ba3(Q, i, cg8Var, cg8Var2));
    }

    @Override
    public final void B(nt6 nt6Var) {
        uj Q = Q();
        V(Q, 14, new aa3(Q, nt6Var, (byte) 9));
    }

    @Override
    public final void C(nt6 nt6Var) {
        uj Q = Q();
        V(Q, 15, new da3(Q, nt6Var, (byte) 3));
    }

    @Override
    public final void D(asb asbVar, int i) {
        s64 s64Var = this.h;
        s64Var.getClass();
        fp fpVar = this.d;
        fpVar.d = fp.e(s64Var, (po5) fpVar.b, (vz6) fpVar.e, (xrb) fpVar.a);
        fpVar.q(s64Var.y0());
        uj Q = Q();
        V(Q, 0, new da3(Q, i));
    }

    @Override
    public final void E(e64 e64Var) {
        uj Q;
        vz6 vz6Var;
        if ((e64Var instanceof e64) && (vz6Var = e64Var.r) != null) {
            Q = R(vz6Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new uy2(Q, e64Var, (byte) 24));
    }

    @Override
    public final void F(e64 e64Var) {
        uj Q;
        vz6 vz6Var;
        if ((e64Var instanceof e64) && (vz6Var = e64Var.r) != null) {
            Q = R(vz6Var);
        } else {
            Q = Q();
        }
        V(Q, 10, new ht2(Q, e64Var, (byte) 15));
    }

    @Override
    public final void G(j99 j99Var) {
        uj Q = Q();
        V(Q, 27, new uy2(Q, j99Var, (byte) 28));
    }

    @Override
    public final void H(int i, boolean z) {
        uj Q = Q();
        V(Q, -1, new uy2(Q, z, i, (byte) 17));
    }

    @Override
    public final void I(int i, vz6 vz6Var) {
        uj T = T(i, vz6Var);
        V(T, 1027, new aa3(T, (byte) 24));
    }

    @Override
    public final void J(of8 of8Var) {
        uj Q = Q();
        V(Q, 12, new uy2(Q, of8Var, (byte) 15));
    }

    @Override
    public final void K(zf8 zf8Var) {
        uj Q = Q();
        V(Q, 13, new da3(Q, zf8Var, (byte) 6));
    }

    @Override
    public final void L(uf7 uf7Var) {
        uj Q = Q();
        V(Q, 28, new uy2(Q, uf7Var, (byte) 19));
    }

    @Override
    public final void M(int i, int i2) {
        uj U = U();
        V(U, 24, new aa3(U, i, i2));
    }

    @Override
    public final void N(int i, vz6 vz6Var, rj2 rj2Var) {
        uj T = T(i, vz6Var);
        V(T, 1023, new da3(T, rj2Var, (byte) 1));
    }

    @Override
    public final void O(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var, int i2) {
        uj T = T(i, vz6Var);
        V(T, 1000, new aa3(T, ja6Var, jt6Var, i2));
    }

    @Override
    public final void P(boolean z) {
        uj Q = Q();
        V(Q, 7, new uy2(Q, z));
    }

    public final uj Q() {
        return R((vz6) this.d.d);
    }

    public final uj R(vz6 vz6Var) {
        asb asbVar;
        this.h.getClass();
        if (vz6Var == null) {
            asbVar = null;
        } else {
            asbVar = (asb) ((o99) this.d.c).get(vz6Var);
        }
        if (vz6Var != null && asbVar != null) {
            return S(asbVar, asbVar.g(vz6Var.a, this.b).c, vz6Var);
        }
        int l0 = this.h.l0();
        asb y0 = this.h.y0();
        if (l0 >= y0.o()) {
            y0 = asb.a;
        }
        return S(y0, l0, null);
    }

    public final uj S(asb asbVar, int i, vz6 vz6Var) {
        vz6 vz6Var2;
        boolean z;
        if (asbVar.p()) {
            vz6Var2 = null;
        } else {
            vz6Var2 = vz6Var;
        }
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (asbVar.equals(this.h.y0()) && i == this.h.l0()) {
            z = true;
        } else {
            z = false;
        }
        long j = 0;
        if (vz6Var2 != null && vz6Var2.c()) {
            if (z && this.h.k0() == vz6Var2.b && this.h.L() == vz6Var2.c) {
                j = this.h.k();
            }
        } else if (z) {
            j = this.h.Y();
        } else if (!asbVar.p()) {
            j = gcc.i0(asbVar.m(i, this.c, 0L).k);
        }
        return new uj(elapsedRealtime, asbVar, i, vz6Var2, j, this.h.y0(), this.h.l0(), (vz6) this.d.d, this.h.k(), this.h.o());
    }

    public final uj T(int i, vz6 vz6Var) {
        this.h.getClass();
        if (vz6Var != null) {
            if (((asb) ((o99) this.d.c).get(vz6Var)) != null) {
                return R(vz6Var);
            }
            return S(asb.a, i, vz6Var);
        }
        asb y0 = this.h.y0();
        if (i >= y0.o()) {
            y0 = asb.a;
        }
        return S(y0, i, null);
    }

    public final uj U() {
        return R((vz6) this.d.f);
    }

    public final void V(uj ujVar, int i, b86 b86Var) {
        this.e.put(i, ujVar);
        this.f.e(i, b86Var);
    }

    public final void W(s64 s64Var, Looper looper) {
        boolean z;
        boolean z2 = true;
        if (this.h != null && !((po5) this.d.b).isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        yve.p(z);
        this.h = s64Var;
        this.n = this.a.a(looper, null);
        e86 e86Var = this.f;
        q72 q72Var = new q72(this, s64Var, (byte) 19);
        vgb vgbVar = this.a;
        if (vgbVar == null) {
            z2 = false;
        }
        yve.p(z2);
        this.f = new e86(e86Var.d, looper, looper.getThread(), vgbVar, q72Var, e86Var.i);
    }

    @Override
    public final void a(ggc ggcVar) {
        uj U = U();
        V(U, 25, new ca3(U, ggcVar));
    }

    @Override
    public final void b(int i) {
        uj Q = Q();
        V(Q, 6, new uy2(Q, i, (byte) 22));
    }

    @Override
    public final void d(int i) {
        uj U = U();
        V(U, 21, new aa3(U, i, (byte) 19));
    }

    @Override
    public final void g(int i) {
        uj Q = Q();
        V(Q, 8, new aa3(Q, i, (byte) 1));
    }

    @Override
    public final void h(boolean z) {
        uj U = U();
        V(U, 23, new aa3(U, z, (byte) 27));
    }

    @Override
    public final void i(int i, vz6 vz6Var, Exception exc) {
        uj T = T(i, vz6Var);
        V(T, 1024, new aa3(T, exc, (byte) 15));
    }

    @Override
    public final void j(int i, vz6 vz6Var, jt6 jt6Var) {
        uj T = T(i, vz6Var);
        V(T, 1004, new q72((Object) T, (Object) jt6Var, (byte) 20));
    }

    @Override
    public final void k(int i, vz6 vz6Var, jt6 jt6Var) {
        uj T = T(i, vz6Var);
        V(T, 1005, new aa3(T, jt6Var, (byte) 23));
    }

    @Override
    public final void l(oz ozVar) {
        uj U = U();
        V(U, 20, new uy2(U, ozVar, (byte) 18));
    }

    @Override
    public final void m(c2c c2cVar) {
        uj Q = Q();
        V(Q, 19, new aa3(Q, c2cVar, (byte) 26));
    }

    @Override
    public final void n(int i, vz6 vz6Var, int i2) {
        uj T = T(i, vz6Var);
        V(T, 1022, new aa3(T, i2, (byte) 14));
    }

    @Override
    public final void o(boolean z) {
        uj Q = Q();
        V(Q, 3, new aa3(Q, z, (byte) 20));
    }

    @Override
    public final void p(int i, boolean z) {
        uj Q = Q();
        V(Q, 5, new uy2(Q, z, i, (byte) 26));
    }

    @Override
    public final void q(float f) {
        uj U = U();
        V(U, 22, new da3(U, f));
    }

    @Override
    public final void r(int i, ft6 ft6Var) {
        uj Q = Q();
        V(Q, 1, new da3(Q, ft6Var, i));
    }

    @Override
    public final void s(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var) {
        uj T = T(i, vz6Var);
        V(T, 1002, new aa3(T, (Object) ja6Var, (Object) jt6Var, (byte) 12));
    }

    @Override
    public final void t(int i) {
        uj Q = Q();
        V(Q, 4, new aa3(Q, i, (byte) 0));
    }

    @Override
    public final void u(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var) {
        uj T = T(i, vz6Var);
        V(T, 1001, new aa3(T, (Object) ja6Var, (Object) jt6Var, (byte) 16));
    }

    @Override
    public final void v(boolean z) {
        uj Q = Q();
        V(Q, 9, new da3(Q, z));
    }

    @Override
    public final void w(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var, IOException iOException, boolean z) {
        uj T = T(i, vz6Var);
        V(T, 1003, new ht2(T, ja6Var, jt6Var, iOException, z));
    }

    @Override
    public final void x(n43 n43Var) {
        uj Q = Q();
        V(Q, 27, new aa3(Q, n43Var, (byte) 2));
    }

    @Override
    public final void y(int i, vz6 vz6Var) {
        uj T = T(i, vz6Var);
        V(T, 1025, new da3(T));
    }

    @Override
    public final void z(f2c f2cVar) {
        uj Q = Q();
        V(Q, 2, new uy2(Q, f2cVar, (byte) 25));
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void c(ag8 ag8Var) {
    }

    @Override
    public final void e(boolean z) {
    }

    @Override
    public final void f(int i) {
    }
}
