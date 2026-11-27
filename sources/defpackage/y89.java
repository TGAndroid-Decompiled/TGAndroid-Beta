package defpackage;

import android.util.SparseArray;
public final class y89 implements Runnable {
    public final byte a;
    public final z89 b;

    public y89(z89 z89Var, byte b) {
        this.a = b;
        this.b = z89Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        z89 z89Var = this.b;
        switch (b) {
            case 0:
                SparseArray sparseArray = z89Var.n;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((c99) sparseArray.valueAt(i)).getClass();
                    c99.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                f99 f99Var = z89Var.r;
                if (f99Var.E == z89Var) {
                    f99Var.p();
                    return;
                }
                return;
        }
    }
}
