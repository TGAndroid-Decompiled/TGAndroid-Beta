package defpackage;

import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class bm6 extends nha {
    public final cm6 x2;

    public bm6(cm6 cm6Var, Context context, long j, fha fhaVar, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i, cm6 cm6Var2, am6 am6Var, ylb ylbVar, km0 km0Var) {
        super(context, j, fhaVar, 0, null, chatFull, userFull, i, 0, cm6Var2, am6Var, 0, ylbVar, km0Var);
        this.x2 = cm6Var;
    }

    @Override
    public final boolean H() {
        cm6 cm6Var = this.x2;
        if (!cm6Var.d0() && cm6Var.a != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final void J0(SparseArray sparseArray) {
        boolean z;
        int size = sparseArray.size();
        cm6 cm6Var = this.x2;
        cm6Var.w = sparseArray;
        b61 b61Var = cm6Var.O;
        if (b61Var != null) {
            if (size > 0) {
                z = true;
            } else {
                z = false;
            }
            b61Var.setEnabled(z);
            cm6Var.O.c(size, true);
            if (cm6Var.S.getClosestTab() == 8) {
                cm6Var.O.i(jb6.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override
    public final void R0(boolean z) {
        cm6 cm6Var = this.x2;
        gm.y2(cm6Var.getParentActivity(), cm6.a0(cm6Var));
    }

    @Override
    public final void S0() {
        super.S0();
        this.x2.f0();
    }

    @Override
    public final void T0(float f) {
        int i;
        cm6 cm6Var = this.x2;
        if (cm6Var.a != 1) {
            return;
        }
        if (Math.round(f - 8.0f) > 0) {
            i = 1;
        } else {
            i = 0;
        }
        ej6 ej6Var = cm6Var.K;
        if (ej6Var != null && cm6Var.M != i) {
            cm6Var.M = i;
            ej6Var.r(cm6Var.L[i], true);
        }
        cm6Var.g0(true);
    }

    @Override
    public final int getInitialTab() {
        return this.x2.T;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.x2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.x2.n;
    }

    @Override
    public final boolean h0() {
        cm6 cm6Var = this.x2;
        if (cm6Var.a == 0 && cm6Var.e == cm6Var.getUserConfig().e() && cm6Var.f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean i0() {
        return this.x2.d0();
    }

    @Override
    public final boolean k0() {
        if (this.x2.a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void l1(boolean z) {
        if (this.F1 != z) {
            super.l1(z);
            cm6 cm6Var = this.x2;
            if (cm6Var.d0()) {
                if (z) {
                    r1(null);
                }
                this.P1 = z;
            }
            fn0 fn0Var = cm6Var.P;
            if (fn0Var != null) {
                fn0Var.a(z, true);
            }
        }
    }

    @Override
    public final boolean q() {
        return !this.x2.d0();
    }

    @Override
    public final boolean s0() {
        return this.x2.d0();
    }
}
