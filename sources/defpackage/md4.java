package defpackage;

import android.util.SparseIntArray;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
public final class md4 implements Runnable {
    public final byte a;
    public final qd4 b;

    public md4(qd4 qd4Var, byte b) {
        this.a = b;
        this.b = qd4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        int i2 = 1;
        qd4 qd4Var = this.b;
        switch (b) {
            case 0:
                qd4Var.L = a.b.getSharedPreferences("uploadinfo", 0);
                qd4Var.i = a.p();
                if (e21.a) {
                    fc4.b("start upload on slow network = " + qd4Var.i);
                }
                if (!qd4Var.i) {
                    i2 = 8;
                }
                while (i < i2) {
                    qd4Var.d();
                    i++;
                }
                qd4Var.e();
                return;
            case 1:
                SparseIntArray sparseIntArray = qd4Var.p;
                while (i < sparseIntArray.size()) {
                    ConnectionsManager.getInstance(qd4Var.a).cancelRequest(sparseIntArray.valueAt(i), true);
                    i++;
                }
                return;
            case 2:
                qd4Var.q.clear();
                return;
            default:
                qd4Var.e();
                return;
        }
    }
}
