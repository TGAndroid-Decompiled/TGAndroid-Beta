package dh;

import java.util.Comparator;
public final class k0 implements Comparator {
    public long f9058a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i3;
        int i10;
        int i11;
        int i12;
        l0 l0Var = (l0) obj;
        l0 l0Var2 = (l0) obj2;
        if (this.f9058a >= 0) {
            boolean z10 = l0Var.f9075l;
            if (z10 != l0Var2.f9075l) {
                if (z10) {
                    return -1;
                }
                return 1;
            }
            boolean z11 = l0Var.P;
            if (z11 != l0Var2.P) {
                if (z11) {
                    return -1;
                }
                return 1;
            } else if (z11 && (i11 = l0Var.f9073j) != (i12 = l0Var2.f9073j)) {
                return i11 - i12;
            } else {
                i3 = l0Var.f9060a.lastDrawnPosition;
                i10 = l0Var2.f9060a.lastDrawnPosition;
            }
        } else {
            boolean z12 = l0Var.f9075l;
            if (z12 != l0Var2.f9075l) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i13 = l0Var.f9072i;
            int i14 = l0Var2.f9072i;
            if (i13 != i14) {
                return i14 - i13;
            }
            i3 = l0Var.f9060a.lastDrawnPosition;
            i10 = l0Var2.f9060a.lastDrawnPosition;
        }
        return i3 - i10;
    }
}
