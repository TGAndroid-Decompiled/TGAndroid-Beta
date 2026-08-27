package org.telegram.messenger;

import java.util.ArrayList;

public final class gc implements Runnable {

    public final int f20376a = 1;

    public final MessagesController f20377b;

    public final long f20378c;
    public final long d;

    public final ArrayList f20379e;

    public gc(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f20377b = messagesController;
        this.f20378c = j10;
        this.d = j11;
        this.f20379e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20376a) {
            case 0:
                this.f20377b.lambda$processUpdateArray$419(this.f20378c, this.f20379e, this.d);
                break;
            case 1:
                this.f20377b.lambda$checkUnreadPollVotesInternal2$431(this.f20378c, this.d, 0, this.f20379e);
                break;
            default:
                this.f20377b.lambda$deleteMessagesByPush$370(this.f20379e, this.f20378c, this.d);
                break;
        }
    }

    public gc(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f20377b = messagesController;
        this.f20378c = j10;
        this.f20379e = arrayList;
        this.d = j11;
    }

    public gc(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f20377b = messagesController;
        this.f20379e = arrayList;
        this.f20378c = j10;
        this.d = j11;
    }
}
