package org.telegram.messenger;

import java.util.function.Consumer;
public final class sg implements Runnable {
    public final int f21230a;
    public final MessagesStorage f21231b;
    public final long f21232c;
    public final Consumer d;

    public sg(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f21230a = i10;
        this.f21231b = messagesStorage;
        this.f21232c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f21230a) {
            case 0:
                this.f21231b.lambda$loadStoryAlbumsCache$274(this.f21232c, this.d);
                return;
            default:
                this.f21231b.lambda$loadTopics$54(this.f21232c, this.d);
                return;
        }
    }
}
