package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f18912a;
    public final MessagesStorage f18913b;
    public final long f18914c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f18912a = i10;
        this.f18913b = messagesStorage;
        this.f18914c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f18912a) {
            case 0:
                this.f18913b.lambda$loadStoryAlbumsCache$270(this.f18914c, this.d);
                return;
            default:
                this.f18913b.lambda$loadTopics$51(this.f18914c, this.d);
                return;
        }
    }
}
