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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.ue;
import org.telegram.ui.an0;
import org.telegram.ui.cn;
import org.telegram.ui.cn0;
import org.telegram.ui.d61;
import org.telegram.ui.j90;
import org.telegram.ui.zm0;
public final class a2 implements View.OnClickListener {
    public final int f8796a;
    public final boolean f8797b;
    public final Object f8798c;

    public a2(int i7, Object obj, boolean z9) {
        this.f8796a = i7;
        this.f8798c = obj;
        this.f8797b = z9;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        boolean z9;
        ue ueVar;
        int i11 = this.f8796a;
        boolean z10 = this.f8797b;
        Object obj = this.f8798c;
        switch (i11) {
            case 0:
                j4 j4Var = (j4) obj;
                boolean z11 = !z10;
                qp s12 = qp.s1(j4Var.f9200l2);
                if (s12.f24867p6 != z11) {
                    SharedPreferences.Editor edit = s12.f24774e7.edit();
                    s12.f24867p6 = z11;
                    edit.putBoolean("storyQualityFull", z11).apply();
                    s12.getNotificationCenter().k(209, new Object[0]);
                }
                hc hcVar = new hc(j4Var.L0, j4Var.f9195k0);
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
                hcVar.I(2131623981, M0, id.M0(i10, null)).j();
                a4 a4Var = j4Var.f9168c1;
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
                    if (g1Var.f9002n && g1Var.f9003r != z12) {
                        g1Var.f9003r = z12;
                        NativeInstance nativeInstance = g1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                }
                a4 a4Var3 = a4Var2.f8808x.f9168c1;
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
                org.telegram.ui.ActionBar.y yVar = r0Var.f28427c;
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
                d61 d61Var = (d61) obj;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.v0 v0Var = ((org.telegram.ui.Cells.v0[]) d61Var.f44867b)[i12];
                    org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) v0Var.d;
                    if (v0Var == view) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    u0Var.a(z9, true);
                }
                iz.f23427p1 = z10;
                SharedPreferences.Editor edit2 = qp.e1().edit();
                edit2.putBoolean("useThreeLinesLayout", iz.f23427p1);
                edit2.apply();
                qs.e().k(3, Boolean.TRUE);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                ad adVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z10 && (ueVar = chatActivityEnterView.L0) != null) {
                    ueVar.g(!S0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !S0;
                org.telegram.messenger.g0.r(adVar);
                org.telegram.messenger.g0.i3(adVar, 500L);
                return;
            case 5:
                di diVar = (di) obj;
                org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                if (diVar.K2 != 0) {
                    diVar.T3.t0();
                    diVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                cn0 cn0Var = new cn0(hashMap, arrayList, 0, true, (cn) f2Var);
                sh shVar = new sh(diVar, hashMap, arrayList);
                zm0 zm0Var = cn0Var.f44712a;
                zm0Var.f52623s0 = shVar;
                zm0 zm0Var2 = cn0Var.f44713b;
                zm0Var2.f52623s0 = shVar;
                zm0Var.f52624t0 = new an0(cn0Var, 1);
                zm0Var2.f52624t0 = new an0(cn0Var, 2);
                int i13 = diVar.M3;
                boolean z13 = diVar.N3;
                zm0Var.k0(i13, z13);
                zm0Var2.k0(i13, z13);
                if (z10) {
                    f2Var.showAsSheet(cn0Var);
                } else {
                    f2Var.presentFragment(cn0Var);
                }
                diVar.dismiss();
                return;
            default:
                j90 j90Var = (j90) obj;
                if (!z10) {
                    org.telegram.ui.Cells.r8 r8Var = j90Var.f46891n;
                    if (r8Var != null && r8Var.f30214e.h) {
                        int i14 = -j90Var.M;
                        j90Var.M = i14;
                        org.telegram.messenger.g0.G3(i14, r8Var, null);
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                    boolean z14 = r8Var2.f30214e.h;
                    r8Var2.setChecked(!z14);
                    j90Var.e0(z14);
                    org.telegram.ui.Cells.r8 r8Var3 = j90Var.f46891n;
                    if (r8Var3 != null) {
                        if (r8Var2.f30214e.h) {
                            r8Var3.setChecked(false);
                            j90Var.f46891n.setCheckBoxIcon(2131232513);
                            j90Var.f46892r.setVisibility(8);
                            return;
                        } else if (j90Var.f46889e == null) {
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
