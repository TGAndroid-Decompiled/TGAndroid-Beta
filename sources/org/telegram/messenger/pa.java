package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class pa implements Runnable {
    public final int f18080a;
    public final MessagesController f18081b;
    public final kf.t f18082c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public pa(MessagesController messagesController, kf.t tVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18080a = i10;
        this.f18081b = messagesController;
        this.f18082c = tVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18080a) {
            case 0:
                this.f18081b.lambda$processUpdateArray$400(this.f18082c, this.d, this.e);
                return;
            case 1:
                this.f18081b.lambda$processUpdateArray$401(this.f18082c, this.d, this.e);
                return;
            default:
                this.f18081b.lambda$processUpdateArray$405(this.f18082c, this.d, this.e);
                return;
        }
    }
}
