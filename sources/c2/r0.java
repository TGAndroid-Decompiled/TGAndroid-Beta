package c2;

import android.util.SparseArray;
public final class r0 implements Runnable {
    public final int f2163a;
    public final s0 f2164b;

    public r0(s0 s0Var, int i10) {
        this.f2163a = i10;
        this.f2164b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f2163a) {
            case 0:
                SparseArray sparseArray = this.f2164b.h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((v0) sparseArray.valueAt(i10)).getClass();
                    v0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                s0 s0Var = this.f2164b;
                y0 y0Var = s0Var.f2171i;
                if (y0Var.f2218y == s0Var) {
                    y0Var.p();
                    return;
                }
                return;
        }
    }
}
