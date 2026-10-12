package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f19043a;
    public final Object f19044b;
    public final int f19045c;
    public final long d;
    public final int f19046e;
    public final Object f19047f;

    public u(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19043a = 4;
        this.f19044b = messagesStorage;
        this.d = j3;
        this.f19047f = arrayList;
        this.f19045c = i10;
        this.f19046e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19043a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f19044b, (TLRPC.User) this.f19047f, this.f19045c, this.d, this.f19046e);
                return;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f19044b, (TLRPC.Chat) this.f19047f, this.f19045c, this.d, this.f19046e);
                return;
            case 2:
                ((MediaDataController) this.f19044b).lambda$putStickersToCache$102((ArrayList) this.f19047f, this.f19045c, this.f19046e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.f19046e;
                ((MessagesStorage) this.f19044b).lambda$updateTopicData$49(this.f19045c, (TLRPC.TL_forumTopic) this.f19047f, j3, i10);
                return;
            default:
                int i11 = this.f19045c;
                int i12 = this.f19046e;
                ((MessagesStorage) this.f19044b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19047f, i11, i12);
                return;
        }
    }

    public u(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f19043a = i12;
        this.f19044b = accountInstance;
        this.f19047f = tLObject;
        this.f19045c = i10;
        this.d = j3;
        this.f19046e = i11;
    }

    public u(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f19043a = 2;
        this.f19044b = mediaDataController;
        this.f19047f = arrayList;
        this.f19045c = i10;
        this.f19046e = i11;
        this.d = j3;
    }

    public u(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f19043a = 3;
        this.f19044b = messagesStorage;
        this.f19045c = i10;
        this.f19047f = tL_forumTopic;
        this.d = j3;
        this.f19046e = i11;
    }
}
