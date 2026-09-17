package org.telegram.messenger;

import java.util.ArrayList;
public final class gc implements Runnable {
    public final int f17791a = 1;
    public final MessagesController f17792b;
    public final long f17793c;
    public final long d;
    public final ArrayList f17794e;

    public gc(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f17792b = messagesController;
        this.f17793c = j3;
        this.d = j10;
        this.f17794e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17791a) {
            case 0:
                this.f17792b.lambda$processUpdateArray$419(this.f17793c, this.f17794e, this.d);
                return;
            case 1:
                this.f17792b.lambda$checkUnreadPollVotesInternal2$431(this.f17793c, this.d, 0, this.f17794e);
                return;
            default:
                this.f17792b.lambda$deleteMessagesByPush$370(this.f17794e, this.f17793c, this.d);
                return;
        }
    }

    public gc(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f17792b = messagesController;
        this.f17793c = j3;
        this.f17794e = arrayList;
        this.d = j10;
    }

    public gc(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f17792b = messagesController;
        this.f17794e = arrayList;
        this.f17793c = j3;
        this.d = j10;
    }
}
