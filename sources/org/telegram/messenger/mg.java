package org.telegram.messenger;

import java.util.function.Consumer;
public final class mg implements Runnable {
    public final int f18989a;
    public final MessagesStorage f18990b;
    public final long f18991c;
    public final Consumer d;

    public mg(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f18989a = i10;
        this.f18990b = messagesStorage;
        this.f18991c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f18989a) {
            case 0:
                this.f18990b.lambda$loadStoryAlbumsCache$270(this.f18991c, this.d);
                return;
            default:
                this.f18990b.lambda$loadTopics$51(this.f18991c, this.d);
                return;
        }
    }
}
