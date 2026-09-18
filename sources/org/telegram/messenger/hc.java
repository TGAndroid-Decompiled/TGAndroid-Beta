package org.telegram.messenger;

import java.util.ArrayList;
public final class hc implements Runnable {
    public final int f16503a = 1;
    public final MessagesController f16504b;
    public final long f16505c;
    public final long d;
    public final ArrayList e;

    public hc(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f16504b = messagesController;
        this.f16505c = j3;
        this.d = j10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16503a) {
            case 0:
                this.f16504b.lambda$processUpdateArray$419(this.f16505c, this.e, this.d);
                return;
            case 1:
                this.f16504b.lambda$checkUnreadPollVotesInternal2$431(this.f16505c, this.d, 0, this.e);
                return;
            default:
                this.f16504b.lambda$deleteMessagesByPush$370(this.e, this.f16505c, this.d);
                return;
        }
    }

    public hc(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f16504b = messagesController;
        this.f16505c = j3;
        this.e = arrayList;
        this.d = j10;
    }

    public hc(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f16504b = messagesController;
        this.e = arrayList;
        this.f16505c = j3;
        this.d = j10;
    }
}
