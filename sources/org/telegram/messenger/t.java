package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f19529a;
    public final Object f19530b;
    public final int f19531c;
    public final long d;
    public final int e;
    public final Object f19532f;

    public t(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19529a = 4;
        this.f19530b = messagesStorage;
        this.d = j10;
        this.f19532f = arrayList;
        this.f19531c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19529a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f19530b, (TLRPC.User) this.f19532f, this.f19531c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f19530b, (TLRPC.Chat) this.f19532f, this.f19531c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f19530b).lambda$putStickersToCache$102((ArrayList) this.f19532f, this.f19531c, this.e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f19530b).lambda$updateTopicData$49(this.f19531c, (TLRPC.TL_forumTopic) this.f19532f, j10, i10);
                return;
            default:
                int i11 = this.f19531c;
                int i12 = this.e;
                ((MessagesStorage) this.f19530b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19532f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f19529a = i12;
        this.f19530b = accountInstance;
        this.f19532f = tLObject;
        this.f19531c = i10;
        this.d = j10;
        this.e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f19529a = 2;
        this.f19530b = mediaDataController;
        this.f19532f = arrayList;
        this.f19531c = i10;
        this.e = i11;
        this.d = j10;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f19529a = 3;
        this.f19530b = messagesStorage;
        this.f19531c = i10;
        this.f19532f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
