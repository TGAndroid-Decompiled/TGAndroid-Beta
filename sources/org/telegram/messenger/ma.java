package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class ma implements Runnable {
    public final int f16750a;
    public final MessagesController f16751b;
    public final r f16752c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public ma(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f16750a = i10;
        this.f16751b = messagesController;
        this.f16752c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f16750a) {
            case 0:
                this.f16751b.lambda$processUpdateArray$400(this.f16752c, this.d, this.e);
                return;
            case 1:
                this.f16751b.lambda$processUpdateArray$401(this.f16752c, this.d, this.e);
                return;
            default:
                this.f16751b.lambda$processUpdateArray$405(this.f16752c, this.d, this.e);
                return;
        }
    }
}
