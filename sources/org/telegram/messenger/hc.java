package org.telegram.messenger;

import java.util.ArrayList;
public final class hc implements Runnable {
    public final int f16555a = 1;
    public final MessagesController f16556b;
    public final long f16557c;
    public final long d;
    public final ArrayList e;

    public hc(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f16556b = messagesController;
        this.f16557c = j3;
        this.d = j10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16555a) {
            case 0:
                this.f16556b.lambda$processUpdateArray$419(this.f16557c, this.e, this.d);
                return;
            case 1:
                this.f16556b.lambda$checkUnreadPollVotesInternal2$431(this.f16557c, this.d, 0, this.e);
                return;
            default:
                this.f16556b.lambda$deleteMessagesByPush$370(this.e, this.f16557c, this.d);
                return;
        }
    }

    public hc(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f16556b = messagesController;
        this.f16557c = j3;
        this.e = arrayList;
        this.d = j10;
    }

    public hc(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f16556b = messagesController;
        this.e = arrayList;
        this.f16557c = j3;
        this.d = j10;
    }
}
