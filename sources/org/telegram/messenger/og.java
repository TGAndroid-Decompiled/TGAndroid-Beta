package org.telegram.messenger;

import java.util.function.Consumer;
public final class og implements Runnable {
    public final int f19162a;
    public final MessagesStorage f19163b;
    public final long f19164c;
    public final Consumer d;

    public og(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f19162a = i10;
        this.f19163b = messagesStorage;
        this.f19164c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19162a) {
            case 0:
                this.f19163b.lambda$loadStoryAlbumsCache$270(this.f19164c, this.d);
                return;
            default:
                this.f19163b.lambda$loadTopics$51(this.f19164c, this.d);
                return;
        }
    }
}
