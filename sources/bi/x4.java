package bi;

import android.os.Bundle;
import android.text.TextUtils;
import di.z6;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ve;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.i8;
import org.telegram.ui.i9;
import org.telegram.ui.vy0;
import org.telegram.ui.y6;
public final class x4 extends org.telegram.ui.ActionBar.j {
    public final int f3985a;
    public final Object f3986b;

    public x4(Object obj, int i7) {
        this.f3985a = i7;
        this.f3986b = obj;
    }

    @Override
    public final void b(int i7) {
        org.telegram.ui.ActionBar.w4 w4Var;
        int i10 = this.f3985a;
        Object obj = this.f3986b;
        switch (i10) {
            case 0:
                if (i7 == -1) {
                    ((a6) obj).finishFragment();
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
                if (i7 == -1) {
                    ((di.t) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                hi.d3 d3Var = (hi.d3) obj;
                if (i7 == -1) {
                    Runnable runnable = d3Var.W;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                } else if (i7 >= 10) {
                    d3Var.e((ve) d3Var.f14111h0.get(i7 - 10), false);
                    return;
                } else {
                    return;
                }
            case 4:
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
            case 5:
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
            case 6:
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
            case 7:
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
            case 8:
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
            case 9:
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
            case 10:
                if (i7 == -1) {
                    ((kg.e1) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                kg.r1 r1Var = (kg.r1) obj;
                ArrayList arrayList = r1Var.f18083b;
                if (i7 == -1) {
                    if (arrayList.isEmpty()) {
                        r1Var.finishFragment();
                        return;
                    } else {
                        kg.r1.c0(r1Var);
                        return;
                    }
                } else if (i7 == 1) {
                    if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        kg.u1 c10 = kg.v1.f(kg.r1.d0(r1Var)).c(intValue);
                        if (c10 != null) {
                            kg.r1.i0(r1Var.getParentActivity(), kg.r1.e0(r1Var), null, c10, kg.r1.f0(r1Var), new ai.y1(this, intValue, 3));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, r1Var.getParentActivity(), r1Var.getResourceProvider());
                    String G = hd.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = G;
                    t1Var.U = hd.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                    alertDialog$Builder.k(hd.M0(2131746321, null), new z6(this, 27));
                    alertDialog$Builder.h(hd.M0(2131752589, null), null);
                    r1Var.showDialog(t1Var);
                    return;
                } else {
                    return;
                }
            case 12:
                if (i7 == -1) {
                    ((kg.y1) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i7 == -1) {
                    ((ki.s) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i7 == -1) {
                    ((ki.j4) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i7 == -1) {
                    ((li.e) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i7 == -1) {
                    ((li.n) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i7 == -1) {
                    ((li.r) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                li.d0 d0Var = ((li.y) obj).f19647n;
                if (i7 == -1) {
                    if (d0Var.I1) {
                        d0Var.dismiss();
                        return;
                    }
                    d0Var.f19548v1.d.f39892g3.O(false);
                    d0Var.f19541o1.C(0);
                    return;
                } else if (i7 == 3) {
                    d0Var.n1.a(true, true);
                    d0Var.u0(false);
                    d0Var.N1 = null;
                    d0Var.B1.f39892g3.O(true);
                    d0Var.f19552z1.f40202r.getText().clear();
                    d0Var.f19552z1.f40202r.requestFocus();
                    org.telegram.messenger.g0.J3(d0Var.f19552z1.f40202r);
                    return;
                } else {
                    return;
                }
            case 19:
                li.d0 d0Var2 = ((li.z) obj).f19649r;
                if (i7 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", d0Var2.f19542p1);
                    d0Var2.f19547u1.presentFragment(new li.n(bundle));
                    d0Var2.dismiss();
                    return;
                } else if (i7 == 3) {
                    d0Var2.f19540m1.a(true, true);
                    d0Var2.u0(false);
                    TextUtils.isEmpty(d0Var2.M1);
                    d0Var2.M1 = null;
                    d0Var2.A1.h(0L, d0Var2.f19542p1, 0L, 0L, null, false, null, true);
                    d0Var2.f19551y1.f40202r.getText().clear();
                    d0Var2.f19551y1.f40202r.requestFocus();
                    org.telegram.messenger.g0.J3(d0Var2.f19551y1.f40202r);
                    return;
                } else {
                    return;
                }
            case 20:
                li.d0 d0Var3 = ((li.y) obj).f19647n;
                if (i7 == -1) {
                    d0Var3.f19548v1.d.f39892g3.O(false);
                    d0Var3.f19541o1.C(0);
                    return;
                }
                return;
            case 21:
                if (i7 == -1) {
                    ((org.telegram.ui.g) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i7 == -1) {
                    ((org.telegram.ui.k) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i7 == -1) {
                    ((org.telegram.ui.o) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i7 == -1) {
                    ((vy0) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i7 == -1) {
                    ((org.telegram.ui.p4) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i7 == -1) {
                    ((org.telegram.ui.y5) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                y6 y6Var = (y6) obj;
                if (i7 == -1) {
                    if (y6.e0(y6Var).v()) {
                        ei.c cVar2 = y6Var.f53446e0;
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
                    y6.k0(y6Var);
                    return;
                } else if (i7 == 3) {
                    y6.l0(y6Var, false);
                    return;
                } else if (i7 == 4) {
                    y6.l0(y6Var, true);
                    return;
                } else {
                    return;
                }
            case 28:
                i8 i8Var = (i8) obj;
                if (i7 == -1) {
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
                i9 i9Var = (i9) obj;
                if (i7 == -1) {
                    w4Var = ((org.telegram.ui.ActionBar.e2) i9Var).simpleActionBar;
                    if (w4Var.v()) {
                        i9Var.j0(true);
                        return;
                    } else {
                        i9Var.finishFragment();
                        return;
                    }
                } else if (i7 == 2) {
                    i9.e0(i9Var, false);
                    return;
                } else if (i7 == 3) {
                    i9.e0(i9Var, true);
                    return;
                } else {
                    return;
                }
        }
    }
}
