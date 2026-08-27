package c2;

import android.util.SparseArray;

public final class q0 implements Runnable {

    public final int f2330a;

    public final r0 f2331b;

    public q0(r0 r0Var, int i10) {
        this.f2330a = i10;
        this.f2331b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f2330a) {
            case 0:
                SparseArray sparseArray = this.f2331b.h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((v0) sparseArray.valueAt(i10)).getClass();
                    v0.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                r0 r0Var = this.f2331b;
                y0 y0Var = r0Var.f2338i;
                if (y0Var.f2389y == r0Var) {
                    y0Var.p();
                }
                break;
        }
    }
}
