package org.telegram.messenger;

import java.util.function.Consumer;
public final class sg implements Runnable {
    public final int f17552a;
    public final MessagesStorage f17553b;
    public final long f17554c;
    public final Consumer d;

    public sg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f17552a = i10;
        this.f17553b = messagesStorage;
        this.f17554c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f17552a) {
            case 0:
                this.f17553b.lambda$loadStoryAlbumsCache$270(this.f17554c, this.d);
                return;
            default:
                this.f17553b.lambda$loadTopics$51(this.f17554c, this.d);
                return;
        }
    }
}
