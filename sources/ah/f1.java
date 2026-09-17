package ah;

import java.util.Comparator;
public final class f1 implements Comparator {
    public long f543a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        h1 h1Var = (h1) obj;
        h1 h1Var2 = (h1) obj2;
        if (this.f543a >= 0) {
            boolean z10 = h1Var.f581m;
            if (z10 != h1Var2.f581m) {
                if (z10) {
                    return -1;
                }
                return 1;
            }
            boolean z11 = h1Var.Q;
            if (z11 != h1Var2.Q) {
                if (z11) {
                    return -1;
                }
                return 1;
            } else if (z11 && (i12 = h1Var.f579k) != (i13 = h1Var2.f579k)) {
                return i12 - i13;
            } else {
                i10 = h1Var.f564a.lastDrawnPosition;
                i11 = h1Var2.f564a.lastDrawnPosition;
            }
        } else {
            boolean z12 = h1Var.f581m;
            if (z12 != h1Var2.f581m) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i14 = h1Var.f578j;
            int i15 = h1Var2.f578j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = h1Var.f564a.lastDrawnPosition;
            i11 = h1Var2.f564a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
