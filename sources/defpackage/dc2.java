package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class dc2 implements Runnable {
    public final byte a;
    public final rc2 b;

    public dc2(rc2 rc2Var, byte b) {
        this.a = b;
        this.b = rc2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        rc2 rc2Var = this.b;
        switch (b) {
            case 0:
                rc2Var.r2();
                return;
            case 1:
                rc2Var.s2();
                return;
            case 2:
                qa4 qa4Var = rc2Var.x;
                qa4Var.a(rc2Var.kc);
                qa4Var.a(rc2Var.lc);
                rc2Var.k3();
                k47 k47Var = rc2Var.Q5;
                if (k47Var != null) {
                    k47Var.n0(null);
                    k47 k47Var2 = rc2Var.Q5;
                    if (k47Var2.z != null) {
                        k47Var2.z = null;
                        k47Var2.k0();
                    }
                    mc2 mc2Var = rc2Var.eb;
                    if (mc2Var != null) {
                        mc2Var.D0(rc2Var, true);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (rc2Var.e8 && !rc2Var.f8 && rc2Var.g8) {
                    rc2Var.f8 = true;
                    rc2Var.Wa.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 4:
                rc2Var.Wa.setState(new int[0]);
                rc2Var.invalidate();
                return;
            case 5:
                rc2Var.Wa.setState(new int[0]);
                rc2Var.invalidate();
                return;
            case 6:
                rc2Var.P5 = false;
                rc2Var.getMessageObject().N0 = true;
                i47 i47Var = rc2Var.q3;
                if (i47Var != null) {
                    ArrayList arrayList = i47Var.e;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((h47) obj).y.clear();
                    }
                }
                i47 i47Var2 = rc2Var.m3;
                if (i47Var2 != null) {
                    ArrayList arrayList2 = i47Var2.e;
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        ((h47) obj2).y.clear();
                    }
                } else {
                    ArrayList arrayList3 = rc2Var.Q5.B2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i < size3) {
                            Object obj3 = arrayList3.get(i);
                            i++;
                            ((h47) obj3).y.clear();
                        }
                    }
                }
                rc2Var.invalidate();
                return;
            case 7:
                rc2Var.getMessageObject().C.N0 = true;
                rc2Var.fc.clear();
                rc2Var.invalidate();
                return;
            case 8:
                mc2 mc2Var2 = rc2Var.eb;
                if (mc2Var2 != null) {
                    mc2Var2.D0(rc2Var, false);
                    return;
                }
                return;
            case 9:
                rc2Var.post(new dc2(rc2Var, (byte) 6));
                return;
            case 10:
                mc2 mc2Var3 = rc2Var.eb;
                if (mc2Var3 != null) {
                    mc2Var3.Z0(rc2Var);
                    return;
                }
                return;
            case 11:
                rc2Var.k3();
                return;
            case 12:
                rc2Var.invalidate();
                if (rc2Var.getParent() instanceof View) {
                    ((View) rc2Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                rc2Var.invalidate();
                if (rc2Var.getParent() instanceof View) {
                    ((View) rc2Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
