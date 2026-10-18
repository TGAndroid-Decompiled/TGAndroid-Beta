package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import zf.r;
public final class mc implements Runnable {
    public final int f18966a;
    public final MessagesController f18967b;
    public final r f18968c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public mc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18966a = i10;
        this.f18967b = messagesController;
        this.f18968c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18966a) {
            case 0:
                this.f18967b.lambda$processUpdateArray$404(this.f18968c, this.d, this.e);
                return;
            case 1:
                this.f18967b.lambda$processUpdateArray$408(this.f18968c, this.d, this.e);
                return;
            default:
                this.f18967b.lambda$processUpdateArray$403(this.f18968c, this.d, this.e);
                return;
        }
    }
}
