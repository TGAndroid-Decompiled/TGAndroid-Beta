package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s implements Runnable {
    public final int f18935a;
    public final Object f18936b;
    public final int f18937c;
    public final long d;
    public final int f18938e;
    public final Object f18939f;

    public s(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f18935a = 4;
        this.f18936b = messagesStorage;
        this.d = j3;
        this.f18939f = arrayList;
        this.f18937c = i10;
        this.f18938e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18935a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f18936b, (TLRPC.User) this.f18939f, this.f18937c, this.d, this.f18938e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f18936b, (TLRPC.Chat) this.f18939f, this.f18937c, this.d, this.f18938e);
                return;
            case 2:
                ((MediaDataController) this.f18936b).lambda$putStickersToCache$102((ArrayList) this.f18939f, this.f18937c, this.f18938e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.f18938e;
                ((MessagesStorage) this.f18936b).lambda$updateTopicData$49(this.f18937c, (TLRPC.TL_forumTopic) this.f18939f, j3, i10);
                return;
            default:
                int i11 = this.f18937c;
                int i12 = this.f18938e;
                ((MessagesStorage) this.f18936b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f18939f, i11, i12);
                return;
        }
    }

    public s(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f18935a = i12;
        this.f18936b = accountInstance;
        this.f18939f = tLObject;
        this.f18937c = i10;
        this.d = j3;
        this.f18938e = i11;
    }

    public s(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f18935a = 2;
        this.f18936b = mediaDataController;
        this.f18939f = arrayList;
        this.f18937c = i10;
        this.f18938e = i11;
        this.d = j3;
    }

    public s(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f18935a = 3;
        this.f18936b = messagesStorage;
        this.f18937c = i10;
        this.f18939f = tL_forumTopic;
        this.d = j3;
        this.f18938e = i11;
    }
}
