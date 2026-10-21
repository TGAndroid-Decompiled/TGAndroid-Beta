package org.telegram.messenger;

import java.util.ArrayList;
public final class wb implements Runnable {
    public final int f19973a = 0;
    public final MessagesController f19974b;
    public final long f19975c;
    public final ArrayList d;
    public final long e;

    public wb(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f19974b = messagesController;
        this.f19975c = j10;
        this.e = j11;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19973a) {
            case 0:
                this.f19974b.lambda$checkUnreadPollVotesInternal2$434(this.f19975c, this.e, 0, this.d);
                return;
            case 1:
                this.f19974b.lambda$processUpdateArray$422(this.f19975c, this.d, this.e);
                return;
            default:
                this.f19974b.lambda$deleteMessagesByPush$369(this.d, this.f19975c, this.e);
                return;
        }
    }

    public wb(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f19974b = messagesController;
        this.f19975c = j10;
        this.d = arrayList;
        this.e = j11;
    }

    public wb(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f19974b = messagesController;
        this.d = arrayList;
        this.f19975c = j10;
        this.e = j11;
    }
}
