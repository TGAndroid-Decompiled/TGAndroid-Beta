package org.telegram.messenger;

import java.util.function.Consumer;
public final class ug implements Runnable {
    public final int f20211a;
    public final MessagesStorage f20212b;
    public final long f20213c;
    public final Consumer d;

    public ug(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f20211a = i10;
        this.f20212b = messagesStorage;
        this.f20213c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f20211a) {
            case 0:
                this.f20212b.lambda$loadStoryAlbumsCache$270(this.f20213c, this.d);
                return;
            default:
                this.f20212b.lambda$loadTopics$51(this.f20213c, this.d);
                return;
        }
    }
}
