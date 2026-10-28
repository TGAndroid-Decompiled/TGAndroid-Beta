package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f21704a;
    public final Object f21705b;
    public final int f21706c;
    public final long d;
    public final int e;
    public final Object f21707f;

    public w(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f21704a = 4;
        this.f21705b = messagesStorage;
        this.d = j10;
        this.f21707f = arrayList;
        this.f21706c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f21704a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.f21705b, (TLRPC.User) this.f21707f, this.f21706c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.f21705b, (TLRPC.Chat) this.f21707f, this.f21706c, this.d, this.e);
                return;
            case 2:
                ((MediaDataController) this.f21705b).lambda$putStickersToCache$102((ArrayList) this.f21707f, this.f21706c, this.e, this.d);
                return;
            case 3:
                long j10 = this.d;
                int i10 = this.e;
                ((MessagesStorage) this.f21705b).lambda$updateTopicData$52(this.f21706c, (TLRPC.TL_forumTopic) this.f21707f, j10, i10);
                return;
            default:
                int i11 = this.f21706c;
                int i12 = this.e;
                ((MessagesStorage) this.f21705b).lambda$markMessagesContentAsRead$222(this.d, (ArrayList) this.f21707f, i11, i12);
                return;
        }
    }

    public w(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f21704a = i12;
        this.f21705b = accountInstance;
        this.f21707f = tLObject;
        this.f21706c = i10;
        this.d = j10;
        this.e = i11;
    }

    public w(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.f21704a = 2;
        this.f21705b = mediaDataController;
        this.f21707f = arrayList;
        this.f21706c = i10;
        this.e = i11;
        this.d = j10;
    }

    public w(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f21704a = 3;
        this.f21705b = messagesStorage;
        this.f21706c = i10;
        this.f21707f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
