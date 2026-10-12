package org.telegram.messenger;

import java.util.ArrayList;
public final class oa implements Runnable {
    public final int f18464a;
    public final MessagesController f18465b;
    public final long f18466c;
    public final long d;
    public final int f18467e;
    public final ArrayList f18468f;

    public oa(MessagesController messagesController, long j3, int i10, long j10, ArrayList arrayList, int i11) {
        this.f18464a = i11;
        this.f18465b = messagesController;
        this.f18466c = j3;
        this.f18467e = i10;
        this.d = j10;
        this.f18468f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18464a) {
            case 0:
                long j3 = this.d;
                ArrayList arrayList = this.f18468f;
                int i10 = this.f18467e;
                this.f18465b.lambda$checkUnreadReactionsInternal2$425(this.f18466c, i10, j3, arrayList);
                return;
            case 1:
                int i11 = this.f18467e;
                ArrayList arrayList2 = this.f18468f;
                this.f18465b.lambda$checkUnreadPollVotesInternal2$436(this.f18466c, this.d, i11, arrayList2);
                return;
            case 2:
                int i12 = this.f18467e;
                ArrayList arrayList3 = this.f18468f;
                this.f18465b.lambda$checkUnreadReactionsInternal2$427(this.f18466c, this.d, i12, arrayList3);
                return;
            case 3:
                int i13 = this.f18467e;
                ArrayList arrayList4 = this.f18468f;
                this.f18465b.lambda$checkUnreadPollVotesInternal2$438(this.f18466c, this.d, i13, arrayList4);
                return;
            case 4:
                long j10 = this.d;
                ArrayList arrayList5 = this.f18468f;
                int i14 = this.f18467e;
                this.f18465b.lambda$checkUnreadPollVotesInternal2$432(this.f18466c, i14, j10, arrayList5);
                return;
            case 5:
                int i15 = this.f18467e;
                ArrayList arrayList6 = this.f18468f;
                this.f18465b.lambda$checkUnreadReactionsInternal2$431(this.f18466c, this.d, i15, arrayList6);
                return;
            default:
                int i16 = this.f18467e;
                ArrayList arrayList7 = this.f18468f;
                this.f18465b.lambda$checkUnreadReactionsInternal2$429(this.f18466c, this.d, i16, arrayList7);
                return;
        }
    }

    public oa(MessagesController messagesController, long j3, long j10, int i10, ArrayList arrayList, int i11) {
        this.f18464a = i11;
        this.f18465b = messagesController;
        this.f18466c = j3;
        this.d = j10;
        this.f18467e = i10;
        this.f18468f = arrayList;
    }
}
