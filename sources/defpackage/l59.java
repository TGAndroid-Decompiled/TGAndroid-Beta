package defpackage;

import android.util.SparseArray;
public final class l59 implements Runnable {
    public final byte a;
    public final m59 b;

    public l59(m59 m59Var, byte b) {
        this.a = b;
        this.b = m59Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        m59 m59Var = this.b;
        switch (b) {
            case 0:
                SparseArray sparseArray = m59Var.n;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((p59) sparseArray.valueAt(i)).getClass();
                    p59.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                s59 s59Var = m59Var.r;
                if (s59Var.E == m59Var) {
                    s59Var.p();
                    return;
                }
                return;
        }
    }
}
