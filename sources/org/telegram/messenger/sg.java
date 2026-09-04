package org.telegram.messenger;

import java.util.function.Consumer;
public final class sg implements Runnable {
    public final int f18991a;
    public final MessagesStorage f18992b;
    public final long f18993c;
    public final Consumer d;

    public sg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f18991a = i10;
        this.f18992b = messagesStorage;
        this.f18993c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f18991a) {
            case 0:
                this.f18992b.lambda$loadStoryAlbumsCache$270(this.f18993c, this.d);
                return;
            default:
                this.f18992b.lambda$loadTopics$51(this.f18993c, this.d);
                return;
        }
    }
}
