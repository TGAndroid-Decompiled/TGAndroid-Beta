package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class sa2 implements Runnable {
    public final byte a;
    public final gb2 b;

    public sa2(gb2 gb2Var, byte b) {
        this.a = b;
        this.b = gb2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        gb2 gb2Var = this.b;
        switch (b) {
            case 0:
                gb2Var.r2();
                return;
            case 1:
                gb2Var.s2();
                return;
            case 2:
                tj2 tj2Var = gb2Var.x;
                tj2Var.a(gb2Var.kc);
                tj2Var.a(gb2Var.lc);
                gb2Var.k3();
                k27 k27Var = gb2Var.Q5;
                if (k27Var != null) {
                    k27Var.n0(null);
                    k27 k27Var2 = gb2Var.Q5;
                    if (k27Var2.z != null) {
                        k27Var2.z = null;
                        k27Var2.k0();
                    }
                    bb2 bb2Var = gb2Var.eb;
                    if (bb2Var != null) {
                        bb2Var.M0(gb2Var, true);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (gb2Var.e8 && !gb2Var.f8 && gb2Var.g8) {
                    gb2Var.f8 = true;
                    gb2Var.Wa.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 4:
                gb2Var.Wa.setState(new int[0]);
                gb2Var.invalidate();
                return;
            case 5:
                gb2Var.Wa.setState(new int[0]);
                gb2Var.invalidate();
                return;
            case 6:
                gb2Var.P5 = false;
                gb2Var.getMessageObject().N0 = true;
                i27 i27Var = gb2Var.q3;
                if (i27Var != null) {
                    ArrayList arrayList = i27Var.e;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((h27) obj).y.clear();
                    }
                }
                i27 i27Var2 = gb2Var.m3;
                if (i27Var2 != null) {
                    ArrayList arrayList2 = i27Var2.e;
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        ((h27) obj2).y.clear();
                    }
                } else {
                    ArrayList arrayList3 = gb2Var.Q5.B2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i < size3) {
                            Object obj3 = arrayList3.get(i);
                            i++;
                            ((h27) obj3).y.clear();
                        }
                    }
                }
                gb2Var.invalidate();
                return;
            case 7:
                gb2Var.getMessageObject().C.N0 = true;
                gb2Var.fc.clear();
                gb2Var.invalidate();
                return;
            case 8:
                bb2 bb2Var2 = gb2Var.eb;
                if (bb2Var2 != null) {
                    bb2Var2.M0(gb2Var, false);
                    return;
                }
                return;
            case 9:
                gb2Var.post(new sa2(gb2Var, (byte) 6));
                return;
            case 10:
                bb2 bb2Var3 = gb2Var.eb;
                if (bb2Var3 != null) {
                    bb2Var3.q1(gb2Var);
                    return;
                }
                return;
            case 11:
                gb2Var.k3();
                return;
            case 12:
                gb2Var.invalidate();
                if (gb2Var.getParent() instanceof View) {
                    ((View) gb2Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                gb2Var.invalidate();
                if (gb2Var.getParent() instanceof View) {
                    ((View) gb2Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
