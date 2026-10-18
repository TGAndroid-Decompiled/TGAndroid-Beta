package ah;

import android.os.Bundle;
import android.text.TextUtils;
import gi.d3;
import gi.s4;
import ig.d2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.c7;
import org.telegram.ui.da;
import org.telegram.ui.e6;
import org.telegram.ui.k8;
import org.telegram.ui.m9;
import org.telegram.ui.r4;
import org.telegram.ui.v4;
import org.telegram.ui.y9;
import org.telegram.ui.z6;
public final class s extends org.telegram.ui.ActionBar.j {
    public final int f857a;
    public final Object f858b;

    public s(Object obj, int i10) {
        this.f857a = i10;
        this.f858b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f857a) {
            case 0:
                a0 a0Var = (a0) this.f858b;
                if (i10 == -1 && !a0Var.X(true)) {
                    a0Var.finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((ai.x) this.f858b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((gi.t) this.f858b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((d3) this.f858b).r();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((s4) this.f858b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((hi.f) this.f858b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((hi.o) this.f858b).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((hi.r) this.f858b).finishFragment();
                    return;
                }
                return;
            case 8:
                hi.k0 k0Var = ((hi.e0) this.f858b).h;
                if (i10 == -1) {
                    if (k0Var.N) {
                        k0Var.dismiss();
                        return;
                    }
                    k0Var.v.d.W2.N(false);
                    k0Var.d.D(0);
                    return;
                } else if (i10 == 3) {
                    k0Var.f12172c.a(true, true);
                    k0Var.setAllowNestedScroll(false);
                    k0Var.S = null;
                    k0Var.G.W2.N(true);
                    k0Var.E.f27719r.getText().clear();
                    k0Var.E.f27719r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var.E.f27719r);
                    return;
                } else {
                    return;
                }
            case 9:
                hi.k0 k0Var2 = ((hi.f0) this.f858b).f12150r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", k0Var2.e);
                    k0Var2.f12176s.presentFragment(new hi.o(bundle));
                    k0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    k0Var2.f12171b.a(true, true);
                    k0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(k0Var2.R);
                    k0Var2.R = null;
                    k0Var2.F.h(0L, k0Var2.e, 0L, 0L, null, false, null, true);
                    k0Var2.f12179y.f27719r.getText().clear();
                    k0Var2.f12179y.f27719r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var2.f12179y.f27719r);
                    return;
                } else {
                    return;
                }
            case 10:
                hi.k0 k0Var3 = ((hi.j0) this.f858b).h;
                if (i10 == -1) {
                    k0Var3.v.d.W2.N(false);
                    k0Var3.d.D(0);
                    return;
                }
                return;
            case 11:
                ig.c cVar = (ig.c) this.f858b;
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
            case 12:
                ig.m mVar = (ig.m) this.f858b;
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
            case 13:
                ig.t0 t0Var = (ig.t0) this.f858b;
                if (i10 == -1) {
                    if (t0Var.onBackPressed(true)) {
                        t0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    t0Var.a0();
                    return;
                } else {
                    return;
                }
            case 14:
                ig.v0 v0Var = (ig.v0) this.f858b;
                if (i10 == -1) {
                    if (v0Var.onBackPressed(true)) {
                        v0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    v0Var.X();
                    return;
                } else {
                    return;
                }
            case 15:
                ig.d1 d1Var = (ig.d1) this.f858b;
                if (i10 == -1) {
                    if (d1Var.onBackPressed(true)) {
                        d1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    d1Var.W();
                    return;
                } else {
                    return;
                }
            case 16:
                ig.f1 f1Var = (ig.f1) this.f858b;
                if (i10 == -1) {
                    if (f1Var.onBackPressed(true)) {
                        f1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    f1Var.d0();
                    return;
                } else {
                    return;
                }
            case 17:
                if (i10 == -1) {
                    ((ig.h1) this.f858b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((d2) this.f858b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((org.telegram.ui.h) this.f858b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((org.telegram.ui.l) this.f858b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((org.telegram.ui.p) this.f858b).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((r4) this.f858b).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i10 == -1) {
                    ((v4) this.f858b).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((e6) this.f858b).finishFragment();
                    return;
                }
                return;
            case 25:
                c7 c7Var = (c7) this.f858b;
                if (i10 == -1) {
                    if (c7.Z(c7Var).s()) {
                        bi.c cVar2 = c7Var.Y;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        z6 z6Var = c7Var.N;
                        if (z6Var != null) {
                            z6Var.e(false);
                            c7Var.N.d();
                            return;
                        }
                        return;
                    }
                    c7Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    c7Var.m0();
                    return;
                } else if (i10 == 3) {
                    c7.f0(c7Var, false);
                    return;
                } else if (i10 == 4) {
                    c7.f0(c7Var, true);
                    return;
                } else {
                    return;
                }
            case 26:
                k8 k8Var = (k8) this.f858b;
                if (i10 == -1) {
                    if (k8Var.P == 0 && k8Var.Q == 0 && !k8Var.G) {
                        k8Var.finishFragment();
                        return;
                    }
                    k8Var.G = false;
                    k8Var.P = 0;
                    k8Var.Q = 0;
                    k8Var.t0();
                    k8Var.o0();
                    return;
                }
                return;
            case 27:
                m9 m9Var = (m9) this.f858b;
                if (i10 == -1) {
                    if (m9.Z(m9Var).s()) {
                        m9Var.k0(true);
                        return;
                    } else {
                        m9Var.finishFragment();
                        return;
                    }
                } else if (i10 == 2) {
                    m9Var.p0(false);
                    return;
                } else {
                    return;
                }
            case 28:
                if (i10 == -1) {
                    ((y9) this.f858b).finishFragment();
                    return;
                }
                return;
            default:
                da daVar = (da) this.f858b;
                if (i10 == -1) {
                    daVar.finishFragment();
                    return;
                } else if (i10 == 1 && daVar.f36138a.getText().length() != 0) {
                    da.U(daVar);
                    daVar.finishFragment();
                    return;
                } else {
                    return;
                }
        }
    }
}
