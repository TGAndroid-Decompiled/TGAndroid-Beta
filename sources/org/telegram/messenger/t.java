package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f17523a;
    public final Object f17524b;
    public final int f17525c;
    public final long d;
    public final int e;
    public final Object f17526f;

    public t(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17523a = 4;
        this.f17524b = messagesStorage;
        this.d = j3;
        this.f17526f = arrayList;
        this.f17525c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f17523a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f17524b, (TLRPC.User) this.f17526f, this.f17525c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f17524b, (TLRPC.Chat) this.f17526f, this.f17525c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f17524b).lambda$putStickersToCache$102((ArrayList) this.f17526f, this.f17525c, this.e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f17524b).lambda$updateTopicData$49(this.f17525c, (TLRPC.TL_forumTopic) this.f17526f, j3, i10);
                return;
            default:
                int i11 = this.f17525c;
                int i12 = this.e;
                ((MessagesStorage) this.f17524b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f17526f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f17523a = i12;
        this.f17524b = accountInstance;
        this.f17526f = tLObject;
        this.f17525c = i10;
        this.d = j3;
        this.e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f17523a = 2;
        this.f17524b = mediaDataController;
        this.f17526f = arrayList;
        this.f17525c = i10;
        this.e = i11;
        this.d = j3;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f17523a = 3;
        this.f17524b = messagesStorage;
        this.f17525c = i10;
        this.f17526f = tL_forumTopic;
        this.d = j3;
        this.e = i11;
    }
}
