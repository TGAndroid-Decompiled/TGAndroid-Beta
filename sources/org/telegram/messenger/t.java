package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f19553a;
    public final Object f19554b;
    public final int f19555c;
    public final long d;
    public final int e;
    public final Object f19556f;

    public t(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19553a = 4;
        this.f19554b = messagesStorage;
        this.d = j10;
        this.f19556f = arrayList;
        this.f19555c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19553a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f19554b, (TLRPC.User) this.f19556f, this.f19555c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f19554b, (TLRPC.Chat) this.f19556f, this.f19555c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f19554b).lambda$putStickersToCache$102((ArrayList) this.f19556f, this.f19555c, this.e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f19554b).lambda$updateTopicData$49(this.f19555c, (TLRPC.TL_forumTopic) this.f19556f, j10, i10);
                return;
            default:
                int i11 = this.f19555c;
                int i12 = this.e;
                ((MessagesStorage) this.f19554b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19556f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f19553a = i12;
        this.f19554b = accountInstance;
        this.f19556f = tLObject;
        this.f19555c = i10;
        this.d = j10;
        this.e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f19553a = 2;
        this.f19554b = mediaDataController;
        this.f19556f = arrayList;
        this.f19555c = i10;
        this.e = i11;
        this.d = j10;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f19553a = 3;
        this.f19554b = messagesStorage;
        this.f19555c = i10;
        this.f19556f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
