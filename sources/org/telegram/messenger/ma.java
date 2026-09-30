package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class ma implements Runnable {
    public final int f17006a;
    public final MessagesController f17007b;
    public final r f17008c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public ma(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f17006a = i10;
        this.f17007b = messagesController;
        this.f17008c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17006a) {
            case 0:
                this.f17007b.lambda$processUpdateArray$400(this.f17008c, this.d, this.e);
                return;
            case 1:
                this.f17007b.lambda$processUpdateArray$401(this.f17008c, this.d, this.e);
                return;
            default:
                this.f17007b.lambda$processUpdateArray$405(this.f17008c, this.d, this.e);
                return;
        }
    }
}
