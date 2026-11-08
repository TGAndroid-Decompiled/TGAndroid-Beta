package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class ck implements Runnable {
    public final int f21874a;
    public final qp f21875b;
    public final bg.u f21876c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f21877e;

    public ck(qp qpVar, bg.u uVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i7) {
        this.f21874a = i7;
        this.f21875b = qpVar;
        this.f21876c = uVar;
        this.d = concurrentHashMap;
        this.f21877e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21874a) {
            case 0:
                qp qpVar = this.f21875b;
                int i7 = qpVar.currentAccount;
                bg.u uVar = this.f21876c;
                uVar.b(i7, this.d, this.f21877e, 0);
                g0.h3(new vl(qpVar, uVar, 1));
                return;
            case 1:
                qp qpVar2 = this.f21875b;
                int i10 = qpVar2.currentAccount;
                bg.u uVar2 = this.f21876c;
                uVar2.b(i10, this.d, this.f21877e, 0);
                g0.h3(new vl(qpVar2, uVar2, 2));
                return;
            default:
                qp qpVar3 = this.f21875b;
                yr messagesStorage = qpVar3.getMessagesStorage();
                bg.u uVar3 = this.f21876c;
                ArrayList arrayList = uVar3.f3373a;
                ck ckVar = new ck(qpVar3, uVar3, this.d, this.f21877e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new ng(messagesStorage, arrayList, ckVar, 3));
                    return;
                }
                return;
        }
    }
}
