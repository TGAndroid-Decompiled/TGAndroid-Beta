package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class ia implements Runnable {
    public final int f20579a;
    public final MessagesController f20580b;
    public final ff.u f20581c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f20582e;

    public ia(MessagesController messagesController, ff.u uVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i9) {
        this.f20579a = i9;
        this.f20580b = messagesController;
        this.f20581c = uVar;
        this.d = concurrentHashMap;
        this.f20582e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f20579a) {
            case 0:
                this.f20580b.lambda$processUpdateArray$400(this.f20581c, this.d, this.f20582e);
                return;
            case 1:
                this.f20580b.lambda$processUpdateArray$401(this.f20581c, this.d, this.f20582e);
                return;
            default:
                this.f20580b.lambda$processUpdateArray$405(this.f20581c, this.d, this.f20582e);
                return;
        }
    }
}
