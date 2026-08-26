package org.telegram.messenger;

import java.util.ArrayList;

public final class MessagesController$$ExternalSyntheticLambda33 implements Runnable {
    public final int $r8$classId = 0;
    public final MessagesController f$0;
    public final long f$1;
    public final long f$2;
    public final ArrayList f$4;

    public MessagesController$$ExternalSyntheticLambda33(MessagesController messagesController, long j, long j2, ArrayList arrayList) {
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$4 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkUnreadPollVotesInternal2$431(this.f$1, this.f$2, 0, this.f$4);
                break;
            case 1:
                this.f$0.lambda$processUpdateArray$419(this.f$1, this.f$4, this.f$2);
                break;
            default:
                this.f$0.lambda$deleteMessagesByPush$370(this.f$4, this.f$1, this.f$2);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda33(MessagesController messagesController, long j, ArrayList arrayList, long j2) {
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$4 = arrayList;
        this.f$2 = j2;
    }

    public MessagesController$$ExternalSyntheticLambda33(MessagesController messagesController, ArrayList arrayList, long j, long j2) {
        this.f$0 = messagesController;
        this.f$4 = arrayList;
        this.f$1 = j;
        this.f$2 = j2;
    }
}
