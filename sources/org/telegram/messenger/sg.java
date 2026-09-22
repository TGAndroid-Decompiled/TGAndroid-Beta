package org.telegram.messenger;

import java.util.function.Consumer;
public final class sg implements Runnable {
    public final int f17319a;
    public final MessagesStorage f17320b;
    public final long f17321c;
    public final Consumer d;

    public sg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f17319a = i10;
        this.f17320b = messagesStorage;
        this.f17321c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f17319a) {
            case 0:
                this.f17320b.lambda$loadStoryAlbumsCache$270(this.f17321c, this.d);
                return;
            default:
                this.f17320b.lambda$loadTopics$51(this.f17321c, this.d);
                return;
        }
    }
}
