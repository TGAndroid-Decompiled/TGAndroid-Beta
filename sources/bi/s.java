package bi;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.we;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.az0;
public final class s extends org.telegram.ui.ActionBar.j {
    public final int f4655a;
    public final Object f4656b;

    public s(Object obj, int i7) {
        this.f4655a = i7;
        this.f4656b = obj;
    }

    @Override
    public final void b(int i7) {
        org.telegram.ui.ActionBar.y4 y4Var;
        int i10 = this.f4655a;
        Object obj = this.f4656b;
        switch (i10) {
            case 0:
                if (i7 == -1) {
                    ((z) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                ch.o oVar = (ch.o) obj;
                if (i7 == -1 && !oVar.d0(true)) {
                    oVar.finishFragment();
                    return;
                }
                return;
            case 2:
                fi.f3 f3Var = (fi.f3) obj;
                if (i7 == -1) {
                    Runnable runnable = f3Var.V;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                } else if (i7 >= 10) {
                    f3Var.e((we) f3Var.f11967g0.get(i7 - 10), false);
                    return;
                } else {
                    return;
                }
            case 3:
                if (i7 == -1) {
                    ((hi.q) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i7 == -1) {
                    ((hi.p4) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i7 == -1) {
                    ((ii.f) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i7 == -1) {
                    ((ii.p) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i7 == -1) {
                    ((ii.s) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                ii.d0 d0Var = ((ii.y) obj).f15617n;
                if (i7 == -1) {
                    if (d0Var.E1) {
                        d0Var.dismiss();
                        return;
                    }
                    d0Var.f15510r1.d.f37556f3.O(false);
                    d0Var.f15505k1.E(0);
                    return;
                } else if (i7 == 3) {
                    d0Var.f15504j1.a(true, true);
                    d0Var.u0(false);
                    d0Var.J1 = null;
                    d0Var.f15516x1.f37556f3.O(true);
                    d0Var.f15514v1.f37857r.getText().clear();
                    d0Var.f15514v1.f37857r.requestFocus();
                    org.telegram.messenger.g0.K3(d0Var.f15514v1.f37857r);
                    return;
                } else {
                    return;
                }
            case 9:
                ii.d0 d0Var2 = ((ii.z) obj).f15619r;
                if (i7 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", d0Var2.l1);
                    d0Var2.f15509q1.presentFragment(new ii.p(bundle));
                    d0Var2.dismiss();
                    return;
                } else if (i7 == 3) {
                    d0Var2.f15503i1.a(true, true);
                    d0Var2.u0(false);
                    TextUtils.isEmpty(d0Var2.I1);
                    d0Var2.I1 = null;
                    d0Var2.f15515w1.h(0L, d0Var2.l1, 0L, 0L, null, false, null, true);
                    d0Var2.f15513u1.f37857r.getText().clear();
                    d0Var2.f15513u1.f37857r.requestFocus();
                    org.telegram.messenger.g0.K3(d0Var2.f15513u1.f37857r);
                    return;
                } else {
                    return;
                }
            case 10:
                ii.d0 d0Var3 = ((ii.y) obj).f15617n;
                if (i7 == -1) {
                    d0Var3.f15510r1.d.f37556f3.O(false);
                    d0Var3.f15505k1.E(0);
                    return;
                }
                return;
            case 11:
                kg.c cVar = (kg.c) obj;
                if (i7 == -1) {
                    if (cVar.onBackPressed(true)) {
                        cVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    cVar.c0();
                    return;
                } else {
                    return;
                }
            case 12:
                kg.m mVar = (kg.m) obj;
                if (i7 == -1) {
                    if (mVar.onBackPressed(true)) {
                        mVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    mVar.m0();
                    return;
                } else {
                    return;
                }
            case 13:
                kg.q0 q0Var = (kg.q0) obj;
                if (i7 == -1) {
                    if (q0Var.onBackPressed(true)) {
                        q0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    q0Var.f0();
                    return;
                } else {
                    return;
                }
            case 14:
                kg.s0 s0Var = (kg.s0) obj;
                if (i7 == -1) {
                    if (s0Var.onBackPressed(true)) {
                        s0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    s0Var.c0();
                    return;
                } else {
                    return;
                }
            case 15:
                kg.a1 a1Var = (kg.a1) obj;
                if (i7 == -1) {
                    if (a1Var.onBackPressed(true)) {
                        a1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    a1Var.b0();
                    return;
                } else {
                    return;
                }
            case 16:
                kg.c1 c1Var = (kg.c1) obj;
                if (i7 == -1) {
                    if (c1Var.onBackPressed(true)) {
                        c1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    c1Var.i0();
                    return;
                } else {
                    return;
                }
            case 17:
                if (i7 == -1) {
                    ((kg.e1) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                kg.q1 q1Var = (kg.q1) obj;
                ArrayList arrayList = q1Var.f17513b;
                if (i7 == -1) {
                    if (arrayList.isEmpty()) {
                        q1Var.finishFragment();
                        return;
                    } else {
                        kg.q1.c0(q1Var);
                        return;
                    }
                } else if (i7 == 1) {
                    if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        kg.s1 c10 = kg.t1.f(kg.q1.d0(q1Var)).c(intValue);
                        if (c10 != null) {
                            kg.q1.i0(q1Var.getParentActivity(), kg.q1.e0(q1Var), null, c10, kg.q1.f0(q1Var), new fi.t3(this, intValue, 2));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, q1Var.getParentActivity(), q1Var.getResourceProvider());
                    String G = org.telegram.messenger.id.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = G;
                    u1Var.T = org.telegram.messenger.id.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746321, null), new di.r4(this, 26));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    q1Var.showDialog(u1Var);
                    return;
                } else {
                    return;
                }
            case 19:
                if (i7 == -1) {
                    ((kg.w1) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i7 == -1) {
                    ((org.telegram.ui.g) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i7 == -1) {
                    ((org.telegram.ui.k) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i7 == -1) {
                    ((org.telegram.ui.o) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i7 == -1) {
                    ((az0) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i7 == -1) {
                    ((org.telegram.ui.p4) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i7 == -1) {
                    ((org.telegram.ui.x5) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.y6 y6Var = (org.telegram.ui.y6) obj;
                if (i7 == -1) {
                    if (org.telegram.ui.y6.e0(y6Var).t()) {
                        ci.c cVar2 = y6Var.f51927d0;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        org.telegram.ui.i6 i6Var = y6Var.M;
                        if (i6Var != null) {
                            i6Var.f(false);
                            y6Var.M.e();
                            return;
                        }
                        return;
                    }
                    y6Var.finishFragment();
                    return;
                } else if (i7 == 1) {
                    org.telegram.ui.y6.k0(y6Var);
                    return;
                } else if (i7 == 3) {
                    org.telegram.ui.y6.l0(y6Var, false);
                    return;
                } else if (i7 == 4) {
                    org.telegram.ui.y6.l0(y6Var, true);
                    return;
                } else {
                    return;
                }
            case 27:
                org.telegram.ui.h8 h8Var = (org.telegram.ui.h8) obj;
                if (i7 == -1) {
                    if (h8Var.P == 0 && h8Var.Q == 0 && !h8Var.G) {
                        h8Var.finishFragment();
                        return;
                    }
                    h8Var.G = false;
                    h8Var.P = 0;
                    h8Var.Q = 0;
                    h8Var.B0();
                    h8Var.u0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.i9 i9Var = (org.telegram.ui.i9) obj;
                if (i7 == -1) {
                    y4Var = ((org.telegram.ui.ActionBar.f2) i9Var).simpleActionBar;
                    if (y4Var.t()) {
                        i9Var.j0(true);
                        return;
                    } else {
                        i9Var.finishFragment();
                        return;
                    }
                } else if (i7 == 2) {
                    org.telegram.ui.i9.e0(i9Var, false);
                    return;
                } else if (i7 == 3) {
                    org.telegram.ui.i9.e0(i9Var, true);
                    return;
                } else {
                    return;
                }
            default:
                if (i7 == -1) {
                    ((org.telegram.ui.s9) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
