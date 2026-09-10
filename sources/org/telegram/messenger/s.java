package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s implements Runnable {
    public final int f16268a;
    public final Object f16269b;
    public final int f16270c;
    public final long d;
    public final int e;
    public final Object f16271f;

    public s(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f16268a = 4;
        this.f16269b = messagesStorage;
        this.d = j3;
        this.f16271f = arrayList;
        this.f16270c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f16268a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f16269b, (TLRPC.User) this.f16271f, this.f16270c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f16269b, (TLRPC.Chat) this.f16271f, this.f16270c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f16269b).lambda$putStickersToCache$102((ArrayList) this.f16271f, this.f16270c, this.e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f16269b).lambda$updateTopicData$49(this.f16270c, (TLRPC.TL_forumTopic) this.f16271f, j3, i10);
                return;
            default:
                int i11 = this.f16270c;
                int i12 = this.e;
                ((MessagesStorage) this.f16269b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f16271f, i11, i12);
                return;
        }
    }

    public s(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f16268a = i12;
        this.f16269b = accountInstance;
        this.f16271f = tLObject;
        this.f16270c = i10;
        this.d = j3;
        this.e = i11;
    }

    public s(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f16268a = 2;
        this.f16269b = mediaDataController;
        this.f16271f = arrayList;
        this.f16270c = i10;
        this.e = i11;
        this.d = j3;
    }

    public s(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f16268a = 3;
        this.f16269b = messagesStorage;
        this.f16270c = i10;
        this.f16271f = tL_forumTopic;
        this.d = j3;
        this.e = i11;
    }
}
