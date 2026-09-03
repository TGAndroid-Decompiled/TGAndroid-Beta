package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f18423a;
    public final Object f18424b;
    public final int f18425c;
    public final long d;
    public final int e;
    public final Object f18426f;

    public t(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f18423a = 4;
        this.f18424b = messagesStorage;
        this.d = j10;
        this.f18426f = arrayList;
        this.f18425c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18423a) {
            case 0:
                AutoMessageHeardReceiver.c((AccountInstance) this.f18424b, (TLRPC.User) this.f18426f, this.f18425c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.d((AccountInstance) this.f18424b, (TLRPC.Chat) this.f18426f, this.f18425c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f18424b).lambda$putStickersToCache$102((ArrayList) this.f18426f, this.f18425c, this.e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f18424b).lambda$updateTopicData$49(this.f18425c, (TLRPC.TL_forumTopic) this.f18426f, j10, i10);
                return;
            default:
                int i11 = this.f18425c;
                int i12 = this.e;
                ((MessagesStorage) this.f18424b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f18426f, i11, i12);
                return;
        }
    }

    public t(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f18423a = i12;
        this.f18424b = accountInstance;
        this.f18426f = tLObject;
        this.f18425c = i10;
        this.d = j10;
        this.e = i11;
    }

    public t(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f18423a = 2;
        this.f18424b = mediaDataController;
        this.f18426f = arrayList;
        this.f18425c = i10;
        this.e = i11;
        this.d = j10;
    }

    public t(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f18423a = 3;
        this.f18424b = messagesStorage;
        this.f18425c = i10;
        this.f18426f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
