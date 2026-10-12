package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ad implements Runnable {
    public final int f16778a;
    public final Object f16779b;
    public final long f16780c;
    public final int d;
    public final long e;
    public final Object f16781f;
    public final Object h;
    public final Object f16782n;
    public final Object f16783r;

    public ad(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f16778a = 1;
        this.f16779b = messagesController;
        this.f16781f = arrayList;
        this.f16780c = j10;
        this.h = updates_channeldifference;
        this.f16782n = chat;
        this.f16783r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f16778a) {
            case 0:
                ((MessagesController) this.f16779b).lambda$ensureMessagesLoaded$463((boolean[]) this.f16781f, (MessagesStorage) this.h, this.f16780c, (Runnable[]) this.f16782n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f16783r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f16779b).lambda$getChannelDifference$346((ArrayList) this.f16781f, this.f16780c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f16782n, (a0.h) this.f16783r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f16779b).lambda$onReceive$0((AccountInstance) this.f16781f, (TLRPC.User) this.h, (CharSequence) this.f16782n, this.f16780c, this.e, this.d, (int[]) this.f16783r);
                return;
            default:
                ((WearReplyReceiver) this.f16779b).lambda$onReceive$2((AccountInstance) this.f16781f, (TLRPC.Chat) this.h, (CharSequence) this.f16782n, this.f16780c, this.e, this.d, (int[]) this.f16783r);
                return;
        }
    }

    public ad(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f16778a = 0;
        this.f16779b = messagesController;
        this.f16781f = zArr;
        this.h = messagesStorage;
        this.f16780c = j10;
        this.f16782n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f16783r = messagesLoadedCallback;
    }

    public ad(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f16778a = i11;
        this.f16779b = wearReplyReceiver;
        this.f16781f = accountInstance;
        this.h = tLObject;
        this.f16782n = charSequence;
        this.f16780c = j10;
        this.e = j11;
        this.d = i10;
        this.f16783r = iArr;
    }
}
