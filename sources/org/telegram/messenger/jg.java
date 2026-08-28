package org.telegram.messenger;

import java.util.function.Consumer;
public final class jg implements Runnable {
    public final int f20717a;
    public final MessagesStorage f20718b;
    public final long f20719c;
    public final Consumer d;

    public jg(MessagesStorage messagesStorage, long j10, Consumer consumer, int i9) {
        this.f20717a = i9;
        this.f20718b = messagesStorage;
        this.f20719c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f20717a) {
            case 0:
                this.f20718b.lambda$loadStoryAlbumsCache$270(this.f20719c, this.d);
                return;
            default:
                this.f20718b.lambda$loadTopics$51(this.f20719c, this.d);
                return;
        }
    }
}
