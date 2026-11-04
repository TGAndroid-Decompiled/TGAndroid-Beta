package org.telegram.messenger;

import java.util.ArrayList;
public final class r7 implements Runnable {
    public final int f25088a;
    public final w7 f25089b;

    public r7(w7 w7Var, int i3) {
        this.f25088a = i3;
        this.f25089b = w7Var;
    }

    @Override
    public final void run() {
        switch (this.f25088a) {
            case 0:
                w7 w7Var = this.f25089b;
                mg.f[] fVarArr = w7Var.f26168c;
                mg.f[] fVarArr2 = w7Var.f26167b;
                for (int i3 = 0; i3 < fVarArr2.length; i3++) {
                    if (((ArrayList) fVarArr2[i3].d).size() > 0 || ((ArrayList) fVarArr[i3].d).size() > 0) {
                        a8.b("download queue: dc" + (i3 + 1) + " account=" + w7Var.currentAccount + " small_operations=" + ((ArrayList) fVarArr2[i3].d).size() + " large_operations=" + ((ArrayList) fVarArr[i3].d).size());
                    }
                }
                if (r2.f25040a) {
                    w7.K.a(w7Var.I);
                    w7.K.e(w7Var.I, 10000L);
                    return;
                }
                return;
            default:
                this.f25089b.getNotificationCenter().k(304, new Object[0]);
                return;
        }
    }
}
