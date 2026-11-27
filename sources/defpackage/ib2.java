package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class ib2 implements Runnable {
    public final byte a;
    public final wb2 b;

    public ib2(wb2 wb2Var, byte b) {
        this.a = b;
        this.b = wb2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        wb2 wb2Var = this.b;
        switch (b) {
            case 0:
                wb2Var.r2();
                return;
            case 1:
                wb2Var.s2();
                return;
            case 2:
                y99 y99Var = wb2Var.x;
                y99Var.a(wb2Var.kc);
                y99Var.a(wb2Var.lc);
                wb2Var.k3();
                r47 r47Var = wb2Var.Q5;
                if (r47Var != null) {
                    r47Var.n0(null);
                    r47 r47Var2 = wb2Var.Q5;
                    if (r47Var2.z != null) {
                        r47Var2.z = null;
                        r47Var2.k0();
                    }
                    rb2 rb2Var = wb2Var.eb;
                    if (rb2Var != null) {
                        rb2Var.A0(wb2Var, true);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (wb2Var.e8 && !wb2Var.f8 && wb2Var.g8) {
                    wb2Var.f8 = true;
                    wb2Var.Wa.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 4:
                wb2Var.Wa.setState(new int[0]);
                wb2Var.invalidate();
                return;
            case 5:
                wb2Var.P5 = false;
                wb2Var.getMessageObject().N0 = true;
                p47 p47Var = wb2Var.q3;
                if (p47Var != null) {
                    ArrayList arrayList = p47Var.e;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((o47) obj).y.clear();
                    }
                }
                p47 p47Var2 = wb2Var.m3;
                if (p47Var2 != null) {
                    ArrayList arrayList2 = p47Var2.e;
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        ((o47) obj2).y.clear();
                    }
                } else {
                    ArrayList arrayList3 = wb2Var.Q5.B2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i < size3) {
                            Object obj3 = arrayList3.get(i);
                            i++;
                            ((o47) obj3).y.clear();
                        }
                    }
                }
                wb2Var.invalidate();
                return;
            case 6:
                wb2Var.getMessageObject().C.N0 = true;
                wb2Var.fc.clear();
                wb2Var.invalidate();
                return;
            case 7:
                rb2 rb2Var2 = wb2Var.eb;
                if (rb2Var2 != null) {
                    rb2Var2.A0(wb2Var, false);
                    return;
                }
                return;
            case 8:
                wb2Var.Wa.setState(new int[0]);
                wb2Var.invalidate();
                return;
            case 9:
                wb2Var.post(new ib2(wb2Var, (byte) 5));
                return;
            case 10:
                rb2 rb2Var3 = wb2Var.eb;
                if (rb2Var3 != null) {
                    rb2Var3.a1(wb2Var);
                    return;
                }
                return;
            case 11:
                wb2Var.k3();
                return;
            case 12:
                wb2Var.invalidate();
                if (wb2Var.getParent() instanceof View) {
                    ((View) wb2Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                wb2Var.invalidate();
                if (wb2Var.getParent() instanceof View) {
                    ((View) wb2Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
