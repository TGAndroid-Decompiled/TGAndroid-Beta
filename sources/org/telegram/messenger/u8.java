package org.telegram.messenger;

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
public final class u8 implements Runnable {
    public final int f26794a;
    public final y8 f26795b;

    public u8(y8 y8Var, int i7) {
        this.f26794a = i7;
        this.f26795b = y8Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f26794a) {
            case 0:
                y8 y8Var = this.f26795b;
                y8Var.L = t0.f26600b.getSharedPreferences("uploadinfo", 0);
                y8Var.f27674i = t0.p();
                if (r2.f26198a) {
                    a8.b("start upload on slow network = " + y8Var.f27674i);
                }
                if (y8Var.f27674i) {
                    i7 = 1;
                } else {
                    i7 = 8;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    y8Var.d();
                }
                y8Var.e();
                return;
            case 1:
                y8 y8Var2 = this.f26795b;
                SparseIntArray sparseIntArray = y8Var2.f27681p;
                for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                    ConnectionsManager.getInstance(y8Var2.f27668a).cancelRequest(sparseIntArray.valueAt(i11), true);
                }
                return;
            case 2:
                this.f26795b.f27682q.clear();
                return;
            default:
                this.f26795b.e();
                return;
        }
    }
}
