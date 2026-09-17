package org.telegram.messenger;

import java.util.ArrayList;
public final class gc implements Runnable {
    public final int f17818a = 1;
    public final MessagesController f17819b;
    public final long f17820c;
    public final long d;
    public final ArrayList f17821e;

    public gc(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f17819b = messagesController;
        this.f17820c = j3;
        this.d = j10;
        this.f17821e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17818a) {
            case 0:
                this.f17819b.lambda$processUpdateArray$419(this.f17820c, this.f17821e, this.d);
                return;
            case 1:
                this.f17819b.lambda$checkUnreadPollVotesInternal2$431(this.f17820c, this.d, 0, this.f17821e);
                return;
            default:
                this.f17819b.lambda$deleteMessagesByPush$370(this.f17821e, this.f17820c, this.d);
                return;
        }
    }

    public gc(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f17819b = messagesController;
        this.f17820c = j3;
        this.f17821e = arrayList;
        this.d = j10;
    }

    public gc(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f17819b = messagesController;
        this.f17821e = arrayList;
        this.f17820c = j3;
        this.d = j10;
    }
}
