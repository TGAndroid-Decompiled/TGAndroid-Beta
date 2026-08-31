package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f20034a;
    public final Object f20035b;
    public final int f20036c;
    public final long d;
    public final int f20037e;
    public final Object f20038f;

    public t(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f20034a = 4;
        this.f20035b = messagesStorage;
        this.d = j10;
        this.f20038f = arrayList;
        this.f20036c = i10;
        this.f20037e = i11;
    }

    @Override
    public final void run() {
        switch (this.f20034a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f20035b, (TLRPC.User) this.f20038f, this.f20036c, this.d, this.f20037e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f20035b, (TLRPC.Chat) this.f20038f, this.f20036c, this.d, this.f20037e);
                return;
            case 2:
                ((MediaDataController) this.f20035b).lambda$putStickersToCache$102((ArrayList) this.f20038f, this.f20036c, this.f20037e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.f20037e;
                ((MessagesStorage) this.f20035b).lambda$updateTopicData$49(this.f20036c, (TLRPC.TL_forumTopic) this.f20038f, j10, i10);
                return;
            default:
                int i11 = this.f20036c;
                int i12 = this.f20037e;
                ((MessagesStorage) this.f20035b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f20038f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f20034a = i12;
        this.f20035b = accountInstance;
        this.f20038f = tLObject;
        this.f20036c = i10;
        this.d = j10;
        this.f20037e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f20034a = 2;
        this.f20035b = mediaDataController;
        this.f20038f = arrayList;
        this.f20036c = i10;
        this.f20037e = i11;
        this.d = j10;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f20034a = 3;
        this.f20035b = messagesStorage;
        this.f20036c = i10;
        this.f20038f = tL_forumTopic;
        this.d = j10;
        this.f20037e = i11;
    }
}
