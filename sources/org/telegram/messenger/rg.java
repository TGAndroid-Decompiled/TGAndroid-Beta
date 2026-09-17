package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f18939a;
    public final MessagesStorage f18940b;
    public final long f18941c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f18939a = i10;
        this.f18940b = messagesStorage;
        this.f18941c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f18939a) {
            case 0:
                this.f18940b.lambda$loadStoryAlbumsCache$270(this.f18941c, this.d);
                return;
            default:
                this.f18940b.lambda$loadTopics$51(this.f18941c, this.d);
                return;
        }
    }
}
