package org.telegram.messenger;

import java.util.function.Consumer;
public final class og implements Runnable {
    public final int f19165a;
    public final MessagesStorage f19166b;
    public final long f19167c;
    public final Consumer d;

    public og(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f19165a = i10;
        this.f19166b = messagesStorage;
        this.f19167c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19165a) {
            case 0:
                this.f19166b.lambda$loadStoryAlbumsCache$270(this.f19167c, this.d);
                return;
            default:
                this.f19166b.lambda$loadTopics$51(this.f19167c, this.d);
                return;
        }
    }
}
