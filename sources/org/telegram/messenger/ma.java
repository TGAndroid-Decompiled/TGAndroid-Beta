package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class ma implements Runnable {
    public final int f18386a;
    public final MessagesController f18387b;
    public final r f18388c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f18389e;

    public ma(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18386a = i10;
        this.f18387b = messagesController;
        this.f18388c = rVar;
        this.d = concurrentHashMap;
        this.f18389e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18386a) {
            case 0:
                this.f18387b.lambda$processUpdateArray$400(this.f18388c, this.d, this.f18389e);
                return;
            case 1:
                this.f18387b.lambda$processUpdateArray$401(this.f18388c, this.d, this.f18389e);
                return;
            default:
                this.f18387b.lambda$processUpdateArray$405(this.f18388c, this.d, this.f18389e);
                return;
        }
    }
}
