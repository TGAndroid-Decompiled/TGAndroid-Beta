package org.telegram.messenger;

import java.util.function.Consumer;
public final class ug implements Runnable {
    public final int f20213a;
    public final MessagesStorage f20214b;
    public final long f20215c;
    public final Consumer d;

    public ug(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f20213a = i10;
        this.f20214b = messagesStorage;
        this.f20215c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f20213a) {
            case 0:
                this.f20214b.lambda$loadStoryAlbumsCache$270(this.f20215c, this.d);
                return;
            default:
                this.f20214b.lambda$loadTopics$51(this.f20215c, this.d);
                return;
        }
    }
}
