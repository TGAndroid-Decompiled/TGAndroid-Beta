package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f20036a;
    public final Object f20037b;
    public final int f20038c;
    public final long d;
    public final int f20039e;
    public final Object f20040f;

    public t(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f20036a = 4;
        this.f20037b = messagesStorage;
        this.d = j10;
        this.f20040f = arrayList;
        this.f20038c = i10;
        this.f20039e = i11;
    }

    @Override
    public final void run() {
        switch (this.f20036a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f20037b, (TLRPC.User) this.f20040f, this.f20038c, this.d, this.f20039e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f20037b, (TLRPC.Chat) this.f20040f, this.f20038c, this.d, this.f20039e);
                return;
            case 2:
                ((MediaDataController) this.f20037b).lambda$putStickersToCache$102((ArrayList) this.f20040f, this.f20038c, this.f20039e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.f20039e;
                ((MessagesStorage) this.f20037b).lambda$updateTopicData$49(this.f20038c, (TLRPC.TL_forumTopic) this.f20040f, j10, i10);
                return;
            default:
                int i11 = this.f20038c;
                int i12 = this.f20039e;
                ((MessagesStorage) this.f20037b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f20040f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f20036a = i12;
        this.f20037b = accountInstance;
        this.f20040f = tLObject;
        this.f20038c = i10;
        this.d = j10;
        this.f20039e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f20036a = 2;
        this.f20037b = mediaDataController;
        this.f20040f = arrayList;
        this.f20038c = i10;
        this.f20039e = i11;
        this.d = j10;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f20036a = 3;
        this.f20037b = messagesStorage;
        this.f20038c = i10;
        this.f20040f = tL_forumTopic;
        this.d = j10;
        this.f20039e = i11;
    }
}
