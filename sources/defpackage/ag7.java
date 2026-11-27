package defpackage;

import android.util.SparseArray;
public final class ag7 {
    public final SparseArray a;
    public px3 b;

    public ag7(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(px3 px3Var, int i, int i2) {
        int a = px3Var.a(i);
        SparseArray sparseArray = this.a;
        ag7 ag7Var = (ag7) sparseArray.get(a);
        if (ag7Var == null) {
            ag7Var = new ag7(1);
            sparseArray.put(px3Var.a(i), ag7Var);
        }
        if (i2 > i) {
            ag7Var.a(px3Var, i + 1, i2);
        } else {
            ag7Var.b = px3Var;
        }
    }
}
