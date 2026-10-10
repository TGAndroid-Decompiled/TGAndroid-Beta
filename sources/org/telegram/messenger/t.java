package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f19195a;
    public final Object f19196b;
    public final int f19197c;
    public final long d;
    public final int f19198e;
    public final Object f19199f;

    public t(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19195a = 4;
        this.f19196b = messagesStorage;
        this.d = j3;
        this.f19199f = arrayList;
        this.f19197c = i10;
        this.f19198e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19195a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f19196b, (TLRPC.User) this.f19199f, this.f19197c, this.d, this.f19198e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f19196b, (TLRPC.Chat) this.f19199f, this.f19197c, this.d, this.f19198e);
                return;
            case 2:
                ((MediaDataController) this.f19196b).lambda$putStickersToCache$102((ArrayList) this.f19199f, this.f19197c, this.f19198e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.f19198e;
                ((MessagesStorage) this.f19196b).lambda$updateTopicData$49(this.f19197c, (TLRPC.TL_forumTopic) this.f19199f, j3, i10);
                return;
            default:
                int i11 = this.f19197c;
                int i12 = this.f19198e;
                ((MessagesStorage) this.f19196b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19199f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f19195a = i12;
        this.f19196b = accountInstance;
        this.f19199f = tLObject;
        this.f19197c = i10;
        this.d = j3;
        this.f19198e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f19195a = 2;
        this.f19196b = mediaDataController;
        this.f19199f = arrayList;
        this.f19197c = i10;
        this.f19198e = i11;
        this.d = j3;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f19195a = 3;
        this.f19196b = messagesStorage;
        this.f19197c = i10;
        this.f19199f = tL_forumTopic;
        this.d = j3;
        this.f19198e = i11;
    }
}
