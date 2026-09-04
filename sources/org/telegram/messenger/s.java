package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s implements Runnable {
    public final int f18933a;
    public final Object f18934b;
    public final int f18935c;
    public final long d;
    public final int f18936e;
    public final Object f18937f;

    public s(int i10, int i11, long j3, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f18933a = 4;
        this.f18934b = messagesStorage;
        this.d = j3;
        this.f18937f = arrayList;
        this.f18935c = i10;
        this.f18936e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18933a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f18934b, (TLRPC.User) this.f18937f, this.f18935c, this.d, this.f18936e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f18934b, (TLRPC.Chat) this.f18937f, this.f18935c, this.d, this.f18936e);
                return;
            case 2:
                ((MediaDataController) this.f18934b).lambda$putStickersToCache$102((ArrayList) this.f18937f, this.f18935c, this.f18936e, this.d);
                return;
            case 3:
                long j3 = this.d;
                int i10 = this.f18936e;
                ((MessagesStorage) this.f18934b).lambda$updateTopicData$49(this.f18935c, (TLRPC.TL_forumTopic) this.f18937f, j3, i10);
                return;
            default:
                int i11 = this.f18935c;
                int i12 = this.f18936e;
                ((MessagesStorage) this.f18934b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f18937f, i11, i12);
                return;
        }
    }

    public s(AccountInstance accountInstance, TLObject tLObject, int i10, long j3, int i11, int i12) {
        this.f18933a = i12;
        this.f18934b = accountInstance;
        this.f18937f = tLObject;
        this.f18935c = i10;
        this.d = j3;
        this.f18936e = i11;
    }

    public s(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j3) {
        this.f18933a = 2;
        this.f18934b = mediaDataController;
        this.f18937f = arrayList;
        this.f18935c = i10;
        this.f18936e = i11;
        this.d = j3;
    }

    public s(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11) {
        this.f18933a = 3;
        this.f18934b = messagesStorage;
        this.f18935c = i10;
        this.f18937f = tL_forumTopic;
        this.d = j3;
        this.f18936e = i11;
    }
}
