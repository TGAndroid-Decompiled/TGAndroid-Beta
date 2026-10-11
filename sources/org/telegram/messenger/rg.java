package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f19064a;
    public final MessagesStorage f19065b;
    public final long f19066c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f19064a = i10;
        this.f19065b = messagesStorage;
        this.f19066c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19064a) {
            case 0:
                this.f19065b.lambda$loadStoryAlbumsCache$270(this.f19066c, this.d);
                return;
            default:
                this.f19065b.lambda$loadTopics$51(this.f19066c, this.d);
                return;
        }
    }
}
