package org.telegram.messenger;

import java.util.ArrayList;
public final class ma implements Runnable {
    public final int f18946a;
    public final MessagesController f18947b;
    public final long f18948c;
    public final long d;
    public final int e;
    public final ArrayList f18949f;

    public ma(MessagesController messagesController, long j10, int i10, long j11, ArrayList arrayList, int i11) {
        this.f18946a = i11;
        this.f18947b = messagesController;
        this.f18948c = j10;
        this.e = i10;
        this.d = j11;
        this.f18949f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18946a) {
            case 0:
                long j10 = this.d;
                ArrayList arrayList = this.f18949f;
                int i10 = this.e;
                this.f18947b.lambda$checkUnreadReactionsInternal2$425(this.f18948c, i10, j10, arrayList);
                return;
            case 1:
                int i11 = this.e;
                ArrayList arrayList2 = this.f18949f;
                this.f18947b.lambda$checkUnreadPollVotesInternal2$436(this.f18948c, this.d, i11, arrayList2);
                return;
            case 2:
                int i12 = this.e;
                ArrayList arrayList3 = this.f18949f;
                this.f18947b.lambda$checkUnreadReactionsInternal2$427(this.f18948c, this.d, i12, arrayList3);
                return;
            case 3:
                int i13 = this.e;
                ArrayList arrayList4 = this.f18949f;
                this.f18947b.lambda$checkUnreadPollVotesInternal2$438(this.f18948c, this.d, i13, arrayList4);
                return;
            case 4:
                long j11 = this.d;
                ArrayList arrayList5 = this.f18949f;
                int i14 = this.e;
                this.f18947b.lambda$checkUnreadPollVotesInternal2$432(this.f18948c, i14, j11, arrayList5);
                return;
            case 5:
                int i15 = this.e;
                ArrayList arrayList6 = this.f18949f;
                this.f18947b.lambda$checkUnreadReactionsInternal2$431(this.f18948c, this.d, i15, arrayList6);
                return;
            default:
                int i16 = this.e;
                ArrayList arrayList7 = this.f18949f;
                this.f18947b.lambda$checkUnreadReactionsInternal2$429(this.f18948c, this.d, i16, arrayList7);
                return;
        }
    }

    public ma(MessagesController messagesController, long j10, long j11, int i10, ArrayList arrayList, int i11) {
        this.f18946a = i11;
        this.f18947b = messagesController;
        this.f18948c = j10;
        this.d = j11;
        this.e = i10;
        this.f18949f = arrayList;
    }
}
