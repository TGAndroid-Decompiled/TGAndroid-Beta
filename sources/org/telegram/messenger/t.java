package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f19233a;
    public final Object f19234b;
    public final int f19235c;
    public final long d;
    public final int f19236e;
    public final Object f19237f;

    public t(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19233a = 4;
        this.f19234b = messagesStorage;
        this.d = j3;
        this.f19237f = arrayList;
        this.f19235c = i10;
        this.f19236e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19233a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f19234b, (TLRPC.User) this.f19237f, this.f19235c, this.d, this.f19236e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f19234b, (TLRPC.Chat) this.f19237f, this.f19235c, this.d, this.f19236e);
                return;
            case 2:
                ((MediaDataController) this.f19234b).lambda$putStickersToCache$102((ArrayList) this.f19237f, this.f19235c, this.f19236e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.f19236e;
                ((MessagesStorage) this.f19234b).lambda$updateTopicData$49(this.f19235c, (TLRPC.TL_forumTopic) this.f19237f, j3, i10);
                return;
            default:
                int i11 = this.f19235c;
                int i12 = this.f19236e;
                ((MessagesStorage) this.f19234b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19237f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f19233a = i12;
        this.f19234b = accountInstance;
        this.f19237f = tLObject;
        this.f19235c = i10;
        this.d = j3;
        this.f19236e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f19233a = 2;
        this.f19234b = mediaDataController;
        this.f19237f = arrayList;
        this.f19235c = i10;
        this.f19236e = i11;
        this.d = j3;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f19233a = 3;
        this.f19234b = messagesStorage;
        this.f19235c = i10;
        this.f19237f = tL_forumTopic;
        this.d = j3;
        this.f19236e = i11;
    }
}
