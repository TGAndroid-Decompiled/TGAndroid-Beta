package ah;

import android.os.Bundle;
import android.text.TextUtils;
import fi.d5;
import fi.k3;
import ig.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.a7;
import org.telegram.ui.d7;
import org.telegram.ui.e6;
import org.telegram.ui.ea;
import org.telegram.ui.l8;
import org.telegram.ui.n9;
import org.telegram.ui.q4;
import org.telegram.ui.u4;
import org.telegram.ui.va;
import org.telegram.ui.z9;
public final class s extends org.telegram.ui.ActionBar.j {
    public final int f855a;
    public final Object f856b;

    public s(Object obj, int i10) {
        this.f855a = i10;
        this.f856b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f855a) {
            case 0:
                a0 a0Var = (a0) this.f856b;
                if (i10 == -1 && !a0Var.X(true)) {
                    a0Var.finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((fi.t) this.f856b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((k3) this.f856b).r();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((d5) this.f856b).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((gi.f) this.f856b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((gi.p) this.f856b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((gi.s) this.f856b).finishFragment();
                    return;
                }
                return;
            case 7:
                gi.k0 k0Var = ((gi.e0) this.f856b).h;
                if (i10 == -1) {
                    if (k0Var.N) {
                        k0Var.dismiss();
                        return;
                    }
                    k0Var.v.d.W2.N(false);
                    k0Var.d.D(0);
                    return;
                } else if (i10 == 3) {
                    k0Var.f10205c.a(true, true);
                    k0Var.setAllowNestedScroll(false);
                    k0Var.S = null;
                    k0Var.G.W2.N(true);
                    k0Var.E.f27510r.getText().clear();
                    k0Var.E.f27510r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var.E.f27510r);
                    return;
                } else {
                    return;
                }
            case 8:
                gi.k0 k0Var2 = ((gi.f0) this.f856b).f10183r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", k0Var2.e);
                    k0Var2.f10209s.presentFragment(new gi.p(bundle));
                    k0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    k0Var2.f10204b.a(true, true);
                    k0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(k0Var2.R);
                    k0Var2.R = null;
                    k0Var2.F.h(0L, k0Var2.e, 0L, 0L, null, false, null, true);
                    k0Var2.f10212y.f27510r.getText().clear();
                    k0Var2.f10212y.f27510r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var2.f10212y.f27510r);
                    return;
                } else {
                    return;
                }
            case 9:
                gi.k0 k0Var3 = ((gi.j0) this.f856b).h;
                if (i10 == -1) {
                    k0Var3.v.d.W2.N(false);
                    k0Var3.d.D(0);
                    return;
                }
                return;
            case 10:
                ig.c cVar = (ig.c) this.f856b;
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
                ig.m mVar = (ig.m) this.f856b;
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
                ig.u0 u0Var = (ig.u0) this.f856b;
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
                ig.w0 w0Var = (ig.w0) this.f856b;
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
                ig.e1 e1Var = (ig.e1) this.f856b;
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
                ig.g1 g1Var = (ig.g1) this.f856b;
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
                    ((ig.i1) this.f856b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((e2) this.f856b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.h) this.f856b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((org.telegram.ui.l) this.f856b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((org.telegram.ui.p) this.f856b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((q4) this.f856b).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((u4) this.f856b).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i10 == -1) {
                    ((e6) this.f856b).finishFragment();
                    return;
                }
                return;
            case 24:
                d7 d7Var = (d7) this.f856b;
                if (i10 == -1) {
                    if (d7.Z(d7Var).t()) {
                        ai.c cVar2 = d7Var.Y;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        a7 a7Var = d7Var.N;
                        if (a7Var != null) {
                            a7Var.e(false);
                            d7Var.N.d();
                            return;
                        }
                        return;
                    }
                    d7Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    d7Var.m0();
                    return;
                } else if (i10 == 3) {
                    d7.f0(d7Var, false);
                    return;
                } else if (i10 == 4) {
                    d7.f0(d7Var, true);
                    return;
                } else {
                    return;
                }
            case 25:
                l8 l8Var = (l8) this.f856b;
                if (i10 == -1) {
                    if (l8Var.P == 0 && l8Var.Q == 0 && !l8Var.G) {
                        l8Var.finishFragment();
                        return;
                    }
                    l8Var.G = false;
                    l8Var.P = 0;
                    l8Var.Q = 0;
                    l8Var.t0();
                    l8Var.o0();
                    return;
                }
                return;
            case 26:
                n9 n9Var = (n9) this.f856b;
                if (i10 == -1) {
                    if (n9.Z(n9Var).t()) {
                        n9Var.k0(true);
                        return;
                    } else {
                        n9Var.finishFragment();
                        return;
                    }
                } else if (i10 == 2) {
                    n9Var.p0(false);
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((z9) this.f856b).finishFragment();
                    return;
                }
                return;
            case 28:
                ea eaVar = (ea) this.f856b;
                if (i10 == -1) {
                    eaVar.finishFragment();
                    return;
                } else if (i10 == 1 && eaVar.f35232a.getText().length() != 0) {
                    ea.U(eaVar);
                    eaVar.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                va vaVar = (va) this.f856b;
                if (i10 == -1) {
                    vaVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    va.Y(vaVar);
                    va.Z(vaVar);
                    return;
                } else {
                    return;
                }
        }
    }
}
