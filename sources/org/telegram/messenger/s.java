package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s implements Runnable {
    public final int f19108a;
    public final Object f19109b;
    public final int f19110c;
    public final long d;
    public final int f19111e;
    public final Object f19112f;

    public s(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19108a = 4;
        this.f19109b = messagesStorage;
        this.d = j3;
        this.f19112f = arrayList;
        this.f19110c = i10;
        this.f19111e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19108a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f19109b, (TLRPC.User) this.f19112f, this.f19110c, this.d, this.f19111e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f19109b, (TLRPC.Chat) this.f19112f, this.f19110c, this.d, this.f19111e);
                return;
            case 2:
                ((MediaDataController) this.f19109b).lambda$putStickersToCache$102((ArrayList) this.f19112f, this.f19110c, this.f19111e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.f19111e;
                ((MessagesStorage) this.f19109b).lambda$updateTopicData$49(this.f19110c, (TLRPC.TL_forumTopic) this.f19112f, j3, i10);
                return;
            default:
                int i11 = this.f19110c;
                int i12 = this.f19111e;
                ((MessagesStorage) this.f19109b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19112f, i11, i12);
                return;
        }
    }

    public s(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f19108a = i12;
        this.f19109b = accountInstance;
        this.f19112f = tLObject;
        this.f19110c = i10;
        this.d = j3;
        this.f19111e = i11;
    }

    public s(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f19108a = 2;
        this.f19109b = mediaDataController;
        this.f19112f = arrayList;
        this.f19110c = i10;
        this.f19111e = i11;
        this.d = j3;
    }

    public s(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f19108a = 3;
        this.f19109b = messagesStorage;
        this.f19110c = i10;
        this.f19112f = tL_forumTopic;
        this.d = j3;
        this.f19111e = i11;
    }
}
