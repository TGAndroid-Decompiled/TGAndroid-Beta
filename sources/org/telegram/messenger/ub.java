package org.telegram.messenger;

import java.util.ArrayList;
public final class ub implements Runnable {
    public final int f19653a = 0;
    public final MessagesController f19654b;
    public final long f19655c;
    public final ArrayList d;
    public final long e;

    public ub(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f19654b = messagesController;
        this.f19655c = j10;
        this.e = j11;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19653a) {
            case 0:
                this.f19654b.lambda$checkUnreadPollVotesInternal2$434(this.f19655c, this.e, 0, this.d);
                return;
            case 1:
                this.f19654b.lambda$processUpdateArray$422(this.f19655c, this.d, this.e);
                return;
            default:
                this.f19654b.lambda$deleteMessagesByPush$369(this.d, this.f19655c, this.e);
                return;
        }
    }

    public ub(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f19654b = messagesController;
        this.f19655c = j10;
        this.d = arrayList;
        this.e = j11;
    }

    public ub(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f19654b = messagesController;
        this.d = arrayList;
        this.f19655c = j10;
        this.e = j11;
    }
}
