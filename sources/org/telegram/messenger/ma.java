package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class ma implements Runnable {
    public final int f17022a;
    public final MessagesController f17023b;
    public final r f17024c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public ma(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f17022a = i10;
        this.f17023b = messagesController;
        this.f17024c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17022a) {
            case 0:
                this.f17023b.lambda$processUpdateArray$400(this.f17024c, this.d, this.e);
                return;
            case 1:
                this.f17023b.lambda$processUpdateArray$401(this.f17024c, this.d, this.e);
                return;
            default:
                this.f17023b.lambda$processUpdateArray$405(this.f17024c, this.d, this.e);
                return;
        }
    }
}
