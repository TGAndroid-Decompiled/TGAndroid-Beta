package di;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hd;
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
import org.telegram.ui.an;
import org.telegram.ui.an0;
import org.telegram.ui.c61;
import org.telegram.ui.h90;
import org.telegram.ui.xm0;
import org.telegram.ui.ym0;
public final class a2 implements View.OnClickListener {
    public final int f8798a;
    public final boolean f8799b;
    public final Object f8800c;

    public a2(int i7, Object obj, boolean z9) {
        this.f8798a = i7;
        this.f8800c = obj;
        this.f8799b = z9;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        boolean z9;
        ue ueVar;
        int i11 = this.f8798a;
        boolean z10 = this.f8799b;
        Object obj = this.f8800c;
        switch (i11) {
            case 0:
                i4 i4Var = (i4) obj;
                boolean z11 = !z10;
                qp s12 = qp.s1(i4Var.f9168l2);
                if (s12.f24852p6 != z11) {
                    SharedPreferences.Editor edit = s12.f24759e7.edit();
                    s12.f24852p6 = z11;
                    edit.putBoolean("storyQualityFull", z11).apply();
                    s12.getNotificationCenter().k(209, new Object[0]);
                }
                hc hcVar = new hc(i4Var.L0, i4Var.f9163k0);
                if (!z10) {
                    i7 = 2131744508;
                } else {
                    i7 = 2131744511;
                }
                String M0 = hd.M0(i7, null);
                if (!z10) {
                    i10 = 2131744509;
                } else {
                    i10 = 2131744512;
                }
                hcVar.I(2131623981, M0, hd.M0(i10, null)).j();
                z3 z3Var = i4Var.f9136c1;
                if (z3Var != null) {
                    z3Var.a();
                    return;
                }
                return;
            case 1:
                z3 z3Var2 = (z3) obj;
                g1 g1Var = g1.W;
                if (g1Var != null) {
                    boolean z12 = !z10;
                    if (g1Var.f9027n && g1Var.f9028r != z12) {
                        g1Var.f9028r = z12;
                        NativeInstance nativeInstance = g1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                }
                z3 z3Var3 = z3Var2.f10013x.f9136c1;
                if (z3Var3 != null) {
                    z3Var3.a();
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
                org.telegram.ui.ActionBar.y yVar = r0Var.f28422c;
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
                c61 c61Var = (c61) obj;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.v0 v0Var = ((org.telegram.ui.Cells.v0[]) c61Var.f44685b)[i12];
                    org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) v0Var.d;
                    if (v0Var == view) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    u0Var.a(z9, true);
                }
                iz.f23399p1 = z10;
                SharedPreferences.Editor edit2 = qp.e1().edit();
                edit2.putBoolean("useThreeLinesLayout", iz.f23399p1);
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
                an0 an0Var = new an0(hashMap, arrayList, 0, true, (an) f2Var);
                sh shVar = new sh(diVar, hashMap, arrayList);
                xm0 xm0Var = an0Var.f44025a;
                xm0Var.f51920s0 = shVar;
                xm0 xm0Var2 = an0Var.f44026b;
                xm0Var2.f51920s0 = shVar;
                xm0Var.f51921t0 = new ym0(an0Var, 1);
                xm0Var2.f51921t0 = new ym0(an0Var, 2);
                int i13 = diVar.M3;
                boolean z13 = diVar.N3;
                xm0Var.k0(i13, z13);
                xm0Var2.k0(i13, z13);
                if (z10) {
                    f2Var.showAsSheet(an0Var);
                } else {
                    f2Var.presentFragment(an0Var);
                }
                diVar.dismiss();
                return;
            default:
                h90 h90Var = (h90) obj;
                if (!z10) {
                    org.telegram.ui.Cells.r8 r8Var = h90Var.f46281n;
                    if (r8Var != null && r8Var.f30205e.h) {
                        int i14 = -h90Var.M;
                        h90Var.M = i14;
                        org.telegram.messenger.g0.G3(i14, r8Var, null);
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                    boolean z14 = r8Var2.f30205e.h;
                    r8Var2.setChecked(!z14);
                    h90Var.e0(z14);
                    org.telegram.ui.Cells.r8 r8Var3 = h90Var.f46281n;
                    if (r8Var3 != null) {
                        if (r8Var2.f30205e.h) {
                            r8Var3.setChecked(false);
                            h90Var.f46281n.setCheckBoxIcon(2131232513);
                            h90Var.f46282r.setVisibility(8);
                            return;
                        } else if (h90Var.f46279e == null) {
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
