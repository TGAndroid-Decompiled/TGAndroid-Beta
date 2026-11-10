package di;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.te;
import org.telegram.ui.Components.zc;
import org.telegram.ui.an0;
import org.telegram.ui.bn0;
import org.telegram.ui.cn;
import org.telegram.ui.dn0;
import org.telegram.ui.e61;
import org.telegram.ui.k90;
public final class a2 implements View.OnClickListener {
    public final int f8801a;
    public final boolean f8802b;
    public final Object f8803c;

    public a2(int i7, Object obj, boolean z9) {
        this.f8801a = i7;
        this.f8803c = obj;
        this.f8802b = z9;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        boolean z9;
        te teVar;
        int i11 = this.f8801a;
        boolean z10 = this.f8802b;
        Object obj = this.f8803c;
        switch (i11) {
            case 0:
                j4 j4Var = (j4) obj;
                boolean z11 = !z10;
                qp s12 = qp.s1(j4Var.f9205l2);
                if (s12.f24871p6 != z11) {
                    SharedPreferences.Editor edit = s12.f24778e7.edit();
                    s12.f24871p6 = z11;
                    edit.putBoolean("storyQualityFull", z11).apply();
                    s12.getNotificationCenter().k(209, new Object[0]);
                }
                gc gcVar = new gc(j4Var.L0, j4Var.f9200k0);
                if (!z10) {
                    i7 = 2131744507;
                } else {
                    i7 = 2131744510;
                }
                String M0 = id.M0(i7, null);
                if (!z10) {
                    i10 = 2131744508;
                } else {
                    i10 = 2131744511;
                }
                gcVar.I(2131623981, M0, id.M0(i10, null)).j();
                a4 a4Var = j4Var.f9173c1;
                if (a4Var != null) {
                    a4Var.a();
                    return;
                }
                return;
            case 1:
                a4 a4Var2 = (a4) obj;
                g1 g1Var = g1.W;
                if (g1Var != null) {
                    boolean z12 = !z10;
                    if (g1Var.f9007n && g1Var.f9008r != z12) {
                        g1Var.f9008r = z12;
                        NativeInstance nativeInstance = g1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                }
                a4 a4Var3 = a4Var2.f8813x.f9173c1;
                if (a4Var3 != null) {
                    a4Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) obj;
                if (r0Var.x() && z10) {
                    if (!r0Var.T) {
                        r0Var.T = true;
                        r0Var.q();
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = r0Var.f28432c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.m0 m0Var = r0Var.P;
                if (m0Var != null) {
                    m0Var.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                e61 e61Var = (e61) obj;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.v0 v0Var = ((org.telegram.ui.Cells.v0[]) e61Var.f45178b)[i12];
                    org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) v0Var.d;
                    if (v0Var == view) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    u0Var.a(z9, true);
                }
                iz.f23431p1 = z10;
                SharedPreferences.Editor edit2 = qp.e1().edit();
                edit2.putBoolean("useThreeLinesLayout", iz.f23431p1);
                edit2.apply();
                qs.e().k(3, Boolean.TRUE);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                zc zcVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z10 && (teVar = chatActivityEnterView.L0) != null) {
                    teVar.g(!S0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !S0;
                org.telegram.messenger.g0.r(zcVar);
                org.telegram.messenger.g0.i3(zcVar, 500L);
                return;
            case 5:
                ci ciVar = (ci) obj;
                org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
                if (ciVar.N2 != 0) {
                    ciVar.W3.t0();
                    ciVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                dn0 dn0Var = new dn0(hashMap, arrayList, 0, true, (cn) f2Var);
                rh rhVar = new rh(ciVar, hashMap, arrayList);
                an0 an0Var = dn0Var.f45014a;
                an0Var.f43773s0 = rhVar;
                an0 an0Var2 = dn0Var.f45015b;
                an0Var2.f43773s0 = rhVar;
                an0Var.f43774t0 = new bn0(dn0Var, 1);
                an0Var2.f43774t0 = new bn0(dn0Var, 2);
                int i13 = ciVar.P3;
                boolean z13 = ciVar.Q3;
                an0Var.k0(i13, z13);
                an0Var2.k0(i13, z13);
                if (z10) {
                    f2Var.showAsSheet(dn0Var);
                } else {
                    f2Var.presentFragment(dn0Var);
                }
                ciVar.dismiss();
                return;
            default:
                k90 k90Var = (k90) obj;
                if (!z10) {
                    org.telegram.ui.Cells.r8 r8Var = k90Var.f47229n;
                    if (r8Var != null && r8Var.f30225e.h) {
                        int i14 = -k90Var.M;
                        k90Var.M = i14;
                        org.telegram.messenger.g0.G3(i14, r8Var, null);
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                    boolean z14 = r8Var2.f30225e.h;
                    r8Var2.setChecked(!z14);
                    k90Var.e0(z14);
                    org.telegram.ui.Cells.r8 r8Var3 = k90Var.f47229n;
                    if (r8Var3 != null) {
                        if (r8Var2.f30225e.h) {
                            r8Var3.setChecked(false);
                            k90Var.f47229n.setCheckBoxIcon(2131232513);
                            k90Var.f47230r.setVisibility(8);
                            return;
                        } else if (k90Var.f47227e == null) {
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
