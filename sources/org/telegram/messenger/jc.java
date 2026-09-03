package org.telegram.messenger;

import java.util.ArrayList;
public final class jc implements Runnable {
    public final int f17555a = 1;
    public final MessagesController f17556b;
    public final long f17557c;
    public final long d;
    public final ArrayList e;

    public jc(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f17556b = messagesController;
        this.f17557c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17555a) {
            case 0:
                this.f17556b.lambda$processUpdateArray$419(this.f17557c, this.e, this.d);
                return;
            case 1:
                this.f17556b.lambda$checkUnreadPollVotesInternal2$431(this.f17557c, this.d, 0, this.e);
                return;
            default:
                this.f17556b.lambda$deleteMessagesByPush$370(this.e, this.f17557c, this.d);
                return;
        }
    }

    public jc(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f17556b = messagesController;
        this.f17557c = j10;
        this.e = arrayList;
        this.d = j11;
    }

    public jc(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f17556b = messagesController;
        this.e = arrayList;
        this.f17557c = j10;
        this.d = j11;
    }
}
