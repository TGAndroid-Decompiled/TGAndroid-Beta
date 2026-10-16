package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f18140a;
    public final Object f18141b;
    public final int f18142c;
    public final long d;
    public final int e;
    public final Object f18143f;

    public t(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f18140a = 4;
        this.f18141b = messagesStorage;
        this.d = j10;
        this.f18143f = arrayList;
        this.f18142c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18140a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f18141b, (TLRPC.User) this.f18143f, this.f18142c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f18141b, (TLRPC.Chat) this.f18143f, this.f18142c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f18141b).lambda$putStickersToCache$102((ArrayList) this.f18143f, this.f18142c, this.e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f18141b).lambda$updateTopicData$49(this.f18142c, (TLRPC.TL_forumTopic) this.f18143f, j10, i10);
                return;
            default:
                int i11 = this.f18142c;
                int i12 = this.e;
                ((MessagesStorage) this.f18141b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f18143f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f18140a = i12;
        this.f18141b = accountInstance;
        this.f18143f = tLObject;
        this.f18142c = i10;
        this.d = j10;
        this.e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f18140a = 2;
        this.f18141b = mediaDataController;
        this.f18143f = arrayList;
        this.f18142c = i10;
        this.e = i11;
        this.d = j10;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f18140a = 3;
        this.f18141b = messagesStorage;
        this.f18142c = i10;
        this.f18143f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
