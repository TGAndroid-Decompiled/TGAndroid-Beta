package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class j57 implements Runnable {
    public final byte a;
    public final na7 b;
    public final q34 c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public j57(na7 na7Var, q34 q34Var, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = q34Var;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ConcurrentHashMap concurrentHashMap = this.e;
        ConcurrentHashMap concurrentHashMap2 = this.d;
        q34 q34Var = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                q34Var.b(na7Var.currentAccount, concurrentHashMap2, concurrentHashMap, 0);
                gl.d3(new h77(na7Var, q34Var, (byte) 0));
                return;
            case 1:
                q34Var.b(na7Var.currentAccount, concurrentHashMap2, concurrentHashMap, 0);
                gl.d3(new h77(na7Var, q34Var, (byte) 2));
                return;
            default:
                na7 na7Var2 = this.b;
                ad7 messagesStorage = na7Var2.getMessagesStorage();
                q34 q34Var2 = this.c;
                ArrayList arrayList = q34Var2.a;
                j57 j57Var = new j57(na7Var2, q34Var2, this.d, this.e, (byte) 1);
                messagesStorage.getClass();
                if (!arrayList.isEmpty()) {
                    messagesStorage.H(new nn6(messagesStorage, arrayList, j57Var, (byte) 3));
                    return;
                }
                return;
        }
    }
}
