package org.telegram.messenger;

import java.util.ArrayList;
public final class nb implements Runnable {
    public final int f19458a;
    public final MessagesController f19459b;
    public final long f19460c;
    public final long d;
    public final int f19461e;
    public final ArrayList f19462f;

    public nb(MessagesController messagesController, long j10, int i10, long j11, ArrayList arrayList, int i11) {
        this.f19458a = i11;
        this.f19459b = messagesController;
        this.f19460c = j10;
        this.f19461e = i10;
        this.d = j11;
        this.f19462f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19458a) {
            case 0:
                int i10 = this.f19461e;
                ArrayList arrayList = this.f19462f;
                this.f19459b.lambda$checkUnreadReactionsInternal2$424(this.f19460c, this.d, i10, arrayList);
                return;
            case 1:
                int i11 = this.f19461e;
                ArrayList arrayList2 = this.f19462f;
                this.f19459b.lambda$checkUnreadPollVotesInternal2$435(this.f19460c, this.d, i11, arrayList2);
                return;
            case 2:
                int i12 = this.f19461e;
                ArrayList arrayList3 = this.f19462f;
                this.f19459b.lambda$checkUnreadReactionsInternal2$426(this.f19460c, this.d, i12, arrayList3);
                return;
            case 3:
                int i13 = this.f19461e;
                ArrayList arrayList4 = this.f19462f;
                this.f19459b.lambda$checkUnreadPollVotesInternal2$433(this.f19460c, this.d, i13, arrayList4);
                return;
            case 4:
                int i14 = this.f19461e;
                ArrayList arrayList5 = this.f19462f;
                this.f19459b.lambda$checkUnreadReactionsInternal2$428(this.f19460c, this.d, i14, arrayList5);
                return;
            case 5:
                long j10 = this.d;
                ArrayList arrayList6 = this.f19462f;
                int i15 = this.f19461e;
                this.f19459b.lambda$checkUnreadReactionsInternal2$422(this.f19460c, i15, j10, arrayList6);
                return;
            default:
                long j11 = this.d;
                ArrayList arrayList7 = this.f19462f;
                int i16 = this.f19461e;
                this.f19459b.lambda$checkUnreadPollVotesInternal2$429(this.f19460c, i16, j11, arrayList7);
                return;
        }
    }

    public nb(MessagesController messagesController, long j10, long j11, int i10, ArrayList arrayList, int i11) {
        this.f19458a = i11;
        this.f19459b = messagesController;
        this.f19460c = j10;
        this.d = j11;
        this.f19461e = i10;
        this.f19462f = arrayList;
    }
}
