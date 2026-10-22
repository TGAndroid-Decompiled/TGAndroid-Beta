package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f19406a;
    public final MessagesStorage f19407b;
    public final long f19408c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f19406a = i10;
        this.f19407b = messagesStorage;
        this.f19408c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19406a) {
            case 0:
                this.f19407b.lambda$loadStoryAlbumsCache$270(this.f19408c, this.d);
                return;
            default:
                this.f19407b.lambda$loadTopics$51(this.f19408c, this.d);
                return;
        }
    }
}
