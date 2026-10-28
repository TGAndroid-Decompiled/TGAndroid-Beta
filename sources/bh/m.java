package bh;

import android.os.Bundle;
import android.text.TextUtils;
import hi.b5;
import hi.m3;
import jg.d1;
import jg.f2;
import jg.h1;
import jg.j1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.c6;
import org.telegram.ui.c7;
import org.telegram.ui.da;
import org.telegram.ui.m6;
import org.telegram.ui.n8;
import org.telegram.ui.o9;
import org.telegram.ui.p4;
import org.telegram.ui.t4;
import org.telegram.ui.y9;
public final class m extends org.telegram.ui.ActionBar.j {
    public final int f4079a;
    public final Object f4080b;

    public m(Object obj, int i10) {
        this.f4079a = i10;
        this.f4080b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f4079a) {
            case 0:
                u uVar = (u) this.f4080b;
                if (i10 == -1 && !uVar.Z(true)) {
                    uVar.finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((bi.y) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((hi.a0) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((m3) this.f4080b).r();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((b5) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((ii.f) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((ii.o) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((ii.r) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 8:
                ii.j0 j0Var = ((ii.d0) this.f4080b).h;
                if (i10 == -1) {
                    if (j0Var.N) {
                        j0Var.dismiss();
                        return;
                    }
                    j0Var.v.d.f32504g3.O(false);
                    j0Var.d.E(0);
                    return;
                } else if (i10 == 3) {
                    j0Var.f14358c.a(true, true);
                    j0Var.setAllowNestedScroll(false);
                    j0Var.S = null;
                    j0Var.G.f32504g3.O(true);
                    j0Var.E.f30347r.getText().clear();
                    j0Var.E.f30347r.requestFocus();
                    AndroidUtilities.showKeyboard(j0Var.E.f30347r);
                    return;
                } else {
                    return;
                }
            case 9:
                ii.j0 j0Var2 = ((ii.e0) this.f4080b).f14336r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", j0Var2.e);
                    j0Var2.f14362s.presentFragment(new ii.o(bundle));
                    j0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    j0Var2.f14357b.a(true, true);
                    j0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(j0Var2.R);
                    j0Var2.R = null;
                    j0Var2.F.h(0L, j0Var2.e, 0L, 0L, null, false, null, true);
                    j0Var2.f14365y.f30347r.getText().clear();
                    j0Var2.f14365y.f30347r.requestFocus();
                    AndroidUtilities.showKeyboard(j0Var2.f14365y.f30347r);
                    return;
                } else {
                    return;
                }
            case 10:
                ii.j0 j0Var3 = ((ii.i0) this.f4080b).h;
                if (i10 == -1) {
                    j0Var3.v.d.f32504g3.O(false);
                    j0Var3.d.E(0);
                    return;
                }
                return;
            case 11:
                jg.c cVar = (jg.c) this.f4080b;
                if (i10 == -1) {
                    if (cVar.onBackPressed(true)) {
                        cVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    cVar.Y();
                    return;
                } else {
                    return;
                }
            case 12:
                jg.n nVar = (jg.n) this.f4080b;
                if (i10 == -1) {
                    if (nVar.onBackPressed(true)) {
                        nVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    nVar.i0();
                    return;
                } else {
                    return;
                }
            case 13:
                jg.t0 t0Var = (jg.t0) this.f4080b;
                if (i10 == -1) {
                    if (t0Var.onBackPressed(true)) {
                        t0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    t0Var.b0();
                    return;
                } else {
                    return;
                }
            case 14:
                jg.v0 v0Var = (jg.v0) this.f4080b;
                if (i10 == -1) {
                    if (v0Var.onBackPressed(true)) {
                        v0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    v0Var.Y();
                    return;
                } else {
                    return;
                }
            case 15:
                d1 d1Var = (d1) this.f4080b;
                if (i10 == -1) {
                    if (d1Var.onBackPressed(true)) {
                        d1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    d1Var.X();
                    return;
                } else {
                    return;
                }
            case 16:
                h1 h1Var = (h1) this.f4080b;
                if (i10 == -1) {
                    if (h1Var.onBackPressed(true)) {
                        h1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    h1Var.e0();
                    return;
                } else {
                    return;
                }
            case 17:
                if (i10 == -1) {
                    ((j1) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((f2) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((org.telegram.ui.g) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((org.telegram.ui.k) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((org.telegram.ui.o) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((p4) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i10 == -1) {
                    ((t4) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((c6) this.f4080b).finishFragment();
                    return;
                }
                return;
            case 25:
                c7 c7Var = (c7) this.f4080b;
                if (i10 == -1) {
                    if (c7.a0(c7Var).o()) {
                        ci.b bVar = c7Var.f38195e0;
                        if (bVar != null) {
                            bVar.d();
                        }
                        m6 m6Var = c7Var.M;
                        if (m6Var != null) {
                            m6Var.f(false);
                            c7Var.M.e();
                            return;
                        }
                        return;
                    }
                    c7Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    c7.g0(c7Var);
                    return;
                } else if (i10 == 3) {
                    c7.h0(c7Var, false);
                    return;
                } else if (i10 == 4) {
                    c7.h0(c7Var, true);
                    return;
                } else {
                    return;
                }
            case 26:
                n8 n8Var = (n8) this.f4080b;
                if (i10 == -1) {
                    if (n8Var.P == 0 && n8Var.Q == 0 && !n8Var.G) {
                        n8Var.finishFragment();
                        return;
                    }
                    n8Var.G = false;
                    n8Var.P = 0;
                    n8Var.Q = 0;
                    n8Var.x0();
                    n8Var.q0();
                    return;
                }
                return;
            case 27:
                o9 o9Var = (o9) this.f4080b;
                if (i10 == -1) {
                    if (o9.Z(o9Var).o()) {
                        o9Var.f0(true);
                        return;
                    } else {
                        o9Var.finishFragment();
                        return;
                    }
                } else if (i10 == 2) {
                    o9.a0(o9Var, false);
                    return;
                } else if (i10 == 3) {
                    o9.a0(o9Var, true);
                    return;
                } else {
                    return;
                }
            case 28:
                if (i10 == -1) {
                    ((y9) this.f4080b).finishFragment();
                    return;
                }
                return;
            default:
                da daVar = (da) this.f4080b;
                if (i10 == -1) {
                    daVar.finishFragment();
                    return;
                } else if (i10 == 1 && daVar.f38561a.getText().length() != 0) {
                    da.V(daVar);
                    daVar.finishFragment();
                    return;
                } else {
                    return;
                }
        }
    }
}
