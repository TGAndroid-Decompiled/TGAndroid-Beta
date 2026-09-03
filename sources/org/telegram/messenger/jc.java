package org.telegram.messenger;

import java.util.ArrayList;
public final class jc implements Runnable {
    public final int f19062a = 1;
    public final MessagesController f19063b;
    public final long f19064c;
    public final long d;
    public final ArrayList f19065e;

    public jc(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f19063b = messagesController;
        this.f19064c = j10;
        this.d = j11;
        this.f19065e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19062a) {
            case 0:
                this.f19063b.lambda$processUpdateArray$419(this.f19064c, this.f19065e, this.d);
                return;
            case 1:
                this.f19063b.lambda$checkUnreadPollVotesInternal2$431(this.f19064c, this.d, 0, this.f19065e);
                return;
            default:
                this.f19063b.lambda$deleteMessagesByPush$370(this.f19065e, this.f19064c, this.d);
                return;
        }
    }

    public jc(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f19063b = messagesController;
        this.f19064c = j10;
        this.f19065e = arrayList;
        this.d = j11;
    }

    public jc(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f19063b = messagesController;
        this.f19065e = arrayList;
        this.f19064c = j10;
        this.d = j11;
    }
}
