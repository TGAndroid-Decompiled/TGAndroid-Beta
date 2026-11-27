package defpackage;

import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class dm6 extends eja {
    public final em6 x2;

    public dm6(em6 em6Var, Context context, long j, wia wiaVar, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i, em6 em6Var2, cm6 cm6Var, vnb vnbVar, ll0 ll0Var) {
        super(context, j, wiaVar, 0, null, chatFull, userFull, i, 0, em6Var2, cm6Var, 0, vnbVar, ll0Var);
        this.x2 = em6Var;
    }

    @Override
    public final boolean H() {
        em6 em6Var = this.x2;
        if (!em6Var.c0() && em6Var.a != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final void J0(SparseArray sparseArray) {
        boolean z;
        int size = sparseArray.size();
        em6 em6Var = this.x2;
        em6Var.w = sparseArray;
        c51 c51Var = em6Var.O;
        if (c51Var != null) {
            if (size > 0) {
                z = true;
            } else {
                z = false;
            }
            c51Var.setEnabled(z);
            em6Var.O.c(size, true);
            if (em6Var.S.getClosestTab() == 8) {
                em6Var.O.i(ob6.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override
    public final void R0(boolean z) {
        em6 em6Var = this.x2;
        hl.y2(em6Var.getParentActivity(), em6.Z(em6Var));
    }

    @Override
    public final void S0() {
        super.S0();
        this.x2.e0();
    }

    @Override
    public final void T0(float f) {
        int i;
        em6 em6Var = this.x2;
        if (em6Var.a != 1) {
            return;
        }
        if (Math.round(f - 8.0f) > 0) {
            i = 1;
        } else {
            i = 0;
        }
        hj6 hj6Var = em6Var.K;
        if (hj6Var != null && em6Var.M != i) {
            em6Var.M = i;
            hj6Var.r(em6Var.L[i], true);
        }
        em6Var.f0(true);
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
        em6 em6Var = this.x2;
        if (em6Var.a == 0 && em6Var.e == em6Var.getUserConfig().e() && em6Var.f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean i0() {
        return this.x2.c0();
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
            em6 em6Var = this.x2;
            if (em6Var.c0()) {
                if (z) {
                    r1(null);
                }
                this.P1 = z;
            }
            fm0 fm0Var = em6Var.P;
            if (fm0Var != null) {
                fm0Var.a(z, true);
            }
        }
    }

    @Override
    public final boolean q() {
        return !this.x2.c0();
    }

    @Override
    public final boolean s0() {
        return this.x2.c0();
    }
}
