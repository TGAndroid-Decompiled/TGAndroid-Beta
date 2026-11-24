package defpackage;

import java.util.ArrayList;
public final class w94 implements Runnable {
    public final byte a;
    public final ba4 b;

    public w94(ba4 ba4Var, byte b) {
        this.a = b;
        this.b = ba4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ba4 ba4Var = this.b;
        switch (b) {
            case 0:
                u20[] u20VarArr = ba4Var.c;
                u20[] u20VarArr2 = ba4Var.b;
                for (int i = 0; i < u20VarArr2.length; i++) {
                    if (((ArrayList) u20VarArr2[i].d).size() > 0 || ((ArrayList) u20VarArr[i].d).size() > 0) {
                        fa4.b("download queue: dc" + (i + 1) + " account=" + ba4Var.currentAccount + " small_operations=" + ((ArrayList) u20VarArr2[i].d).size() + " large_operations=" + ((ArrayList) u20VarArr[i].d).size());
                    }
                }
                if (w01.a) {
                    ba4.K.a(ba4Var.I);
                    ba4.K.d(ba4Var.I, 10000L);
                    return;
                }
                return;
            default:
                ba4Var.getNotificationCenter().k(307, new Object[0]);
                return;
        }
    }
}
