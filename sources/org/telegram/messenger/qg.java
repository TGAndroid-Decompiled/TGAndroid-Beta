package org.telegram.messenger;

import java.util.function.Consumer;
public final class qg implements Runnable {
    public final int f19404a;
    public final MessagesStorage f19405b;
    public final long f19406c;
    public final Consumer d;

    public qg(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f19404a = i10;
        this.f19405b = messagesStorage;
        this.f19406c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19404a) {
            case 0:
                this.f19405b.lambda$loadStoryAlbumsCache$270(this.f19406c, this.d);
                return;
            default:
                this.f19405b.lambda$loadTopics$51(this.f19406c, this.d);
                return;
        }
    }
}
