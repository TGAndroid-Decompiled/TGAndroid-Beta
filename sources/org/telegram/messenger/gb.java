package org.telegram.messenger;

import java.util.ArrayList;
public final class gb implements Runnable {
    public final int f20376a;
    public final MessagesController f20377b;
    public final long f20378c;
    public final long d;
    public final int f20379e;
    public final ArrayList f20380f;

    public gb(MessagesController messagesController, long j10, int i9, long j11, ArrayList arrayList, int i10) {
        this.f20376a = i10;
        this.f20377b = messagesController;
        this.f20378c = j10;
        this.f20379e = i9;
        this.d = j11;
        this.f20380f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20376a) {
            case 0:
                int i9 = this.f20379e;
                ArrayList arrayList = this.f20380f;
                this.f20377b.lambda$checkUnreadReactionsInternal2$424(this.f20378c, this.d, i9, arrayList);
                return;
            case 1:
                int i10 = this.f20379e;
                ArrayList arrayList2 = this.f20380f;
                this.f20377b.lambda$checkUnreadPollVotesInternal2$435(this.f20378c, this.d, i10, arrayList2);
                return;
            case 2:
                int i11 = this.f20379e;
                ArrayList arrayList3 = this.f20380f;
                this.f20377b.lambda$checkUnreadReactionsInternal2$426(this.f20378c, this.d, i11, arrayList3);
                return;
            case 3:
                int i12 = this.f20379e;
                ArrayList arrayList4 = this.f20380f;
                this.f20377b.lambda$checkUnreadPollVotesInternal2$433(this.f20378c, this.d, i12, arrayList4);
                return;
            case 4:
                int i13 = this.f20379e;
                ArrayList arrayList5 = this.f20380f;
                this.f20377b.lambda$checkUnreadReactionsInternal2$428(this.f20378c, this.d, i13, arrayList5);
                return;
            case 5:
                long j10 = this.d;
                ArrayList arrayList6 = this.f20380f;
                int i14 = this.f20379e;
                this.f20377b.lambda$checkUnreadReactionsInternal2$422(this.f20378c, i14, j10, arrayList6);
                return;
            default:
                long j11 = this.d;
                ArrayList arrayList7 = this.f20380f;
                int i15 = this.f20379e;
                this.f20377b.lambda$checkUnreadPollVotesInternal2$429(this.f20378c, i15, j11, arrayList7);
                return;
        }
    }

    public gb(MessagesController messagesController, long j10, long j11, int i9, ArrayList arrayList, int i10) {
        this.f20376a = i10;
        this.f20377b = messagesController;
        this.f20378c = j10;
        this.d = j11;
        this.f20379e = i9;
        this.f20380f = arrayList;
    }
}
