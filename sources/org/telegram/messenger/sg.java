package org.telegram.messenger;

import java.util.function.Consumer;
public final class sg implements Runnable {
    public final int f17537a;
    public final MessagesStorage f17538b;
    public final long f17539c;
    public final Consumer d;

    public sg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f17537a = i10;
        this.f17538b = messagesStorage;
        this.f17539c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f17537a) {
            case 0:
                this.f17538b.lambda$loadStoryAlbumsCache$270(this.f17539c, this.d);
                return;
            default:
                this.f17538b.lambda$loadTopics$51(this.f17539c, this.d);
                return;
        }
    }
}
