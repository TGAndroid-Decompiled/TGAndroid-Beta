package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import zf.r;
public final class rc implements Runnable {
    public final int f19380a;
    public final MessagesController f19381b;
    public final r f19382c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public rc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f19380a = i10;
        this.f19381b = messagesController;
        this.f19382c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19380a) {
            case 0:
                this.f19381b.lambda$processUpdateArray$404(this.f19382c, this.d, this.e);
                return;
            case 1:
                this.f19381b.lambda$processUpdateArray$408(this.f19382c, this.d, this.e);
                return;
            default:
                this.f19381b.lambda$processUpdateArray$403(this.f19382c, this.d, this.e);
                return;
        }
    }
}
