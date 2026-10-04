package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class ma implements Runnable {
    public final int f18561a;
    public final MessagesController f18562b;
    public final r f18563c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f18564e;

    public ma(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18561a = i10;
        this.f18562b = messagesController;
        this.f18563c = rVar;
        this.d = concurrentHashMap;
        this.f18564e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18561a) {
            case 0:
                this.f18562b.lambda$processUpdateArray$400(this.f18563c, this.d, this.f18564e);
                return;
            case 1:
                this.f18562b.lambda$processUpdateArray$401(this.f18563c, this.d, this.f18564e);
                return;
            default:
                this.f18562b.lambda$processUpdateArray$405(this.f18563c, this.d, this.f18564e);
                return;
        }
    }
}
