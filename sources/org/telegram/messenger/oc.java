package org.telegram.messenger;

import java.util.ArrayList;
public final class oc implements Runnable {
    public final int f15964a = 1;
    public final MessagesController f15965b;
    public final long f15966c;
    public final long d;
    public final ArrayList e;

    public oc(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f15965b = messagesController;
        this.f15966c = j3;
        this.d = j10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15964a) {
            case 0:
                this.f15965b.lambda$processUpdateArray$419(this.f15966c, this.e, this.d);
                return;
            case 1:
                this.f15965b.lambda$checkUnreadPollVotesInternal2$431(this.f15966c, this.d, 0, this.e);
                return;
            default:
                this.f15965b.lambda$deleteMessagesByPush$370(this.e, this.f15966c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f15965b = messagesController;
        this.f15966c = j3;
        this.e = arrayList;
        this.d = j10;
    }

    public oc(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f15965b = messagesController;
        this.e = arrayList;
        this.f15966c = j3;
        this.d = j10;
    }
}
