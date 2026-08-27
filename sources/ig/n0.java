package ig;

import java.util.Comparator;

public final class n0 implements Comparator {

    public long f11375a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        o0 o0Var = (o0) obj;
        o0 o0Var2 = (o0) obj2;
        if (this.f11375a >= 0) {
            boolean z10 = o0Var.f11394m;
            if (z10 != o0Var2.f11394m) {
                return z10 ? -1 : 1;
            }
            boolean z11 = o0Var.Q;
            if (z11 != o0Var2.Q) {
                return z11 ? -1 : 1;
            }
            if (z11 && (i12 = o0Var.f11392k) != (i13 = o0Var2.f11392k)) {
                return i12 - i13;
            }
            i10 = o0Var.f11377a.lastDrawnPosition;
            i11 = o0Var2.f11377a.lastDrawnPosition;
        } else {
            boolean z12 = o0Var.f11394m;
            if (z12 != o0Var2.f11394m) {
                return z12 ? -1 : 1;
            }
            int i14 = o0Var.f11391j;
            int i15 = o0Var2.f11391j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = o0Var.f11377a.lastDrawnPosition;
            i11 = o0Var2.f11377a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
