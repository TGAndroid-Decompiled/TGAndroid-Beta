package org.telegram.messenger;

import java.util.function.Consumer;
public final class ug implements Runnable {
    public final int f19114a;
    public final MessagesStorage f19115b;
    public final long f19116c;
    public final Consumer d;

    public ug(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f19114a = i10;
        this.f19115b = messagesStorage;
        this.f19116c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19114a) {
            case 0:
                this.f19115b.lambda$loadStoryAlbumsCache$270(this.f19116c, this.d);
                return;
            default:
                this.f19115b.lambda$loadTopics$51(this.f19116c, this.d);
                return;
        }
    }
}
