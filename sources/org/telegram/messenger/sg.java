package org.telegram.messenger;

import java.util.function.Consumer;
public final class sg implements Runnable {
    public final int f17503a;
    public final MessagesStorage f17504b;
    public final long f17505c;
    public final Consumer d;

    public sg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f17503a = i10;
        this.f17504b = messagesStorage;
        this.f17505c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f17503a) {
            case 0:
                this.f17504b.lambda$loadStoryAlbumsCache$270(this.f17505c, this.d);
                return;
            default:
                this.f17504b.lambda$loadTopics$51(this.f17505c, this.d);
                return;
        }
    }
}
