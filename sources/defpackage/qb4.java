package defpackage;

import java.util.ArrayList;
public final class qb4 implements Runnable {
    public final byte a;
    public final xb4 b;

    public qb4(xb4 xb4Var, byte b) {
        this.a = b;
        this.b = xb4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xb4 xb4Var = this.b;
        switch (b) {
            case 0:
                zb4[] zb4VarArr = xb4Var.c;
                zb4[] zb4VarArr2 = xb4Var.b;
                for (int i = 0; i < zb4VarArr2.length; i++) {
                    if (((ArrayList) zb4VarArr2[i].d).size() > 0 || ((ArrayList) zb4VarArr[i].d).size() > 0) {
                        cc4.b("download queue: dc" + (i + 1) + " account=" + xb4Var.currentAccount + " small_operations=" + ((ArrayList) zb4VarArr2[i].d).size() + " large_operations=" + ((ArrayList) zb4VarArr[i].d).size());
                    }
                }
                if (f11.a) {
                    xb4.K.a(xb4Var.I);
                    xb4.K.d(xb4Var.I, 10000L);
                    return;
                }
                return;
            default:
                xb4Var.getNotificationCenter().k(308, new Object[0]);
                return;
        }
    }
}
