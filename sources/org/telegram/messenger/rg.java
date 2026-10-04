package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f19087a;
    public final MessagesStorage f19088b;
    public final long f19089c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.f19087a = i10;
        this.f19088b = messagesStorage;
        this.f19089c = j3;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19087a) {
            case 0:
                this.f19088b.lambda$loadStoryAlbumsCache$270(this.f19089c, this.d);
                return;
            default:
                this.f19088b.lambda$loadTopics$51(this.f19089c, this.d);
                return;
        }
    }
}
