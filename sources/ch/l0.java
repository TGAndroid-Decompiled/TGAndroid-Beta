package ch;

import java.util.Comparator;
public final class l0 implements Comparator {
    public long f6309a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        int i12;
        m0 m0Var = (m0) obj;
        m0 m0Var2 = (m0) obj2;
        if (this.f6309a >= 0) {
            boolean z9 = m0Var.f6327l;
            if (z9 != m0Var2.f6327l) {
                if (z9) {
                    return -1;
                }
                return 1;
            }
            boolean z10 = m0Var.P;
            if (z10 != m0Var2.P) {
                if (z10) {
                    return -1;
                }
                return 1;
            } else if (z10 && (i11 = m0Var.f6325j) != (i12 = m0Var2.f6325j)) {
                return i11 - i12;
            } else {
                i7 = m0Var.f6312a.lastDrawnPosition;
                i10 = m0Var2.f6312a.lastDrawnPosition;
            }
        } else {
            boolean z11 = m0Var.f6327l;
            if (z11 != m0Var2.f6327l) {
                if (z11) {
                    return -1;
                }
                return 1;
            }
            int i13 = m0Var.f6324i;
            int i14 = m0Var2.f6324i;
            if (i13 != i14) {
                return i14 - i13;
            }
            i7 = m0Var.f6312a.lastDrawnPosition;
            i10 = m0Var2.f6312a.lastDrawnPosition;
        }
        return i7 - i10;
    }
}
