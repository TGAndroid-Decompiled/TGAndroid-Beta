package org.telegram.messenger;

import java.util.function.Consumer;
public final class ug implements Runnable {
    public final int f18583a;
    public final MessagesStorage f18584b;
    public final long f18585c;
    public final Consumer d;

    public ug(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f18583a = i10;
        this.f18584b = messagesStorage;
        this.f18585c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f18583a) {
            case 0:
                this.f18584b.lambda$loadStoryAlbumsCache$270(this.f18585c, this.d);
                return;
            default:
                this.f18584b.lambda$loadTopics$51(this.f18585c, this.d);
                return;
        }
    }
}
