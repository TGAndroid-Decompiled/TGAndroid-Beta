package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class lk implements Runnable {
    public final int f16754a;
    public final vp f16755b;
    public final rf.q f16756c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public lk(vp vpVar, rf.q qVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f16754a = i10;
        this.f16755b = vpVar;
        this.f16756c = qVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f16754a) {
            case 0:
                vp vpVar = this.f16755b;
                int i10 = vpVar.currentAccount;
                rf.q qVar = this.f16756c;
                qVar.b(i10, this.d, this.e, 0);
                i0.g3(new sl(vpVar, qVar, 0));
                return;
            case 1:
                vp vpVar2 = this.f16755b;
                int i11 = vpVar2.currentAccount;
                rf.q qVar2 = this.f16756c;
                qVar2.b(i11, this.d, this.e, 0);
                i0.g3(new sl(vpVar2, qVar2, 2));
                return;
            default:
                vp vpVar3 = this.f16755b;
                hs messagesStorage = vpVar3.getMessagesStorage();
                rf.q qVar3 = this.f16756c;
                ArrayList arrayList = qVar3.f46548a;
                lk lkVar = new lk(vpVar3, qVar3, this.d, this.e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new mg(messagesStorage, arrayList, lkVar, 3));
                    return;
                }
                return;
        }
    }
}
