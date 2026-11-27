package defpackage;

import android.util.SparseArray;
public final class bg7 {
    public final SparseArray a;
    public px3 b;

    public bg7(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(px3 px3Var, int i, int i2) {
        int a = px3Var.a(i);
        SparseArray sparseArray = this.a;
        bg7 bg7Var = (bg7) sparseArray.get(a);
        if (bg7Var == null) {
            bg7Var = new bg7(1);
            sparseArray.put(px3Var.a(i), bg7Var);
        }
        if (i2 > i) {
            bg7Var.a(px3Var, i + 1, i2);
        } else {
            bg7Var.b = px3Var;
        }
    }
}
