package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class oa implements Runnable {
    public final int f21143a;
    public final MessagesController f21144b;
    public final jf.t f21145c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f21146e;

    public oa(MessagesController messagesController, jf.t tVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f21143a = i10;
        this.f21144b = messagesController;
        this.f21145c = tVar;
        this.d = concurrentHashMap;
        this.f21146e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21143a) {
            case 0:
                this.f21144b.lambda$processUpdateArray$400(this.f21145c, this.d, this.f21146e);
                return;
            case 1:
                this.f21144b.lambda$processUpdateArray$401(this.f21145c, this.d, this.f21146e);
                return;
            default:
                this.f21144b.lambda$processUpdateArray$405(this.f21145c, this.d, this.f21146e);
                return;
        }
    }
}
