package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class oc implements Runnable {
    public final int f18766a;
    public final MessagesController f18767b;
    public final r f18768c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f18769e;

    public oc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18766a = i10;
        this.f18767b = messagesController;
        this.f18768c = rVar;
        this.d = concurrentHashMap;
        this.f18769e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18766a) {
            case 0:
                this.f18767b.lambda$processUpdateArray$404(this.f18768c, this.d, this.f18769e);
                return;
            case 1:
                this.f18767b.lambda$processUpdateArray$408(this.f18768c, this.d, this.f18769e);
                return;
            default:
                this.f18767b.lambda$processUpdateArray$403(this.f18768c, this.d, this.f18769e);
                return;
        }
    }
}
