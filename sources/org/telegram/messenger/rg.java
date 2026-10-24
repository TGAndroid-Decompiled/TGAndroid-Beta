package org.telegram.messenger;

import java.util.function.Consumer;
public final class rg implements Runnable {
    public final int f19476a;
    public final MessagesStorage f19477b;
    public final long f19478c;
    public final Consumer d;

    public rg(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f19476a = i10;
        this.f19477b = messagesStorage;
        this.f19478c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f19476a) {
            case 0:
                this.f19477b.lambda$loadStoryAlbumsCache$270(this.f19478c, this.d);
                return;
            default:
                this.f19477b.lambda$loadTopics$51(this.f19478c, this.d);
                return;
        }
    }
}
