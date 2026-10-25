package org.telegram.messenger;

import java.util.ArrayList;
public final class jb implements Runnable {
    public final int f20412a = 0;
    public final MessagesController f20413b;
    public final long f20414c;
    public final ArrayList d;
    public final long e;

    public jb(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f20413b = messagesController;
        this.f20414c = j10;
        this.e = j11;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20412a) {
            case 0:
                this.f20413b.lambda$checkUnreadPollVotesInternal2$436(this.f20414c, this.e, 0, this.d);
                return;
            case 1:
                this.f20413b.lambda$processUpdateArray$424(this.f20414c, this.d, this.e);
                return;
            default:
                this.f20413b.lambda$deleteMessagesByPush$371(this.d, this.f20414c, this.e);
                return;
        }
    }

    public jb(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f20413b = messagesController;
        this.f20414c = j10;
        this.d = arrayList;
        this.e = j11;
    }

    public jb(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f20413b = messagesController;
        this.d = arrayList;
        this.f20414c = j10;
        this.e = j11;
    }
}
