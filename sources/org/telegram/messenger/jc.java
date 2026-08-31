package org.telegram.messenger;

import java.util.ArrayList;
public final class jc implements Runnable {
    public final int f19060a = 1;
    public final MessagesController f19061b;
    public final long f19062c;
    public final long d;
    public final ArrayList f19063e;

    public jc(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f19061b = messagesController;
        this.f19062c = j10;
        this.d = j11;
        this.f19063e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19060a) {
            case 0:
                this.f19061b.lambda$processUpdateArray$419(this.f19062c, this.f19063e, this.d);
                return;
            case 1:
                this.f19061b.lambda$checkUnreadPollVotesInternal2$431(this.f19062c, this.d, 0, this.f19063e);
                return;
            default:
                this.f19061b.lambda$deleteMessagesByPush$370(this.f19063e, this.f19062c, this.d);
                return;
        }
    }

    public jc(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f19061b = messagesController;
        this.f19062c = j10;
        this.f19063e = arrayList;
        this.d = j11;
    }

    public jc(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f19061b = messagesController;
        this.f19063e = arrayList;
        this.f19062c = j10;
        this.d = j11;
    }
}
