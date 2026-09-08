package org.telegram.messenger;

import java.util.ArrayList;
public final class hc implements Runnable {
    public final int f17902a = 1;
    public final MessagesController f17903b;
    public final long f17904c;
    public final long d;
    public final ArrayList f17905e;

    public hc(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f17903b = messagesController;
        this.f17904c = j3;
        this.d = j10;
        this.f17905e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17902a) {
            case 0:
                this.f17903b.lambda$processUpdateArray$419(this.f17904c, this.f17905e, this.d);
                return;
            case 1:
                this.f17903b.lambda$checkUnreadPollVotesInternal2$431(this.f17904c, this.d, 0, this.f17905e);
                return;
            default:
                this.f17903b.lambda$deleteMessagesByPush$370(this.f17905e, this.f17904c, this.d);
                return;
        }
    }

    public hc(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f17903b = messagesController;
        this.f17904c = j3;
        this.f17905e = arrayList;
        this.d = j10;
    }

    public hc(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f17903b = messagesController;
        this.f17905e = arrayList;
        this.f17904c = j3;
        this.d = j10;
    }
}
