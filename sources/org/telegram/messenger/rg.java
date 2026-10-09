package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f19057a;
    public final MessagesStorage f19058b;
    public final long f19059c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f19057a = i10;
        this.f19058b = messagesStorage;
        this.f19059c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19057a) {
            case 0:
                this.f19058b.lambda$loadStoryAlbumsCache$270(this.f19059c, this.d);
                return;
            default:
                this.f19058b.lambda$loadTopics$51(this.f19059c, this.d);
                return;
        }
    }
}
