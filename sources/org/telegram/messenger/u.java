package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f18539a;
    public final Object f18540b;
    public final int f18541c;
    public final long d;
    public final int e;
    public final Object f18542f;

    public u(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f18539a = 4;
        this.f18540b = messagesStorage;
        this.d = j10;
        this.f18542f = arrayList;
        this.f18541c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18539a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f18540b, (TLRPC.User) this.f18542f, this.f18541c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f18540b, (TLRPC.Chat) this.f18542f, this.f18541c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f18540b).lambda$putStickersToCache$102((ArrayList) this.f18542f, this.f18541c, this.e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f18540b).lambda$updateTopicData$49(this.f18541c, (TLRPC.TL_forumTopic) this.f18542f, j10, i10);
                return;
            default:
                int i11 = this.f18541c;
                int i12 = this.e;
                ((MessagesStorage) this.f18540b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f18542f, i11, i12);
                return;
        }
    }

    public u(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f18539a = i12;
        this.f18540b = accountInstance;
        this.f18542f = tLObject;
        this.f18541c = i10;
        this.d = j10;
        this.e = i11;
    }

    public u(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f18539a = 2;
        this.f18540b = mediaDataController;
        this.f18542f = arrayList;
        this.f18541c = i10;
        this.e = i11;
        this.d = j10;
    }

    public u(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f18539a = 3;
        this.f18540b = messagesStorage;
        this.f18541c = i10;
        this.f18542f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
