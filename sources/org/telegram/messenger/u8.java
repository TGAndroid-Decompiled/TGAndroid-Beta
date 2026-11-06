package org.telegram.messenger;

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
public final class u8 implements Runnable {
    public final int f25739a;
    public final y8 f25740b;

    public u8(y8 y8Var, int i7) {
        this.f25739a = i7;
        this.f25740b = y8Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f25739a) {
            case 0:
                y8 y8Var = this.f25740b;
                y8Var.L = t0.f25563b.getSharedPreferences("uploadinfo", 0);
                y8Var.f26596i = t0.p();
                if (r2.f25199a) {
                    a8.b("start upload on slow network = " + y8Var.f26596i);
                }
                if (y8Var.f26596i) {
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
                y8 y8Var2 = this.f25740b;
                SparseIntArray sparseIntArray = y8Var2.f26603p;
                for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                    ConnectionsManager.getInstance(y8Var2.f26590a).cancelRequest(sparseIntArray.valueAt(i11), true);
                }
                return;
            case 2:
                this.f25740b.f26604q.clear();
                return;
            default:
                this.f25740b.e();
                return;
        }
    }
}
