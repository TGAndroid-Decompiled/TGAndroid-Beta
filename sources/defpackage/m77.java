package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class m77 implements Runnable {
    public final byte a;
    public final uc7 b;
    public final m44 c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public m77(uc7 uc7Var, m44 m44Var, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = m44Var;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ConcurrentHashMap concurrentHashMap = this.e;
        ConcurrentHashMap concurrentHashMap2 = this.d;
        m44 m44Var = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                m44Var.b(uc7Var.currentAccount, concurrentHashMap2, concurrentHashMap, 0);
                hl.c3(new n87(uc7Var, m44Var, (byte) 0));
                return;
            case 1:
                m44Var.b(uc7Var.currentAccount, concurrentHashMap2, concurrentHashMap, 0);
                hl.c3(new n87(uc7Var, m44Var, (byte) 2));
                return;
            default:
                uc7 uc7Var2 = this.b;
                jf7 messagesStorage = uc7Var2.getMessagesStorage();
                m44 m44Var2 = this.c;
                ArrayList arrayList = m44Var2.a;
                m77 m77Var = new m77(uc7Var2, m44Var2, this.d, this.e, (byte) 1);
                messagesStorage.getClass();
                if (!arrayList.isEmpty()) {
                    messagesStorage.H(new es6(messagesStorage, arrayList, m77Var, (byte) 3));
                    return;
                }
                return;
        }
    }
}
