package org.telegram.messenger;

import java.util.ArrayList;
public final class la implements Runnable {
    public final int f18425a;
    public final MessagesController f18426b;
    public final long f18427c;
    public final long d;
    public final int f18428e;
    public final ArrayList f18429f;

    public la(MessagesController messagesController, long j3, int i10, long j10, ArrayList arrayList, int i11) {
        this.f18425a = i11;
        this.f18426b = messagesController;
        this.f18427c = j3;
        this.f18428e = i10;
        this.d = j10;
        this.f18429f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18425a) {
            case 0:
                long j3 = this.d;
                ArrayList arrayList = this.f18429f;
                int i10 = this.f18428e;
                this.f18426b.lambda$checkUnreadReactionsInternal2$425(this.f18427c, i10, j3, arrayList);
                return;
            case 1:
                int i11 = this.f18428e;
                ArrayList arrayList2 = this.f18429f;
                this.f18426b.lambda$checkUnreadPollVotesInternal2$436(this.f18427c, this.d, i11, arrayList2);
                return;
            case 2:
                int i12 = this.f18428e;
                ArrayList arrayList3 = this.f18429f;
                this.f18426b.lambda$checkUnreadReactionsInternal2$427(this.f18427c, this.d, i12, arrayList3);
                return;
            case 3:
                int i13 = this.f18428e;
                ArrayList arrayList4 = this.f18429f;
                this.f18426b.lambda$checkUnreadPollVotesInternal2$438(this.f18427c, this.d, i13, arrayList4);
                return;
            case 4:
                long j10 = this.d;
                ArrayList arrayList5 = this.f18429f;
                int i14 = this.f18428e;
                this.f18426b.lambda$checkUnreadPollVotesInternal2$432(this.f18427c, i14, j10, arrayList5);
                return;
            case 5:
                int i15 = this.f18428e;
                ArrayList arrayList6 = this.f18429f;
                this.f18426b.lambda$checkUnreadReactionsInternal2$431(this.f18427c, this.d, i15, arrayList6);
                return;
            default:
                int i16 = this.f18428e;
                ArrayList arrayList7 = this.f18429f;
                this.f18426b.lambda$checkUnreadReactionsInternal2$429(this.f18427c, this.d, i16, arrayList7);
                return;
        }
    }

    public la(MessagesController messagesController, long j3, long j10, int i10, ArrayList arrayList, int i11) {
        this.f18425a = i11;
        this.f18426b = messagesController;
        this.f18427c = j3;
        this.d = j10;
        this.f18428e = i10;
        this.f18429f = arrayList;
    }
}
