package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f21716a;
    public final Object f21717b;
    public final int f21718c;
    public final long d;
    public final int e;
    public final Object f21719f;

    public w(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f21716a = 4;
        this.f21717b = messagesStorage;
        this.d = j10;
        this.f21719f = arrayList;
        this.f21718c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f21716a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f21717b, (TLRPC.User) this.f21719f, this.f21718c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f21717b, (TLRPC.Chat) this.f21719f, this.f21718c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f21717b).lambda$putStickersToCache$102((ArrayList) this.f21719f, this.f21718c, this.e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f21717b).lambda$updateTopicData$52(this.f21718c, (TLRPC.TL_forumTopic) this.f21719f, j10, i10);
                return;
            default:
                int i11 = this.f21718c;
                int i12 = this.e;
                ((MessagesStorage) this.f21717b).lambda$markMessagesContentAsRead$221(this.d, (ArrayList) this.f21719f, i11, i12);
                return;
        }
    }

    public w(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f21716a = i12;
        this.f21717b = accountInstance;
        this.f21719f = tLObject;
        this.f21718c = i10;
        this.d = j10;
        this.e = i11;
    }

    public w(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f21716a = 2;
        this.f21717b = mediaDataController;
        this.f21719f = arrayList;
        this.f21718c = i10;
        this.e = i11;
        this.d = j10;
    }

    public w(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f21716a = 3;
        this.f21717b = messagesStorage;
        this.f21718c = i10;
        this.f21719f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
