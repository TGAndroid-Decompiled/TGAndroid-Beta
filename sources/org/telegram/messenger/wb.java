package org.telegram.messenger;

import java.util.ArrayList;
public final class wb implements Runnable {
    public final int f19696a = 0;
    public final MessagesController f19697b;
    public final long f19698c;
    public final ArrayList d;
    public final long f19699e;

    public wb(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f19697b = messagesController;
        this.f19698c = j3;
        this.f19699e = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19696a) {
            case 0:
                this.f19697b.lambda$checkUnreadPollVotesInternal2$434(this.f19698c, this.f19699e, 0, this.d);
                return;
            case 1:
                this.f19697b.lambda$processUpdateArray$422(this.f19698c, this.d, this.f19699e);
                return;
            default:
                this.f19697b.lambda$deleteMessagesByPush$369(this.d, this.f19698c, this.f19699e);
                return;
        }
    }

    public wb(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f19697b = messagesController;
        this.f19698c = j3;
        this.d = arrayList;
        this.f19699e = j10;
    }

    public wb(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f19697b = messagesController;
        this.d = arrayList;
        this.f19698c = j3;
        this.f19699e = j10;
    }
}
