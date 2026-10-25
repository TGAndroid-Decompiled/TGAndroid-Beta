package bh;

import java.util.Comparator;
public final class t0 implements Comparator {
    public long f4148a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        v0 v0Var = (v0) obj;
        v0 v0Var2 = (v0) obj2;
        if (this.f4148a >= 0) {
            boolean z10 = v0Var.f4179m;
            if (z10 != v0Var2.f4179m) {
                if (z10) {
                    return -1;
                }
                return 1;
            }
            boolean z11 = v0Var.Q;
            if (z11 != v0Var2.Q) {
                if (z11) {
                    return -1;
                }
                return 1;
            } else if (z11 && (i12 = v0Var.f4177k) != (i13 = v0Var2.f4177k)) {
                return i12 - i13;
            } else {
                i10 = v0Var.f4163a.lastDrawnPosition;
                i11 = v0Var2.f4163a.lastDrawnPosition;
            }
        } else {
            boolean z12 = v0Var.f4179m;
            if (z12 != v0Var2.f4179m) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i14 = v0Var.f4176j;
            int i15 = v0Var2.f4176j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = v0Var.f4163a.lastDrawnPosition;
            i11 = v0Var2.f4163a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
