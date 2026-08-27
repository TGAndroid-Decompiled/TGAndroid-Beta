package f2;

import android.util.SparseArray;

public final class d1 {

    public final SparseArray f5642a = new SparseArray();

    public int f5643b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f5642a;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((c1) sparseArray.valueAt(i10)).f5635a.clear();
            i10++;
        }
    }

    public final c1 b(int i10) {
        SparseArray sparseArray = this.f5642a;
        c1 c1Var = (c1) sparseArray.get(i10);
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1Var2 = new c1();
        sparseArray.put(i10, c1Var2);
        return c1Var2;
    }
}
