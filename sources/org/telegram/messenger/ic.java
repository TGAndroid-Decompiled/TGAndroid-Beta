package org.telegram.messenger;

import java.util.ArrayList;
public final class ic implements Runnable {
    public final int f20554a = 1;
    public final MessagesController f20555b;
    public final long f20556c;
    public final long d;
    public final ArrayList f20557e;

    public ic(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f20555b = messagesController;
        this.f20556c = j10;
        this.d = j11;
        this.f20557e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20554a) {
            case 0:
                this.f20555b.lambda$processUpdateArray$419(this.f20556c, this.f20557e, this.d);
                return;
            case 1:
                this.f20555b.lambda$checkUnreadPollVotesInternal2$431(this.f20556c, this.d, 0, this.f20557e);
                return;
            default:
                this.f20555b.lambda$deleteMessagesByPush$370(this.f20557e, this.f20556c, this.d);
                return;
        }
    }

    public ic(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f20555b = messagesController;
        this.f20556c = j10;
        this.f20557e = arrayList;
        this.d = j11;
    }

    public ic(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f20555b = messagesController;
        this.f20557e = arrayList;
        this.f20556c = j10;
        this.d = j11;
    }
}
