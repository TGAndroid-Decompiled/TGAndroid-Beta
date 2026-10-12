package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f18537a;
    public final Object f18538b;
    public final int f18539c;
    public final long d;
    public final int e;
    public final Object f18540f;

    public u(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f18537a = 4;
        this.f18538b = messagesStorage;
        this.d = j10;
        this.f18540f = arrayList;
        this.f18539c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18537a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f18538b, (TLRPC.User) this.f18540f, this.f18539c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f18538b, (TLRPC.Chat) this.f18540f, this.f18539c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f18538b).lambda$putStickersToCache$102((ArrayList) this.f18540f, this.f18539c, this.e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f18538b).lambda$updateTopicData$49(this.f18539c, (TLRPC.TL_forumTopic) this.f18540f, j10, i10);
                return;
            default:
                int i11 = this.f18539c;
                int i12 = this.e;
                ((MessagesStorage) this.f18538b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f18540f, i11, i12);
                return;
        }
    }

    public u(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f18537a = i12;
        this.f18538b = accountInstance;
        this.f18540f = tLObject;
        this.f18539c = i10;
        this.d = j10;
        this.e = i11;
    }

    public u(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f18537a = 2;
        this.f18538b = mediaDataController;
        this.f18540f = arrayList;
        this.f18539c = i10;
        this.e = i11;
        this.d = j10;
    }

    public u(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f18537a = 3;
        this.f18538b = messagesStorage;
        this.f18539c = i10;
        this.f18540f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
