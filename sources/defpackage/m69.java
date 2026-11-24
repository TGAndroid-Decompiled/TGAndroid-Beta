package defpackage;

import android.util.SparseArray;
public final class m69 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i < sparseArray.size()) {
                ((l69) sparseArray.valueAt(i)).a.clear();
                i++;
            } else {
                return;
            }
        }
    }

    public final l69 b(int i) {
        SparseArray sparseArray = this.a;
        l69 l69Var = (l69) sparseArray.get(i);
        if (l69Var == null) {
            l69 l69Var2 = new l69();
            sparseArray.put(i, l69Var2);
            return l69Var2;
        }
        return l69Var;
    }
}
