package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f17459a;
    public final MessagesStorage f17460b;
    public final long f17461c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f17459a = i10;
        this.f17460b = messagesStorage;
        this.f17461c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f17459a) {
            case 0:
                this.f17460b.lambda$loadStoryAlbumsCache$270(this.f17461c, this.d);
                return;
            default:
                this.f17460b.lambda$loadTopics$51(this.f17461c, this.d);
                return;
        }
    }
}
