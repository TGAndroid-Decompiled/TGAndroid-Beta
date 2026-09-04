package org.telegram.messenger;

import java.util.ArrayList;
public final class lb implements Runnable {
    public final int f18260a;
    public final MessagesController f18261b;
    public final long f18262c;
    public final long d;
    public final int f18263e;
    public final ArrayList f18264f;

    public lb(MessagesController messagesController, long j3, int i10, long j10, ArrayList arrayList, int i11) {
        this.f18260a = i11;
        this.f18261b = messagesController;
        this.f18262c = j3;
        this.f18263e = i10;
        this.d = j10;
        this.f18264f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18260a) {
            case 0:
                int i10 = this.f18263e;
                ArrayList arrayList = this.f18264f;
                this.f18261b.lambda$checkUnreadReactionsInternal2$424(this.f18262c, this.d, i10, arrayList);
                return;
            case 1:
                int i11 = this.f18263e;
                ArrayList arrayList2 = this.f18264f;
                this.f18261b.lambda$checkUnreadPollVotesInternal2$435(this.f18262c, this.d, i11, arrayList2);
                return;
            case 2:
                int i12 = this.f18263e;
                ArrayList arrayList3 = this.f18264f;
                this.f18261b.lambda$checkUnreadReactionsInternal2$426(this.f18262c, this.d, i12, arrayList3);
                return;
            case 3:
                int i13 = this.f18263e;
                ArrayList arrayList4 = this.f18264f;
                this.f18261b.lambda$checkUnreadPollVotesInternal2$433(this.f18262c, this.d, i13, arrayList4);
                return;
            case 4:
                int i14 = this.f18263e;
                ArrayList arrayList5 = this.f18264f;
                this.f18261b.lambda$checkUnreadReactionsInternal2$428(this.f18262c, this.d, i14, arrayList5);
                return;
            case 5:
                long j3 = this.d;
                ArrayList arrayList6 = this.f18264f;
                int i15 = this.f18263e;
                this.f18261b.lambda$checkUnreadReactionsInternal2$422(this.f18262c, i15, j3, arrayList6);
                return;
            default:
                long j10 = this.d;
                ArrayList arrayList7 = this.f18264f;
                int i16 = this.f18263e;
                this.f18261b.lambda$checkUnreadPollVotesInternal2$429(this.f18262c, i16, j10, arrayList7);
                return;
        }
    }

    public lb(MessagesController messagesController, long j3, long j10, int i10, ArrayList arrayList, int i11) {
        this.f18260a = i11;
        this.f18261b = messagesController;
        this.f18262c = j3;
        this.d = j10;
        this.f18263e = i10;
        this.f18264f = arrayList;
    }
}
