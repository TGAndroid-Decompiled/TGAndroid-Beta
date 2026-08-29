package f2;

import android.util.SparseArray;
public final class c1 {
    public final SparseArray f6286a = new SparseArray();
    public int f6287b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f6286a;
            if (i10 < sparseArray.size()) {
                ((b1) sparseArray.valueAt(i10)).f6278a.clear();
                i10++;
            } else {
                return;
            }
        }
    }

    public final b1 b(int i10) {
        SparseArray sparseArray = this.f6286a;
        b1 b1Var = (b1) sparseArray.get(i10);
        if (b1Var == null) {
            b1 b1Var2 = new b1();
            sparseArray.put(i10, b1Var2);
            return b1Var2;
        }
        return b1Var;
    }
}
