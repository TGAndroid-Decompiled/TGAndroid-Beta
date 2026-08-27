package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class t implements Runnable {

    public final int f21588a;

    public final Object f21589b;

    public final int f21590c;
    public final long d;

    public final int f21591e;

    public final Object f21592f;

    public t(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f21588a = 4;
        this.f21589b = messagesStorage;
        this.d = j10;
        this.f21592f = arrayList;
        this.f21590c = i10;
        this.f21591e = i11;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21588a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f21589b, (TLRPC.User) this.f21592f, this.f21590c, this.d, this.f21591e);
                break;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f21589b, (TLRPC.Chat) this.f21592f, this.f21590c, this.d, this.f21591e);
                break;
            case 2:
                ((MediaDataController) this.f21589b).lambda$putStickersToCache$102((ArrayList) this.f21592f, this.f21590c, this.f21591e, this.d);
                break;
            case 3:
                ((MessagesStorage) this.f21589b).lambda$updateTopicData$49(this.f21590c, (TLRPC.TL_forumTopic) this.f21592f, this.d, this.f21591e);
                break;
            default:
                ((MessagesStorage) this.f21589b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f21592f, this.f21590c, this.f21591e);
                break;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f21588a = i12;
        this.f21589b = accountInstance;
        this.f21592f = tLObject;
        this.f21590c = i10;
        this.d = j10;
        this.f21591e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f21588a = 2;
        this.f21589b = mediaDataController;
        this.f21592f = arrayList;
        this.f21590c = i10;
        this.f21591e = i11;
        this.d = j10;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f21588a = 3;
        this.f21589b = messagesStorage;
        this.f21590c = i10;
        this.f21592f = tL_forumTopic;
        this.d = j10;
        this.f21591e = i11;
    }
}
