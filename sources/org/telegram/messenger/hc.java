package org.telegram.messenger;

import java.util.ArrayList;
public final class hc implements Runnable {
    public final int f18053a = 1;
    public final MessagesController f18054b;
    public final long f18055c;
    public final long d;
    public final ArrayList f18056e;

    public hc(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f18054b = messagesController;
        this.f18055c = j3;
        this.d = j10;
        this.f18056e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18053a) {
            case 0:
                this.f18054b.lambda$processUpdateArray$419(this.f18055c, this.f18056e, this.d);
                return;
            case 1:
                this.f18054b.lambda$checkUnreadPollVotesInternal2$431(this.f18055c, this.d, 0, this.f18056e);
                return;
            default:
                this.f18054b.lambda$deleteMessagesByPush$370(this.f18056e, this.f18055c, this.d);
                return;
        }
    }

    public hc(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f18054b = messagesController;
        this.f18055c = j3;
        this.f18056e = arrayList;
        this.d = j10;
    }

    public hc(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f18054b = messagesController;
        this.f18056e = arrayList;
        this.f18055c = j3;
        this.d = j10;
    }
}
