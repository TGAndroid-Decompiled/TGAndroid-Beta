package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f19061a;
    public final MessagesStorage f19062b;
    public final long f19063c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f19061a = i10;
        this.f19062b = messagesStorage;
        this.f19063c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19061a) {
            case 0:
                this.f19062b.lambda$loadStoryAlbumsCache$270(this.f19063c, this.d);
                return;
            default:
                this.f19062b.lambda$loadTopics$51(this.f19063c, this.d);
                return;
        }
    }
}
