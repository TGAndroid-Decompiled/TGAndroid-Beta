package defpackage;

import java.util.Comparator;
public final class h39 implements Comparator {
    public long a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        i39 i39Var = (i39) obj;
        i39 i39Var2 = (i39) obj2;
        if (this.a >= 0) {
            boolean z = i39Var.l;
            if (z != i39Var2.l) {
                if (z) {
                    return -1;
                }
                return 1;
            }
            boolean z2 = i39Var.P;
            if (z2 != i39Var2.P) {
                if (z2) {
                    return -1;
                }
                return 1;
            } else if (z2 && (i3 = i39Var.j) != (i4 = i39Var2.j)) {
                return i3 - i4;
            } else {
                i = i39Var.a.lastDrawnPosition;
                i2 = i39Var2.a.lastDrawnPosition;
            }
        } else {
            boolean z3 = i39Var.l;
            if (z3 != i39Var2.l) {
                if (z3) {
                    return -1;
                }
                return 1;
            }
            int i5 = i39Var.i;
            int i6 = i39Var2.i;
            if (i5 != i6) {
                return i6 - i5;
            }
            i = i39Var.a.lastDrawnPosition;
            i2 = i39Var2.a.lastDrawnPosition;
        }
        return i - i2;
    }
}
