package defpackage;

import android.util.SparseArray;
public final class tf7 {
    public final SparseArray a;
    public fy3 b;

    public tf7(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(fy3 fy3Var, int i, int i2) {
        int a = fy3Var.a(i);
        SparseArray sparseArray = this.a;
        tf7 tf7Var = (tf7) sparseArray.get(a);
        if (tf7Var == null) {
            tf7Var = new tf7(1);
            sparseArray.put(fy3Var.a(i), tf7Var);
        }
        if (i2 > i) {
            tf7Var.a(fy3Var, i + 1, i2);
        } else {
            tf7Var.b = fy3Var;
        }
    }
}
