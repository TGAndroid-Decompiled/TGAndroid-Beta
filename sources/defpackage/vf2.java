package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class vf2 extends qie {
    public int a;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final bg2 m;
    public final SparseIntArray b = new SparseIntArray();
    public final SparseIntArray c = new SparseIntArray();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public vf2(bg2 bg2Var) {
        this.m = bg2Var;
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
        bg2 bg2Var = this.m;
        if (i >= i3 && i < this.i && i2 >= bg2Var.X0 && i2 < bg2Var.Y0) {
            return ((TLObject) this.k.get(i - i3)).equals(bg2Var.G.get(i2 - bg2Var.X0));
        }
        int i4 = this.f;
        if (i >= i4 && i < this.g && i2 >= bg2Var.U0 && i2 < bg2Var.V0) {
            return ((TLObject) this.l.get(i - i4)).equals(bg2Var.H.get(i2 - bg2Var.U0));
        }
        int i5 = this.d;
        if (i >= i5 && i < this.e && i2 >= bg2Var.E0 && i2 < bg2Var.F0) {
            return ((TLObject) this.j.get(i - i5)).equals(bg2Var.F.get(i2 - bg2Var.E0));
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
        bg2 bg2Var = this.m;
        f(1, bg2Var.v0, sparseIntArray);
        f(2, bg2Var.z0, sparseIntArray);
        f(3, bg2Var.A0, sparseIntArray);
        f(4, bg2Var.C0, sparseIntArray);
        f(5, bg2Var.D0, sparseIntArray);
        f(6, bg2Var.G0, sparseIntArray);
        f(7, bg2Var.H0, sparseIntArray);
        f(8, bg2Var.s0, sparseIntArray);
        f(9, bg2Var.t0, sparseIntArray);
        f(10, bg2Var.u0, sparseIntArray);
        f(11, bg2Var.b1, sparseIntArray);
        f(12, bg2Var.c1, sparseIntArray);
        f(13, bg2Var.S, sparseIntArray);
        f(14, bg2Var.T, sparseIntArray);
        f(15, bg2Var.U, sparseIntArray);
        f(16, bg2Var.e0, sparseIntArray);
        f(17, bg2Var.d0, sparseIntArray);
        f(18, bg2Var.f0, sparseIntArray);
        f(19, bg2Var.h0, sparseIntArray);
        f(20, bg2Var.m0, sparseIntArray);
        f(21, bg2Var.i0, sparseIntArray);
        f(22, bg2Var.j0, sparseIntArray);
        int i = 23;
        f(23, bg2Var.k0, sparseIntArray);
        if (bg2Var.x) {
            i = 24;
            f(24, bg2Var.l0, sparseIntArray);
        }
        f(i + 1, bg2Var.g0, sparseIntArray);
        f(i + 2, bg2Var.B0, sparseIntArray);
        f(i + 3, bg2Var.T0, sparseIntArray);
        f(i + 4, bg2Var.W0, sparseIntArray);
        f(i + 5, bg2Var.Z0, sparseIntArray);
        f(i + 6, bg2Var.N0, sparseIntArray);
        f(i + 7, bg2Var.O0, sparseIntArray);
        f(i + 8, bg2Var.P0, sparseIntArray);
        f(i + 9, bg2Var.Q0, sparseIntArray);
        f(i + 10, bg2Var.S0, sparseIntArray);
        f(i + 11, bg2Var.R0, sparseIntArray);
        f(i + 12, bg2Var.a1, sparseIntArray);
        f(i + 13, bg2Var.f1, sparseIntArray);
        f(i + 14, bg2Var.g1, sparseIntArray);
        f(i + 15, bg2Var.h1, sparseIntArray);
        f(i + 16, bg2Var.i1, sparseIntArray);
        f(i + 17, bg2Var.j1, sparseIntArray);
        f(i + 18, bg2Var.n0, sparseIntArray);
        f(i + 19, bg2Var.o0, sparseIntArray);
        f(i + 20, bg2Var.p0, sparseIntArray);
        f(i + 21, bg2Var.q0, sparseIntArray);
        f(i + 22, bg2Var.r0, sparseIntArray);
    }
}
