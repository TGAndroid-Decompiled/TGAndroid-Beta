package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import zf.r;
public final class qc implements Runnable {
    public final int f19308a;
    public final MessagesController f19309b;
    public final r f19310c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public qc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f19308a = i10;
        this.f19309b = messagesController;
        this.f19310c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19308a) {
            case 0:
                this.f19309b.lambda$processUpdateArray$404(this.f19310c, this.d, this.e);
                return;
            case 1:
                this.f19309b.lambda$processUpdateArray$408(this.f19310c, this.d, this.e);
                return;
            default:
                this.f19309b.lambda$processUpdateArray$403(this.f19310c, this.d, this.e);
                return;
        }
    }
}
