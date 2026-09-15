package org.telegram.messenger;

import java.util.function.Consumer;
public final class sg implements Runnable {
    public final int f17322a;
    public final MessagesStorage f17323b;
    public final long f17324c;
    public final Consumer d;

    public sg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f17322a = i10;
        this.f17323b = messagesStorage;
        this.f17324c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f17322a) {
            case 0:
                this.f17323b.lambda$loadStoryAlbumsCache$270(this.f17324c, this.d);
                return;
            default:
                this.f17323b.lambda$loadTopics$51(this.f17324c, this.d);
                return;
        }
    }
}
