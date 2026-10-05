package org.telegram.messenger;

import java.util.ArrayList;
public final class hc implements Runnable {
    public final int f18051a = 1;
    public final MessagesController f18052b;
    public final long f18053c;
    public final long d;
    public final ArrayList f18054e;

    public hc(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f18052b = messagesController;
        this.f18053c = j3;
        this.d = j10;
        this.f18054e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18051a) {
            case 0:
                this.f18052b.lambda$processUpdateArray$419(this.f18053c, this.f18054e, this.d);
                return;
            case 1:
                this.f18052b.lambda$checkUnreadPollVotesInternal2$431(this.f18053c, this.d, 0, this.f18054e);
                return;
            default:
                this.f18052b.lambda$deleteMessagesByPush$370(this.f18054e, this.f18053c, this.d);
                return;
        }
    }

    public hc(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f18052b = messagesController;
        this.f18053c = j3;
        this.f18054e = arrayList;
        this.d = j10;
    }

    public hc(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f18052b = messagesController;
        this.f18054e = arrayList;
        this.f18053c = j3;
        this.d = j10;
    }
}
