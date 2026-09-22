package org.telegram.messenger;

import java.util.ArrayList;
public final class lb implements Runnable {
    public final int f16898a;
    public final MessagesController f16899b;
    public final long f16900c;
    public final long d;
    public final int e;
    public final ArrayList f16901f;

    public lb(MessagesController messagesController, long j3, int i10, long j10, ArrayList arrayList, int i11) {
        this.f16898a = i11;
        this.f16899b = messagesController;
        this.f16900c = j3;
        this.e = i10;
        this.d = j10;
        this.f16901f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16898a) {
            case 0:
                int i10 = this.e;
                ArrayList arrayList = this.f16901f;
                this.f16899b.lambda$checkUnreadReactionsInternal2$424(this.f16900c, this.d, i10, arrayList);
                return;
            case 1:
                int i11 = this.e;
                ArrayList arrayList2 = this.f16901f;
                this.f16899b.lambda$checkUnreadPollVotesInternal2$435(this.f16900c, this.d, i11, arrayList2);
                return;
            case 2:
                int i12 = this.e;
                ArrayList arrayList3 = this.f16901f;
                this.f16899b.lambda$checkUnreadReactionsInternal2$426(this.f16900c, this.d, i12, arrayList3);
                return;
            case 3:
                int i13 = this.e;
                ArrayList arrayList4 = this.f16901f;
                this.f16899b.lambda$checkUnreadPollVotesInternal2$433(this.f16900c, this.d, i13, arrayList4);
                return;
            case 4:
                int i14 = this.e;
                ArrayList arrayList5 = this.f16901f;
                this.f16899b.lambda$checkUnreadReactionsInternal2$428(this.f16900c, this.d, i14, arrayList5);
                return;
            case 5:
                long j3 = this.d;
                ArrayList arrayList6 = this.f16901f;
                int i15 = this.e;
                this.f16899b.lambda$checkUnreadReactionsInternal2$422(this.f16900c, i15, j3, arrayList6);
                return;
            default:
                long j10 = this.d;
                ArrayList arrayList7 = this.f16901f;
                int i16 = this.e;
                this.f16899b.lambda$checkUnreadPollVotesInternal2$429(this.f16900c, i16, j10, arrayList7);
                return;
        }
    }

    public lb(MessagesController messagesController, long j3, long j10, int i10, ArrayList arrayList, int i11) {
        this.f16898a = i11;
        this.f16899b = messagesController;
        this.f16900c = j3;
        this.d = j10;
        this.e = i10;
        this.f16901f = arrayList;
    }
}
