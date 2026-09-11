package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class la implements Runnable {
    public final int f18282a;
    public final MessagesController f18283b;
    public final r f18284c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f18285e;

    public la(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18282a = i10;
        this.f18283b = messagesController;
        this.f18284c = rVar;
        this.d = concurrentHashMap;
        this.f18285e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18282a) {
            case 0:
                this.f18283b.lambda$processUpdateArray$400(this.f18284c, this.d, this.f18285e);
                return;
            case 1:
                this.f18283b.lambda$processUpdateArray$401(this.f18284c, this.d, this.f18285e);
                return;
            default:
                this.f18283b.lambda$processUpdateArray$405(this.f18284c, this.d, this.f18285e);
                return;
        }
    }
}
