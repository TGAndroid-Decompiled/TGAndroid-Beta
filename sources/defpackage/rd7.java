package defpackage;

import android.util.SparseArray;
public final class rd7 {
    public final SparseArray a;
    public uw3 b;

    public rd7(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(uw3 uw3Var, int i, int i2) {
        int a = uw3Var.a(i);
        SparseArray sparseArray = this.a;
        rd7 rd7Var = (rd7) sparseArray.get(a);
        if (rd7Var == null) {
            rd7Var = new rd7(1);
            sparseArray.put(uw3Var.a(i), rd7Var);
        }
        if (i2 > i) {
            rd7Var.a(uw3Var, i + 1, i2);
        } else {
            rd7Var.b = uw3Var;
        }
    }
}
