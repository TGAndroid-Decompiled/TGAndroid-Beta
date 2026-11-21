package fi;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.ui;
import org.telegram.ui.bn;
import org.telegram.ui.cn0;
import org.telegram.ui.d61;
import org.telegram.ui.dn0;
import org.telegram.ui.eg0;
import org.telegram.ui.fn0;
import org.telegram.ui.k90;
public final class v1 implements View.OnClickListener {
    public final int f12677a;
    public final boolean f12678b;
    public final Object f12679c;

    public v1(int i7, Object obj, boolean z10) {
        this.f12677a = i7;
        this.f12679c = obj;
        this.f12678b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        boolean z10;
        eg0 eg0Var;
        int i11 = this.f12677a;
        boolean z11 = this.f12678b;
        Object obj = this.f12679c;
        switch (i11) {
            case 0:
                z3 z3Var = (z3) obj;
                boolean z12 = !z11;
                mp u12 = mp.u1(z3Var.f12888m2);
                if (u12.f25788s6 != z12) {
                    SharedPreferences.Editor edit = u12.h7.edit();
                    u12.f25788s6 = z12;
                    edit.putBoolean("storyQualityFull", z12).apply();
                    u12.getNotificationCenter().k(211, new Object[0]);
                }
                lc lcVar = new lc(z3Var.M0, z3Var.f12884l0);
                if (!z11) {
                    i7 = 2131744266;
                } else {
                    i7 = 2131744269;
                }
                String N0 = gd.N0(i7, null);
                if (!z11) {
                    i10 = 2131744267;
                } else {
                    i10 = 2131744270;
                }
                lcVar.I(2131623982, N0, gd.N0(i10, null)).j();
                r3 r3Var = z3Var.f12857d1;
                if (r3Var != null) {
                    r3Var.a();
                    return;
                }
                return;
            case 1:
                r3 r3Var2 = (r3) obj;
                c1 c1Var = c1.X;
                if (c1Var != null) {
                    boolean z13 = !z11;
                    if (c1Var.f11838n && c1Var.f11839r != z13) {
                        c1Var.f11839r = z13;
                        NativeInstance nativeInstance = c1Var.F;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z13);
                        }
                    }
                }
                r3 r3Var3 = r3Var2.f12529x.f12857d1;
                if (r3Var3 != null) {
                    r3Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj;
                if (q0Var.y() && z11) {
                    if (!q0Var.U) {
                        q0Var.U = true;
                        q0Var.r();
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = q0Var.f29901c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.l0 l0Var = q0Var.Q;
                if (l0Var != null) {
                    l0Var.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                d61 d61Var = (d61) obj;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) d61Var.f46885b)[i12];
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) x0Var.d;
                    if (x0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w0Var.a(z10, true);
                }
                bz.f23215p1 = z11;
                SharedPreferences.Editor edit2 = mp.g1().edit();
                edit2.putBoolean("useThreeLinesLayout", bz.f23215p1);
                edit2.apply();
                ks.e().k(3, Boolean.TRUE);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                td tdVar = chatActivityEnterView.f32617f6;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean v12 = chatActivityEnterView.v1();
                if (!z11 && (eg0Var = chatActivityEnterView.M0) != null) {
                    eg0Var.h(!v12);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                chatActivityEnterView.f32608e6 = !v12;
                org.telegram.messenger.g0.r(tdVar);
                org.telegram.messenger.g0.h3(tdVar, 500L);
                return;
            case 5:
                ui uiVar = (ui) obj;
                org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40375a2;
                if (uiVar.O2 != 0) {
                    uiVar.X3.v0();
                    uiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                fn0 fn0Var = new fn0(hashMap, arrayList, 0, true, (bn) g2Var);
                ji jiVar = new ji(uiVar, hashMap, arrayList);
                cn0 cn0Var = fn0Var.f47790a;
                cn0Var.f46619t0 = jiVar;
                cn0 cn0Var2 = fn0Var.f47791b;
                cn0Var2.f46619t0 = jiVar;
                cn0Var.f46620u0 = new dn0(fn0Var, 1);
                cn0Var2.f46620u0 = new dn0(fn0Var, 2);
                int i13 = uiVar.Q3;
                boolean z14 = uiVar.R3;
                cn0Var.k0(i13, z14);
                cn0Var2.k0(i13, z14);
                if (z11) {
                    g2Var.showAsSheet(fn0Var);
                } else {
                    g2Var.presentFragment(fn0Var);
                }
                uiVar.dismiss();
                return;
            default:
                k90 k90Var = (k90) obj;
                if (!z11) {
                    org.telegram.ui.Cells.s8 s8Var = k90Var.f49251n;
                    if (s8Var != null && s8Var.f31811e.h) {
                        int i14 = -k90Var.N;
                        k90Var.N = i14;
                        org.telegram.messenger.g0.E3(i14, s8Var, null);
                        return;
                    }
                    org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                    boolean z15 = s8Var2.f31811e.h;
                    s8Var2.setChecked(!z15);
                    k90Var.e0(z15);
                    org.telegram.ui.Cells.s8 s8Var3 = k90Var.f49251n;
                    if (s8Var3 != null) {
                        if (s8Var2.f31811e.h) {
                            s8Var3.setChecked(false);
                            k90Var.f49251n.setCheckBoxIcon(2131232515);
                            k90Var.f49252r.setVisibility(8);
                            return;
                        } else if (k90Var.f49249e == null) {
                            s8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
