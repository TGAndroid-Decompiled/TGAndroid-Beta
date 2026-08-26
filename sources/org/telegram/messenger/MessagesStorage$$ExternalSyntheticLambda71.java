package org.telegram.messenger;

import java.util.function.Consumer;

public final class MessagesStorage$$ExternalSyntheticLambda71 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final long f$1;
    public final Consumer f$2;

    public MessagesStorage$$ExternalSyntheticLambda71(MessagesStorage messagesStorage, long j, Consumer consumer, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = j;
        this.f$2 = consumer;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadStoryAlbumsCache$270(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$loadTopics$51(this.f$1, this.f$2);
                break;
        }
    }
}
