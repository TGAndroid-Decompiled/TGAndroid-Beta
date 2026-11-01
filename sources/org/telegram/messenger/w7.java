package org.telegram.messenger;

import java.util.ArrayList;
public final class w7 implements Runnable {
    public final int f19000a;
    public final b8 f19001b;

    public w7(b8 b8Var, int i10) {
        this.f19000a = i10;
        this.f19001b = b8Var;
    }

    @Override
    public final void run() {
        switch (this.f19000a) {
            case 0:
                b8 b8Var = this.f19001b;
                bg.h[] hVarArr = b8Var.f14941c;
                bg.h[] hVarArr2 = b8Var.f14940b;
                for (int i10 = 0; i10 < hVarArr2.length; i10++) {
                    if (((ArrayList) hVarArr2[i10].d).size() > 0 || ((ArrayList) hVarArr[i10].d).size() > 0) {
                        f8.b("download queue: dc" + (i10 + 1) + " account=" + b8Var.currentAccount + " small_operations=" + ((ArrayList) hVarArr2[i10].d).size() + " large_operations=" + ((ArrayList) hVarArr[i10].d).size());
                    }
                }
                if (v2.f18578a) {
                    b8.J.a(b8Var.H);
                    b8.J.d(b8Var.H, 10000L);
                    return;
                }
                return;
            default:
                this.f19001b.getNotificationCenter().k(304, new Object[0]);
                return;
        }
    }
}
