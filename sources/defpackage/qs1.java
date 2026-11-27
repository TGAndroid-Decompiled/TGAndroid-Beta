package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
public final class qs1 implements jt1 {
    public final zu1 a;
    public final zu1 b;

    public qs1(zu1 zu1Var, zu1 zu1Var2) {
        this.b = zu1Var;
        this.a = zu1Var2;
    }

    @Override
    public final void F(boolean z, boolean z2) {
        int c7;
        c21 c21Var;
        int i;
        zu1 zu1Var = this.b;
        if (z) {
            ArrayList arrayList = new ArrayList(zu1Var.V4);
            ArrayList arrayList2 = new ArrayList(zu1Var.X4.values());
            v21 v21Var = null;
            if (z2) {
                i = ((e) zu1Var).currentAccount;
                SharedPreferences sharedPreferences = uc7.s1(i).X3;
                if (zu1Var.V4.isEmpty()) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("pin_" + zu1Var.l6).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("pin_" + zu1Var.l6, ((Integer) zu1Var.V4.get(0)).intValue()).commit();
                }
                zu1Var.gd(0, true);
            } else {
                zu1Var.getNotificationCenter().k(jn7.t0, Long.valueOf(zu1Var.l6), arrayList, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            v21 v21Var2 = zu1Var.P3;
            if (v21Var2 != null) {
                v21Var2.b();
            }
            zu1Var.Q3 = true;
            int i2 = zu1Var.R3 + 1;
            zu1Var.R3 = i2;
            boolean z3 = zu1Var.x4;
            zu1 zu1Var2 = this.a;
            if (z3) {
                c7 = zu1Var2.c7();
            } else {
                c7 = zu1Var.c7();
            }
            int i3 = c7;
            if (!zu1Var.x4) {
                zu1Var2 = zu1Var;
            }
            ArrayList arrayList3 = new ArrayList(zu1Var2.V4);
            l5a l5aVar = new l5a(this, z2, arrayList, arrayList2, i3, i2);
            ps1 ps1Var = new ps1(this, z2, arrayList3, i2);
            xu1 xu1Var = zu1Var.Ba;
            if (zu1Var.getParentActivity() == null) {
                ps1Var.run();
            } else {
                if (z2) {
                    s21 s21Var = new s21(zu1Var.getParentActivity(), xu1Var);
                    s21Var.g(2131624061, 28, 28, "Pin", "Line");
                    s21Var.b.setText(ob6.M0(2131746951, null));
                    s21Var.c.setText(ob6.M0(2131746950, null));
                    c21Var = s21Var;
                } else {
                    c21 c21Var2 = new c21(zu1Var.getParentActivity(), xu1Var);
                    c21Var2.g(2131624061, 28, 28, "Pin", "Line");
                    c21Var2.b.setText(ob6.G(i3, "MessagesUnpinned", new Object[0]));
                    c21Var = c21Var2;
                }
                t21 t21Var = new t21(xu1Var, zu1Var.getParentActivity(), true);
                t21Var.b = l5aVar;
                t21Var.c = ps1Var;
                c21Var.setButton(t21Var);
                v21Var = v21.g(zu1Var, c21Var, 5000);
            }
            zu1Var.P3 = v21Var;
            return;
        }
        r47 r47Var = (r47) zu1Var.X4.get(Integer.valueOf(zu1Var.Z4));
        if (r47Var == null) {
            r47Var = (r47) zu1Var.G6[0].get(zu1Var.Z4);
        }
        zu1Var.Jc(r47Var);
    }

    @Override
    public final void O(String str) {
        this.b.ta(str, false);
    }

    @Override
    public final void c0(int i) {
        this.b.J(i, 0, 0, 0, true, true);
    }
}
