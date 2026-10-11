package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f19197a;
    public final Object f19198b;
    public final int f19199c;
    public final long d;
    public final int f19200e;
    public final Object f19201f;

    public t(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19197a = 4;
        this.f19198b = messagesStorage;
        this.d = j3;
        this.f19201f = arrayList;
        this.f19199c = i10;
        this.f19200e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19197a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f19198b, (TLRPC.User) this.f19201f, this.f19199c, this.d, this.f19200e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f19198b, (TLRPC.Chat) this.f19201f, this.f19199c, this.d, this.f19200e);
                return;
            case 2:
                ((MediaDataController) this.f19198b).lambda$putStickersToCache$102((ArrayList) this.f19201f, this.f19199c, this.f19200e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.f19200e;
                ((MessagesStorage) this.f19198b).lambda$updateTopicData$49(this.f19199c, (TLRPC.TL_forumTopic) this.f19201f, j3, i10);
                return;
            default:
                int i11 = this.f19199c;
                int i12 = this.f19200e;
                ((MessagesStorage) this.f19198b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19201f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f19197a = i12;
        this.f19198b = accountInstance;
        this.f19201f = tLObject;
        this.f19199c = i10;
        this.d = j3;
        this.f19200e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f19197a = 2;
        this.f19198b = mediaDataController;
        this.f19201f = arrayList;
        this.f19199c = i10;
        this.f19200e = i11;
        this.d = j3;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f19197a = 3;
        this.f19198b = messagesStorage;
        this.f19199c = i10;
        this.f19201f = tL_forumTopic;
        this.d = j3;
        this.f19200e = i11;
    }
}
