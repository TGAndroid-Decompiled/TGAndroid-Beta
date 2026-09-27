package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f17468a;
    public final MessagesStorage f17469b;
    public final long f17470c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f17468a = i10;
        this.f17469b = messagesStorage;
        this.f17470c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f17468a) {
            case 0:
                this.f17469b.lambda$loadStoryAlbumsCache$270(this.f17470c, this.d);
                return;
            default:
                this.f17469b.lambda$loadTopics$51(this.f17470c, this.d);
                return;
        }
    }
}
