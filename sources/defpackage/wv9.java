package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public final class wv9 implements Runnable {
    public final byte a;
    public final tx9 b;

    public wv9(tx9 tx9Var, byte b) {
        this.a = b;
        this.b = tx9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tx9 tx9Var = this.b;
        switch (b) {
            case 0:
                tx9Var.getClass();
                HashSet hashSet = pg5.a;
                yv2 yv2Var = fl5.z().p;
                if (((CountDownLatch) yv2Var.c) == null) {
                    yv2Var.c = new CountDownLatch(1);
                }
                pg5.b = true;
                pg5.e = false;
                pg5.g = false;
                gl.e3(new wv9(tx9Var, (byte) 2), 0L);
                return;
            case 1:
                ArrayList arrayList = tx9Var.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = tx9Var.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = tx9Var.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                tx9Var.r0.E(true);
                return;
            case 2:
                tx9Var.W1.start();
                return;
            case 3:
                tx9Var.B(true, true, true);
                return;
            default:
                kk7 e = kk7.e();
                wv9 wv9Var = tx9Var.T1;
                e.e.remove(wv9Var);
                kk7.e().d(wv9Var);
                return;
        }
    }
}
