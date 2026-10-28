package org.telegram.messenger;

import java.util.ArrayList;
public final class pc implements Runnable {
    public final int f20949a = 1;
    public final MessagesController f20950b;
    public final long f20951c;
    public final long d;
    public final ArrayList e;

    public pc(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f20950b = messagesController;
        this.f20951c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20949a) {
            case 0:
                this.f20950b.lambda$processUpdateArray$425(this.f20951c, this.e, this.d);
                return;
            case 1:
                this.f20950b.lambda$checkUnreadPollVotesInternal2$437(this.f20951c, this.d, 0, this.e);
                return;
            default:
                this.f20950b.lambda$deleteMessagesByPush$371(this.e, this.f20951c, this.d);
                return;
        }
    }

    public pc(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f20950b = messagesController;
        this.f20951c = j10;
        this.e = arrayList;
        this.d = j11;
    }

    public pc(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f20950b = messagesController;
        this.e = arrayList;
        this.f20951c = j10;
        this.d = j11;
    }
}
