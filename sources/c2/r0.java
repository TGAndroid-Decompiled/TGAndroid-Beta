package c2;

import android.util.SparseArray;
public final class r0 implements Runnable {
    public final int f2217a;
    public final s0 f2218b;

    public r0(s0 s0Var, int i9) {
        this.f2217a = i9;
        this.f2218b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f2217a) {
            case 0:
                SparseArray sparseArray = this.f2218b.h;
                int size = sparseArray.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((w0) sparseArray.valueAt(i9)).getClass();
                    w0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                s0 s0Var = this.f2218b;
                z0 z0Var = s0Var.f2231i;
                if (z0Var.f2277y == s0Var) {
                    z0Var.p();
                    return;
                }
                return;
        }
    }
}
