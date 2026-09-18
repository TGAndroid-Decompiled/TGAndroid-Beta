package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s implements Runnable {
    public final int f17278a;
    public final Object f17279b;
    public final int f17280c;
    public final long d;
    public final int e;
    public final Object f17281f;

    public s(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17278a = 4;
        this.f17279b = messagesStorage;
        this.d = j3;
        this.f17281f = arrayList;
        this.f17280c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f17278a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f17279b, (TLRPC.User) this.f17281f, this.f17280c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f17279b, (TLRPC.Chat) this.f17281f, this.f17280c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f17279b).lambda$putStickersToCache$102((ArrayList) this.f17281f, this.f17280c, this.e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f17279b).lambda$updateTopicData$49(this.f17280c, (TLRPC.TL_forumTopic) this.f17281f, j3, i10);
                return;
            default:
                int i11 = this.f17280c;
                int i12 = this.e;
                ((MessagesStorage) this.f17279b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f17281f, i11, i12);
                return;
        }
    }

    public s(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f17278a = i12;
        this.f17279b = accountInstance;
        this.f17281f = tLObject;
        this.f17280c = i10;
        this.d = j3;
        this.e = i11;
    }

    public s(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f17278a = 2;
        this.f17279b = mediaDataController;
        this.f17281f = arrayList;
        this.f17280c = i10;
        this.e = i11;
        this.d = j3;
    }

    public s(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f17278a = 3;
        this.f17279b = messagesStorage;
        this.f17280c = i10;
        this.f17281f = tL_forumTopic;
        this.d = j3;
        this.e = i11;
    }
}
