package org.telegram.messenger;

import java.util.ArrayList;

public final class kb implements Runnable {

    public final int f20764a;

    public final MessagesController f20765b;

    public final long f20766c;
    public final long d;

    public final int f20767e;

    public final ArrayList f20768f;

    public kb(MessagesController messagesController, long j10, int i10, long j11, ArrayList arrayList, int i11) {
        this.f20764a = i11;
        this.f20765b = messagesController;
        this.f20766c = j10;
        this.f20767e = i10;
        this.d = j11;
        this.f20768f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20764a) {
            case 0:
                int i10 = this.f20767e;
                ArrayList arrayList = this.f20768f;
                this.f20765b.lambda$checkUnreadReactionsInternal2$424(this.f20766c, this.d, i10, arrayList);
                break;
            case 1:
                int i11 = this.f20767e;
                ArrayList arrayList2 = this.f20768f;
                this.f20765b.lambda$checkUnreadPollVotesInternal2$435(this.f20766c, this.d, i11, arrayList2);
                break;
            case 2:
                int i12 = this.f20767e;
                ArrayList arrayList3 = this.f20768f;
                this.f20765b.lambda$checkUnreadReactionsInternal2$426(this.f20766c, this.d, i12, arrayList3);
                break;
            case 3:
                int i13 = this.f20767e;
                ArrayList arrayList4 = this.f20768f;
                this.f20765b.lambda$checkUnreadPollVotesInternal2$433(this.f20766c, this.d, i13, arrayList4);
                break;
            case 4:
                int i14 = this.f20767e;
                ArrayList arrayList5 = this.f20768f;
                this.f20765b.lambda$checkUnreadReactionsInternal2$428(this.f20766c, this.d, i14, arrayList5);
                break;
            case 5:
                long j10 = this.d;
                ArrayList arrayList6 = this.f20768f;
                int i15 = this.f20767e;
                this.f20765b.lambda$checkUnreadReactionsInternal2$422(this.f20766c, i15, j10, arrayList6);
                break;
            default:
                long j11 = this.d;
                ArrayList arrayList7 = this.f20768f;
                int i16 = this.f20767e;
                this.f20765b.lambda$checkUnreadPollVotesInternal2$429(this.f20766c, i16, j11, arrayList7);
                break;
        }
    }

    public kb(MessagesController messagesController, long j10, long j11, int i10, ArrayList arrayList, int i11) {
        this.f20764a = i11;
        this.f20765b = messagesController;
        this.f20766c = j10;
        this.d = j11;
        this.f20767e = i10;
        this.f20768f = arrayList;
    }
}
