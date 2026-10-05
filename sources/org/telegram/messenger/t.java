package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f19190a;
    public final Object f19191b;
    public final int f19192c;
    public final long d;
    public final int f19193e;
    public final Object f19194f;

    public t(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19190a = 4;
        this.f19191b = messagesStorage;
        this.d = j3;
        this.f19194f = arrayList;
        this.f19192c = i10;
        this.f19193e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19190a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f19191b, (TLRPC.User) this.f19194f, this.f19192c, this.d, this.f19193e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f19191b, (TLRPC.Chat) this.f19194f, this.f19192c, this.d, this.f19193e);
                return;
            case 2:
                ((MediaDataController) this.f19191b).lambda$putStickersToCache$102((ArrayList) this.f19194f, this.f19192c, this.f19193e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.f19193e;
                ((MessagesStorage) this.f19191b).lambda$updateTopicData$49(this.f19192c, (TLRPC.TL_forumTopic) this.f19194f, j3, i10);
                return;
            default:
                int i11 = this.f19192c;
                int i12 = this.f19193e;
                ((MessagesStorage) this.f19191b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19194f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f19190a = i12;
        this.f19191b = accountInstance;
        this.f19194f = tLObject;
        this.f19192c = i10;
        this.d = j3;
        this.f19193e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f19190a = 2;
        this.f19191b = mediaDataController;
        this.f19194f = arrayList;
        this.f19192c = i10;
        this.f19193e = i11;
        this.d = j3;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f19190a = 3;
        this.f19191b = messagesStorage;
        this.f19192c = i10;
        this.f19194f = tL_forumTopic;
        this.d = j3;
        this.f19193e = i11;
    }
}
