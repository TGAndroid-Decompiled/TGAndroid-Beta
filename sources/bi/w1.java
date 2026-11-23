package bi;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.yy0;
public final class w1 extends org.telegram.ui.ActionBar.j {
    public final int f4170a;
    public final Object f4171b;

    public w1(Object obj, int i7) {
        this.f4170a = i7;
        this.f4171b = obj;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var;
        int i12 = this.f4170a;
        Object obj = this.f4171b;
        switch (i12) {
            case 0:
                if (i7 == -1) {
                    ((f2) obj).dismiss();
                    return;
                }
                return;
            case 1:
                if (i7 == -1) {
                    ((p3) obj).dismiss();
                    return;
                }
                return;
            case 2:
                if (i7 == -1) {
                    ((m8) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                ch.p pVar = (ch.p) obj;
                if (i7 == -1 && !pVar.d0(true)) {
                    pVar.finishFragment();
                    return;
                }
                return;
            case 4:
                if (i7 == -1) {
                    ((di.t) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                hi.m3 m3Var = (hi.m3) obj;
                if (i7 == -1) {
                    Runnable runnable = m3Var.W;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                } else if (i7 >= 10) {
                    m3Var.e((ue) m3Var.f14899h0.get(i7 - 10), false);
                    return;
                } else {
                    return;
                }
            case 6:
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
            case 7:
                kg.n nVar = (kg.n) obj;
                if (i7 == -1) {
                    if (nVar.onBackPressed(true)) {
                        nVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    nVar.m0();
                    return;
                } else {
                    return;
                }
            case 8:
                kg.s0 s0Var = (kg.s0) obj;
                if (i7 == -1) {
                    if (s0Var.onBackPressed(true)) {
                        s0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    s0Var.f0();
                    return;
                } else {
                    return;
                }
            case 9:
                kg.u0 u0Var = (kg.u0) obj;
                if (i7 == -1) {
                    if (u0Var.onBackPressed(true)) {
                        u0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    u0Var.c0();
                    return;
                } else {
                    return;
                }
            case 10:
                kg.c1 c1Var = (kg.c1) obj;
                if (i7 == -1) {
                    if (c1Var.onBackPressed(true)) {
                        c1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    c1Var.b0();
                    return;
                } else {
                    return;
                }
            case 11:
                kg.e1 e1Var = (kg.e1) obj;
                if (i7 == -1) {
                    if (e1Var.onBackPressed(true)) {
                        e1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    e1Var.i0();
                    return;
                } else {
                    return;
                }
            case 12:
                if (i7 == -1) {
                    ((kg.h1) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                kg.t1 t1Var = (kg.t1) obj;
                ArrayList arrayList = t1Var.f18581b;
                if (i7 == -1) {
                    if (arrayList.isEmpty()) {
                        t1Var.finishFragment();
                        return;
                    } else {
                        kg.t1.c0(t1Var);
                        return;
                    }
                } else if (i7 == 1) {
                    if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        i10 = ((org.telegram.ui.ActionBar.g2) t1Var).currentAccount;
                        kg.v1 c10 = kg.w1.f(i10).c(intValue);
                        if (c10 != null) {
                            Activity parentActivity = t1Var.getParentActivity();
                            i11 = ((org.telegram.ui.ActionBar.g2) t1Var).currentAccount;
                            i6Var = ((org.telegram.ui.ActionBar.g2) t1Var).resourceProvider;
                            kg.t1.i0(parentActivity, i11, null, c10, i6Var, new hi.a4(this, intValue, 2));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t1Var.getParentActivity(), t1Var.getResourceProvider());
                    String G = gd.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28835a;
                    t1Var2.S = G;
                    t1Var2.U = gd.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                    alertDialog$Builder.k(gd.N0(2131746125, null), new kg.f1(this, 1));
                    alertDialog$Builder.h(gd.N0(2131752577, null), null);
                    t1Var.showDialog(t1Var2);
                    return;
                } else {
                    return;
                }
            case 14:
                if (i7 == -1) {
                    ((kg.y1) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i7 == -1) {
                    ((ki.q) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i7 == -1) {
                    ((ki.e4) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i7 == -1) {
                    ((li.f) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i7 == -1) {
                    ((li.o) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i7 == -1) {
                    ((li.r) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                li.c0 c0Var = ((li.x) obj).f20105n;
                if (i7 == -1) {
                    if (c0Var.I1) {
                        c0Var.dismiss();
                        return;
                    }
                    c0Var.f20003v1.d.f35323g3.O(false);
                    c0Var.f19996o1.C(0);
                    return;
                } else if (i7 == 3) {
                    c0Var.n1.a(true, true);
                    c0Var.u0(false);
                    c0Var.N1 = null;
                    c0Var.B1.f35323g3.O(true);
                    c0Var.f20007z1.f33883r.getText().clear();
                    c0Var.f20007z1.f33883r.requestFocus();
                    org.telegram.messenger.g0.I3(c0Var.f20007z1.f33883r);
                    return;
                } else {
                    return;
                }
            case 21:
                li.c0 c0Var2 = ((li.y) obj).f20107r;
                if (i7 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", c0Var2.f19997p1);
                    c0Var2.f20002u1.presentFragment(new li.o(bundle));
                    c0Var2.dismiss();
                    return;
                } else if (i7 == 3) {
                    c0Var2.f19995m1.a(true, true);
                    c0Var2.u0(false);
                    TextUtils.isEmpty(c0Var2.M1);
                    c0Var2.M1 = null;
                    c0Var2.A1.h(0L, c0Var2.f19997p1, 0L, 0L, null, false, null, true);
                    c0Var2.f20006y1.f33883r.getText().clear();
                    c0Var2.f20006y1.f33883r.requestFocus();
                    org.telegram.messenger.g0.I3(c0Var2.f20006y1.f33883r);
                    return;
                } else {
                    return;
                }
            case 22:
                li.c0 c0Var3 = ((li.x) obj).f20105n;
                if (i7 == -1) {
                    c0Var3.f20003v1.d.f35323g3.O(false);
                    c0Var3.f19996o1.C(0);
                    return;
                }
                return;
            case 23:
                if (i7 == -1) {
                    ((org.telegram.ui.g) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i7 == -1) {
                    ((org.telegram.ui.k) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i7 == -1) {
                    ((org.telegram.ui.o) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i7 == -1) {
                    ((yy0) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i7 == -1) {
                    ((org.telegram.ui.p4) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i7 == -1) {
                    ((org.telegram.ui.y5) obj).finishFragment();
                    return;
                }
                return;
            default:
                org.telegram.ui.y6 y6Var = (org.telegram.ui.y6) obj;
                if (i7 == -1) {
                    if (org.telegram.ui.y6.e0(y6Var).x()) {
                        ei.c cVar2 = y6Var.f54248e0;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        org.telegram.ui.j6 j6Var = y6Var.N;
                        if (j6Var != null) {
                            j6Var.f(false);
                            y6Var.N.e();
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
        }
    }
}
