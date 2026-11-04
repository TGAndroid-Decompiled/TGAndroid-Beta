package ai;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.pe;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.h9;
import org.telegram.ui.i8;
import org.telegram.ui.ny0;
public final class g5 extends org.telegram.ui.ActionBar.j {
    public final int f662a;
    public final Object f663b;

    public g5(Object obj, int i3) {
        this.f662a = i3;
        this.f663b = obj;
    }

    @Override
    public final void b(int i3) {
        int i10 = this.f662a;
        Object obj = this.f663b;
        switch (i10) {
            case 0:
                if (i3 == -1) {
                    ((i6) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i3 == -1) {
                    ((ci.v) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                dh.o oVar = (dh.o) obj;
                if (i3 == -1 && !oVar.d0(true)) {
                    oVar.finishFragment();
                    return;
                }
                return;
            case 3:
                gi.d3 d3Var = (gi.d3) obj;
                if (i3 == -1) {
                    Runnable runnable = d3Var.W;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                } else if (i3 >= 10) {
                    d3Var.e((pe) d3Var.f12571h0.get(i3 - 10), false);
                    return;
                } else {
                    return;
                }
            case 4:
                if (i3 == -1) {
                    ((ii.s) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i3 == -1) {
                    ((ii.p4) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i3 == -1) {
                    ((ji.e) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i3 == -1) {
                    ((ji.n) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i3 == -1) {
                    ((ji.q) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                ji.b0 b0Var = ((ji.w) obj).f16376n;
                if (i3 == -1) {
                    if (b0Var.F1) {
                        b0Var.dismiss();
                        return;
                    }
                    b0Var.f16271s1.d.f35594g3.O(false);
                    b0Var.f16265l1.D(0);
                    return;
                } else if (i3 == 3) {
                    b0Var.k1.a(true, true);
                    b0Var.u0(false);
                    b0Var.K1 = null;
                    b0Var.f16277y1.f35594g3.O(true);
                    b0Var.f16275w1.f36302r.getText().clear();
                    b0Var.f16275w1.f36302r.requestFocus();
                    org.telegram.messenger.g0.K3(b0Var.f16275w1.f36302r);
                    return;
                } else {
                    return;
                }
            case 10:
                ji.b0 b0Var2 = ((ji.x) obj).f16378r;
                if (i3 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", b0Var2.m1);
                    b0Var2.f16270r1.presentFragment(new ji.n(bundle));
                    b0Var2.dismiss();
                    return;
                } else if (i3 == 3) {
                    b0Var2.f16264j1.a(true, true);
                    b0Var2.u0(false);
                    TextUtils.isEmpty(b0Var2.J1);
                    b0Var2.J1 = null;
                    b0Var2.f16276x1.h(0L, b0Var2.m1, 0L, 0L, null, false, null, true);
                    b0Var2.f16274v1.f36302r.getText().clear();
                    b0Var2.f16274v1.f36302r.requestFocus();
                    org.telegram.messenger.g0.K3(b0Var2.f16274v1.f36302r);
                    return;
                } else {
                    return;
                }
            case 11:
                ji.b0 b0Var3 = ((ji.w) obj).f16376n;
                if (i3 == -1) {
                    b0Var3.f16271s1.d.f35594g3.O(false);
                    b0Var3.f16265l1.D(0);
                    return;
                }
                return;
            case 12:
                lg.c cVar = (lg.c) obj;
                if (i3 == -1) {
                    if (cVar.onBackPressed(true)) {
                        cVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    cVar.c0();
                    return;
                } else {
                    return;
                }
            case 13:
                lg.m mVar = (lg.m) obj;
                if (i3 == -1) {
                    if (mVar.onBackPressed(true)) {
                        mVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    mVar.m0();
                    return;
                } else {
                    return;
                }
            case 14:
                lg.r0 r0Var = (lg.r0) obj;
                if (i3 == -1) {
                    if (r0Var.onBackPressed(true)) {
                        r0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    r0Var.f0();
                    return;
                } else {
                    return;
                }
            case 15:
                lg.t0 t0Var = (lg.t0) obj;
                if (i3 == -1) {
                    if (t0Var.onBackPressed(true)) {
                        t0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    t0Var.c0();
                    return;
                } else {
                    return;
                }
            case 16:
                lg.b1 b1Var = (lg.b1) obj;
                if (i3 == -1) {
                    if (b1Var.onBackPressed(true)) {
                        b1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    b1Var.b0();
                    return;
                } else {
                    return;
                }
            case 17:
                lg.d1 d1Var = (lg.d1) obj;
                if (i3 == -1) {
                    if (d1Var.onBackPressed(true)) {
                        d1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    d1Var.i0();
                    return;
                } else {
                    return;
                }
            case 18:
                if (i3 == -1) {
                    ((lg.f1) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                lg.r1 r1Var = (lg.r1) obj;
                ArrayList arrayList = r1Var.f18451b;
                if (i3 == -1) {
                    if (arrayList.isEmpty()) {
                        r1Var.finishFragment();
                        return;
                    } else {
                        lg.r1.c0(r1Var);
                        return;
                    }
                } else if (i3 == 1) {
                    if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        lg.t1 c2 = lg.u1.f(lg.r1.d0(r1Var)).c(intValue);
                        if (c2 != null) {
                            lg.r1.i0(r1Var.getParentActivity(), lg.r1.e0(r1Var), null, c2, lg.r1.f0(r1Var), new gi.s3(this, intValue, 2));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i3 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, r1Var.getParentActivity(), r1Var.getResourceProvider());
                    String G = bd.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = G;
                    s1Var.U = bd.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                    alertDialog$Builder.k(bd.M0(2131746329, null), new l5.b(this, 3));
                    alertDialog$Builder.h(bd.M0(2131752589, null), null);
                    r1Var.showDialog(s1Var);
                    return;
                } else {
                    return;
                }
            case 20:
                if (i3 == -1) {
                    ((lg.x1) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i3 == -1) {
                    ((org.telegram.ui.g) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i3 == -1) {
                    ((org.telegram.ui.k) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i3 == -1) {
                    ((org.telegram.ui.o) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i3 == -1) {
                    ((ny0) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i3 == -1) {
                    ((org.telegram.ui.r4) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i3 == -1) {
                    ((org.telegram.ui.z5) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                org.telegram.ui.z6 z6Var = (org.telegram.ui.z6) obj;
                if (i3 == -1) {
                    if (org.telegram.ui.z6.e0(z6Var).s()) {
                        di.c cVar2 = z6Var.f52553e0;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        org.telegram.ui.k6 k6Var = z6Var.N;
                        if (k6Var != null) {
                            k6Var.f(false);
                            z6Var.N.e();
                            return;
                        }
                        return;
                    }
                    z6Var.finishFragment();
                    return;
                } else if (i3 == 1) {
                    org.telegram.ui.z6.k0(z6Var);
                    return;
                } else if (i3 == 3) {
                    org.telegram.ui.z6.l0(z6Var, false);
                    return;
                } else if (i3 == 4) {
                    org.telegram.ui.z6.l0(z6Var, true);
                    return;
                } else {
                    return;
                }
            case 28:
                i8 i8Var = (i8) obj;
                if (i3 == -1) {
                    if (i8Var.Q == 0 && i8Var.R == 0 && !i8Var.H) {
                        i8Var.finishFragment();
                        return;
                    }
                    i8Var.H = false;
                    i8Var.Q = 0;
                    i8Var.R = 0;
                    i8Var.B0();
                    i8Var.u0();
                    return;
                }
                return;
            default:
                h9 h9Var = (h9) obj;
                if (i3 == -1) {
                    if (h9.d0(h9Var).s()) {
                        h9Var.j0(true);
                        return;
                    } else {
                        h9Var.finishFragment();
                        return;
                    }
                } else if (i3 == 2) {
                    h9.e0(h9Var, false);
                    return;
                } else if (i3 == 3) {
                    h9.e0(h9Var, true);
                    return;
                } else {
                    return;
                }
        }
    }
}
