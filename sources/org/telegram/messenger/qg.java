package org.telegram.messenger;

import java.util.function.Consumer;
public final class qg implements Runnable {
    public final int f19334a;
    public final MessagesStorage f19335b;
    public final long f19336c;
    public final Consumer d;

    public qg(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f19334a = i10;
        this.f19335b = messagesStorage;
        this.f19336c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19334a) {
            case 0:
                this.f19335b.lambda$loadStoryAlbumsCache$270(this.f19336c, this.d);
                return;
            default:
                this.f19335b.lambda$loadTopics$51(this.f19336c, this.d);
                return;
        }
    }
}
