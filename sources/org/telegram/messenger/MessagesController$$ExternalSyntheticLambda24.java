package org.telegram.messenger;

import java.util.ArrayList;

public final class MessagesController$$ExternalSyntheticLambda24 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final long f$1;
    public final long f$2;
    public final int f$3;
    public final ArrayList f$4;

    public MessagesController$$ExternalSyntheticLambda24(MessagesController messagesController, long j, int i, long j2, ArrayList arrayList, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$3 = i;
        this.f$2 = j2;
        this.f$4 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkUnreadReactionsInternal2$424(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            case 1:
                this.f$0.lambda$checkUnreadPollVotesInternal2$435(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            case 2:
                this.f$0.lambda$checkUnreadReactionsInternal2$426(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            case 3:
                this.f$0.lambda$checkUnreadPollVotesInternal2$433(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            case 4:
                this.f$0.lambda$checkUnreadReactionsInternal2$428(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            case 5:
                this.f$0.lambda$checkUnreadReactionsInternal2$422(this.f$1, this.f$3, this.f$2, this.f$4);
                break;
            default:
                this.f$0.lambda$checkUnreadPollVotesInternal2$429(this.f$1, this.f$3, this.f$2, this.f$4);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda24(MessagesController messagesController, long j, long j2, int i, ArrayList arrayList, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = i;
        this.f$4 = arrayList;
    }
}
