package org.telegram.messenger;

import java.util.function.Consumer;
public final class ug implements Runnable {
    public final int f18598a;
    public final MessagesStorage f18599b;
    public final long f18600c;
    public final Consumer d;

    public ug(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f18598a = i10;
        this.f18599b = messagesStorage;
        this.f18600c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f18598a) {
            case 0:
                this.f18599b.lambda$loadStoryAlbumsCache$270(this.f18600c, this.d);
                return;
            default:
                this.f18599b.lambda$loadTopics$51(this.f18600c, this.d);
                return;
        }
    }
}
