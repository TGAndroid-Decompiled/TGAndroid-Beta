package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class mk implements Runnable {
    public final int f17138a;
    public final wp f17139b;
    public final rf.q f17140c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public mk(wp wpVar, rf.q qVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f17138a = i10;
        this.f17139b = wpVar;
        this.f17140c = qVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17138a) {
            case 0:
                wp wpVar = this.f17139b;
                int i10 = wpVar.currentAccount;
                rf.q qVar = this.f17140c;
                qVar.b(i10, this.d, this.e, 0);
                i0.g3(new tl(wpVar, qVar, 0));
                return;
            case 1:
                wp wpVar2 = this.f17139b;
                int i11 = wpVar2.currentAccount;
                rf.q qVar2 = this.f17140c;
                qVar2.b(i11, this.d, this.e, 0);
                i0.g3(new tl(wpVar2, qVar2, 2));
                return;
            default:
                wp wpVar3 = this.f17139b;
                is messagesStorage = wpVar3.getMessagesStorage();
                rf.q qVar3 = this.f17140c;
                ArrayList arrayList = qVar3.f46559a;
                mk mkVar = new mk(wpVar3, qVar3, this.d, this.e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new ng(messagesStorage, arrayList, mkVar, 3));
                    return;
                }
                return;
        }
    }
}
