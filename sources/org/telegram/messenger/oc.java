package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class oc implements Runnable {
    public final int f18730a;
    public final MessagesController f18731b;
    public final r f18732c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f18733e;

    public oc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18730a = i10;
        this.f18731b = messagesController;
        this.f18732c = rVar;
        this.d = concurrentHashMap;
        this.f18733e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18730a) {
            case 0:
                this.f18731b.lambda$processUpdateArray$404(this.f18732c, this.d, this.f18733e);
                return;
            case 1:
                this.f18731b.lambda$processUpdateArray$408(this.f18732c, this.d, this.f18733e);
                return;
            default:
                this.f18731b.lambda$processUpdateArray$403(this.f18732c, this.d, this.f18733e);
                return;
        }
    }
}
