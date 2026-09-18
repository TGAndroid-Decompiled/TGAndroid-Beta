package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class ma implements Runnable {
    public final int f16931a;
    public final MessagesController f16932b;
    public final yf.s f16933c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public ma(MessagesController messagesController, yf.s sVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f16931a = i10;
        this.f16932b = messagesController;
        this.f16933c = sVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f16931a) {
            case 0:
                this.f16932b.lambda$processUpdateArray$400(this.f16933c, this.d, this.e);
                return;
            case 1:
                this.f16932b.lambda$processUpdateArray$401(this.f16933c, this.d, this.e);
                return;
            default:
                this.f16932b.lambda$processUpdateArray$405(this.f16933c, this.d, this.e);
                return;
        }
    }
}
