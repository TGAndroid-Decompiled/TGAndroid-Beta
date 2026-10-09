package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f19191a;
    public final Object f19192b;
    public final int f19193c;
    public final long d;
    public final int f19194e;
    public final Object f19195f;

    public t(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19191a = 4;
        this.f19192b = messagesStorage;
        this.d = j3;
        this.f19195f = arrayList;
        this.f19193c = i10;
        this.f19194e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19191a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f19192b, (TLRPC.User) this.f19195f, this.f19193c, this.d, this.f19194e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f19192b, (TLRPC.Chat) this.f19195f, this.f19193c, this.d, this.f19194e);
                return;
            case 2:
                ((MediaDataController) this.f19192b).lambda$putStickersToCache$102((ArrayList) this.f19195f, this.f19193c, this.f19194e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.f19194e;
                ((MessagesStorage) this.f19192b).lambda$updateTopicData$49(this.f19193c, (TLRPC.TL_forumTopic) this.f19195f, j3, i10);
                return;
            default:
                int i11 = this.f19193c;
                int i12 = this.f19194e;
                ((MessagesStorage) this.f19192b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19195f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f19191a = i12;
        this.f19192b = accountInstance;
        this.f19195f = tLObject;
        this.f19193c = i10;
        this.d = j3;
        this.f19194e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f19191a = 2;
        this.f19192b = mediaDataController;
        this.f19195f = arrayList;
        this.f19193c = i10;
        this.f19194e = i11;
        this.d = j3;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f19191a = 3;
        this.f19192b = messagesStorage;
        this.f19193c = i10;
        this.f19195f = tL_forumTopic;
        this.d = j3;
        this.f19194e = i11;
    }
}
