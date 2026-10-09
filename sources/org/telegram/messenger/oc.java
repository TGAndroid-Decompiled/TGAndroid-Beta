package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class oc implements Runnable {
    public final int f18727a;
    public final MessagesController f18728b;
    public final r f18729c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f18730e;

    public oc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18727a = i10;
        this.f18728b = messagesController;
        this.f18729c = rVar;
        this.d = concurrentHashMap;
        this.f18730e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18727a) {
            case 0:
                this.f18728b.lambda$processUpdateArray$404(this.f18729c, this.d, this.f18730e);
                return;
            case 1:
                this.f18728b.lambda$processUpdateArray$408(this.f18729c, this.d, this.f18730e);
                return;
            default:
                this.f18728b.lambda$processUpdateArray$403(this.f18729c, this.d, this.f18730e);
                return;
        }
    }
}
