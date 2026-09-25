package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f17474a;
    public final MessagesStorage f17475b;
    public final long f17476c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f17474a = i10;
        this.f17475b = messagesStorage;
        this.f17476c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f17474a) {
            case 0:
                this.f17475b.lambda$loadStoryAlbumsCache$270(this.f17476c, this.d);
                return;
            default:
                this.f17475b.lambda$loadTopics$51(this.f17476c, this.d);
                return;
        }
    }
}
