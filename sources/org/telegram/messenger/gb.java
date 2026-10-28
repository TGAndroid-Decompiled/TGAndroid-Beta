package org.telegram.messenger;

import java.util.ArrayList;
public final class gb implements Runnable {
    public final int f20158a;
    public final MessagesController f20159b;
    public final long f20160c;
    public final long d;
    public final int e;
    public final ArrayList f20161f;

    public gb(MessagesController messagesController, long j10, int i10, long j11, ArrayList arrayList, int i11) {
        this.f20158a = i11;
        this.f20159b = messagesController;
        this.f20160c = j10;
        this.e = i10;
        this.d = j11;
        this.f20161f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20158a) {
            case 0:
                long j10 = this.d;
                ArrayList arrayList = this.f20161f;
                int i10 = this.e;
                this.f20159b.lambda$checkUnreadReactionsInternal2$428(this.f20160c, i10, j10, arrayList);
                return;
            case 1:
                int i11 = this.e;
                ArrayList arrayList2 = this.f20161f;
                this.f20159b.lambda$checkUnreadPollVotesInternal2$441(this.f20160c, this.d, i11, arrayList2);
                return;
            case 2:
                int i12 = this.e;
                ArrayList arrayList3 = this.f20161f;
                this.f20159b.lambda$checkUnreadPollVotesInternal2$439(this.f20160c, this.d, i12, arrayList3);
                return;
            case 3:
                int i13 = this.e;
                ArrayList arrayList4 = this.f20161f;
                this.f20159b.lambda$checkUnreadReactionsInternal2$430(this.f20160c, this.d, i13, arrayList4);
                return;
            case 4:
                int i14 = this.e;
                ArrayList arrayList5 = this.f20161f;
                this.f20159b.lambda$checkUnreadReactionsInternal2$432(this.f20160c, this.d, i14, arrayList5);
                return;
            case 5:
                int i15 = this.e;
                ArrayList arrayList6 = this.f20161f;
                this.f20159b.lambda$checkUnreadReactionsInternal2$434(this.f20160c, this.d, i15, arrayList6);
                return;
            default:
                long j11 = this.d;
                ArrayList arrayList7 = this.f20161f;
                int i16 = this.e;
                this.f20159b.lambda$checkUnreadPollVotesInternal2$435(this.f20160c, i16, j11, arrayList7);
                return;
        }
    }

    public gb(MessagesController messagesController, long j10, long j11, int i10, ArrayList arrayList, int i11) {
        this.f20158a = i11;
        this.f20159b = messagesController;
        this.f20160c = j10;
        this.d = j11;
        this.e = i10;
        this.f20161f = arrayList;
    }
}
