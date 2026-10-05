package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f19096a;
    public final MessagesStorage f19097b;
    public final long f19098c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f19096a = i10;
        this.f19097b = messagesStorage;
        this.f19098c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19096a) {
            case 0:
                this.f19097b.lambda$loadStoryAlbumsCache$270(this.f19098c, this.d);
                return;
            default:
                this.f19097b.lambda$loadTopics$51(this.f19098c, this.d);
                return;
        }
    }
}
