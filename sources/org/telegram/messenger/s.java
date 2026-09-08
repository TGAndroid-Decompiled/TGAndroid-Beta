package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s implements Runnable {
    public final int f18960a;
    public final Object f18961b;
    public final int f18962c;
    public final long d;
    public final int f18963e;
    public final Object f18964f;

    public s(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f18960a = 4;
        this.f18961b = messagesStorage;
        this.d = j3;
        this.f18964f = arrayList;
        this.f18962c = i10;
        this.f18963e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18960a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f18961b, (TLRPC.User) this.f18964f, this.f18962c, this.d, this.f18963e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f18961b, (TLRPC.Chat) this.f18964f, this.f18962c, this.d, this.f18963e);
                return;
            case 2:
                ((MediaDataController) this.f18961b).lambda$putStickersToCache$102((ArrayList) this.f18964f, this.f18962c, this.f18963e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.f18963e;
                ((MessagesStorage) this.f18961b).lambda$updateTopicData$49(this.f18962c, (TLRPC.TL_forumTopic) this.f18964f, j3, i10);
                return;
            default:
                int i11 = this.f18962c;
                int i12 = this.f18963e;
                ((MessagesStorage) this.f18961b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f18964f, i11, i12);
                return;
        }
    }

    public s(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f18960a = i12;
        this.f18961b = accountInstance;
        this.f18964f = tLObject;
        this.f18962c = i10;
        this.d = j3;
        this.f18963e = i11;
    }

    public s(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f18960a = 2;
        this.f18961b = mediaDataController;
        this.f18964f = arrayList;
        this.f18962c = i10;
        this.f18963e = i11;
        this.d = j3;
    }

    public s(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f18960a = 3;
        this.f18961b = messagesStorage;
        this.f18962c = i10;
        this.f18964f = tL_forumTopic;
        this.d = j3;
        this.f18963e = i11;
    }
}
