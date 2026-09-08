package org.telegram.messenger;

import java.util.function.Consumer;
public final class sg implements Runnable {
    public final int f19018a;
    public final MessagesStorage f19019b;
    public final long f19020c;
    public final Consumer d;

    public sg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f19018a = i10;
        this.f19019b = messagesStorage;
        this.f19020c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19018a) {
            case 0:
                this.f19019b.lambda$loadStoryAlbumsCache$270(this.f19020c, this.d);
                return;
            default:
                this.f19019b.lambda$loadTopics$51(this.f19020c, this.d);
                return;
        }
    }
}
