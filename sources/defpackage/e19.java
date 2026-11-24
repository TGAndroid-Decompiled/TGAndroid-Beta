package defpackage;

import java.util.Comparator;
public final class e19 implements Comparator {
    public long a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        f19 f19Var = (f19) obj;
        f19 f19Var2 = (f19) obj2;
        if (this.a >= 0) {
            boolean z = f19Var.l;
            if (z != f19Var2.l) {
                if (z) {
                    return -1;
                }
                return 1;
            }
            boolean z2 = f19Var.P;
            if (z2 != f19Var2.P) {
                if (z2) {
                    return -1;
                }
                return 1;
            } else if (z2 && (i3 = f19Var.j) != (i4 = f19Var2.j)) {
                return i3 - i4;
            } else {
                i = f19Var.a.lastDrawnPosition;
                i2 = f19Var2.a.lastDrawnPosition;
            }
        } else {
            boolean z3 = f19Var.l;
            if (z3 != f19Var2.l) {
                if (z3) {
                    return -1;
                }
                return 1;
            }
            int i5 = f19Var.i;
            int i6 = f19Var2.i;
            if (i5 != i6) {
                return i6 - i5;
            }
            i = f19Var.a.lastDrawnPosition;
            i2 = f19Var2.a.lastDrawnPosition;
        }
        return i - i2;
    }
}
