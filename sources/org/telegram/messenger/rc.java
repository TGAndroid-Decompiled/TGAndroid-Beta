package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class rc implements Runnable {
    public final int f18286a;
    public final MessagesController f18287b;
    public final zf.s f18288c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public rc(MessagesController messagesController, zf.s sVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18286a = i10;
        this.f18287b = messagesController;
        this.f18288c = sVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18286a) {
            case 0:
                this.f18287b.lambda$processUpdateArray$404(this.f18288c, this.d, this.e);
                return;
            case 1:
                this.f18287b.lambda$processUpdateArray$408(this.f18288c, this.d, this.e);
                return;
            default:
                this.f18287b.lambda$processUpdateArray$403(this.f18288c, this.d, this.e);
                return;
        }
    }
}
