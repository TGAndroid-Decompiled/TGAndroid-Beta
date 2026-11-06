package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class dk implements Runnable {
    public final int f22014a;
    public final qp f22015b;
    public final bg.u f22016c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f22017e;

    public dk(qp qpVar, bg.u uVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i7) {
        this.f22014a = i7;
        this.f22015b = qpVar;
        this.f22016c = uVar;
        this.d = concurrentHashMap;
        this.f22017e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f22014a) {
            case 0:
                qp qpVar = this.f22015b;
                int i7 = qpVar.currentAccount;
                bg.u uVar = this.f22016c;
                uVar.b(i7, this.d, this.f22017e, 0);
                g0.h3(new vl(qpVar, uVar, 1));
                return;
            case 1:
                qp qpVar2 = this.f22015b;
                int i10 = qpVar2.currentAccount;
                bg.u uVar2 = this.f22016c;
                uVar2.b(i10, this.d, this.f22017e, 0);
                g0.h3(new vl(qpVar2, uVar2, 2));
                return;
            default:
                qp qpVar3 = this.f22015b;
                yr messagesStorage = qpVar3.getMessagesStorage();
                bg.u uVar3 = this.f22016c;
                ArrayList arrayList = uVar3.f3373a;
                dk dkVar = new dk(qpVar3, uVar3, this.d, this.f22017e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new ng(messagesStorage, arrayList, dkVar, 3));
                    return;
                }
                return;
        }
    }
}
