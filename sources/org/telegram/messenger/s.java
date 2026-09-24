package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s implements Runnable {
    public final int f17478a;
    public final Object f17479b;
    public final int f17480c;
    public final long d;
    public final int e;
    public final Object f17481f;

    public s(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17478a = 4;
        this.f17479b = messagesStorage;
        this.d = j3;
        this.f17481f = arrayList;
        this.f17480c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f17478a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f17479b, (TLRPC.User) this.f17481f, this.f17480c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f17479b, (TLRPC.Chat) this.f17481f, this.f17480c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f17479b).lambda$putStickersToCache$102((ArrayList) this.f17481f, this.f17480c, this.e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f17479b).lambda$updateTopicData$49(this.f17480c, (TLRPC.TL_forumTopic) this.f17481f, j3, i10);
                return;
            default:
                int i11 = this.f17480c;
                int i12 = this.e;
                ((MessagesStorage) this.f17479b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f17481f, i11, i12);
                return;
        }
    }

    public s(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f17478a = i12;
        this.f17479b = accountInstance;
        this.f17481f = tLObject;
        this.f17480c = i10;
        this.d = j3;
        this.e = i11;
    }

    public s(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f17478a = 2;
        this.f17479b = mediaDataController;
        this.f17481f = arrayList;
        this.f17480c = i10;
        this.e = i11;
        this.d = j3;
    }

    public s(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f17478a = 3;
        this.f17479b = messagesStorage;
        this.f17480c = i10;
        this.f17481f = tL_forumTopic;
        this.d = j3;
        this.e = i11;
    }
}
