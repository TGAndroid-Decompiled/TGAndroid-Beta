package org.telegram.messenger;

import java.util.ArrayList;
public final class wb implements Runnable {
    public final int f19725a = 0;
    public final MessagesController f19726b;
    public final long f19727c;
    public final ArrayList d;
    public final long f19728e;

    public wb(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f19726b = messagesController;
        this.f19727c = j3;
        this.f19728e = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19725a) {
            case 0:
                this.f19726b.lambda$checkUnreadPollVotesInternal2$434(this.f19727c, this.f19728e, 0, this.d);
                return;
            case 1:
                this.f19726b.lambda$processUpdateArray$422(this.f19727c, this.d, this.f19728e);
                return;
            default:
                this.f19726b.lambda$deleteMessagesByPush$369(this.d, this.f19727c, this.f19728e);
                return;
        }
    }

    public wb(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f19726b = messagesController;
        this.f19727c = j3;
        this.d = arrayList;
        this.f19728e = j10;
    }

    public wb(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f19726b = messagesController;
        this.d = arrayList;
        this.f19727c = j3;
        this.f19728e = j10;
    }
}
