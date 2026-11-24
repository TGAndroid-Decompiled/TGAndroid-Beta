package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class v6 implements View.OnClickListener {
    public final byte a;
    public final boolean b;
    public final Object c;

    public v6(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override
    public final void onClick(View view) {
        j67 j67Var;
        boolean z;
        int i;
        int i2;
        byte b = this.a;
        boolean z2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                r7 r7Var = (r7) obj;
                if (r7Var.y() && z2) {
                    if (!r7Var.U) {
                        r7Var.U = true;
                        r7Var.r();
                    } else {
                        return;
                    }
                }
                r6 r6Var = r7Var.c;
                if (r6Var != null) {
                    r6Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
                m7 m7Var = r7Var.Q;
                if (m7Var != null) {
                    m7Var.h(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i3 = ChatActivityEnterView.z7;
                mw1 mw1Var = chatActivityEnterView.e6;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean w1 = chatActivityEnterView.w1();
                if (!z2 && (j67Var = chatActivityEnterView.M0) != null) {
                    j67Var.f(!w1);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                chatActivityEnterView.d6 = !w1;
                gm.r(mw1Var);
                gm.d3(mw1Var, 500L);
                return;
            case 2:
                i22 i22Var = (i22) obj;
                d dVar = i22Var.Z1;
                if (i22Var.N2 != 0) {
                    i22Var.W3.I();
                    i22Var.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                d88 d88Var = new d88(hashMap, arrayList, 0, true, (yv1) dVar);
                x12 x12Var = new x12(i22Var, hashMap, arrayList);
                w78 w78Var = d88Var.a;
                w78Var.t0 = x12Var;
                w78 w78Var2 = d88Var.b;
                w78Var2.t0 = x12Var;
                w78Var.u0 = new fk3(d88Var);
                w78Var2.u0 = new k44(d88Var, (byte) 25);
                int i4 = i22Var.P3;
                boolean z3 = i22Var.Q3;
                w78Var.k0(i4, z3);
                w78Var2.k0(i4, z3);
                if (z2) {
                    dVar.showAsSheet(d88Var);
                } else {
                    dVar.presentFragment(d88Var);
                }
                i22Var.dismiss();
                return;
            case 3:
                qmb qmbVar = (qmb) obj;
                for (int i5 = 0; i5 < 2; i5++) {
                    kb2 kb2Var = ((kb2[]) qmbVar.b)[i5];
                    jb2 jb2Var = (jb2) kb2Var.d;
                    if (kb2Var == view) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jb2Var.a(z, true);
                }
                gda.l1 = z2;
                SharedPreferences.Editor edit = oc7.d1().edit();
                edit.putBoolean("useThreeLinesLayout", gda.l1);
                edit.apply();
                nm7.e().k(3, Boolean.TRUE);
                return;
            case 4:
                s56 s56Var = (s56) obj;
                if (!z2) {
                    bjb bjbVar = s56Var.n;
                    if (bjbVar != null && bjbVar.e.h) {
                        int i6 = -s56Var.N;
                        s56Var.N = i6;
                        gm.A3(i6, bjbVar, null);
                        return;
                    }
                    bjb bjbVar2 = (bjb) view;
                    boolean z4 = bjbVar2.e.h;
                    bjbVar2.setChecked(!z4);
                    s56Var.e0(z4);
                    bjb bjbVar3 = s56Var.n;
                    if (bjbVar3 != null) {
                        if (bjbVar2.e.h) {
                            bjbVar3.setChecked(false);
                            s56Var.n.setCheckBoxIcon(2131232530);
                            s56Var.r.setVisibility(8);
                            return;
                        } else if (s56Var.e == null) {
                            bjbVar3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                a58 a58Var = (a58) obj;
                boolean z5 = !z2;
                oc7 r1 = oc7.r1(a58Var.s2);
                if (r1.Q3 != z5) {
                    SharedPreferences.Editor edit2 = r1.X3.edit();
                    r1.Q3 = z5;
                    edit2.putBoolean("storyQualityFull", z5).apply();
                    r1.getNotificationCenter().k(212, new Object[0]);
                }
                c41 c41Var = new c41(a58Var.S0, a58Var.r0);
                if (!z2) {
                    i = 2131744193;
                } else {
                    i = 2131744196;
                }
                String M0 = jb6.M0(i, null);
                if (!z2) {
                    i2 = 2131744194;
                } else {
                    i2 = 2131744197;
                }
                c41Var.I(2131623982, M0, jb6.M0(i2, null)).j();
                v48 v48Var = a58Var.j1;
                if (v48Var != null) {
                    v48Var.a();
                    return;
                }
                return;
            default:
                v48 v48Var2 = (v48) obj;
                s96 s96Var = s96.N;
                if (s96Var != null) {
                    s96Var.D(!z2);
                }
                v48 v48Var3 = v48Var2.x.j1;
                if (v48Var3 != null) {
                    v48Var3.a();
                    return;
                }
                return;
        }
    }
}
