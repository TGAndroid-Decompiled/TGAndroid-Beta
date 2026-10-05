package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class ma implements Runnable {
    public final int f18566a;
    public final MessagesController f18567b;
    public final r f18568c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f18569e;

    public ma(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18566a = i10;
        this.f18567b = messagesController;
        this.f18568c = rVar;
        this.d = concurrentHashMap;
        this.f18569e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18566a) {
            case 0:
                this.f18567b.lambda$processUpdateArray$400(this.f18568c, this.d, this.f18569e);
                return;
            case 1:
                this.f18567b.lambda$processUpdateArray$401(this.f18568c, this.d, this.f18569e);
                return;
            default:
                this.f18567b.lambda$processUpdateArray$405(this.f18568c, this.d, this.f18569e);
                return;
        }
    }
}
