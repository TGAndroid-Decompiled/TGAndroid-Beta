package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import zf.r;
public final class mc implements Runnable {
    public final int f18960a;
    public final MessagesController f18961b;
    public final r f18962c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public mc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18960a = i10;
        this.f18961b = messagesController;
        this.f18962c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18960a) {
            case 0:
                this.f18961b.lambda$processUpdateArray$404(this.f18962c, this.d, this.e);
                return;
            case 1:
                this.f18961b.lambda$processUpdateArray$408(this.f18962c, this.d, this.e);
                return;
            default:
                this.f18961b.lambda$processUpdateArray$403(this.f18962c, this.d, this.e);
                return;
        }
    }
}
