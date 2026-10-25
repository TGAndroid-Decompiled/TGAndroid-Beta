package org.telegram.messenger;

import java.util.function.Consumer;
public final class qg implements Runnable {
    public final int f21054a;
    public final MessagesStorage f21055b;
    public final long f21056c;
    public final Consumer d;

    public qg(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f21054a = i10;
        this.f21055b = messagesStorage;
        this.f21056c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f21054a) {
            case 0:
                this.f21055b.lambda$loadStoryAlbumsCache$273(this.f21056c, this.d);
                return;
            default:
                this.f21055b.lambda$loadTopics$54(this.f21056c, this.d);
                return;
        }
    }
}
