package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import zf.r;
public final class nc implements Runnable {
    public final int f19045a;
    public final MessagesController f19046b;
    public final r f19047c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public nc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f19045a = i10;
        this.f19046b = messagesController;
        this.f19047c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19045a) {
            case 0:
                this.f19046b.lambda$processUpdateArray$404(this.f19047c, this.d, this.e);
                return;
            case 1:
                this.f19046b.lambda$processUpdateArray$408(this.f19047c, this.d, this.e);
                return;
            default:
                this.f19046b.lambda$processUpdateArray$403(this.f19047c, this.d, this.e);
                return;
        }
    }
}
