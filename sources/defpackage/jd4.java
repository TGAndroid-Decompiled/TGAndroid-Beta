package defpackage;

import android.util.SparseIntArray;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
public final class jd4 implements Runnable {
    public final byte a;
    public final nd4 b;

    public jd4(nd4 nd4Var, byte b) {
        this.a = b;
        this.b = nd4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        int i2 = 1;
        nd4 nd4Var = this.b;
        switch (b) {
            case 0:
                nd4Var.L = a.b.getSharedPreferences("uploadinfo", 0);
                nd4Var.i = a.p();
                if (f11.a) {
                    cc4.b("start upload on slow network = " + nd4Var.i);
                }
                if (!nd4Var.i) {
                    i2 = 8;
                }
                while (i < i2) {
                    nd4Var.d();
                    i++;
                }
                nd4Var.e();
                return;
            case 1:
                SparseIntArray sparseIntArray = nd4Var.p;
                while (i < sparseIntArray.size()) {
                    ConnectionsManager.getInstance(nd4Var.a).cancelRequest(sparseIntArray.valueAt(i), true);
                    i++;
                }
                return;
            case 2:
                nd4Var.q.clear();
                return;
            default:
                nd4Var.e();
                return;
        }
    }
}
