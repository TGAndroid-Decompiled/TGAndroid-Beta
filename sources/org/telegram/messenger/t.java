package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f19534a;
    public final Object f19535b;
    public final int f19536c;
    public final long d;
    public final int e;
    public final Object f19537f;

    public t(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19534a = 4;
        this.f19535b = messagesStorage;
        this.d = j10;
        this.f19537f = arrayList;
        this.f19536c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19534a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f19535b, (TLRPC.User) this.f19537f, this.f19536c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f19535b, (TLRPC.Chat) this.f19537f, this.f19536c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f19535b).lambda$putStickersToCache$102((ArrayList) this.f19537f, this.f19536c, this.e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f19535b).lambda$updateTopicData$49(this.f19536c, (TLRPC.TL_forumTopic) this.f19537f, j10, i10);
                return;
            default:
                int i11 = this.f19536c;
                int i12 = this.e;
                ((MessagesStorage) this.f19535b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19537f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f19534a = i12;
        this.f19535b = accountInstance;
        this.f19537f = tLObject;
        this.f19536c = i10;
        this.d = j10;
        this.e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f19534a = 2;
        this.f19535b = mediaDataController;
        this.f19537f = arrayList;
        this.f19536c = i10;
        this.e = i11;
        this.d = j10;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f19534a = 3;
        this.f19535b = messagesStorage;
        this.f19536c = i10;
        this.f19537f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
