package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import zf.r;
public final class nc implements Runnable {
    public final int f19042a;
    public final MessagesController f19043b;
    public final r f19044c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public nc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f19042a = i10;
        this.f19043b = messagesController;
        this.f19044c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19042a) {
            case 0:
                this.f19043b.lambda$processUpdateArray$404(this.f19044c, this.d, this.e);
                return;
            case 1:
                this.f19043b.lambda$processUpdateArray$408(this.f19044c, this.d, this.e);
                return;
            default:
                this.f19043b.lambda$processUpdateArray$403(this.f19044c, this.d, this.e);
                return;
        }
    }
}
