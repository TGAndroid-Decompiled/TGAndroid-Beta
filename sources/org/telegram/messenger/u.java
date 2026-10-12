package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f19042a;
    public final Object f19043b;
    public final int f19044c;
    public final long d;
    public final int f19045e;
    public final Object f19046f;

    public u(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19042a = 4;
        this.f19043b = messagesStorage;
        this.d = j3;
        this.f19046f = arrayList;
        this.f19044c = i10;
        this.f19045e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19042a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f19043b, (TLRPC.User) this.f19046f, this.f19044c, this.d, this.f19045e);
                return;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f19043b, (TLRPC.Chat) this.f19046f, this.f19044c, this.d, this.f19045e);
                return;
            case 2:
                ((MediaDataController) this.f19043b).lambda$putStickersToCache$102((ArrayList) this.f19046f, this.f19044c, this.f19045e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.f19045e;
                ((MessagesStorage) this.f19043b).lambda$updateTopicData$49(this.f19044c, (TLRPC.TL_forumTopic) this.f19046f, j3, i10);
                return;
            default:
                int i11 = this.f19044c;
                int i12 = this.f19045e;
                ((MessagesStorage) this.f19043b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19046f, i11, i12);
                return;
        }
    }

    public u(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f19042a = i12;
        this.f19043b = accountInstance;
        this.f19046f = tLObject;
        this.f19044c = i10;
        this.d = j3;
        this.f19045e = i11;
    }

    public u(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f19042a = 2;
        this.f19043b = mediaDataController;
        this.f19046f = arrayList;
        this.f19044c = i10;
        this.f19045e = i11;
        this.d = j3;
    }

    public u(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f19042a = 3;
        this.f19043b = messagesStorage;
        this.f19044c = i10;
        this.f19046f = tL_forumTopic;
        this.d = j3;
        this.f19045e = i11;
    }
}
