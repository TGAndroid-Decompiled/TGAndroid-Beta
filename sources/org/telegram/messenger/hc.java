package org.telegram.messenger;

import java.util.ArrayList;
public final class hc implements Runnable {
    public final int f17875a = 1;
    public final MessagesController f17876b;
    public final long f17877c;
    public final long d;
    public final ArrayList f17878e;

    public hc(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f17876b = messagesController;
        this.f17877c = j3;
        this.d = j10;
        this.f17878e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17875a) {
            case 0:
                this.f17876b.lambda$processUpdateArray$419(this.f17877c, this.f17878e, this.d);
                return;
            case 1:
                this.f17876b.lambda$checkUnreadPollVotesInternal2$431(this.f17877c, this.d, 0, this.f17878e);
                return;
            default:
                this.f17876b.lambda$deleteMessagesByPush$370(this.f17878e, this.f17877c, this.d);
                return;
        }
    }

    public hc(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f17876b = messagesController;
        this.f17877c = j3;
        this.f17878e = arrayList;
        this.d = j10;
    }

    public hc(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f17876b = messagesController;
        this.f17878e = arrayList;
        this.f17877c = j3;
        this.d = j10;
    }
}
