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
        j47 j47Var;
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
                int i3 = ChatActivityEnterView.r7;
                uv1 uv1Var = chatActivityEnterView.e6;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean u1 = chatActivityEnterView.u1();
                if (!z2 && (j47Var = chatActivityEnterView.M0) != null) {
                    j47Var.f(!u1);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                chatActivityEnterView.d6 = !u1;
                gl.r(uv1Var);
                gl.d3(uv1Var, 500L);
                return;
            case 2:
                x02 x02Var = (x02) obj;
                d dVar = x02Var.Z1;
                if (x02Var.N2 != 0) {
                    x02Var.W3.z0();
                    x02Var.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                b68 b68Var = new b68(hashMap, arrayList, 0, true, (mu1) dVar);
                m02 m02Var = new m02(x02Var, hashMap, arrayList);
                u58 u58Var = b68Var.a;
                u58Var.t0 = m02Var;
                u58 u58Var2 = b68Var.b;
                u58Var2.t0 = m02Var;
                u58Var.u0 = new s34(b68Var, (byte) 23);
                u58Var2.u0 = new pj4(b68Var, (byte) 24);
                int i4 = x02Var.P3;
                boolean z3 = x02Var.Q3;
                u58Var.j0(i4, z3);
                u58Var2.j0(i4, z3);
                if (z2) {
                    dVar.showAsSheet(b68Var);
                } else {
                    dVar.presentFragment(b68Var);
                }
                x02Var.dismiss();
                return;
            case 3:
                pkb pkbVar = (pkb) obj;
                for (int i5 = 0; i5 < 2; i5++) {
                    z92 z92Var = ((z92[]) pkbVar.b)[i5];
                    y92 y92Var = (y92) z92Var.d;
                    if (z92Var == view) {
                        z = true;
                    } else {
                        z = false;
                    }
                    y92Var.a(z, true);
                }
                gba.l1 = z2;
                SharedPreferences.Editor edit = na7.c1().edit();
                edit.putBoolean("useThreeLinesLayout", gba.l1);
                edit.apply();
                kk7.e().k(3, Boolean.TRUE);
                return;
            case 4:
                s36 s36Var = (s36) obj;
                if (!z2) {
                    ahb ahbVar = s36Var.n;
                    if (ahbVar != null && ahbVar.e.h) {
                        int i6 = -s36Var.N;
                        s36Var.N = i6;
                        gl.A3(i6, ahbVar, null);
                        return;
                    }
                    ahb ahbVar2 = (ahb) view;
                    boolean z4 = ahbVar2.e.h;
                    ahbVar2.setChecked(!z4);
                    s36Var.d0(z4);
                    ahb ahbVar3 = s36Var.n;
                    if (ahbVar3 != null) {
                        if (ahbVar2.e.h) {
                            ahbVar3.setChecked(false);
                            s36Var.n.setCheckBoxIcon(2131232518);
                            s36Var.r.setVisibility(8);
                            return;
                        } else if (s36Var.e == null) {
                            ahbVar3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                y28 y28Var = (y28) obj;
                boolean z5 = !z2;
                na7 q1 = na7.q1(y28Var.s2);
                if (q1.Q3 != z5) {
                    SharedPreferences.Editor edit2 = q1.X3.edit();
                    q1.Q3 = z5;
                    edit2.putBoolean("storyQualityFull", z5).apply();
                    q1.getNotificationCenter().k(211, new Object[0]);
                }
                u21 u21Var = new u21(y28Var.S0, y28Var.r0);
                if (!z2) {
                    i = 2131744267;
                } else {
                    i = 2131744270;
                }
                String M0 = k96.M0(i, null);
                if (!z2) {
                    i2 = 2131744268;
                } else {
                    i2 = 2131744271;
                }
                u21Var.I(2131623982, M0, k96.M0(i2, null)).j();
                s28 s28Var = y28Var.j1;
                if (s28Var != null) {
                    s28Var.a();
                    return;
                }
                return;
            default:
                s28 s28Var2 = (s28) obj;
                t76 t76Var = t76.N;
                if (t76Var != null) {
                    t76Var.D(!z2);
                }
                s28 s28Var3 = s28Var2.x.j1;
                if (s28Var3 != null) {
                    s28Var3.a();
                    return;
                }
                return;
        }
    }
}
