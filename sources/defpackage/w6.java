package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class w6 implements View.OnClickListener {
    public final byte a;
    public final boolean b;
    public final Object c;

    public w6(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override
    public final void onClick(View view) {
        q67 q67Var;
        boolean z;
        int i;
        int i2;
        byte b = this.a;
        boolean z2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                s7 s7Var = (s7) obj;
                if (s7Var.y() && z2) {
                    if (!s7Var.U) {
                        s7Var.U = true;
                        s7Var.r();
                    } else {
                        return;
                    }
                }
                s6 s6Var = s7Var.c;
                if (s6Var != null) {
                    s6Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
                n7 n7Var = s7Var.Q;
                if (n7Var != null) {
                    n7Var.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i3 = ChatActivityEnterView.X7;
                mv1 mv1Var = chatActivityEnterView.p6;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean E1 = chatActivityEnterView.E1();
                if (!z2 && (q67Var = chatActivityEnterView.M0) != null) {
                    q67Var.f(!E1);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                chatActivityEnterView.o6 = !E1;
                hl.r(mv1Var);
                hl.d3(mv1Var, 500L);
                return;
            case 2:
                n12 n12Var = (n12) obj;
                e eVar = n12Var.Z1;
                if (n12Var.N2 != 0) {
                    n12Var.W3.R();
                    n12Var.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                s98 s98Var = new s98(hashMap, arrayList, 0, true, (zu1) eVar);
                c12 c12Var = new c12(n12Var, hashMap, arrayList);
                l98 l98Var = s98Var.a;
                l98Var.t0 = c12Var;
                l98 l98Var2 = s98Var.b;
                l98Var2.t0 = c12Var;
                l98Var.u0 = new v34(s98Var, (byte) 23);
                l98Var2.u0 = new kj4(s98Var, (byte) 26);
                int i4 = n12Var.P3;
                boolean z3 = n12Var.Q3;
                l98Var.j0(i4, z3);
                l98Var2.j0(i4, z3);
                if (z2) {
                    eVar.showAsSheet(s98Var);
                } else {
                    eVar.presentFragment(s98Var);
                }
                n12Var.dismiss();
                return;
            case 3:
                oob oobVar = (oob) obj;
                for (int i5 = 0; i5 < 2; i5++) {
                    pa2 pa2Var = ((pa2[]) oobVar.b)[i5];
                    oa2 oa2Var = (oa2) pa2Var.d;
                    if (pa2Var == view) {
                        z = true;
                    } else {
                        z = false;
                    }
                    oa2Var.a(z, true);
                }
                xea.l1 = z2;
                SharedPreferences.Editor edit = uc7.e1().edit();
                edit.putBoolean("useThreeLinesLayout", xea.l1);
                edit.apply();
                jn7.e().k(3, Boolean.TRUE);
                return;
            case 4:
                v56 v56Var = (v56) obj;
                if (!z2) {
                    wkb wkbVar = v56Var.n;
                    if (wkbVar != null && wkbVar.e.h) {
                        int i6 = -v56Var.N;
                        v56Var.N = i6;
                        hl.A3(i6, wkbVar, null);
                        return;
                    }
                    wkb wkbVar2 = (wkb) view;
                    boolean z4 = wkbVar2.e.h;
                    wkbVar2.setChecked(!z4);
                    v56Var.d0(z4);
                    wkb wkbVar3 = v56Var.n;
                    if (wkbVar3 != null) {
                        if (wkbVar2.e.h) {
                            wkbVar3.setChecked(false);
                            v56Var.n.setCheckBoxIcon(2131232529);
                            v56Var.r.setVisibility(8);
                            return;
                        } else if (v56Var.e == null) {
                            wkbVar3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                o68 o68Var = (o68) obj;
                boolean z5 = !z2;
                uc7 s1 = uc7.s1(o68Var.m2);
                if (s1.R3 != z5) {
                    SharedPreferences.Editor edit2 = s1.Y3.edit();
                    s1.R3 = z5;
                    edit2.putBoolean("storyQualityFull", z5).apply();
                    s1.getNotificationCenter().k(212, new Object[0]);
                }
                d31 d31Var = new d31(o68Var.M0, o68Var.l0);
                if (!z2) {
                    i = 2131744161;
                } else {
                    i = 2131744164;
                }
                String M0 = ob6.M0(i, null);
                if (!z2) {
                    i2 = 2131744162;
                } else {
                    i2 = 2131744165;
                }
                d31Var.I(2131623982, M0, ob6.M0(i2, null)).j();
                j68 j68Var = o68Var.d1;
                if (j68Var != null) {
                    j68Var.a();
                    return;
                }
                return;
            default:
                j68 j68Var2 = (j68) obj;
                w96 w96Var = w96.N;
                if (w96Var != null) {
                    w96Var.D(!z2);
                }
                j68 j68Var3 = j68Var2.x.d1;
                if (j68Var3 != null) {
                    j68Var3.a();
                    return;
                }
                return;
        }
    }
}
