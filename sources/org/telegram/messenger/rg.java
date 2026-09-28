package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f17477a;
    public final MessagesStorage f17478b;
    public final long f17479c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f17477a = i10;
        this.f17478b = messagesStorage;
        this.f17479c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f17477a) {
            case 0:
                this.f17478b.lambda$loadStoryAlbumsCache$270(this.f17479c, this.d);
                return;
            default:
                this.f17478b.lambda$loadTopics$51(this.f17479c, this.d);
                return;
        }
    }
}
