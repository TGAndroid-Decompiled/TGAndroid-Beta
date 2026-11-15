package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class ak implements Runnable {
    public final int f22530a;
    public final np f22531b;
    public final bg.u f22532c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f22533e;

    public ak(np npVar, bg.u uVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i7) {
        this.f22530a = i7;
        this.f22531b = npVar;
        this.f22532c = uVar;
        this.d = concurrentHashMap;
        this.f22533e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f22530a) {
            case 0:
                np npVar = this.f22531b;
                int i7 = npVar.currentAccount;
                bg.u uVar = this.f22532c;
                uVar.b(i7, this.d, this.f22533e, 0);
                g0.h3(new sl(npVar, uVar, 1));
                return;
            case 1:
                np npVar2 = this.f22531b;
                int i10 = npVar2.currentAccount;
                bg.u uVar2 = this.f22532c;
                uVar2.b(i10, this.d, this.f22533e, 0);
                g0.h3(new sl(npVar2, uVar2, 2));
                return;
            default:
                np npVar3 = this.f22531b;
                vr messagesStorage = npVar3.getMessagesStorage();
                bg.u uVar3 = this.f22532c;
                ArrayList arrayList = uVar3.f3332a;
                ak akVar = new ak(npVar3, uVar3, this.d, this.f22533e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new mg(messagesStorage, arrayList, akVar, 3));
                    return;
                }
                return;
        }
    }
}
