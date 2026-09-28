package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f17478a;
    public final MessagesStorage f17479b;
    public final long f17480c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f17478a = i10;
        this.f17479b = messagesStorage;
        this.f17480c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f17478a) {
            case 0:
                this.f17479b.lambda$loadStoryAlbumsCache$270(this.f17480c, this.d);
                return;
            default:
                this.f17479b.lambda$loadTopics$51(this.f17480c, this.d);
                return;
        }
    }
}
