package defpackage;

import android.util.SparseArray;
public final class n79 implements Runnable {
    public final byte a;
    public final o79 b;

    public n79(o79 o79Var, byte b) {
        this.a = b;
        this.b = o79Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        o79 o79Var = this.b;
        switch (b) {
            case 0:
                SparseArray sparseArray = o79Var.n;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((r79) sparseArray.valueAt(i)).getClass();
                    r79.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                u79 u79Var = o79Var.r;
                if (u79Var.E == o79Var) {
                    u79Var.p();
                    return;
                }
                return;
        }
    }
}
