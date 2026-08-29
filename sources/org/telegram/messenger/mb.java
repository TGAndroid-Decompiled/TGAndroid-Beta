package org.telegram.messenger;

import java.util.ArrayList;
public final class mb implements Runnable {
    public final int f20949a;
    public final MessagesController f20950b;
    public final long f20951c;
    public final long d;
    public final int f20952e;
    public final ArrayList f20953f;

    public mb(MessagesController messagesController, long j10, int i10, long j11, ArrayList arrayList, int i11) {
        this.f20949a = i11;
        this.f20950b = messagesController;
        this.f20951c = j10;
        this.f20952e = i10;
        this.d = j11;
        this.f20953f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20949a) {
            case 0:
                int i10 = this.f20952e;
                ArrayList arrayList = this.f20953f;
                this.f20950b.lambda$checkUnreadReactionsInternal2$424(this.f20951c, this.d, i10, arrayList);
                return;
            case 1:
                int i11 = this.f20952e;
                ArrayList arrayList2 = this.f20953f;
                this.f20950b.lambda$checkUnreadPollVotesInternal2$435(this.f20951c, this.d, i11, arrayList2);
                return;
            case 2:
                int i12 = this.f20952e;
                ArrayList arrayList3 = this.f20953f;
                this.f20950b.lambda$checkUnreadReactionsInternal2$426(this.f20951c, this.d, i12, arrayList3);
                return;
            case 3:
                int i13 = this.f20952e;
                ArrayList arrayList4 = this.f20953f;
                this.f20950b.lambda$checkUnreadPollVotesInternal2$433(this.f20951c, this.d, i13, arrayList4);
                return;
            case 4:
                int i14 = this.f20952e;
                ArrayList arrayList5 = this.f20953f;
                this.f20950b.lambda$checkUnreadReactionsInternal2$428(this.f20951c, this.d, i14, arrayList5);
                return;
            case 5:
                long j10 = this.d;
                ArrayList arrayList6 = this.f20953f;
                int i15 = this.f20952e;
                this.f20950b.lambda$checkUnreadReactionsInternal2$422(this.f20951c, i15, j10, arrayList6);
                return;
            default:
                long j11 = this.d;
                ArrayList arrayList7 = this.f20953f;
                int i16 = this.f20952e;
                this.f20950b.lambda$checkUnreadPollVotesInternal2$429(this.f20951c, i16, j11, arrayList7);
                return;
        }
    }

    public mb(MessagesController messagesController, long j10, long j11, int i10, ArrayList arrayList, int i11) {
        this.f20949a = i11;
        this.f20950b = messagesController;
        this.f20951c = j10;
        this.d = j11;
        this.f20952e = i10;
        this.f20953f = arrayList;
    }
}
