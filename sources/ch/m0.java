package ch;

import java.util.Comparator;
public final class m0 implements Comparator {
    public long f5140a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        int i12;
        n0 n0Var = (n0) obj;
        n0 n0Var2 = (n0) obj2;
        if (this.f5140a >= 0) {
            boolean z10 = n0Var.f5157l;
            if (z10 != n0Var2.f5157l) {
                if (z10) {
                    return -1;
                }
                return 1;
            }
            boolean z11 = n0Var.P;
            if (z11 != n0Var2.P) {
                if (z11) {
                    return -1;
                }
                return 1;
            } else if (z11 && (i11 = n0Var.f5155j) != (i12 = n0Var2.f5155j)) {
                return i11 - i12;
            } else {
                i7 = n0Var.f5142a.lastDrawnPosition;
                i10 = n0Var2.f5142a.lastDrawnPosition;
            }
        } else {
            boolean z12 = n0Var.f5157l;
            if (z12 != n0Var2.f5157l) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i13 = n0Var.f5154i;
            int i14 = n0Var2.f5154i;
            if (i13 != i14) {
                return i14 - i13;
            }
            i7 = n0Var.f5142a.lastDrawnPosition;
            i10 = n0Var2.f5142a.lastDrawnPosition;
        }
        return i7 - i10;
    }
}
