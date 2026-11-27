package defpackage;

import android.util.SparseArray;
public final class x79 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i < sparseArray.size()) {
                ((w79) sparseArray.valueAt(i)).a.clear();
                i++;
            } else {
                return;
            }
        }
    }

    public final w79 b(int i) {
        SparseArray sparseArray = this.a;
        w79 w79Var = (w79) sparseArray.get(i);
        if (w79Var == null) {
            w79 w79Var2 = new w79();
            sparseArray.put(i, w79Var2);
            return w79Var2;
        }
        return w79Var;
    }
}
