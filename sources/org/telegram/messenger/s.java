package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s implements Runnable {
    public final int f19107a;
    public final Object f19108b;
    public final int f19109c;
    public final long d;
    public final int f19110e;
    public final Object f19111f;

    public s(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19107a = 4;
        this.f19108b = messagesStorage;
        this.d = j3;
        this.f19111f = arrayList;
        this.f19109c = i10;
        this.f19110e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19107a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f19108b, (TLRPC.User) this.f19111f, this.f19109c, this.d, this.f19110e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f19108b, (TLRPC.Chat) this.f19111f, this.f19109c, this.d, this.f19110e);
                return;
            case 2:
                ((MediaDataController) this.f19108b).lambda$putStickersToCache$102((ArrayList) this.f19111f, this.f19109c, this.f19110e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.f19110e;
                ((MessagesStorage) this.f19108b).lambda$updateTopicData$49(this.f19109c, (TLRPC.TL_forumTopic) this.f19111f, j3, i10);
                return;
            default:
                int i11 = this.f19109c;
                int i12 = this.f19110e;
                ((MessagesStorage) this.f19108b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f19111f, i11, i12);
                return;
        }
    }

    public s(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f19107a = i12;
        this.f19108b = accountInstance;
        this.f19111f = tLObject;
        this.f19109c = i10;
        this.d = j3;
        this.f19110e = i11;
    }

    public s(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f19107a = 2;
        this.f19108b = mediaDataController;
        this.f19111f = arrayList;
        this.f19109c = i10;
        this.f19110e = i11;
        this.d = j3;
    }

    public s(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f19107a = 3;
        this.f19108b = messagesStorage;
        this.f19109c = i10;
        this.f19111f = tL_forumTopic;
        this.d = j3;
        this.f19110e = i11;
    }
}
