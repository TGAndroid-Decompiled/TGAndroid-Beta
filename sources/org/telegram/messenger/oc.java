package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class oc implements Runnable {
    public final int f18731a;
    public final MessagesController f18732b;
    public final r f18733c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f18734e;

    public oc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18731a = i10;
        this.f18732b = messagesController;
        this.f18733c = rVar;
        this.d = concurrentHashMap;
        this.f18734e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18731a) {
            case 0:
                this.f18732b.lambda$processUpdateArray$404(this.f18733c, this.d, this.f18734e);
                return;
            case 1:
                this.f18732b.lambda$processUpdateArray$408(this.f18733c, this.d, this.f18734e);
                return;
            default:
                this.f18732b.lambda$processUpdateArray$403(this.f18733c, this.d, this.f18734e);
                return;
        }
    }
}
