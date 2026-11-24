package defpackage;

import android.util.SparseIntArray;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
public final class mb4 implements Runnable {
    public final byte a;
    public final qb4 b;

    public mb4(qb4 qb4Var, byte b) {
        this.a = b;
        this.b = qb4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        int i2 = 1;
        qb4 qb4Var = this.b;
        switch (b) {
            case 0:
                qb4Var.L = a.b.getSharedPreferences("uploadinfo", 0);
                qb4Var.i = a.p();
                if (w01.a) {
                    fa4.b("start upload on slow network = " + qb4Var.i);
                }
                if (!qb4Var.i) {
                    i2 = 8;
                }
                while (i < i2) {
                    qb4Var.d();
                    i++;
                }
                qb4Var.e();
                return;
            case 1:
                SparseIntArray sparseIntArray = qb4Var.p;
                while (i < sparseIntArray.size()) {
                    ConnectionsManager.getInstance(qb4Var.a).cancelRequest(sparseIntArray.valueAt(i), true);
                    i++;
                }
                return;
            case 2:
                qb4Var.q.clear();
                return;
            default:
                qb4Var.e();
                return;
        }
    }
}
