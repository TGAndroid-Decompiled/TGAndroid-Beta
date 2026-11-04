package org.telegram.messenger;

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
public final class u8 implements Runnable {
    public final int f25663a;
    public final y8 f25664b;

    public u8(y8 y8Var, int i3) {
        this.f25663a = i3;
        this.f25664b = y8Var;
    }

    @Override
    public final void run() {
        int i3;
        switch (this.f25663a) {
            case 0:
                y8 y8Var = this.f25664b;
                y8Var.L = t0.f25457b.getSharedPreferences("uploadinfo", 0);
                y8Var.f26540i = t0.p();
                if (r2.f25040a) {
                    a8.b("start upload on slow network = " + y8Var.f26540i);
                }
                if (y8Var.f26540i) {
                    i3 = 1;
                } else {
                    i3 = 8;
                }
                for (int i10 = 0; i10 < i3; i10++) {
                    y8Var.d();
                }
                y8Var.e();
                return;
            case 1:
                y8 y8Var2 = this.f25664b;
                SparseIntArray sparseIntArray = y8Var2.f26547p;
                for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                    ConnectionsManager.getInstance(y8Var2.f26534a).cancelRequest(sparseIntArray.valueAt(i11), true);
                }
                return;
            case 2:
                this.f25664b.f26548q.clear();
                return;
            default:
                this.f25664b.e();
                return;
        }
    }
}
