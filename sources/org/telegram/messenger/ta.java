package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import xf.r;
public final class ta implements Runnable {
    public final int f16393a;
    public final MessagesController f16394b;
    public final r f16395c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public ta(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f16393a = i10;
        this.f16394b = messagesController;
        this.f16395c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f16393a) {
            case 0:
                this.f16394b.lambda$processUpdateArray$400(this.f16395c, this.d, this.e);
                return;
            case 1:
                this.f16394b.lambda$processUpdateArray$401(this.f16395c, this.d, this.e);
                return;
            default:
                this.f16394b.lambda$processUpdateArray$405(this.f16395c, this.d, this.e);
                return;
        }
    }
}
