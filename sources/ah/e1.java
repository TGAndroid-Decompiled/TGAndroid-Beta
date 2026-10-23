package ah;

import java.util.Comparator;
public final class e1 implements Comparator {
    public long f722a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        g1 g1Var = (g1) obj;
        g1 g1Var2 = (g1) obj2;
        if (this.f722a >= 0) {
            boolean z10 = g1Var.f757m;
            if (z10 != g1Var2.f757m) {
                if (z10) {
                    return -1;
                }
                return 1;
            }
            boolean z11 = g1Var.Q;
            if (z11 != g1Var2.Q) {
                if (z11) {
                    return -1;
                }
                return 1;
            } else if (z11 && (i12 = g1Var.f755k) != (i13 = g1Var2.f755k)) {
                return i12 - i13;
            } else {
                i10 = g1Var.f741a.lastDrawnPosition;
                i11 = g1Var2.f741a.lastDrawnPosition;
            }
        } else {
            boolean z12 = g1Var.f757m;
            if (z12 != g1Var2.f757m) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i14 = g1Var.f754j;
            int i15 = g1Var2.f754j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = g1Var.f741a.lastDrawnPosition;
            i11 = g1Var2.f741a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
