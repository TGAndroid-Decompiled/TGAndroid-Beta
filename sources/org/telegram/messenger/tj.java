package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class tj implements Runnable {
    public final int f25541a;
    public final hp f25542b;
    public final cg.t f25543c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f25544e;

    public tj(hp hpVar, cg.t tVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i3) {
        this.f25541a = i3;
        this.f25542b = hpVar;
        this.f25543c = tVar;
        this.d = concurrentHashMap;
        this.f25544e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f25541a) {
            case 0:
                hp hpVar = this.f25542b;
                int i3 = hpVar.currentAccount;
                cg.t tVar = this.f25543c;
                tVar.b(i3, this.d, this.f25544e, 0);
                g0.h3(new ll(hpVar, tVar, 1));
                return;
            case 1:
                hp hpVar2 = this.f25542b;
                int i10 = hpVar2.currentAccount;
                cg.t tVar2 = this.f25543c;
                tVar2.b(i10, this.d, this.f25544e, 0);
                g0.h3(new ll(hpVar2, tVar2, 2));
                return;
            default:
                hp hpVar3 = this.f25542b;
                qr messagesStorage = hpVar3.getMessagesStorage();
                cg.t tVar3 = this.f25543c;
                ArrayList arrayList = tVar3.f4738a;
                tj tjVar = new tj(hpVar3, tVar3, this.d, this.f25544e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new fg(messagesStorage, arrayList, tjVar, 3));
                    return;
                }
                return;
        }
    }
}
