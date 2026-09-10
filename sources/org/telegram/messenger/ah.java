package org.telegram.messenger;

import java.util.function.Consumer;
public final class ah implements Runnable {
    public final int f14721a;
    public final MessagesStorage f14722b;
    public final long f14723c;
    public final Consumer d;

    public ah(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f14721a = i10;
        this.f14722b = messagesStorage;
        this.f14723c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f14721a) {
            case 0:
                this.f14722b.lambda$loadStoryAlbumsCache$270(this.f14723c, this.d);
                return;
            default:
                this.f14722b.lambda$loadTopics$51(this.f14723c, this.d);
                return;
        }
    }
}
