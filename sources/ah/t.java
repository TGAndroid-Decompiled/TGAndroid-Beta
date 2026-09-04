package ah;

import android.os.Bundle;
import android.text.TextUtils;
import fi.e5;
import fi.k3;
import ig.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.a6;
import org.telegram.ui.h8;
import org.telegram.ui.k9;
import org.telegram.ui.q4;
import org.telegram.ui.qa;
import org.telegram.ui.u9;
import org.telegram.ui.ub;
import org.telegram.ui.w6;
import org.telegram.ui.z6;
import org.telegram.ui.z9;
public final class t extends org.telegram.ui.ActionBar.j {
    public final int f671a;
    public final Object f672b;

    public t(Object obj, int i10) {
        this.f671a = i10;
        this.f672b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f671a) {
            case 0:
                b0 b0Var = (b0) this.f672b;
                if (i10 == -1 && !b0Var.X(true)) {
                    b0Var.finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((fi.u) this.f672b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((k3) this.f672b).q();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((e5) this.f672b).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((gi.f) this.f672b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((gi.p) this.f672b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((gi.s) this.f672b).finishFragment();
                    return;
                }
                return;
            case 7:
                gi.k0 k0Var = ((gi.e0) this.f672b).h;
                if (i10 == -1) {
                    if (k0Var.N) {
                        k0Var.dismiss();
                        return;
                    }
                    k0Var.v.d.Y2.N(false);
                    k0Var.d.D(0);
                    return;
                } else if (i10 == 3) {
                    k0Var.f10710c.a(true, true);
                    k0Var.setAllowNestedScroll(false);
                    k0Var.S = null;
                    k0Var.G.Y2.N(true);
                    k0Var.E.f24522r.getText().clear();
                    k0Var.E.f24522r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var.E.f24522r);
                    return;
                } else {
                    return;
                }
            case 8:
                gi.k0 k0Var2 = ((gi.f0) this.f672b).f10686r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", k0Var2.f10711e);
                    k0Var2.f10715s.presentFragment(new gi.p(bundle));
                    k0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    k0Var2.f10709b.a(true, true);
                    k0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(k0Var2.R);
                    k0Var2.R = null;
                    k0Var2.F.h(0L, k0Var2.f10711e, 0L, 0L, null, false, null, true);
                    k0Var2.f10718y.f24522r.getText().clear();
                    k0Var2.f10718y.f24522r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var2.f10718y.f24522r);
                    return;
                } else {
                    return;
                }
            case 9:
                gi.k0 k0Var3 = ((gi.j0) this.f672b).h;
                if (i10 == -1) {
                    k0Var3.v.d.Y2.N(false);
                    k0Var3.d.D(0);
                    return;
                }
                return;
            case 10:
                ig.c cVar = (ig.c) this.f672b;
                if (i10 == -1) {
                    if (cVar.onBackPressed(true)) {
                        cVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    cVar.X();
                    return;
                } else {
                    return;
                }
            case 11:
                ig.m mVar = (ig.m) this.f672b;
                if (i10 == -1) {
                    if (mVar.onBackPressed(true)) {
                        mVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    mVar.h0();
                    return;
                } else {
                    return;
                }
            case 12:
                ig.u0 u0Var = (ig.u0) this.f672b;
                if (i10 == -1) {
                    if (u0Var.onBackPressed(true)) {
                        u0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    u0Var.a0();
                    return;
                } else {
                    return;
                }
            case 13:
                ig.w0 w0Var = (ig.w0) this.f672b;
                if (i10 == -1) {
                    if (w0Var.onBackPressed(true)) {
                        w0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    w0Var.X();
                    return;
                } else {
                    return;
                }
            case 14:
                ig.e1 e1Var = (ig.e1) this.f672b;
                if (i10 == -1) {
                    if (e1Var.onBackPressed(true)) {
                        e1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    e1Var.W();
                    return;
                } else {
                    return;
                }
            case 15:
                ig.g1 g1Var = (ig.g1) this.f672b;
                if (i10 == -1) {
                    if (g1Var.onBackPressed(true)) {
                        g1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    g1Var.d0();
                    return;
                } else {
                    return;
                }
            case 16:
                if (i10 == -1) {
                    ((ig.i1) this.f672b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((e2) this.f672b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.h) this.f672b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((org.telegram.ui.l) this.f672b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((org.telegram.ui.p) this.f672b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((q4) this.f672b).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((a6) this.f672b).finishFragment();
                    return;
                }
                return;
            case 23:
                z6 z6Var = (z6) this.f672b;
                if (i10 == -1) {
                    if (z6.Z(z6Var).s()) {
                        ai.c cVar2 = z6Var.Y;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        w6 w6Var = z6Var.N;
                        if (w6Var != null) {
                            w6Var.e(false);
                            z6Var.N.d();
                            return;
                        }
                        return;
                    }
                    z6Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    z6Var.m0();
                    return;
                } else if (i10 == 3) {
                    z6.f0(z6Var, false);
                    return;
                } else if (i10 == 4) {
                    z6.f0(z6Var, true);
                    return;
                } else {
                    return;
                }
            case 24:
                h8 h8Var = (h8) this.f672b;
                if (i10 == -1) {
                    if (h8Var.P == 0 && h8Var.Q == 0 && !h8Var.G) {
                        h8Var.finishFragment();
                        return;
                    }
                    h8Var.G = false;
                    h8Var.P = 0;
                    h8Var.Q = 0;
                    h8Var.t0();
                    h8Var.o0();
                    return;
                }
                return;
            case 25:
                k9 k9Var = (k9) this.f672b;
                if (i10 == -1) {
                    if (k9.Z(k9Var).s()) {
                        k9Var.k0(true);
                        return;
                    } else {
                        k9Var.finishFragment();
                        return;
                    }
                } else if (i10 == 2) {
                    k9Var.p0(false);
                    return;
                } else {
                    return;
                }
            case 26:
                if (i10 == -1) {
                    ((u9) this.f672b).finishFragment();
                    return;
                }
                return;
            case 27:
                z9 z9Var = (z9) this.f672b;
                if (i10 == -1) {
                    z9Var.finishFragment();
                    return;
                } else if (i10 == 1 && z9Var.f43340a.getText().length() != 0) {
                    z9.U(z9Var);
                    z9Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 28:
                qa qaVar = (qa) this.f672b;
                if (i10 == -1) {
                    qaVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    qa.Y(qaVar);
                    qa.Z(qaVar);
                    return;
                } else {
                    return;
                }
            default:
                if (i10 == -1) {
                    ((ub) this.f672b).finishFragment();
                    return;
                }
                return;
        }
    }
}
