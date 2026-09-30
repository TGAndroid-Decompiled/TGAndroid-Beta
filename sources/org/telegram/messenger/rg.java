package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f17494a;
    public final MessagesStorage f17495b;
    public final long f17496c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f17494a = i10;
        this.f17495b = messagesStorage;
        this.f17496c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f17494a) {
            case 0:
                this.f17495b.lambda$loadStoryAlbumsCache$270(this.f17496c, this.d);
                return;
            default:
                this.f17495b.lambda$loadTopics$51(this.f17496c, this.d);
                return;
        }
    }
}
