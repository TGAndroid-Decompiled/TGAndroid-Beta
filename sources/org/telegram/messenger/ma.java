package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class ma implements Runnable {
    public final int f16759a;
    public final MessagesController f16760b;
    public final r f16761c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public ma(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f16759a = i10;
        this.f16760b = messagesController;
        this.f16761c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f16759a) {
            case 0:
                this.f16760b.lambda$processUpdateArray$400(this.f16761c, this.d, this.e);
                return;
            case 1:
                this.f16760b.lambda$processUpdateArray$401(this.f16761c, this.d, this.e);
                return;
            default:
                this.f16760b.lambda$processUpdateArray$405(this.f16761c, this.d, this.e);
                return;
        }
    }
}
