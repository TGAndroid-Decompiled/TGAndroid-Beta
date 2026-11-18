package ch;

import java.util.Comparator;
public final class m0 implements Comparator {
    public long f5427a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        int i12;
        n0 n0Var = (n0) obj;
        n0 n0Var2 = (n0) obj2;
        if (this.f5427a >= 0) {
            boolean z10 = n0Var.f5445l;
            if (z10 != n0Var2.f5445l) {
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
            } else if (z11 && (i11 = n0Var.f5443j) != (i12 = n0Var2.f5443j)) {
                return i11 - i12;
            } else {
                i7 = n0Var.f5430a.lastDrawnPosition;
                i10 = n0Var2.f5430a.lastDrawnPosition;
            }
        } else {
            boolean z12 = n0Var.f5445l;
            if (z12 != n0Var2.f5445l) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i13 = n0Var.f5442i;
            int i14 = n0Var2.f5442i;
            if (i13 != i14) {
                return i14 - i13;
            }
            i7 = n0Var.f5430a.lastDrawnPosition;
            i10 = n0Var2.f5430a.lastDrawnPosition;
        }
        return i7 - i10;
    }
}
