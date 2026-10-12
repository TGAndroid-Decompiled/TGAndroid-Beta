package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class rc implements Runnable {
    public final int f18765a;
    public final MessagesController f18766b;
    public final r f18767c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f18768e;

    public rc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18765a = i10;
        this.f18766b = messagesController;
        this.f18767c = rVar;
        this.d = concurrentHashMap;
        this.f18768e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18765a) {
            case 0:
                this.f18766b.lambda$processUpdateArray$404(this.f18767c, this.d, this.f18768e);
                return;
            case 1:
                this.f18766b.lambda$processUpdateArray$408(this.f18767c, this.d, this.f18768e);
                return;
            default:
                this.f18766b.lambda$processUpdateArray$403(this.f18767c, this.d, this.f18768e);
                return;
        }
    }
}
