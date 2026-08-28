package hg;

import java.util.Comparator;
public final class o0 implements Comparator {
    public long f10680a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i9;
        int i10;
        int i11;
        int i12;
        p0 p0Var = (p0) obj;
        p0 p0Var2 = (p0) obj2;
        if (this.f10680a >= 0) {
            boolean z10 = p0Var.f10698m;
            if (z10 != p0Var2.f10698m) {
                if (z10) {
                    return -1;
                }
                return 1;
            }
            boolean z11 = p0Var.Q;
            if (z11 != p0Var2.Q) {
                if (z11) {
                    return -1;
                }
                return 1;
            } else if (z11 && (i11 = p0Var.f10696k) != (i12 = p0Var2.f10696k)) {
                return i11 - i12;
            } else {
                i9 = p0Var.f10681a.lastDrawnPosition;
                i10 = p0Var2.f10681a.lastDrawnPosition;
            }
        } else {
            boolean z12 = p0Var.f10698m;
            if (z12 != p0Var2.f10698m) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i13 = p0Var.f10695j;
            int i14 = p0Var2.f10695j;
            if (i13 != i14) {
                return i14 - i13;
            }
            i9 = p0Var.f10681a.lastDrawnPosition;
            i10 = p0Var2.f10681a.lastDrawnPosition;
        }
        return i9 - i10;
    }
}
