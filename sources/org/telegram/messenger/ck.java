package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class ck implements Runnable {
    public final int f21878a;
    public final qp f21879b;
    public final bg.u f21880c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f21881e;

    public ck(qp qpVar, bg.u uVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i7) {
        this.f21878a = i7;
        this.f21879b = qpVar;
        this.f21880c = uVar;
        this.d = concurrentHashMap;
        this.f21881e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21878a) {
            case 0:
                qp qpVar = this.f21879b;
                int i7 = qpVar.currentAccount;
                bg.u uVar = this.f21880c;
                uVar.b(i7, this.d, this.f21881e, 0);
                g0.h3(new vl(qpVar, uVar, 1));
                return;
            case 1:
                qp qpVar2 = this.f21879b;
                int i10 = qpVar2.currentAccount;
                bg.u uVar2 = this.f21880c;
                uVar2.b(i10, this.d, this.f21881e, 0);
                g0.h3(new vl(qpVar2, uVar2, 2));
                return;
            default:
                qp qpVar3 = this.f21879b;
                yr messagesStorage = qpVar3.getMessagesStorage();
                bg.u uVar3 = this.f21880c;
                ArrayList arrayList = uVar3.f3373a;
                ck ckVar = new ck(qpVar3, uVar3, this.d, this.f21881e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new ng(messagesStorage, arrayList, ckVar, 3));
                    return;
                }
                return;
        }
    }
}
