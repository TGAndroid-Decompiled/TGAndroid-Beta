package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

public final class ma implements Runnable {

    public final int f20965a;

    public final MessagesController f20966b;

    public final gf.u f20967c;
    public final ConcurrentHashMap d;

    public final ConcurrentHashMap f20968e;

    public ma(MessagesController messagesController, gf.u uVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f20965a = i10;
        this.f20966b = messagesController;
        this.f20967c = uVar;
        this.d = concurrentHashMap;
        this.f20968e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f20965a) {
            case 0:
                this.f20966b.lambda$processUpdateArray$400(this.f20967c, this.d, this.f20968e);
                break;
            case 1:
                this.f20966b.lambda$processUpdateArray$401(this.f20967c, this.d, this.f20968e);
                break;
            default:
                this.f20966b.lambda$processUpdateArray$405(this.f20967c, this.d, this.f20968e);
                break;
        }
    }
}
