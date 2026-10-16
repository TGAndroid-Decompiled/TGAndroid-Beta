package org.telegram.messenger;

import java.util.function.Consumer;
public final class ug implements Runnable {
    public final int f18299a;
    public final MessagesStorage f18300b;
    public final long f18301c;
    public final Consumer d;

    public ug(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f18299a = i10;
        this.f18300b = messagesStorage;
        this.f18301c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() {
        switch (this.f18299a) {
            case 0:
                this.f18300b.lambda$loadStoryAlbumsCache$270(this.f18301c, this.d);
                return;
            default:
                this.f18300b.lambda$loadTopics$51(this.f18301c, this.d);
                return;
        }
    }
}
