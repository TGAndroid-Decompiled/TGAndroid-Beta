package org.telegram.messenger;

import java.util.ArrayList;
public final class lb implements Runnable {
    public final int f16915a;
    public final MessagesController f16916b;
    public final long f16917c;
    public final long d;
    public final int e;
    public final ArrayList f16918f;

    public lb(MessagesController messagesController, long j3, int i10, long j10, ArrayList arrayList, int i11) {
        this.f16915a = i11;
        this.f16916b = messagesController;
        this.f16917c = j3;
        this.e = i10;
        this.d = j10;
        this.f16918f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16915a) {
            case 0:
                int i10 = this.e;
                ArrayList arrayList = this.f16918f;
                this.f16916b.lambda$checkUnreadReactionsInternal2$424(this.f16917c, this.d, i10, arrayList);
                return;
            case 1:
                int i11 = this.e;
                ArrayList arrayList2 = this.f16918f;
                this.f16916b.lambda$checkUnreadPollVotesInternal2$435(this.f16917c, this.d, i11, arrayList2);
                return;
            case 2:
                int i12 = this.e;
                ArrayList arrayList3 = this.f16918f;
                this.f16916b.lambda$checkUnreadReactionsInternal2$426(this.f16917c, this.d, i12, arrayList3);
                return;
            case 3:
                int i13 = this.e;
                ArrayList arrayList4 = this.f16918f;
                this.f16916b.lambda$checkUnreadPollVotesInternal2$433(this.f16917c, this.d, i13, arrayList4);
                return;
            case 4:
                int i14 = this.e;
                ArrayList arrayList5 = this.f16918f;
                this.f16916b.lambda$checkUnreadReactionsInternal2$428(this.f16917c, this.d, i14, arrayList5);
                return;
            case 5:
                long j3 = this.d;
                ArrayList arrayList6 = this.f16918f;
                int i15 = this.e;
                this.f16916b.lambda$checkUnreadReactionsInternal2$422(this.f16917c, i15, j3, arrayList6);
                return;
            default:
                long j10 = this.d;
                ArrayList arrayList7 = this.f16918f;
                int i16 = this.e;
                this.f16916b.lambda$checkUnreadPollVotesInternal2$429(this.f16917c, i16, j10, arrayList7);
                return;
        }
    }

    public lb(MessagesController messagesController, long j3, long j10, int i10, ArrayList arrayList, int i11) {
        this.f16915a = i11;
        this.f16916b = messagesController;
        this.f16917c = j3;
        this.d = j10;
        this.e = i10;
        this.f16918f = arrayList;
    }
}
