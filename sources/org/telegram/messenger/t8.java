package org.telegram.messenger;

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
public final class t8 implements Runnable {
    public final int f27070a;
    public final x8 f27071b;

    public t8(x8 x8Var, int i7) {
        this.f27070a = i7;
        this.f27071b = x8Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f27070a) {
            case 0:
                x8 x8Var = this.f27071b;
                x8Var.L = t0.f27013b.getSharedPreferences("uploadinfo", 0);
                x8Var.f27929i = t0.p();
                if (s2.f26829a) {
                    a8.b("start upload on slow network = " + x8Var.f27929i);
                }
                if (x8Var.f27929i) {
                    i7 = 1;
                } else {
                    i7 = 8;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    x8Var.d();
                }
                x8Var.e();
                return;
            case 1:
                x8 x8Var2 = this.f27071b;
                SparseIntArray sparseIntArray = x8Var2.f27936p;
                for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                    ConnectionsManager.getInstance(x8Var2.f27923a).cancelRequest(sparseIntArray.valueAt(i11), true);
                }
                return;
            case 2:
                this.f27071b.f27937q.clear();
                return;
            default:
                this.f27071b.e();
                return;
        }
    }
}
