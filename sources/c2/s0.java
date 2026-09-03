package c2;

import android.util.SparseArray;
public final class s0 implements Runnable {
    public final int f2022a;
    public final t0 f2023b;

    public s0(t0 t0Var, int i10) {
        this.f2022a = i10;
        this.f2023b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f2022a) {
            case 0:
                SparseArray sparseArray = this.f2023b.h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((w0) sparseArray.valueAt(i10)).getClass();
                    w0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                t0 t0Var = this.f2023b;
                z0 z0Var = t0Var.f2034i;
                if (z0Var.f2073y == t0Var) {
                    z0Var.p();
                    return;
                }
                return;
        }
    }
}
