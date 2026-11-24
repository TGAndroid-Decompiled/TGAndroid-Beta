package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class pt1 implements iu1 {
    public final yv1 a;
    public final yv1 b;

    public pt1(yv1 yv1Var, yv1 yv1Var2) {
        this.b = yv1Var;
        this.a = yv1Var2;
    }

    @Override
    public final void E(boolean z, boolean z2) {
        int c7;
        b31 b31Var;
        int i;
        yv1 yv1Var = this.b;
        if (z) {
            ArrayList arrayList = new ArrayList(yv1Var.V4);
            ArrayList arrayList2 = new ArrayList(yv1Var.X4.values());
            u31 u31Var = null;
            if (z2) {
                i = ((d) yv1Var).currentAccount;
                SharedPreferences sharedPreferences = oc7.r1(i).W3;
                if (yv1Var.V4.isEmpty()) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("pin_" + yv1Var.l6).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("pin_" + yv1Var.l6, ((Integer) yv1Var.V4.get(0)).intValue()).commit();
                }
                yv1Var.gd(0, true);
            } else {
                yv1Var.getNotificationCenter().k(nm7.t0, Long.valueOf(yv1Var.l6), arrayList, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            u31 u31Var2 = yv1Var.P3;
            if (u31Var2 != null) {
                u31Var2.b();
            }
            yv1Var.Q3 = true;
            int i2 = yv1Var.R3 + 1;
            yv1Var.R3 = i2;
            boolean z3 = yv1Var.x4;
            yv1 yv1Var2 = this.a;
            if (z3) {
                c7 = yv1Var2.c7();
            } else {
                c7 = yv1Var.c7();
            }
            int i3 = c7;
            if (!yv1Var.x4) {
                yv1Var2 = yv1Var;
            }
            ArrayList arrayList3 = new ArrayList(yv1Var2.V4);
            o3a o3aVar = new o3a(this, z2, arrayList, arrayList2, i3, i2);
            ot1 ot1Var = new ot1(this, z2, arrayList3, i2);
            wv1 wv1Var = yv1Var.Ba;
            if (yv1Var.getParentActivity() == null) {
                ot1Var.run();
            } else {
                if (z2) {
                    r31 r31Var = new r31(yv1Var.getParentActivity(), wv1Var);
                    r31Var.c(2131624061, 28, 28, "Pin", "Line");
                    r31Var.b.setText(jb6.M0(2131746957, null));
                    r31Var.c.setText(jb6.M0(2131746956, null));
                    b31Var = r31Var;
                } else {
                    b31 b31Var2 = new b31(yv1Var.getParentActivity(), wv1Var);
                    b31Var2.c(2131624061, 28, 28, "Pin", "Line");
                    b31Var2.b.setText(jb6.G(i3, "MessagesUnpinned", new Object[0]));
                    b31Var = b31Var2;
                }
                s31 s31Var = new s31(wv1Var, yv1Var.getParentActivity(), true);
                s31Var.b = o3aVar;
                s31Var.c = ot1Var;
                b31Var.setButton(s31Var);
                u31Var = u31.g(yv1Var, b31Var, 5000);
            }
            yv1Var.P3 = u31Var;
            return;
        }
        k47 k47Var = (k47) yv1Var.X4.get(Integer.valueOf(yv1Var.Z4));
        if (k47Var == null) {
            k47Var = (k47) yv1Var.G6[0].get(yv1Var.Z4);
        }
        yv1Var.Jc(k47Var);
    }

    @Override
    public final void N(String str) {
        this.b.sa(str, false);
    }

    @Override
    public final void Z(int i) {
        this.b.J(i, 0, 0, 0, true, true);
    }
}
