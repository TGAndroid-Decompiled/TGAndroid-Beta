package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import zf.r;
public final class oc implements Runnable {
    public final int f19136a;
    public final MessagesController f19137b;
    public final r f19138c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public oc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f19136a = i10;
        this.f19137b = messagesController;
        this.f19138c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19136a) {
            case 0:
                this.f19137b.lambda$processUpdateArray$404(this.f19138c, this.d, this.e);
                return;
            case 1:
                this.f19137b.lambda$processUpdateArray$408(this.f19138c, this.d, this.e);
                return;
            default:
                this.f19137b.lambda$processUpdateArray$403(this.f19138c, this.d, this.e);
                return;
        }
    }
}
