package org.telegram.messenger;

import java.util.function.Consumer;
public final class mg implements Runnable {
    public final int f18986a;
    public final MessagesStorage f18987b;
    public final long f18988c;
    public final Consumer d;

    public mg(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f18986a = i10;
        this.f18987b = messagesStorage;
        this.f18988c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f18986a) {
            case 0:
                this.f18987b.lambda$loadStoryAlbumsCache$270(this.f18988c, this.d);
                return;
            default:
                this.f18987b.lambda$loadTopics$51(this.f18988c, this.d);
                return;
        }
    }
}
