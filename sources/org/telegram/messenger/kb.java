package org.telegram.messenger;

import java.util.ArrayList;
public final class kb implements Runnable {
    public final int f18180a;
    public final MessagesController f18181b;
    public final long f18182c;
    public final long d;
    public final int f18183e;
    public final ArrayList f18184f;

    public kb(MessagesController messagesController, long j3, int i10, long j10, ArrayList arrayList, int i11) {
        this.f18180a = i11;
        this.f18181b = messagesController;
        this.f18182c = j3;
        this.f18183e = i10;
        this.d = j10;
        this.f18184f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18180a) {
            case 0:
                int i10 = this.f18183e;
                ArrayList arrayList = this.f18184f;
                this.f18181b.lambda$checkUnreadReactionsInternal2$424(this.f18182c, this.d, i10, arrayList);
                return;
            case 1:
                int i11 = this.f18183e;
                ArrayList arrayList2 = this.f18184f;
                this.f18181b.lambda$checkUnreadPollVotesInternal2$435(this.f18182c, this.d, i11, arrayList2);
                return;
            case 2:
                int i12 = this.f18183e;
                ArrayList arrayList3 = this.f18184f;
                this.f18181b.lambda$checkUnreadReactionsInternal2$426(this.f18182c, this.d, i12, arrayList3);
                return;
            case 3:
                int i13 = this.f18183e;
                ArrayList arrayList4 = this.f18184f;
                this.f18181b.lambda$checkUnreadPollVotesInternal2$433(this.f18182c, this.d, i13, arrayList4);
                return;
            case 4:
                int i14 = this.f18183e;
                ArrayList arrayList5 = this.f18184f;
                this.f18181b.lambda$checkUnreadReactionsInternal2$428(this.f18182c, this.d, i14, arrayList5);
                return;
            case 5:
                long j3 = this.d;
                ArrayList arrayList6 = this.f18184f;
                int i15 = this.f18183e;
                this.f18181b.lambda$checkUnreadReactionsInternal2$422(this.f18182c, i15, j3, arrayList6);
                return;
            default:
                long j10 = this.d;
                ArrayList arrayList7 = this.f18184f;
                int i16 = this.f18183e;
                this.f18181b.lambda$checkUnreadPollVotesInternal2$429(this.f18182c, i16, j10, arrayList7);
                return;
        }
    }

    public kb(MessagesController messagesController, long j3, long j10, int i10, ArrayList arrayList, int i11) {
        this.f18180a = i11;
        this.f18181b = messagesController;
        this.f18182c = j3;
        this.d = j10;
        this.f18183e = i10;
        this.f18184f = arrayList;
    }
}
