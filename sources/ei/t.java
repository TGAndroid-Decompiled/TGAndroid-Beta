package ei;

import android.os.Bundle;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.b7;
import org.telegram.ui.d6;
import org.telegram.ui.da;
import org.telegram.ui.j8;
import org.telegram.ui.m9;
import org.telegram.ui.ua;
import org.telegram.ui.y6;
import org.telegram.ui.y9;
import org.telegram.ui.yb;
public final class t extends org.telegram.ui.ActionBar.j {
    public final int f9355a;
    public final Object f9356b;

    public t(Object obj, int i10) {
        this.f9355a = i10;
        this.f9356b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f9355a) {
            case 0:
                if (i10 == -1) {
                    ((u) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((k3) this.f9356b).r();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((d5) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((fi.f) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((fi.p) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((fi.s) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 6:
                fi.k0 k0Var = ((fi.e0) this.f9356b).h;
                if (i10 == -1) {
                    if (k0Var.N) {
                        k0Var.dismiss();
                        return;
                    }
                    k0Var.v.d.W2.N(false);
                    k0Var.d.D(0);
                    return;
                } else if (i10 == 3) {
                    k0Var.f9989c.a(true, true);
                    k0Var.setAllowNestedScroll(false);
                    k0Var.S = null;
                    k0Var.G.W2.N(true);
                    k0Var.E.f31362r.getText().clear();
                    k0Var.E.f31362r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var.E.f31362r);
                    return;
                } else {
                    return;
                }
            case 7:
                fi.k0 k0Var2 = ((fi.f0) this.f9356b).f9965r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", k0Var2.f9990e);
                    k0Var2.f9994s.presentFragment(new fi.p(bundle));
                    k0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    k0Var2.f9988b.a(true, true);
                    k0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(k0Var2.R);
                    k0Var2.R = null;
                    k0Var2.F.h(0L, k0Var2.f9990e, 0L, 0L, null, false, null, true);
                    k0Var2.f9997y.f31362r.getText().clear();
                    k0Var2.f9997y.f31362r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var2.f9997y.f31362r);
                    return;
                } else {
                    return;
                }
            case 8:
                fi.k0 k0Var3 = ((fi.j0) this.f9356b).h;
                if (i10 == -1) {
                    k0Var3.v.d.W2.N(false);
                    k0Var3.d.D(0);
                    return;
                }
                return;
            case 9:
                hg.d dVar = (hg.d) this.f9356b;
                if (i10 == -1) {
                    if (dVar.onBackPressed(true)) {
                        dVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    dVar.X();
                    return;
                } else {
                    return;
                }
            case 10:
                hg.n nVar = (hg.n) this.f9356b;
                if (i10 == -1) {
                    if (nVar.onBackPressed(true)) {
                        nVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    nVar.h0();
                    return;
                } else {
                    return;
                }
            case 11:
                hg.u0 u0Var = (hg.u0) this.f9356b;
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
            case 12:
                hg.w0 w0Var = (hg.w0) this.f9356b;
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
            case 13:
                hg.e1 e1Var = (hg.e1) this.f9356b;
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
            case 14:
                hg.g1 g1Var = (hg.g1) this.f9356b;
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
            case 15:
                if (i10 == -1) {
                    ((hg.i1) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((hg.f2) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.h) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.l) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((org.telegram.ui.q) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((org.telegram.ui.o4) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((org.telegram.ui.s4) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((d6) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 23:
                b7 b7Var = (b7) this.f9356b;
                if (i10 == -1) {
                    if (b7.Z(b7Var).u()) {
                        zh.b bVar = b7Var.Y;
                        if (bVar != null) {
                            bVar.d();
                        }
                        y6 y6Var = b7Var.N;
                        if (y6Var != null) {
                            y6Var.e(false);
                            b7Var.N.d();
                            return;
                        }
                        return;
                    }
                    b7Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    b7Var.m0();
                    return;
                } else if (i10 == 3) {
                    b7.f0(b7Var, false);
                    return;
                } else if (i10 == 4) {
                    b7.f0(b7Var, true);
                    return;
                } else {
                    return;
                }
            case 24:
                j8 j8Var = (j8) this.f9356b;
                if (i10 == -1) {
                    if (j8Var.P == 0 && j8Var.Q == 0 && !j8Var.G) {
                        j8Var.finishFragment();
                        return;
                    }
                    j8Var.G = false;
                    j8Var.P = 0;
                    j8Var.Q = 0;
                    j8Var.t0();
                    j8Var.o0();
                    return;
                }
                return;
            case 25:
                m9 m9Var = (m9) this.f9356b;
                if (i10 == -1) {
                    if (m9.Z(m9Var).u()) {
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
            case 26:
                if (i10 == -1) {
                    ((y9) this.f9356b).finishFragment();
                    return;
                }
                return;
            case 27:
                da daVar = (da) this.f9356b;
                if (i10 == -1) {
                    daVar.finishFragment();
                    return;
                } else if (i10 == 1 && daVar.f36703a.getText().length() != 0) {
                    da.U(daVar);
                    daVar.finishFragment();
                    return;
                } else {
                    return;
                }
            case 28:
                ua uaVar = (ua) this.f9356b;
                if (i10 == -1) {
                    uaVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    ua.Y(uaVar);
                    ua.Z(uaVar);
                    return;
                } else {
                    return;
                }
            default:
                if (i10 == -1) {
                    ((yb) this.f9356b).finishFragment();
                    return;
                }
                return;
        }
    }
}
