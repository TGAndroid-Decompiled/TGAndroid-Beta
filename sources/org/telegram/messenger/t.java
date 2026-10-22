package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f19549a;
    public final Object f19550b;
    public final int f19551c;
    public final long d;
    public final int e;
    public final Object f19552f;

    public t(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19549a = 4;
        this.f19550b = messagesStorage;
        this.d = j10;
        this.f19552f = arrayList;
        this.f19551c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19549a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f19550b, (TLRPC.User) this.f19552f, this.f19551c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f19550b, (TLRPC.Chat) this.f19552f, this.f19551c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f19550b).lambda$putStickersToCache$102((ArrayList) this.f19552f, this.f19551c, this.e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f19550b).lambda$updateTopicData$49(this.f19551c, (TLRPC.TL_forumTopic) this.f19552f, j10, i10);
                return;
            default:
                int i11 = this.f19551c;
                int i12 = this.e;
                ((MessagesStorage) this.f19550b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19552f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f19549a = i12;
        this.f19550b = accountInstance;
        this.f19552f = tLObject;
        this.f19551c = i10;
        this.d = j10;
        this.e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f19549a = 2;
        this.f19550b = mediaDataController;
        this.f19552f = arrayList;
        this.f19551c = i10;
        this.e = i11;
        this.d = j10;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f19549a = 3;
        this.f19550b = messagesStorage;
        this.f19551c = i10;
        this.f19552f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
