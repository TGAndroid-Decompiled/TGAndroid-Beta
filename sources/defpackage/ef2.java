package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class ef2 extends zde {
    public int a;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final kf2 m;
    public final SparseIntArray b = new SparseIntArray();
    public final SparseIntArray c = new SparseIntArray();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public ef2(kf2 kf2Var) {
        this.m = kf2Var;
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
        kf2 kf2Var = this.m;
        if (i >= i3 && i < this.i && i2 >= kf2Var.X0 && i2 < kf2Var.Y0) {
            return ((TLObject) this.k.get(i - i3)).equals(kf2Var.G.get(i2 - kf2Var.X0));
        }
        int i4 = this.f;
        if (i >= i4 && i < this.g && i2 >= kf2Var.U0 && i2 < kf2Var.V0) {
            return ((TLObject) this.l.get(i - i4)).equals(kf2Var.H.get(i2 - kf2Var.U0));
        }
        int i5 = this.d;
        if (i >= i5 && i < this.e && i2 >= kf2Var.E0 && i2 < kf2Var.F0) {
            return ((TLObject) this.j.get(i - i5)).equals(kf2Var.F.get(i2 - kf2Var.E0));
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
        kf2 kf2Var = this.m;
        f(1, kf2Var.v0, sparseIntArray);
        f(2, kf2Var.z0, sparseIntArray);
        f(3, kf2Var.A0, sparseIntArray);
        f(4, kf2Var.C0, sparseIntArray);
        f(5, kf2Var.D0, sparseIntArray);
        f(6, kf2Var.G0, sparseIntArray);
        f(7, kf2Var.H0, sparseIntArray);
        f(8, kf2Var.s0, sparseIntArray);
        f(9, kf2Var.t0, sparseIntArray);
        f(10, kf2Var.u0, sparseIntArray);
        f(11, kf2Var.b1, sparseIntArray);
        f(12, kf2Var.c1, sparseIntArray);
        f(13, kf2Var.S, sparseIntArray);
        f(14, kf2Var.T, sparseIntArray);
        f(15, kf2Var.U, sparseIntArray);
        f(16, kf2Var.e0, sparseIntArray);
        f(17, kf2Var.d0, sparseIntArray);
        f(18, kf2Var.f0, sparseIntArray);
        f(19, kf2Var.h0, sparseIntArray);
        f(20, kf2Var.m0, sparseIntArray);
        f(21, kf2Var.i0, sparseIntArray);
        f(22, kf2Var.j0, sparseIntArray);
        int i = 23;
        f(23, kf2Var.k0, sparseIntArray);
        if (kf2Var.x) {
            i = 24;
            f(24, kf2Var.l0, sparseIntArray);
        }
        f(i + 1, kf2Var.g0, sparseIntArray);
        f(i + 2, kf2Var.B0, sparseIntArray);
        f(i + 3, kf2Var.T0, sparseIntArray);
        f(i + 4, kf2Var.W0, sparseIntArray);
        f(i + 5, kf2Var.Z0, sparseIntArray);
        f(i + 6, kf2Var.N0, sparseIntArray);
        f(i + 7, kf2Var.O0, sparseIntArray);
        f(i + 8, kf2Var.P0, sparseIntArray);
        f(i + 9, kf2Var.Q0, sparseIntArray);
        f(i + 10, kf2Var.S0, sparseIntArray);
        f(i + 11, kf2Var.R0, sparseIntArray);
        f(i + 12, kf2Var.a1, sparseIntArray);
        f(i + 13, kf2Var.f1, sparseIntArray);
        f(i + 14, kf2Var.g1, sparseIntArray);
        f(i + 15, kf2Var.h1, sparseIntArray);
        f(i + 16, kf2Var.i1, sparseIntArray);
        f(i + 17, kf2Var.j1, sparseIntArray);
        f(i + 18, kf2Var.n0, sparseIntArray);
        f(i + 19, kf2Var.o0, sparseIntArray);
        f(i + 20, kf2Var.p0, sparseIntArray);
        f(i + 21, kf2Var.q0, sparseIntArray);
        f(i + 22, kf2Var.r0, sparseIntArray);
    }
}
