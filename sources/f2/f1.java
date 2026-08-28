package f2;

import android.util.SparseArray;
public final class f1 {
    public final SparseArray f5354a = new SparseArray();
    public int f5355b = 0;

    public final void a() {
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.f5354a;
            if (i9 < sparseArray.size()) {
                ((e1) sparseArray.valueAt(i9)).f5346a.clear();
                i9++;
            } else {
                return;
            }
        }
    }

    public final e1 b(int i9) {
        SparseArray sparseArray = this.f5354a;
        e1 e1Var = (e1) sparseArray.get(i9);
        if (e1Var == null) {
            e1 e1Var2 = new e1();
            sparseArray.put(i9, e1Var2);
            return e1Var2;
        }
        return e1Var;
    }
}
