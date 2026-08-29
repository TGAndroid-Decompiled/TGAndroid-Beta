package kg;

import java.util.Comparator;
public final class n0 implements Comparator {
    public long f13788a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        o0 o0Var = (o0) obj;
        o0 o0Var2 = (o0) obj2;
        if (this.f13788a >= 0) {
            boolean z10 = o0Var.f13807m;
            if (z10 != o0Var2.f13807m) {
                if (z10) {
                    return -1;
                }
                return 1;
            }
            boolean z11 = o0Var.Q;
            if (z11 != o0Var2.Q) {
                if (z11) {
                    return -1;
                }
                return 1;
            } else if (z11 && (i12 = o0Var.f13805k) != (i13 = o0Var2.f13805k)) {
                return i12 - i13;
            } else {
                i10 = o0Var.f13790a.lastDrawnPosition;
                i11 = o0Var2.f13790a.lastDrawnPosition;
            }
        } else {
            boolean z12 = o0Var.f13807m;
            if (z12 != o0Var2.f13807m) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i14 = o0Var.f13804j;
            int i15 = o0Var2.f13804j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = o0Var.f13790a.lastDrawnPosition;
            i11 = o0Var2.f13790a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
