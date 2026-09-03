package f2;

import android.util.SparseArray;
public final class b1 {
    public final SparseArray f5656a = new SparseArray();
    public int f5657b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f5656a;
            if (i10 < sparseArray.size()) {
                ((a1) sparseArray.valueAt(i10)).f5647a.clear();
                i10++;
            } else {
                return;
            }
        }
    }

    public final a1 b(int i10) {
        SparseArray sparseArray = this.f5656a;
        a1 a1Var = (a1) sparseArray.get(i10);
        if (a1Var == null) {
            a1 a1Var2 = new a1();
            sparseArray.put(i10, a1Var2);
            return a1Var2;
        }
        return a1Var;
    }
}
