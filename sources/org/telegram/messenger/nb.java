package org.telegram.messenger;

import java.util.ArrayList;
public final class nb implements Runnable {
    public final int f17905a;
    public final MessagesController f17906b;
    public final long f17907c;
    public final long d;
    public final int e;
    public final ArrayList f17908f;

    public nb(MessagesController messagesController, long j10, int i10, long j11, ArrayList arrayList, int i11) {
        this.f17905a = i11;
        this.f17906b = messagesController;
        this.f17907c = j10;
        this.e = i10;
        this.d = j11;
        this.f17908f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17905a) {
            case 0:
                int i10 = this.e;
                ArrayList arrayList = this.f17908f;
                this.f17906b.lambda$checkUnreadReactionsInternal2$424(this.f17907c, this.d, i10, arrayList);
                return;
            case 1:
                int i11 = this.e;
                ArrayList arrayList2 = this.f17908f;
                this.f17906b.lambda$checkUnreadPollVotesInternal2$435(this.f17907c, this.d, i11, arrayList2);
                return;
            case 2:
                int i12 = this.e;
                ArrayList arrayList3 = this.f17908f;
                this.f17906b.lambda$checkUnreadReactionsInternal2$426(this.f17907c, this.d, i12, arrayList3);
                return;
            case 3:
                int i13 = this.e;
                ArrayList arrayList4 = this.f17908f;
                this.f17906b.lambda$checkUnreadPollVotesInternal2$433(this.f17907c, this.d, i13, arrayList4);
                return;
            case 4:
                int i14 = this.e;
                ArrayList arrayList5 = this.f17908f;
                this.f17906b.lambda$checkUnreadReactionsInternal2$428(this.f17907c, this.d, i14, arrayList5);
                return;
            case 5:
                long j10 = this.d;
                ArrayList arrayList6 = this.f17908f;
                int i15 = this.e;
                this.f17906b.lambda$checkUnreadReactionsInternal2$422(this.f17907c, i15, j10, arrayList6);
                return;
            default:
                long j11 = this.d;
                ArrayList arrayList7 = this.f17908f;
                int i16 = this.e;
                this.f17906b.lambda$checkUnreadPollVotesInternal2$429(this.f17907c, i16, j11, arrayList7);
                return;
        }
    }

    public nb(MessagesController messagesController, long j10, long j11, int i10, ArrayList arrayList, int i11) {
        this.f17905a = i11;
        this.f17906b = messagesController;
        this.f17907c = j10;
        this.d = j11;
        this.e = i10;
        this.f17908f = arrayList;
    }
}
