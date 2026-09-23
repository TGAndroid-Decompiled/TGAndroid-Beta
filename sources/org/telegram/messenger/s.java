package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s implements Runnable {
    public final int f17246a;
    public final Object f17247b;
    public final int f17248c;
    public final long d;
    public final int e;
    public final Object f17249f;

    public s(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17246a = 4;
        this.f17247b = messagesStorage;
        this.d = j3;
        this.f17249f = arrayList;
        this.f17248c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f17246a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f17247b, (TLRPC.User) this.f17249f, this.f17248c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f17247b, (TLRPC.Chat) this.f17249f, this.f17248c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f17247b).lambda$putStickersToCache$102((ArrayList) this.f17249f, this.f17248c, this.e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f17247b).lambda$updateTopicData$49(this.f17248c, (TLRPC.TL_forumTopic) this.f17249f, j3, i10);
                return;
            default:
                int i11 = this.f17248c;
                int i12 = this.e;
                ((MessagesStorage) this.f17247b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f17249f, i11, i12);
                return;
        }
    }

    public s(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f17246a = i12;
        this.f17247b = accountInstance;
        this.f17249f = tLObject;
        this.f17248c = i10;
        this.d = j3;
        this.e = i11;
    }

    public s(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f17246a = 2;
        this.f17247b = mediaDataController;
        this.f17249f = arrayList;
        this.f17248c = i10;
        this.e = i11;
        this.d = j3;
    }

    public s(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f17246a = 3;
        this.f17247b = messagesStorage;
        this.f17248c = i10;
        this.f17249f = tL_forumTopic;
        this.d = j3;
        this.e = i11;
    }
}
