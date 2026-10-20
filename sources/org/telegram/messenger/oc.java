package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import zf.r;
public final class oc implements Runnable {
    public final int f19139a;
    public final MessagesController f19140b;
    public final r f19141c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public oc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f19139a = i10;
        this.f19140b = messagesController;
        this.f19141c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19139a) {
            case 0:
                this.f19140b.lambda$processUpdateArray$404(this.f19141c, this.d, this.e);
                return;
            case 1:
                this.f19140b.lambda$processUpdateArray$408(this.f19141c, this.d, this.e);
                return;
            default:
                this.f19140b.lambda$processUpdateArray$403(this.f19141c, this.d, this.e);
                return;
        }
    }
}
