package org.telegram.messenger;

import java.util.function.Consumer;
public final class ng implements Runnable {
    public final int f19068a;
    public final MessagesStorage f19069b;
    public final long f19070c;
    public final Consumer d;

    public ng(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f19068a = i10;
        this.f19069b = messagesStorage;
        this.f19070c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19068a) {
            case 0:
                this.f19069b.lambda$loadStoryAlbumsCache$270(this.f19070c, this.d);
                return;
            default:
                this.f19069b.lambda$loadTopics$51(this.f19070c, this.d);
                return;
        }
    }
}
