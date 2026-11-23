package bi;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ve;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.zy0;
public final class v1 extends org.telegram.ui.ActionBar.j {
    public final int f4171a;
    public final Object f4172b;

    public v1(Object obj, int i7) {
        this.f4171a = i7;
        this.f4172b = obj;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var;
        int i12 = this.f4171a;
        Object obj = this.f4172b;
        switch (i12) {
            case 0:
                if (i7 == -1) {
                    ((e2) obj).dismiss();
                    return;
                }
                return;
            case 1:
                if (i7 == -1) {
                    ((n3) obj).dismiss();
                    return;
                }
                return;
            case 2:
                if (i7 == -1) {
                    ((j8) obj).finishFragment();
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
                hi.d3 d3Var = (hi.d3) obj;
                if (i7 == -1) {
                    Runnable runnable = d3Var.W;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                } else if (i7 >= 10) {
                    d3Var.e((ve) d3Var.f14499h0.get(i7 - 10), false);
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
                    ((kg.g1) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                kg.s1 s1Var = (kg.s1) obj;
                ArrayList arrayList = s1Var.f18510b;
                if (i7 == -1) {
                    if (arrayList.isEmpty()) {
                        s1Var.finishFragment();
                        return;
                    } else {
                        kg.s1.c0(s1Var);
                        return;
                    }
                } else if (i7 == 1) {
                    if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        i10 = ((org.telegram.ui.ActionBar.g2) s1Var).currentAccount;
                        kg.u1 c10 = kg.v1.f(i10).c(intValue);
                        if (c10 != null) {
                            Activity parentActivity = s1Var.getParentActivity();
                            i11 = ((org.telegram.ui.ActionBar.g2) s1Var).currentAccount;
                            h6Var = ((org.telegram.ui.ActionBar.g2) s1Var).resourceProvider;
                            kg.s1.i0(parentActivity, i11, null, c10, h6Var, new ai.b2(this, intValue, 3));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, s1Var.getParentActivity(), s1Var.getResourceProvider());
                    String G = hd.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    t1Var.S = G;
                    t1Var.U = hd.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                    alertDialog$Builder.k(hd.N0(2131746125, null), new di.v6(this, 29));
                    alertDialog$Builder.h(hd.N0(2131752577, null), null);
                    s1Var.showDialog(t1Var);
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
                    ((ki.d4) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i7 == -1) {
                    ((li.g) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i7 == -1) {
                    ((li.p) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i7 == -1) {
                    ((li.s) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                li.d0 d0Var = ((li.y) obj).f20042n;
                if (i7 == -1) {
                    if (d0Var.I1) {
                        d0Var.dismiss();
                        return;
                    }
                    d0Var.f19940v1.d.f35789g3.O(false);
                    d0Var.f19933o1.A(0);
                    return;
                } else if (i7 == 3) {
                    d0Var.n1.a(true, true);
                    d0Var.u0(false);
                    d0Var.N1 = null;
                    d0Var.B1.f35789g3.O(true);
                    d0Var.f19944z1.f34642r.getText().clear();
                    d0Var.f19944z1.f34642r.requestFocus();
                    org.telegram.messenger.g0.I3(d0Var.f19944z1.f34642r);
                    return;
                } else {
                    return;
                }
            case 21:
                li.d0 d0Var2 = ((li.z) obj).f20044r;
                if (i7 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", d0Var2.f19934p1);
                    d0Var2.f19939u1.presentFragment(new li.p(bundle));
                    d0Var2.dismiss();
                    return;
                } else if (i7 == 3) {
                    d0Var2.f19932m1.a(true, true);
                    d0Var2.u0(false);
                    TextUtils.isEmpty(d0Var2.M1);
                    d0Var2.M1 = null;
                    d0Var2.A1.h(0L, d0Var2.f19934p1, 0L, 0L, null, false, null, true);
                    d0Var2.f19943y1.f34642r.getText().clear();
                    d0Var2.f19943y1.f34642r.requestFocus();
                    org.telegram.messenger.g0.I3(d0Var2.f19943y1.f34642r);
                    return;
                } else {
                    return;
                }
            case 22:
                li.d0 d0Var3 = ((li.y) obj).f20042n;
                if (i7 == -1) {
                    d0Var3.f19940v1.d.f35789g3.O(false);
                    d0Var3.f19933o1.A(0);
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
                    ((zy0) obj).finishFragment();
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
                    ((org.telegram.ui.x5) obj).finishFragment();
                    return;
                }
                return;
            default:
                org.telegram.ui.x6 x6Var = (org.telegram.ui.x6) obj;
                if (i7 == -1) {
                    if (org.telegram.ui.x6.e0(x6Var).x()) {
                        ei.c cVar2 = x6Var.f53656e0;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        org.telegram.ui.i6 i6Var = x6Var.N;
                        if (i6Var != null) {
                            i6Var.f(false);
                            x6Var.N.e();
                            return;
                        }
                        return;
                    }
                    x6Var.finishFragment();
                    return;
                } else if (i7 == 1) {
                    org.telegram.ui.x6.k0(x6Var);
                    return;
                } else if (i7 == 3) {
                    org.telegram.ui.x6.l0(x6Var, false);
                    return;
                } else if (i7 == 4) {
                    org.telegram.ui.x6.l0(x6Var, true);
                    return;
                } else {
                    return;
                }
        }
    }
}
