package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f19185a;
    public final Object f19186b;
    public final int f19187c;
    public final long d;
    public final int f19188e;
    public final Object f19189f;

    public t(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19185a = 4;
        this.f19186b = messagesStorage;
        this.d = j3;
        this.f19189f = arrayList;
        this.f19187c = i10;
        this.f19188e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19185a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f19186b, (TLRPC.User) this.f19189f, this.f19187c, this.d, this.f19188e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f19186b, (TLRPC.Chat) this.f19189f, this.f19187c, this.d, this.f19188e);
                return;
            case 2:
                ((MediaDataController) this.f19186b).lambda$putStickersToCache$102((ArrayList) this.f19189f, this.f19187c, this.f19188e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.f19188e;
                ((MessagesStorage) this.f19186b).lambda$updateTopicData$49(this.f19187c, (TLRPC.TL_forumTopic) this.f19189f, j3, i10);
                return;
            default:
                int i11 = this.f19187c;
                int i12 = this.f19188e;
                ((MessagesStorage) this.f19186b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19189f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f19185a = i12;
        this.f19186b = accountInstance;
        this.f19189f = tLObject;
        this.f19187c = i10;
        this.d = j3;
        this.f19188e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f19185a = 2;
        this.f19186b = mediaDataController;
        this.f19189f = arrayList;
        this.f19187c = i10;
        this.f19188e = i11;
        this.d = j3;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f19185a = 3;
        this.f19186b = messagesStorage;
        this.f19187c = i10;
        this.f19189f = tL_forumTopic;
        this.d = j3;
        this.f19188e = i11;
    }
}
