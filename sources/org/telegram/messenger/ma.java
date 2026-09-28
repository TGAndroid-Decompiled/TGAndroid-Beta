package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class ma implements Runnable {
    public final int f17005a;
    public final MessagesController f17006b;
    public final r f17007c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public ma(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f17005a = i10;
        this.f17006b = messagesController;
        this.f17007c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17005a) {
            case 0:
                this.f17006b.lambda$processUpdateArray$400(this.f17007c, this.d, this.e);
                return;
            case 1:
                this.f17006b.lambda$processUpdateArray$401(this.f17007c, this.d, this.e);
                return;
            default:
                this.f17006b.lambda$processUpdateArray$405(this.f17007c, this.d, this.e);
                return;
        }
    }
}
