package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class rc implements Runnable {
    public final int f17988a;
    public final MessagesController f17989b;
    public final zf.s f17990c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public rc(MessagesController messagesController, zf.s sVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f17988a = i10;
        this.f17989b = messagesController;
        this.f17990c = sVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17988a) {
            case 0:
                this.f17989b.lambda$processUpdateArray$404(this.f17990c, this.d, this.e);
                return;
            case 1:
                this.f17989b.lambda$processUpdateArray$408(this.f17990c, this.d, this.e);
                return;
            default:
                this.f17989b.lambda$processUpdateArray$403(this.f17990c, this.d, this.e);
                return;
        }
    }
}
