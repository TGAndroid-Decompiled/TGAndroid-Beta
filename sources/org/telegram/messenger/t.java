package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f19563a;
    public final Object f19564b;
    public final int f19565c;
    public final long d;
    public final int e;
    public final Object f19566f;

    public t(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19563a = 4;
        this.f19564b = messagesStorage;
        this.d = j10;
        this.f19566f = arrayList;
        this.f19565c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19563a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f19564b, (TLRPC.User) this.f19566f, this.f19565c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f19564b, (TLRPC.Chat) this.f19566f, this.f19565c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f19564b).lambda$putStickersToCache$102((ArrayList) this.f19566f, this.f19565c, this.e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f19564b).lambda$updateTopicData$49(this.f19565c, (TLRPC.TL_forumTopic) this.f19566f, j10, i10);
                return;
            default:
                int i11 = this.f19565c;
                int i12 = this.e;
                ((MessagesStorage) this.f19564b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19566f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f19563a = i12;
        this.f19564b = accountInstance;
        this.f19566f = tLObject;
        this.f19565c = i10;
        this.d = j10;
        this.e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f19563a = 2;
        this.f19564b = mediaDataController;
        this.f19566f = arrayList;
        this.f19565c = i10;
        this.e = i11;
        this.d = j10;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f19563a = 3;
        this.f19564b = messagesStorage;
        this.f19565c = i10;
        this.f19566f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
