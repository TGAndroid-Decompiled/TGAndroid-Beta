package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f19604a;
    public final Object f19605b;
    public final int f19606c;
    public final long d;
    public final int e;
    public final Object f19607f;

    public u(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19604a = 4;
        this.f19605b = messagesStorage;
        this.d = j10;
        this.f19607f = arrayList;
        this.f19606c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19604a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f19605b, (TLRPC.User) this.f19607f, this.f19606c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f19605b, (TLRPC.Chat) this.f19607f, this.f19606c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f19605b).lambda$putStickersToCache$102((ArrayList) this.f19607f, this.f19606c, this.e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f19605b).lambda$updateTopicData$49(this.f19606c, (TLRPC.TL_forumTopic) this.f19607f, j10, i10);
                return;
            default:
                int i11 = this.f19606c;
                int i12 = this.e;
                ((MessagesStorage) this.f19605b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19607f, i11, i12);
                return;
        }
    }

    public u(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f19604a = i12;
        this.f19605b = accountInstance;
        this.f19607f = tLObject;
        this.f19606c = i10;
        this.d = j10;
        this.e = i11;
    }

    public u(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f19604a = 2;
        this.f19605b = mediaDataController;
        this.f19607f = arrayList;
        this.f19606c = i10;
        this.e = i11;
        this.d = j10;
    }

    public u(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f19604a = 3;
        this.f19605b = messagesStorage;
        this.f19606c = i10;
        this.f19607f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
