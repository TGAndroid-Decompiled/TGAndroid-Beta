package bi;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ve;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.zy0;
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
        org.telegram.ui.ActionBar.h6 h6Var;
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
                hi.d3 d3Var = (hi.d3) obj;
                if (i7 == -1) {
                    Runnable runnable = d3Var.W;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                } else if (i7 >= 10) {
                    d3Var.e((ve) d3Var.f14345h0.get(i7 - 10), false);
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
                kg.t0 t0Var = (kg.t0) obj;
                if (i7 == -1) {
                    if (t0Var.onBackPressed(true)) {
                        t0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    t0Var.f0();
                    return;
                } else {
                    return;
                }
            case 9:
                kg.v0 v0Var = (kg.v0) obj;
                if (i7 == -1) {
                    if (v0Var.onBackPressed(true)) {
                        v0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    v0Var.c0();
                    return;
                } else {
                    return;
                }
            case 10:
                kg.d1 d1Var = (kg.d1) obj;
                if (i7 == -1) {
                    if (d1Var.onBackPressed(true)) {
                        d1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    d1Var.b0();
                    return;
                } else {
                    return;
                }
            case 11:
                kg.f1 f1Var = (kg.f1) obj;
                if (i7 == -1) {
                    if (f1Var.onBackPressed(true)) {
                        f1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    f1Var.i0();
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
                ArrayList arrayList = t1Var.f18486b;
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
                            h6Var = ((org.telegram.ui.ActionBar.g2) t1Var).resourceProvider;
                            kg.t1.i0(parentActivity, i11, null, c10, h6Var, new hi.r3(this, intValue, 2));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t1Var.getParentActivity(), t1Var.getResourceProvider());
                    String G = hd.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28743a;
                    t1Var2.S = G;
                    t1Var2.U = hd.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                    alertDialog$Builder.k(hd.N0(2131746125, null), new di.v6(this, 29));
                    alertDialog$Builder.h(hd.N0(2131752577, null), null);
                    t1Var.showDialog(t1Var2);
                    return;
                } else {
                    return;
                }
            case 14:
                if (i7 == -1) {
                    ((kg.z1) obj).finishFragment();
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
                li.d0 d0Var = ((li.y) obj).f20008n;
                if (i7 == -1) {
                    if (d0Var.I1) {
                        d0Var.dismiss();
                        return;
                    }
                    d0Var.f19906v1.d.f35742g3.O(false);
                    d0Var.f19899o1.A(0);
                    return;
                } else if (i7 == 3) {
                    d0Var.n1.a(true, true);
                    d0Var.u0(false);
                    d0Var.N1 = null;
                    d0Var.B1.f35742g3.O(true);
                    d0Var.f19910z1.f34632r.getText().clear();
                    d0Var.f19910z1.f34632r.requestFocus();
                    org.telegram.messenger.g0.I3(d0Var.f19910z1.f34632r);
                    return;
                } else {
                    return;
                }
            case 21:
                li.d0 d0Var2 = ((li.z) obj).f20010r;
                if (i7 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", d0Var2.f19900p1);
                    d0Var2.f19905u1.presentFragment(new li.p(bundle));
                    d0Var2.dismiss();
                    return;
                } else if (i7 == 3) {
                    d0Var2.f19898m1.a(true, true);
                    d0Var2.u0(false);
                    TextUtils.isEmpty(d0Var2.M1);
                    d0Var2.M1 = null;
                    d0Var2.A1.h(0L, d0Var2.f19900p1, 0L, 0L, null, false, null, true);
                    d0Var2.f19909y1.f34632r.getText().clear();
                    d0Var2.f19909y1.f34632r.requestFocus();
                    org.telegram.messenger.g0.I3(d0Var2.f19909y1.f34632r);
                    return;
                } else {
                    return;
                }
            case 22:
                li.d0 d0Var3 = ((li.y) obj).f20008n;
                if (i7 == -1) {
                    d0Var3.f19906v1.d.f35742g3.O(false);
                    d0Var3.f19899o1.A(0);
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
                        ei.c cVar2 = x6Var.f53578e0;
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
