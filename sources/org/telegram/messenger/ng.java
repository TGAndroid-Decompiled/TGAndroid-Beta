package org.telegram.messenger;

import java.util.function.Consumer;

public final class ng implements Runnable {

    public final int f21089a;

    public final MessagesStorage f21090b;

    public final long f21091c;
    public final Consumer d;

    public ng(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.f21089a = i10;
        this.f21090b = messagesStorage;
        this.f21091c = j10;
        this.d = consumer;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21089a) {
            case 0:
                this.f21090b.lambda$loadStoryAlbumsCache$270(this.f21091c, this.d);
                break;
            default:
                this.f21090b.lambda$loadTopics$51(this.f21091c, this.d);
                break;
        }
    }
}
