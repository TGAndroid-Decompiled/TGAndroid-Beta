package org.telegram.messenger;

import java.util.ArrayList;
public final class r7 implements Runnable {
    public final int f25266a;
    public final w7 f25267b;

    public r7(w7 w7Var, int i7) {
        this.f25266a = i7;
        this.f25267b = w7Var;
    }

    @Override
    public final void run() {
        switch (this.f25266a) {
            case 0:
                w7 w7Var = this.f25267b;
                lg.f[] fVarArr = w7Var.f26269c;
                lg.f[] fVarArr2 = w7Var.f26268b;
                for (int i7 = 0; i7 < fVarArr2.length; i7++) {
                    if (((ArrayList) fVarArr2[i7].d).size() > 0 || ((ArrayList) fVarArr[i7].d).size() > 0) {
                        a8.b("download queue: dc" + (i7 + 1) + " account=" + w7Var.currentAccount + " small_operations=" + ((ArrayList) fVarArr2[i7].d).size() + " large_operations=" + ((ArrayList) fVarArr[i7].d).size());
                    }
                }
                if (r2.f25216a) {
                    w7.J.a(w7Var.H);
                    w7.J.d(w7Var.H, 10000L);
                    return;
                }
                return;
            default:
                this.f25267b.getNotificationCenter().k(304, new Object[0]);
                return;
        }
    }
}
