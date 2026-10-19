package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import zf.r;
public final class mc implements Runnable {
    public final int f18963a;
    public final MessagesController f18964b;
    public final r f18965c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public mc(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18963a = i10;
        this.f18964b = messagesController;
        this.f18965c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18963a) {
            case 0:
                this.f18964b.lambda$processUpdateArray$404(this.f18965c, this.d, this.e);
                return;
            case 1:
                this.f18964b.lambda$processUpdateArray$408(this.f18965c, this.d, this.e);
                return;
            default:
                this.f18964b.lambda$processUpdateArray$403(this.f18965c, this.d, this.e);
                return;
        }
    }
}
