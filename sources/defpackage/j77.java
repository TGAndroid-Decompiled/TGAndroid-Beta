package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class j77 implements Runnable {
    public final byte a;
    public final oc7 b;
    public final b54 c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public j77(oc7 oc7Var, b54 b54Var, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = b54Var;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ConcurrentHashMap concurrentHashMap = this.e;
        ConcurrentHashMap concurrentHashMap2 = this.d;
        b54 b54Var = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                b54Var.b(oc7Var.currentAccount, concurrentHashMap2, concurrentHashMap, 0);
                gm.c3(new y87(oc7Var, b54Var, (byte) 0));
                return;
            case 1:
                b54Var.b(oc7Var.currentAccount, concurrentHashMap2, concurrentHashMap, 0);
                gm.c3(new y87(oc7Var, b54Var, (byte) 2));
                return;
            default:
                oc7 oc7Var2 = this.b;
                cf7 messagesStorage = oc7Var2.getMessagesStorage();
                b54 b54Var2 = this.c;
                ArrayList arrayList = b54Var2.a;
                j77 j77Var = new j77(oc7Var2, b54Var2, this.d, this.e, (byte) 1);
                messagesStorage.getClass();
                if (!arrayList.isEmpty()) {
                    messagesStorage.H(new op6(messagesStorage, arrayList, j77Var, (byte) 3));
                    return;
                }
                return;
        }
    }
}
