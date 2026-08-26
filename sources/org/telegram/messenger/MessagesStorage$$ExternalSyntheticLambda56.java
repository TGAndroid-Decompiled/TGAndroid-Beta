package org.telegram.messenger;

import java.util.ArrayList;

public final class MessagesStorage$$ExternalSyntheticLambda56 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final ArrayList f$1;
    public final Runnable f$2;

    public MessagesStorage$$ExternalSyntheticLambda56(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = arrayList;
        this.f$2 = runnable;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processEphemeralMessages$201(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$loadMessageAttachPaths$235(this.f$1, this.f$2);
                break;
            case 2:
                this.f$0.lambda$processAnchoredEphemeralMessages$203(this.f$1, this.f$2);
                break;
            case 3:
                this.f$0.lambda$checkLoadedRemoteFilters$69(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$processEphemeralEditedMessages$202(this.f$1, this.f$2);
                break;
        }
    }
}
