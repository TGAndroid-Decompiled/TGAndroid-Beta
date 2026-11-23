package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class ak implements Runnable {
    public final int f22933a;
    public final np f22934b;
    public final bg.v f22935c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f22936e;

    public ak(np npVar, bg.v vVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i7) {
        this.f22933a = i7;
        this.f22934b = npVar;
        this.f22935c = vVar;
        this.d = concurrentHashMap;
        this.f22936e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f22933a) {
            case 0:
                np npVar = this.f22934b;
                int i7 = npVar.currentAccount;
                bg.v vVar = this.f22935c;
                vVar.b(i7, this.d, this.f22936e, 0);
                g0.g3(new ql(npVar, vVar, 1));
                return;
            case 1:
                np npVar2 = this.f22934b;
                int i10 = npVar2.currentAccount;
                bg.v vVar2 = this.f22935c;
                vVar2.b(i10, this.d, this.f22936e, 0);
                g0.g3(new ql(npVar2, vVar2, 2));
                return;
            default:
                np npVar3 = this.f22934b;
                ur messagesStorage = npVar3.getMessagesStorage();
                bg.v vVar3 = this.f22935c;
                ArrayList arrayList = vVar3.f3359a;
                ak akVar = new ak(npVar3, vVar3, this.d, this.f22936e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new zf(messagesStorage, arrayList, akVar, 3));
                    return;
                }
                return;
        }
    }
}
