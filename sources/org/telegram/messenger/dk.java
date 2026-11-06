package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class dk implements Runnable {
    public final int f22021a;
    public final qp f22022b;
    public final bg.u f22023c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f22024e;

    public dk(qp qpVar, bg.u uVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i7) {
        this.f22021a = i7;
        this.f22022b = qpVar;
        this.f22023c = uVar;
        this.d = concurrentHashMap;
        this.f22024e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f22021a) {
            case 0:
                qp qpVar = this.f22022b;
                int i7 = qpVar.currentAccount;
                bg.u uVar = this.f22023c;
                uVar.b(i7, this.d, this.f22024e, 0);
                g0.h3(new vl(qpVar, uVar, 1));
                return;
            case 1:
                qp qpVar2 = this.f22022b;
                int i10 = qpVar2.currentAccount;
                bg.u uVar2 = this.f22023c;
                uVar2.b(i10, this.d, this.f22024e, 0);
                g0.h3(new vl(qpVar2, uVar2, 2));
                return;
            default:
                qp qpVar3 = this.f22022b;
                yr messagesStorage = qpVar3.getMessagesStorage();
                bg.u uVar3 = this.f22023c;
                ArrayList arrayList = uVar3.f3373a;
                dk dkVar = new dk(qpVar3, uVar3, this.d, this.f22024e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new ng(messagesStorage, arrayList, dkVar, 3));
                    return;
                }
                return;
        }
    }
}
