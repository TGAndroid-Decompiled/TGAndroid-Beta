package org.telegram.messenger;

import java.util.ArrayList;
public final class wb implements Runnable {
    public final int f19692a = 0;
    public final MessagesController f19693b;
    public final long f19694c;
    public final ArrayList d;
    public final long f19695e;

    public wb(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f19693b = messagesController;
        this.f19694c = j3;
        this.f19695e = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19692a) {
            case 0:
                this.f19693b.lambda$checkUnreadPollVotesInternal2$434(this.f19694c, this.f19695e, 0, this.d);
                return;
            case 1:
                this.f19693b.lambda$processUpdateArray$422(this.f19694c, this.d, this.f19695e);
                return;
            default:
                this.f19693b.lambda$deleteMessagesByPush$369(this.d, this.f19694c, this.f19695e);
                return;
        }
    }

    public wb(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f19693b = messagesController;
        this.f19694c = j3;
        this.d = arrayList;
        this.f19695e = j10;
    }

    public wb(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f19693b = messagesController;
        this.d = arrayList;
        this.f19694c = j3;
        this.f19695e = j10;
    }
}
