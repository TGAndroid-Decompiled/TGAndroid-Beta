package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f17226a;
    public final MessagesStorage f17227b;
    public final long f17228c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f17226a = i10;
        this.f17227b = messagesStorage;
        this.f17228c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f17226a) {
            case 0:
                this.f17227b.lambda$loadStoryAlbumsCache$270(this.f17228c, this.d);
                return;
            default:
                this.f17227b.lambda$loadTopics$51(this.f17228c, this.d);
                return;
        }
    }
}
