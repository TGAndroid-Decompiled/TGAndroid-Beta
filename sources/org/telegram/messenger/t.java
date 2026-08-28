package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f21518a;
    public final Object f21519b;
    public final int f21520c;
    public final long d;
    public final int f21521e;
    public final Object f21522f;

    public t(int i9, int i10, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f21518a = 4;
        this.f21519b = messagesStorage;
        this.d = j10;
        this.f21522f = arrayList;
        this.f21520c = i9;
        this.f21521e = i10;
    }

    @Override
    public final void run() {
        switch (this.f21518a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f21519b, (TLRPC.User) this.f21522f, this.f21520c, this.d, this.f21521e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f21519b, (TLRPC.Chat) this.f21522f, this.f21520c, this.d, this.f21521e);
                return;
            case 2:
                ((MediaDataController) this.f21519b).lambda$putStickersToCache$102((ArrayList) this.f21522f, this.f21520c, this.f21521e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i9 = this.f21521e;
                ((MessagesStorage) this.f21519b).lambda$updateTopicData$49(this.f21520c, (TLRPC.TL_forumTopic) this.f21522f, j10, i9);
                return;
            default:
                int i10 = this.f21520c;
                int i11 = this.f21521e;
                ((MessagesStorage) this.f21519b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f21522f, i10, i11);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i9, long j10, int i10, int i11) {
        this.f21518a = i11;
        this.f21519b = accountInstance;
        this.f21522f = tLObject;
        this.f21520c = i9;
        this.d = j10;
        this.f21521e = i10;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i9, int i10, long j10) {
        this.f21518a = 2;
        this.f21519b = mediaDataController;
        this.f21522f = arrayList;
        this.f21520c = i9;
        this.f21521e = i10;
        this.d = j10;
    }

    public t(MessagesStorage messagesStorage, int i9, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i10) {
        this.f21518a = 3;
        this.f21519b = messagesStorage;
        this.f21520c = i9;
        this.f21522f = tL_forumTopic;
        this.d = j10;
        this.f21521e = i10;
    }
}
