package org.telegram.messenger;

import java.util.ArrayList;
public final class hc implements Runnable {
    public final int f18052a = 1;
    public final MessagesController f18053b;
    public final long f18054c;
    public final long d;
    public final ArrayList f18055e;

    public hc(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f18053b = messagesController;
        this.f18054c = j3;
        this.d = j10;
        this.f18055e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18052a) {
            case 0:
                this.f18053b.lambda$processUpdateArray$419(this.f18054c, this.f18055e, this.d);
                return;
            case 1:
                this.f18053b.lambda$checkUnreadPollVotesInternal2$431(this.f18054c, this.d, 0, this.f18055e);
                return;
            default:
                this.f18053b.lambda$deleteMessagesByPush$370(this.f18055e, this.f18054c, this.d);
                return;
        }
    }

    public hc(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f18053b = messagesController;
        this.f18054c = j3;
        this.f18055e = arrayList;
        this.d = j10;
    }

    public hc(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f18053b = messagesController;
        this.f18055e = arrayList;
        this.f18054c = j3;
        this.d = j10;
    }
}
