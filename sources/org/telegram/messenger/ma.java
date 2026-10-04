package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class ma implements Runnable {
    public final int f18564a;
    public final MessagesController f18565b;
    public final r f18566c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f18567e;

    public ma(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18564a = i10;
        this.f18565b = messagesController;
        this.f18566c = rVar;
        this.d = concurrentHashMap;
        this.f18567e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18564a) {
            case 0:
                this.f18565b.lambda$processUpdateArray$400(this.f18566c, this.d, this.f18567e);
                return;
            case 1:
                this.f18565b.lambda$processUpdateArray$401(this.f18566c, this.d, this.f18567e);
                return;
            default:
                this.f18565b.lambda$processUpdateArray$405(this.f18566c, this.d, this.f18567e);
                return;
        }
    }
}
