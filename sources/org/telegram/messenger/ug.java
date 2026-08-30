package org.telegram.messenger;

import java.util.function.Consumer;
public final class ug implements Runnable {
    public final int f18601a;
    public final MessagesStorage f18602b;
    public final long f18603c;
    public final Consumer d;

    public ug(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f18601a = i10;
        this.f18602b = messagesStorage;
        this.f18603c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f18601a) {
            case 0:
                this.f18602b.lambda$loadStoryAlbumsCache$270(this.f18603c, this.d);
                return;
            default:
                this.f18602b.lambda$loadTopics$51(this.f18603c, this.d);
                return;
        }
    }
}
