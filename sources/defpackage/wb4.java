package defpackage;

import java.util.ArrayList;
public final class wb4 implements Runnable {
    public final byte a;
    public final bc4 b;

    public wb4(bc4 bc4Var, byte b) {
        this.a = b;
        this.b = bc4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bc4 bc4Var = this.b;
        switch (b) {
            case 0:
                u30[] u30VarArr = bc4Var.c;
                u30[] u30VarArr2 = bc4Var.b;
                for (int i = 0; i < u30VarArr2.length; i++) {
                    if (((ArrayList) u30VarArr2[i].d).size() > 0 || ((ArrayList) u30VarArr[i].d).size() > 0) {
                        fc4.b("download queue: dc" + (i + 1) + " account=" + bc4Var.currentAccount + " small_operations=" + ((ArrayList) u30VarArr2[i].d).size() + " large_operations=" + ((ArrayList) u30VarArr[i].d).size());
                    }
                }
                if (e21.a) {
                    bc4.K.a(bc4Var.I);
                    bc4.K.d(bc4Var.I, 10000L);
                    return;
                }
                return;
            default:
                bc4Var.getNotificationCenter().k(309, new Object[0]);
                return;
        }
    }
}
