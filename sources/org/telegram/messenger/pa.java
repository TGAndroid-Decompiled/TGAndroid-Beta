package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class pa implements Runnable {
    public final int f19658a;
    public final MessagesController f19659b;
    public final lf.t f19660c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f19661e;

    public pa(MessagesController messagesController, lf.t tVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f19658a = i10;
        this.f19659b = messagesController;
        this.f19660c = tVar;
        this.d = concurrentHashMap;
        this.f19661e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19658a) {
            case 0:
                this.f19659b.lambda$processUpdateArray$400(this.f19660c, this.d, this.f19661e);
                return;
            case 1:
                this.f19659b.lambda$processUpdateArray$401(this.f19660c, this.d, this.f19661e);
                return;
            default:
                this.f19659b.lambda$processUpdateArray$405(this.f19660c, this.d, this.f19661e);
                return;
        }
    }
}
