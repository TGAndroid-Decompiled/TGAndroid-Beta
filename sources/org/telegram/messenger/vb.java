package org.telegram.messenger;

import java.util.ArrayList;
public final class vb implements Runnable {
    public final int f19728a = 0;
    public final MessagesController f19729b;
    public final long f19730c;
    public final ArrayList d;
    public final long e;

    public vb(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f19729b = messagesController;
        this.f19730c = j10;
        this.e = j11;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19728a) {
            case 0:
                this.f19729b.lambda$checkUnreadPollVotesInternal2$434(this.f19730c, this.e, 0, this.d);
                return;
            case 1:
                this.f19729b.lambda$processUpdateArray$422(this.f19730c, this.d, this.e);
                return;
            default:
                this.f19729b.lambda$deleteMessagesByPush$369(this.d, this.f19730c, this.e);
                return;
        }
    }

    public vb(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f19729b = messagesController;
        this.f19730c = j10;
        this.d = arrayList;
        this.e = j11;
    }

    public vb(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f19729b = messagesController;
        this.d = arrayList;
        this.f19730c = j10;
        this.e = j11;
    }
}
