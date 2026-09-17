package org.telegram.messenger;

import java.util.ArrayList;
public final class kb implements Runnable {
    public final int f18207a;
    public final MessagesController f18208b;
    public final long f18209c;
    public final long d;
    public final int f18210e;
    public final ArrayList f18211f;

    public kb(MessagesController messagesController, long j3, int i10, long j10, ArrayList arrayList, int i11) {
        this.f18207a = i11;
        this.f18208b = messagesController;
        this.f18209c = j3;
        this.f18210e = i10;
        this.d = j10;
        this.f18211f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18207a) {
            case 0:
                int i10 = this.f18210e;
                ArrayList arrayList = this.f18211f;
                this.f18208b.lambda$checkUnreadReactionsInternal2$424(this.f18209c, this.d, i10, arrayList);
                return;
            case 1:
                int i11 = this.f18210e;
                ArrayList arrayList2 = this.f18211f;
                this.f18208b.lambda$checkUnreadPollVotesInternal2$435(this.f18209c, this.d, i11, arrayList2);
                return;
            case 2:
                int i12 = this.f18210e;
                ArrayList arrayList3 = this.f18211f;
                this.f18208b.lambda$checkUnreadReactionsInternal2$426(this.f18209c, this.d, i12, arrayList3);
                return;
            case 3:
                int i13 = this.f18210e;
                ArrayList arrayList4 = this.f18211f;
                this.f18208b.lambda$checkUnreadPollVotesInternal2$433(this.f18209c, this.d, i13, arrayList4);
                return;
            case 4:
                int i14 = this.f18210e;
                ArrayList arrayList5 = this.f18211f;
                this.f18208b.lambda$checkUnreadReactionsInternal2$428(this.f18209c, this.d, i14, arrayList5);
                return;
            case 5:
                long j3 = this.d;
                ArrayList arrayList6 = this.f18211f;
                int i15 = this.f18210e;
                this.f18208b.lambda$checkUnreadReactionsInternal2$422(this.f18209c, i15, j3, arrayList6);
                return;
            default:
                long j10 = this.d;
                ArrayList arrayList7 = this.f18211f;
                int i16 = this.f18210e;
                this.f18208b.lambda$checkUnreadPollVotesInternal2$429(this.f18209c, i16, j10, arrayList7);
                return;
        }
    }

    public kb(MessagesController messagesController, long j3, long j10, int i10, ArrayList arrayList, int i11) {
        this.f18207a = i11;
        this.f18208b = messagesController;
        this.f18209c = j3;
        this.d = j10;
        this.f18210e = i10;
        this.f18211f = arrayList;
    }
}
