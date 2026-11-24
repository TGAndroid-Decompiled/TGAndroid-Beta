package defpackage;

import android.util.SparseArray;
public final class k49 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i < sparseArray.size()) {
                ((j49) sparseArray.valueAt(i)).a.clear();
                i++;
            } else {
                return;
            }
        }
    }

    public final j49 b(int i) {
        SparseArray sparseArray = this.a;
        j49 j49Var = (j49) sparseArray.get(i);
        if (j49Var == null) {
            j49 j49Var2 = new j49();
            sparseArray.put(i, j49Var2);
            return j49Var2;
        }
        return j49Var;
    }
}
