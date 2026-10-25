package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class la implements Runnable {
    public final int f20578a;
    public final MessagesController f20579b;
    public final ag.y f20580c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public la(MessagesController messagesController, ag.y yVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f20578a = i10;
        this.f20579b = messagesController;
        this.f20580c = yVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f20578a) {
            case 0:
                this.f20579b.lambda$processUpdateArray$405(this.f20580c, this.d, this.e);
                return;
            case 1:
                this.f20579b.lambda$processUpdateArray$406(this.f20580c, this.d, this.e);
                return;
            default:
                this.f20579b.lambda$processUpdateArray$410(this.f20580c, this.d, this.e);
                return;
        }
    }
}
