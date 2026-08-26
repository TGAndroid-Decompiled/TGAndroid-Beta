package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import org.telegram.messenger.utils.EphemeralMessagesHelper;

public final class MessagesController$$ExternalSyntheticLambda159 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final EphemeralMessagesHelper.EphemeralUpdates.StructBuilder f$1;
    public final ConcurrentHashMap f$2;
    public final ConcurrentHashMap f$3;

    public MessagesController$$ExternalSyntheticLambda159(MessagesController messagesController, EphemeralMessagesHelper.EphemeralUpdates.StructBuilder structBuilder, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = structBuilder;
        this.f$2 = concurrentHashMap;
        this.f$3 = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processUpdateArray$400(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                this.f$0.lambda$processUpdateArray$401(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$processUpdateArray$405(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
