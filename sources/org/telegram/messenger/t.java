package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f21592a;
    public final Object f21593b;
    public final int f21594c;
    public final long d;
    public final int f21595e;
    public final Object f21596f;

    public t(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f21592a = 4;
        this.f21593b = messagesStorage;
        this.d = j10;
        this.f21596f = arrayList;
        this.f21594c = i10;
        this.f21595e = i11;
    }

    @Override
    public final void run() {
        switch (this.f21592a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f21593b, (TLRPC.User) this.f21596f, this.f21594c, this.d, this.f21595e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f21593b, (TLRPC.Chat) this.f21596f, this.f21594c, this.d, this.f21595e);
                return;
            case 2:
                ((MediaDataController) this.f21593b).lambda$putStickersToCache$102((ArrayList) this.f21596f, this.f21594c, this.f21595e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.f21595e;
                ((MessagesStorage) this.f21593b).lambda$updateTopicData$49(this.f21594c, (TLRPC.TL_forumTopic) this.f21596f, j10, i10);
                return;
            default:
                int i11 = this.f21594c;
                int i12 = this.f21595e;
                ((MessagesStorage) this.f21593b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f21596f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f21592a = i12;
        this.f21593b = accountInstance;
        this.f21596f = tLObject;
        this.f21594c = i10;
        this.d = j10;
        this.f21595e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f21592a = 2;
        this.f21593b = mediaDataController;
        this.f21596f = arrayList;
        this.f21594c = i10;
        this.f21595e = i11;
        this.d = j10;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f21592a = 3;
        this.f21593b = messagesStorage;
        this.f21594c = i10;
        this.f21596f = tL_forumTopic;
        this.d = j10;
        this.f21595e = i11;
    }
}
