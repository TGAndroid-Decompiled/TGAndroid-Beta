package org.telegram.messenger;

import java.util.function.Consumer;
public final class mg implements Runnable {
    public final int f18992a;
    public final MessagesStorage f18993b;
    public final long f18994c;
    public final Consumer d;

    public mg(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f18992a = i10;
        this.f18993b = messagesStorage;
        this.f18994c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f18992a) {
            case 0:
                this.f18993b.lambda$loadStoryAlbumsCache$270(this.f18994c, this.d);
                return;
            default:
                this.f18993b.lambda$loadTopics$51(this.f18994c, this.d);
                return;
        }
    }
}
