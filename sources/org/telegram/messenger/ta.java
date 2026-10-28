package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class ta implements Runnable {
    public final int f21288a;
    public final MessagesController f21289b;
    public final ag.y f21290c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public ta(MessagesController messagesController, ag.y yVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.f21288a = i10;
        this.f21289b = messagesController;
        this.f21290c = yVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21288a) {
            case 0:
                this.f21289b.lambda$processUpdateArray$406(this.f21290c, this.d, this.e);
                return;
            case 1:
                this.f21289b.lambda$processUpdateArray$407(this.f21290c, this.d, this.e);
                return;
            default:
                this.f21289b.lambda$processUpdateArray$411(this.f21290c, this.d, this.e);
                return;
        }
    }
}
