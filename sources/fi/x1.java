package fi;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zh;
import org.telegram.ui.an;
import org.telegram.ui.an0;
import org.telegram.ui.bg0;
import org.telegram.ui.cn0;
import org.telegram.ui.i90;
import org.telegram.ui.z51;
import org.telegram.ui.zm0;
public final class x1 implements View.OnClickListener {
    public final int f12489a;
    public final boolean f12490b;
    public final Object f12491c;

    public x1(int i7, Object obj, boolean z10) {
        this.f12489a = i7;
        this.f12491c = obj;
        this.f12490b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        boolean z10;
        bg0 bg0Var;
        int i11 = this.f12489a;
        boolean z11 = this.f12490b;
        Object obj = this.f12491c;
        switch (i11) {
            case 0:
                b4 b4Var = (b4) obj;
                boolean z12 = !z11;
                np s12 = np.s1(b4Var.f11497m2);
                if (s12.f25375q6 != z12) {
                    SharedPreferences.Editor edit = s12.f25283f7.edit();
                    s12.f25375q6 = z12;
                    edit.putBoolean("storyQualityFull", z12).apply();
                    s12.getNotificationCenter().k(209, new Object[0]);
                }
                cc ccVar = new cc(b4Var.M0, b4Var.f11493l0);
                if (!z11) {
                    i7 = 2131744507;
                } else {
                    i7 = 2131744510;
                }
                String M0 = hd.M0(i7, null);
                if (!z11) {
                    i10 = 2131744508;
                } else {
                    i10 = 2131744511;
                }
                ccVar.I(2131623982, M0, hd.M0(i10, null)).j();
                t3 t3Var = b4Var.f11466d1;
                if (t3Var != null) {
                    t3Var.a();
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = (t3) obj;
                e1 e1Var = e1.X;
                if (e1Var != null) {
                    boolean z13 = !z11;
                    if (e1Var.f11658n && e1Var.f11659r != z13) {
                        e1Var.f11659r = z13;
                        NativeInstance nativeInstance = e1Var.F;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z13);
                        }
                    }
                }
                t3 t3Var3 = t3Var2.f12360x.f11466d1;
                if (t3Var3 != null) {
                    t3Var3.a();
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
                org.telegram.ui.ActionBar.y yVar = q0Var.f29499c;
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
                z51 z51Var = (z51) obj;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.v0 v0Var = ((org.telegram.ui.Cells.v0[]) z51Var.f53847b)[i12];
                    org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) v0Var.d;
                    if (v0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u0Var.a(z10, true);
                }
                gz.f23974p1 = z11;
                SharedPreferences.Editor edit2 = np.e1().edit();
                edit2.putBoolean("useThreeLinesLayout", gz.f23974p1);
                edit2.apply();
                ns.e().k(3, Boolean.TRUE);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                uc ucVar = chatActivityEnterView.X5;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean j12 = chatActivityEnterView.j1();
                if (!z11 && (bg0Var = chatActivityEnterView.M0) != null) {
                    bg0Var.h(!j12);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                chatActivityEnterView.W5 = !j12;
                org.telegram.messenger.g0.r(ucVar);
                org.telegram.messenger.g0.i3(ucVar, 500L);
                return;
            case 5:
                ki kiVar = (ki) obj;
                org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
                if (kiVar.O2 != 0) {
                    kiVar.X3.v0();
                    kiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                cn0 cn0Var = new cn0(hashMap, arrayList, 0, true, (an) e2Var);
                zh zhVar = new zh(kiVar, hashMap, arrayList);
                zm0 zm0Var = cn0Var.f46183a;
                zm0Var.f53981t0 = zhVar;
                zm0 zm0Var2 = cn0Var.f46184b;
                zm0Var2.f53981t0 = zhVar;
                zm0Var.f53982u0 = new an0(cn0Var, 1);
                zm0Var2.f53982u0 = new an0(cn0Var, 2);
                int i13 = kiVar.Q3;
                boolean z14 = kiVar.R3;
                zm0Var.k0(i13, z14);
                zm0Var2.k0(i13, z14);
                if (z11) {
                    e2Var.showAsSheet(cn0Var);
                } else {
                    e2Var.presentFragment(cn0Var);
                }
                kiVar.dismiss();
                return;
            default:
                i90 i90Var = (i90) obj;
                if (!z11) {
                    org.telegram.ui.Cells.q8 q8Var = i90Var.f47981n;
                    if (q8Var != null && q8Var.f31310e.h) {
                        int i14 = -i90Var.N;
                        i90Var.N = i14;
                        org.telegram.messenger.g0.F3(i14, q8Var, null);
                        return;
                    }
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                    boolean z15 = q8Var2.f31310e.h;
                    q8Var2.setChecked(!z15);
                    i90Var.e0(z15);
                    org.telegram.ui.Cells.q8 q8Var3 = i90Var.f47981n;
                    if (q8Var3 != null) {
                        if (q8Var2.f31310e.h) {
                            q8Var3.setChecked(false);
                            i90Var.f47981n.setCheckBoxIcon(2131232514);
                            i90Var.f47982r.setVisibility(8);
                            return;
                        } else if (i90Var.f47979e == null) {
                            q8Var3.setCheckBoxIcon(0);
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
