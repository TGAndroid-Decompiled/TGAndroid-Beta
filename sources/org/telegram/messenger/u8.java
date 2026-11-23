package org.telegram.messenger;

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
public final class u8 implements Runnable {
    public final int f27135a;
    public final y8 f27136b;

    public u8(y8 y8Var, int i7) {
        this.f27135a = i7;
        this.f27136b = y8Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f27135a) {
            case 0:
                y8 y8Var = this.f27136b;
                y8Var.L = t0.f26895b.getSharedPreferences("uploadinfo", 0);
                y8Var.f27989i = t0.p();
                if (s2.f26694a) {
                    a8.b("start upload on slow network = " + y8Var.f27989i);
                }
                if (y8Var.f27989i) {
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
                y8 y8Var2 = this.f27136b;
                SparseIntArray sparseIntArray = y8Var2.f27996p;
                for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                    ConnectionsManager.getInstance(y8Var2.f27983a).cancelRequest(sparseIntArray.valueAt(i11), true);
                }
                return;
            case 2:
                this.f27136b.f27997q.clear();
                return;
            default:
                this.f27136b.e();
                return;
        }
    }
}
