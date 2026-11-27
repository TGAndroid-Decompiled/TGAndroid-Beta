package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public final class qz9 implements Runnable {
    public final byte a;
    public final n1a b;

    public qz9(n1a n1aVar, byte b) {
        this.a = b;
        this.b = n1aVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        n1a n1aVar = this.b;
        switch (b) {
            case 0:
                n1aVar.getClass();
                HashSet hashSet = ri5.a;
                sw2 sw2Var = in5.z().p;
                if (((CountDownLatch) sw2Var.c) == null) {
                    sw2Var.c = new CountDownLatch(1);
                }
                ri5.b = true;
                ri5.e = false;
                ri5.g = false;
                hl.d3(new qz9(n1aVar, (byte) 2), 0L);
                return;
            case 1:
                ArrayList arrayList = n1aVar.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = n1aVar.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = n1aVar.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                n1aVar.r0.E(true);
                return;
            case 2:
                n1aVar.W1.start();
                return;
            case 3:
                n1aVar.B(true, true, true);
                return;
            default:
                jn7 e = jn7.e();
                qz9 qz9Var = n1aVar.T1;
                e.e.remove(qz9Var);
                jn7.e().d(qz9Var);
                return;
        }
    }
}
