package org.telegram.messenger;

import java.util.ArrayList;
public final class pa implements Runnable {
    public final int f19257a;
    public final MessagesController f19258b;
    public final long f19259c;
    public final long d;
    public final int e;
    public final ArrayList f19260f;

    public pa(MessagesController messagesController, long j10, int i10, long j11, ArrayList arrayList, int i11) {
        this.f19257a = i11;
        this.f19258b = messagesController;
        this.f19259c = j10;
        this.e = i10;
        this.d = j11;
        this.f19260f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19257a) {
            case 0:
                long j10 = this.d;
                ArrayList arrayList = this.f19260f;
                int i10 = this.e;
                this.f19258b.lambda$checkUnreadReactionsInternal2$425(this.f19259c, i10, j10, arrayList);
                return;
            case 1:
                int i11 = this.e;
                ArrayList arrayList2 = this.f19260f;
                this.f19258b.lambda$checkUnreadPollVotesInternal2$436(this.f19259c, this.d, i11, arrayList2);
                return;
            case 2:
                int i12 = this.e;
                ArrayList arrayList3 = this.f19260f;
                this.f19258b.lambda$checkUnreadReactionsInternal2$427(this.f19259c, this.d, i12, arrayList3);
                return;
            case 3:
                int i13 = this.e;
                ArrayList arrayList4 = this.f19260f;
                this.f19258b.lambda$checkUnreadPollVotesInternal2$438(this.f19259c, this.d, i13, arrayList4);
                return;
            case 4:
                long j11 = this.d;
                ArrayList arrayList5 = this.f19260f;
                int i14 = this.e;
                this.f19258b.lambda$checkUnreadPollVotesInternal2$432(this.f19259c, i14, j11, arrayList5);
                return;
            case 5:
                int i15 = this.e;
                ArrayList arrayList6 = this.f19260f;
                this.f19258b.lambda$checkUnreadReactionsInternal2$431(this.f19259c, this.d, i15, arrayList6);
                return;
            default:
                int i16 = this.e;
                ArrayList arrayList7 = this.f19260f;
                this.f19258b.lambda$checkUnreadReactionsInternal2$429(this.f19259c, this.d, i16, arrayList7);
                return;
        }
    }

    public pa(MessagesController messagesController, long j10, long j11, int i10, ArrayList arrayList, int i11) {
        this.f19257a = i11;
        this.f19258b = messagesController;
        this.f19259c = j10;
        this.d = j11;
        this.e = i10;
        this.f19260f = arrayList;
    }
}
