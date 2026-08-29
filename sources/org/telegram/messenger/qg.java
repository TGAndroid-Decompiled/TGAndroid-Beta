package org.telegram.messenger;

import java.util.function.Consumer;
public final class qg implements Runnable {
    public final int f21367a;
    public final MessagesStorage f21368b;
    public final long f21369c;
    public final Consumer d;

    public qg(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f21367a = i10;
        this.f21368b = messagesStorage;
        this.f21369c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f21367a) {
            case 0:
                this.f21368b.lambda$loadStoryAlbumsCache$270(this.f21369c, this.d);
                return;
            default:
                this.f21368b.lambda$loadTopics$51(this.f21369c, this.d);
                return;
        }
    }
}
