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
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.td;
import org.telegram.ui.bn;
import org.telegram.ui.cn0;
import org.telegram.ui.d61;
import org.telegram.ui.dn0;
import org.telegram.ui.fg0;
import org.telegram.ui.fn0;
import org.telegram.ui.k90;
public final class v1 implements View.OnClickListener {
    public final int f12633a;
    public final boolean f12634b;
    public final Object f12635c;

    public v1(int i7, Object obj, boolean z10) {
        this.f12633a = i7;
        this.f12635c = obj;
        this.f12634b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        boolean z10;
        fg0 fg0Var;
        int i11 = this.f12633a;
        boolean z11 = this.f12634b;
        Object obj = this.f12635c;
        switch (i11) {
            case 0:
                z3 z3Var = (z3) obj;
                boolean z12 = !z11;
                mp u12 = mp.u1(z3Var.f12847m2);
                if (u12.f25760s6 != z12) {
                    SharedPreferences.Editor edit = u12.h7.edit();
                    u12.f25760s6 = z12;
                    edit.putBoolean("storyQualityFull", z12).apply();
                    u12.getNotificationCenter().k(211, new Object[0]);
                }
                lc lcVar = new lc(z3Var.M0, z3Var.f12843l0);
                if (!z11) {
                    i7 = 2131744272;
                } else {
                    i7 = 2131744275;
                }
                String M0 = gd.M0(i7, null);
                if (!z11) {
                    i10 = 2131744273;
                } else {
                    i10 = 2131744276;
                }
                lcVar.I(2131623982, M0, gd.M0(i10, null)).j();
                r3 r3Var = z3Var.f12816d1;
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
                    if (c1Var.f11795n && c1Var.f11796r != z13) {
                        c1Var.f11796r = z13;
                        NativeInstance nativeInstance = c1Var.F;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z13);
                        }
                    }
                }
                r3 r3Var3 = r3Var2.f12498x.f12816d1;
                if (r3Var3 != null) {
                    r3Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) obj;
                if (r0Var.y() && z11) {
                    if (!r0Var.U) {
                        r0Var.U = true;
                        r0Var.r();
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = r0Var.f29918c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.m0 m0Var = r0Var.Q;
                if (m0Var != null) {
                    m0Var.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                d61 d61Var = (d61) obj;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) d61Var.f46829b)[i12];
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) x0Var.d;
                    if (x0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w0Var.a(z10, true);
                }
                bz.f23187p1 = z11;
                SharedPreferences.Editor edit2 = mp.g1().edit();
                edit2.putBoolean("useThreeLinesLayout", bz.f23187p1);
                edit2.apply();
                ks.e().k(3, Boolean.TRUE);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                td tdVar = chatActivityEnterView.f32571d6;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean r12 = chatActivityEnterView.r1();
                if (!z11 && (fg0Var = chatActivityEnterView.M0) != null) {
                    fg0Var.h(!r12);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                chatActivityEnterView.f32564c6 = !r12;
                org.telegram.messenger.g0.r(tdVar);
                org.telegram.messenger.g0.h3(tdVar, 500L);
                return;
            case 5:
                si siVar = (si) obj;
                org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
                if (siVar.O2 != 0) {
                    siVar.X3.v0();
                    siVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                fn0 fn0Var = new fn0(hashMap, arrayList, 0, true, (bn) h2Var);
                hi hiVar = new hi(siVar, hashMap, arrayList);
                cn0 cn0Var = fn0Var.f47723a;
                cn0Var.f46563t0 = hiVar;
                cn0 cn0Var2 = fn0Var.f47724b;
                cn0Var2.f46563t0 = hiVar;
                cn0Var.f46564u0 = new dn0(fn0Var, 1);
                cn0Var2.f46564u0 = new dn0(fn0Var, 2);
                int i13 = siVar.Q3;
                boolean z14 = siVar.R3;
                cn0Var.k0(i13, z14);
                cn0Var2.k0(i13, z14);
                if (z11) {
                    h2Var.showAsSheet(fn0Var);
                } else {
                    h2Var.presentFragment(fn0Var);
                }
                siVar.dismiss();
                return;
            default:
                k90 k90Var = (k90) obj;
                if (!z11) {
                    org.telegram.ui.Cells.s8 s8Var = k90Var.f49212n;
                    if (s8Var != null && s8Var.f31783e.h) {
                        int i14 = -k90Var.N;
                        k90Var.N = i14;
                        org.telegram.messenger.g0.E3(i14, s8Var, null);
                        return;
                    }
                    org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                    boolean z15 = s8Var2.f31783e.h;
                    s8Var2.setChecked(!z15);
                    k90Var.e0(z15);
                    org.telegram.ui.Cells.s8 s8Var3 = k90Var.f49212n;
                    if (s8Var3 != null) {
                        if (s8Var2.f31783e.h) {
                            s8Var3.setChecked(false);
                            k90Var.f49212n.setCheckBoxIcon(2131232515);
                            k90Var.f49213r.setVisibility(8);
                            return;
                        } else if (k90Var.f49210e == null) {
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
