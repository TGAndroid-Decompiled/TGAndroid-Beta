package org.telegram.messenger;

import java.util.function.Consumer;
public final class sg implements Runnable {
    public final int f17331a;
    public final MessagesStorage f17332b;
    public final long f17333c;
    public final Consumer d;

    public sg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f17331a = i10;
        this.f17332b = messagesStorage;
        this.f17333c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f17331a) {
            case 0:
                this.f17332b.lambda$loadStoryAlbumsCache$270(this.f17333c, this.d);
                return;
            default:
                this.f17332b.lambda$loadTopics$51(this.f17333c, this.d);
                return;
        }
    }
}
