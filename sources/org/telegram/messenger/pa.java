package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class pa implements Runnable {
    public final int f18102a;
    public final MessagesController f18103b;
    public final lf.t f18104c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public pa(MessagesController messagesController, lf.t tVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f18102a = i10;
        this.f18103b = messagesController;
        this.f18104c = tVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18102a) {
            case 0:
                this.f18103b.lambda$processUpdateArray$400(this.f18104c, this.d, this.e);
                return;
            case 1:
                this.f18103b.lambda$processUpdateArray$401(this.f18104c, this.d, this.e);
                return;
            default:
                this.f18103b.lambda$processUpdateArray$405(this.f18104c, this.d, this.e);
                return;
        }
    }
}
