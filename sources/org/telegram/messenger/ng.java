package org.telegram.messenger;

import java.util.function.Consumer;
public final class ng implements Runnable {
    public final int f19071a;
    public final MessagesStorage f19072b;
    public final long f19073c;
    public final Consumer d;

    public ng(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f19071a = i10;
        this.f19072b = messagesStorage;
        this.f19073c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19071a) {
            case 0:
                this.f19072b.lambda$loadStoryAlbumsCache$270(this.f19073c, this.d);
                return;
            default:
                this.f19072b.lambda$loadTopics$51(this.f19073c, this.d);
                return;
        }
    }
}
