package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class qg2 extends age {
    public int a;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final wg2 m;
    public final SparseIntArray b = new SparseIntArray();
    public final SparseIntArray c = new SparseIntArray();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public qg2(wg2 wg2Var) {
        this.m = wg2Var;
    }

    public static void f(int i, int i2, SparseIntArray sparseIntArray) {
        if (i2 >= 0) {
            sparseIntArray.put(i2, i);
        }
    }

    @Override
    public final boolean a(int i, int i2) {
        if (b(i, i2) && this.m.D0 != i2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i, int i2) {
        int i3 = this.h;
        wg2 wg2Var = this.m;
        if (i >= i3 && i < this.i && i2 >= wg2Var.X0 && i2 < wg2Var.Y0) {
            return ((TLObject) this.k.get(i - i3)).equals(wg2Var.G.get(i2 - wg2Var.X0));
        }
        int i4 = this.f;
        if (i >= i4 && i < this.g && i2 >= wg2Var.U0 && i2 < wg2Var.V0) {
            return ((TLObject) this.l.get(i - i4)).equals(wg2Var.H.get(i2 - wg2Var.U0));
        }
        int i5 = this.d;
        if (i >= i5 && i < this.e && i2 >= wg2Var.E0 && i2 < wg2Var.F0) {
            return ((TLObject) this.j.get(i - i5)).equals(wg2Var.F.get(i2 - wg2Var.E0));
        }
        if (this.b.get(i) == this.c.get(i2)) {
            return true;
        }
        return false;
    }

    @Override
    public final int c() {
        return this.m.d1;
    }

    @Override
    public final int d() {
        return this.a;
    }

    public final void e(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        wg2 wg2Var = this.m;
        f(1, wg2Var.v0, sparseIntArray);
        f(2, wg2Var.z0, sparseIntArray);
        f(3, wg2Var.A0, sparseIntArray);
        f(4, wg2Var.C0, sparseIntArray);
        f(5, wg2Var.D0, sparseIntArray);
        f(6, wg2Var.G0, sparseIntArray);
        f(7, wg2Var.H0, sparseIntArray);
        f(8, wg2Var.s0, sparseIntArray);
        f(9, wg2Var.t0, sparseIntArray);
        f(10, wg2Var.u0, sparseIntArray);
        f(11, wg2Var.b1, sparseIntArray);
        f(12, wg2Var.c1, sparseIntArray);
        f(13, wg2Var.S, sparseIntArray);
        f(14, wg2Var.T, sparseIntArray);
        f(15, wg2Var.U, sparseIntArray);
        f(16, wg2Var.e0, sparseIntArray);
        f(17, wg2Var.d0, sparseIntArray);
        f(18, wg2Var.f0, sparseIntArray);
        f(19, wg2Var.h0, sparseIntArray);
        f(20, wg2Var.m0, sparseIntArray);
        f(21, wg2Var.i0, sparseIntArray);
        f(22, wg2Var.j0, sparseIntArray);
        int i = 23;
        f(23, wg2Var.k0, sparseIntArray);
        if (wg2Var.x) {
            i = 24;
            f(24, wg2Var.l0, sparseIntArray);
        }
        f(i + 1, wg2Var.g0, sparseIntArray);
        f(i + 2, wg2Var.B0, sparseIntArray);
        f(i + 3, wg2Var.T0, sparseIntArray);
        f(i + 4, wg2Var.W0, sparseIntArray);
        f(i + 5, wg2Var.Z0, sparseIntArray);
        f(i + 6, wg2Var.N0, sparseIntArray);
        f(i + 7, wg2Var.O0, sparseIntArray);
        f(i + 8, wg2Var.P0, sparseIntArray);
        f(i + 9, wg2Var.Q0, sparseIntArray);
        f(i + 10, wg2Var.S0, sparseIntArray);
        f(i + 11, wg2Var.R0, sparseIntArray);
        f(i + 12, wg2Var.a1, sparseIntArray);
        f(i + 13, wg2Var.f1, sparseIntArray);
        f(i + 14, wg2Var.g1, sparseIntArray);
        f(i + 15, wg2Var.h1, sparseIntArray);
        f(i + 16, wg2Var.i1, sparseIntArray);
        f(i + 17, wg2Var.j1, sparseIntArray);
        f(i + 18, wg2Var.n0, sparseIntArray);
        f(i + 19, wg2Var.o0, sparseIntArray);
        f(i + 20, wg2Var.p0, sparseIntArray);
        f(i + 21, wg2Var.q0, sparseIntArray);
        f(i + 22, wg2Var.r0, sparseIntArray);
    }
}
