package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f19086a;
    public final MessagesStorage f19087b;
    public final long f19088c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f19086a = i10;
        this.f19087b = messagesStorage;
        this.f19088c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19086a) {
            case 0:
                this.f19087b.lambda$loadStoryAlbumsCache$270(this.f19088c, this.d);
                return;
            default:
                this.f19087b.lambda$loadTopics$51(this.f19088c, this.d);
                return;
        }
    }
}
