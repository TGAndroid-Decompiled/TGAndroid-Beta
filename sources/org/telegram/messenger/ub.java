package org.telegram.messenger;

import java.util.ArrayList;
public final class ub implements Runnable {
    public final int f19649a = 0;
    public final MessagesController f19650b;
    public final long f19651c;
    public final ArrayList d;
    public final long e;

    public ub(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f19650b = messagesController;
        this.f19651c = j10;
        this.e = j11;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19649a) {
            case 0:
                this.f19650b.lambda$checkUnreadPollVotesInternal2$434(this.f19651c, this.e, 0, this.d);
                return;
            case 1:
                this.f19650b.lambda$processUpdateArray$422(this.f19651c, this.d, this.e);
                return;
            default:
                this.f19650b.lambda$deleteMessagesByPush$369(this.d, this.f19651c, this.e);
                return;
        }
    }

    public ub(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f19650b = messagesController;
        this.f19651c = j10;
        this.d = arrayList;
        this.e = j11;
    }

    public ub(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f19650b = messagesController;
        this.d = arrayList;
        this.f19651c = j10;
        this.e = j11;
    }
}
