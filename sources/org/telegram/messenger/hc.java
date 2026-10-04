package org.telegram.messenger;

import java.util.ArrayList;
public final class hc implements Runnable {
    public final int f18046a = 1;
    public final MessagesController f18047b;
    public final long f18048c;
    public final long d;
    public final ArrayList f18049e;

    public hc(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f18047b = messagesController;
        this.f18048c = j3;
        this.d = j10;
        this.f18049e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18046a) {
            case 0:
                this.f18047b.lambda$processUpdateArray$419(this.f18048c, this.f18049e, this.d);
                return;
            case 1:
                this.f18047b.lambda$checkUnreadPollVotesInternal2$431(this.f18048c, this.d, 0, this.f18049e);
                return;
            default:
                this.f18047b.lambda$deleteMessagesByPush$370(this.f18049e, this.f18048c, this.d);
                return;
        }
    }

    public hc(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f18047b = messagesController;
        this.f18048c = j3;
        this.f18049e = arrayList;
        this.d = j10;
    }

    public hc(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f18047b = messagesController;
        this.f18049e = arrayList;
        this.f18048c = j3;
        this.d = j10;
    }
}
