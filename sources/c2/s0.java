package c2;

import android.util.SparseArray;
public final class s0 implements Runnable {
    public final int f2895a;
    public final t0 f2896b;

    public s0(t0 t0Var, int i10) {
        this.f2895a = i10;
        this.f2896b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f2895a) {
            case 0:
                SparseArray sparseArray = this.f2896b.h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((x0) sparseArray.valueAt(i10)).getClass();
                    x0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                t0 t0Var = this.f2896b;
                a1 a1Var = t0Var.f2909i;
                if (a1Var.f2767y == t0Var) {
                    a1Var.p();
                    return;
                }
                return;
        }
    }
}
