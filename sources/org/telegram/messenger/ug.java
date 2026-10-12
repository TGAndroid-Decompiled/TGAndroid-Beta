package org.telegram.messenger;

import java.util.function.Consumer;
public final class ug implements Runnable {
    public final int f19113a;
    public final MessagesStorage f19114b;
    public final long f19115c;
    public final Consumer d;

    public ug(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f19113a = i10;
        this.f19114b = messagesStorage;
        this.f19115c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19113a) {
            case 0:
                this.f19114b.lambda$loadStoryAlbumsCache$270(this.f19115c, this.d);
                return;
            default:
                this.f19114b.lambda$loadTopics$51(this.f19115c, this.d);
                return;
        }
    }
}
