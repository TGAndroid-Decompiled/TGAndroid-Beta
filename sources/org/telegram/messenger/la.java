package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;
public final class la implements Runnable {
    public final int f18309a;
    public final MessagesController f18310b;
    public final r f18311c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f18312e;

    public la(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18309a = i10;
        this.f18310b = messagesController;
        this.f18311c = rVar;
        this.d = concurrentHashMap;
        this.f18312e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18309a) {
            case 0:
                this.f18310b.lambda$processUpdateArray$400(this.f18311c, this.d, this.f18312e);
                return;
            case 1:
                this.f18310b.lambda$processUpdateArray$401(this.f18311c, this.d, this.f18312e);
                return;
            default:
                this.f18310b.lambda$processUpdateArray$405(this.f18311c, this.d, this.f18312e);
                return;
        }
    }
}
