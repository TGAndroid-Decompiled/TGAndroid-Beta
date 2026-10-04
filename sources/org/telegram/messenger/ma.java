package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class ma implements Runnable {
    public final int f18565a;
    public final MessagesController f18566b;
    public final r f18567c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f18568e;

    public ma(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18565a = i10;
        this.f18566b = messagesController;
        this.f18567c = rVar;
        this.d = concurrentHashMap;
        this.f18568e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18565a) {
            case 0:
                this.f18566b.lambda$processUpdateArray$400(this.f18567c, this.d, this.f18568e);
                return;
            case 1:
                this.f18566b.lambda$processUpdateArray$401(this.f18567c, this.d, this.f18568e);
                return;
            default:
                this.f18566b.lambda$processUpdateArray$405(this.f18567c, this.d, this.f18568e);
                return;
        }
    }
}
