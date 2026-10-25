package org.telegram.messenger;

import java.util.ArrayList;
public final class oa implements Runnable {
    public final int f20854a;
    public final MessagesController f20855b;
    public final long f20856c;
    public final int d;
    public final long e;
    public final ArrayList f20857f;

    public oa(MessagesController messagesController, long j10, int i10, long j11, ArrayList arrayList, int i11) {
        this.f20854a = i11;
        this.f20855b = messagesController;
        this.f20856c = j10;
        this.d = i10;
        this.e = j11;
        this.f20857f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20854a) {
            case 0:
                int i10 = this.d;
                ArrayList arrayList = this.f20857f;
                this.f20855b.lambda$checkUnreadPollVotesInternal2$438(this.f20856c, this.e, i10, arrayList);
                return;
            case 1:
                long j10 = this.e;
                ArrayList arrayList2 = this.f20857f;
                int i11 = this.d;
                this.f20855b.lambda$checkUnreadReactionsInternal2$427(this.f20856c, i11, j10, arrayList2);
                return;
            case 2:
                int i12 = this.d;
                ArrayList arrayList3 = this.f20857f;
                this.f20855b.lambda$checkUnreadReactionsInternal2$431(this.f20856c, this.e, i12, arrayList3);
                return;
            case 3:
                long j11 = this.e;
                ArrayList arrayList4 = this.f20857f;
                int i13 = this.d;
                this.f20855b.lambda$checkUnreadPollVotesInternal2$434(this.f20856c, i13, j11, arrayList4);
                return;
            case 4:
                int i14 = this.d;
                ArrayList arrayList5 = this.f20857f;
                this.f20855b.lambda$checkUnreadPollVotesInternal2$440(this.f20856c, this.e, i14, arrayList5);
                return;
            case 5:
                int i15 = this.d;
                ArrayList arrayList6 = this.f20857f;
                this.f20855b.lambda$checkUnreadReactionsInternal2$433(this.f20856c, this.e, i15, arrayList6);
                return;
            default:
                int i16 = this.d;
                ArrayList arrayList7 = this.f20857f;
                this.f20855b.lambda$checkUnreadReactionsInternal2$429(this.f20856c, this.e, i16, arrayList7);
                return;
        }
    }

    public oa(MessagesController messagesController, long j10, long j11, int i10, ArrayList arrayList, int i11) {
        this.f20854a = i11;
        this.f20855b = messagesController;
        this.f20856c = j10;
        this.e = j11;
        this.d = i10;
        this.f20857f = arrayList;
    }
}
