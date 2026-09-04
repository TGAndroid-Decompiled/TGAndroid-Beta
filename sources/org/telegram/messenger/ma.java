package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class ma implements Runnable {
    public final int f18359a;
    public final MessagesController f18360b;
    public final r f18361c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f18362e;

    public ma(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18359a = i10;
        this.f18360b = messagesController;
        this.f18361c = rVar;
        this.d = concurrentHashMap;
        this.f18362e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18359a) {
            case 0:
                this.f18360b.lambda$processUpdateArray$400(this.f18361c, this.d, this.f18362e);
                return;
            case 1:
                this.f18360b.lambda$processUpdateArray$401(this.f18361c, this.d, this.f18362e);
                return;
            default:
                this.f18360b.lambda$processUpdateArray$405(this.f18361c, this.d, this.f18362e);
                return;
        }
    }
}
