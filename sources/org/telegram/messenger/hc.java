package org.telegram.messenger;

import java.util.ArrayList;
public final class hc implements Runnable {
    public final int f16564a = 1;
    public final MessagesController f16565b;
    public final long f16566c;
    public final long d;
    public final ArrayList e;

    public hc(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f16565b = messagesController;
        this.f16566c = j3;
        this.d = j10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16564a) {
            case 0:
                this.f16565b.lambda$processUpdateArray$419(this.f16566c, this.e, this.d);
                return;
            case 1:
                this.f16565b.lambda$checkUnreadPollVotesInternal2$431(this.f16566c, this.d, 0, this.e);
                return;
            default:
                this.f16565b.lambda$deleteMessagesByPush$370(this.e, this.f16566c, this.d);
                return;
        }
    }

    public hc(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f16565b = messagesController;
        this.f16566c = j3;
        this.e = arrayList;
        this.d = j10;
    }

    public hc(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f16565b = messagesController;
        this.e = arrayList;
        this.f16566c = j3;
        this.d = j10;
    }
}
