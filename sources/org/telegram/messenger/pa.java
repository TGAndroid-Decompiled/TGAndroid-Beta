package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class pa implements Runnable {
    public final int f19656a;
    public final MessagesController f19657b;
    public final lf.t f19658c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f19659e;

    public pa(MessagesController messagesController, lf.t tVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f19656a = i10;
        this.f19657b = messagesController;
        this.f19658c = tVar;
        this.d = concurrentHashMap;
        this.f19659e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19656a) {
            case 0:
                this.f19657b.lambda$processUpdateArray$400(this.f19658c, this.d, this.f19659e);
                return;
            case 1:
                this.f19657b.lambda$processUpdateArray$401(this.f19658c, this.d, this.f19659e);
                return;
            default:
                this.f19657b.lambda$processUpdateArray$405(this.f19658c, this.d, this.f19659e);
                return;
        }
    }
}
