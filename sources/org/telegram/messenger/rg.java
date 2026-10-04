package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f19091a;
    public final MessagesStorage f19092b;
    public final long f19093c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f19091a = i10;
        this.f19092b = messagesStorage;
        this.f19093c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19091a) {
            case 0:
                this.f19092b.lambda$loadStoryAlbumsCache$270(this.f19093c, this.d);
                return;
            default:
                this.f19092b.lambda$loadTopics$51(this.f19093c, this.d);
                return;
        }
    }
}
