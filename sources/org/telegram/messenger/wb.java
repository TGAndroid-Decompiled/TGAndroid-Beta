package org.telegram.messenger;

import java.util.ArrayList;
public final class wb implements Runnable {
    public final int f19689a = 0;
    public final MessagesController f19690b;
    public final long f19691c;
    public final ArrayList d;
    public final long f19692e;

    public wb(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f19690b = messagesController;
        this.f19691c = j3;
        this.f19692e = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19689a) {
            case 0:
                this.f19690b.lambda$checkUnreadPollVotesInternal2$434(this.f19691c, this.f19692e, 0, this.d);
                return;
            case 1:
                this.f19690b.lambda$processUpdateArray$422(this.f19691c, this.d, this.f19692e);
                return;
            default:
                this.f19690b.lambda$deleteMessagesByPush$369(this.d, this.f19691c, this.f19692e);
                return;
        }
    }

    public wb(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f19690b = messagesController;
        this.f19691c = j3;
        this.d = arrayList;
        this.f19692e = j10;
    }

    public wb(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f19690b = messagesController;
        this.d = arrayList;
        this.f19691c = j3;
        this.f19692e = j10;
    }
}
