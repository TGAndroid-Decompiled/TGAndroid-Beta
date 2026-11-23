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
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.ti;
import org.telegram.ui.an0;
import org.telegram.ui.b61;
import org.telegram.ui.bn;
import org.telegram.ui.bn0;
import org.telegram.ui.dg0;
import org.telegram.ui.dn0;
import org.telegram.ui.j90;
public final class v1 implements View.OnClickListener {
    public final int f12642a;
    public final boolean f12643b;
    public final Object f12644c;

    public v1(int i7, Object obj, boolean z10) {
        this.f12642a = i7;
        this.f12644c = obj;
        this.f12643b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        boolean z10;
        dg0 dg0Var;
        int i11 = this.f12642a;
        boolean z11 = this.f12643b;
        Object obj = this.f12644c;
        switch (i11) {
            case 0:
                z3 z3Var = (z3) obj;
                boolean z12 = !z11;
                mp u12 = mp.u1(z3Var.f12853m2);
                if (u12.f25855s6 != z12) {
                    SharedPreferences.Editor edit = u12.h7.edit();
                    u12.f25855s6 = z12;
                    edit.putBoolean("storyQualityFull", z12).apply();
                    u12.getNotificationCenter().k(211, new Object[0]);
                }
                kc kcVar = new kc(z3Var.M0, z3Var.f12849l0);
                if (!z11) {
                    i7 = 2131744263;
                } else {
                    i7 = 2131744266;
                }
                String N0 = gd.N0(i7, null);
                if (!z11) {
                    i10 = 2131744264;
                } else {
                    i10 = 2131744267;
                }
                kcVar.I(2131623982, N0, gd.N0(i10, null)).j();
                r3 r3Var = z3Var.f12822d1;
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
                    if (c1Var.f11803n && c1Var.f11804r != z13) {
                        c1Var.f11804r = z13;
                        NativeInstance nativeInstance = c1Var.F;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z13);
                        }
                    }
                }
                r3 r3Var3 = r3Var2.f12494x.f12822d1;
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
                org.telegram.ui.ActionBar.y yVar = q0Var.f29961c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.l0 l0Var = q0Var.Q;
                if (l0Var != null) {
                    l0Var.h(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                b61 b61Var = (b61) obj;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) b61Var.f45965b)[i12];
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) x0Var.d;
                    if (x0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w0Var.a(z10, true);
                }
                bz.f23312p1 = z11;
                SharedPreferences.Editor edit2 = mp.g1().edit();
                edit2.putBoolean("useThreeLinesLayout", bz.f23312p1);
                edit2.apply();
                ks.e().k(3, Boolean.TRUE);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                td tdVar = chatActivityEnterView.f32684f6;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean w12 = chatActivityEnterView.w1();
                if (!z11 && (dg0Var = chatActivityEnterView.M0) != null) {
                    dg0Var.h(!w12);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                chatActivityEnterView.f32675e6 = !w12;
                org.telegram.messenger.g0.r(tdVar);
                org.telegram.messenger.g0.h3(tdVar, 500L);
                return;
            case 5:
                ti tiVar = (ti) obj;
                org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
                if (tiVar.O2 != 0) {
                    tiVar.X3.l0();
                    tiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                dn0 dn0Var = new dn0(hashMap, arrayList, 0, true, (bn) g2Var);
                ii iiVar = new ii(tiVar, hashMap, arrayList);
                an0 an0Var = dn0Var.f47195a;
                an0Var.f45769t0 = iiVar;
                an0 an0Var2 = dn0Var.f47196b;
                an0Var2.f45769t0 = iiVar;
                an0Var.f45770u0 = new bn0(dn0Var, 1);
                an0Var2.f45770u0 = new bn0(dn0Var, 2);
                int i13 = tiVar.Q3;
                boolean z14 = tiVar.R3;
                an0Var.k0(i13, z14);
                an0Var2.k0(i13, z14);
                if (z11) {
                    g2Var.showAsSheet(dn0Var);
                } else {
                    g2Var.presentFragment(dn0Var);
                }
                tiVar.dismiss();
                return;
            default:
                j90 j90Var = (j90) obj;
                if (!z11) {
                    org.telegram.ui.Cells.r8 r8Var = j90Var.f49064n;
                    if (r8Var != null && r8Var.f31813e.h) {
                        int i14 = -j90Var.N;
                        j90Var.N = i14;
                        org.telegram.messenger.g0.E3(i14, r8Var, null);
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                    boolean z15 = r8Var2.f31813e.h;
                    r8Var2.setChecked(!z15);
                    j90Var.e0(z15);
                    org.telegram.ui.Cells.r8 r8Var3 = j90Var.f49064n;
                    if (r8Var3 != null) {
                        if (r8Var2.f31813e.h) {
                            r8Var3.setChecked(false);
                            j90Var.f49064n.setCheckBoxIcon(2131232518);
                            j90Var.f49065r.setVisibility(8);
                            return;
                        } else if (j90Var.f49062e == null) {
                            r8Var3.setCheckBoxIcon(0);
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
