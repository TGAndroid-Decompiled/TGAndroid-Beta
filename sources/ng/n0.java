package ng;

import java.util.Comparator;
public final class n0 implements Comparator {
    public long f16140a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        o0 o0Var = (o0) obj;
        o0 o0Var2 = (o0) obj2;
        if (this.f16140a >= 0) {
            boolean z4 = o0Var.f16159m;
            if (z4 != o0Var2.f16159m) {
                if (z4) {
                    return -1;
                }
                return 1;
            }
            boolean z10 = o0Var.Q;
            if (z10 != o0Var2.Q) {
                if (z10) {
                    return -1;
                }
                return 1;
            } else if (z10 && (i12 = o0Var.f16157k) != (i13 = o0Var2.f16157k)) {
                return i12 - i13;
            } else {
                i10 = o0Var.f16142a.lastDrawnPosition;
                i11 = o0Var2.f16142a.lastDrawnPosition;
            }
        } else {
            boolean z11 = o0Var.f16159m;
            if (z11 != o0Var2.f16159m) {
                if (z11) {
                    return -1;
                }
                return 1;
            }
            int i14 = o0Var.f16156j;
            int i15 = o0Var2.f16156j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = o0Var.f16142a.lastDrawnPosition;
            i11 = o0Var2.f16142a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
