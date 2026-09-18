package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f17211a;
    public final Object f17212b;
    public final long f17213c;
    public final int d;
    public final long e;
    public final Object f17214f;
    public final Object h;
    public final Object f17215n;
    public final Object f17216r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17211a = 1;
        this.f17212b = messagesController;
        this.f17214f = arrayList;
        this.f17213c = j3;
        this.h = updates_channeldifference;
        this.f17215n = chat;
        this.f17216r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17211a) {
            case 0:
                ((MessagesController) this.f17212b).lambda$ensureMessagesLoaded$460((boolean[]) this.f17214f, (MessagesStorage) this.h, this.f17213c, (Runnable[]) this.f17215n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17216r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.e;
                ((MessagesController) this.f17212b).lambda$getChannelDifference$347((ArrayList) this.f17214f, this.f17213c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17215n, (a0.i) this.f17216r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17212b).lambda$onReceive$0((AccountInstance) this.f17214f, (TLRPC.User) this.h, (CharSequence) this.f17215n, this.f17213c, this.e, this.d, (int[]) this.f17216r);
                return;
            default:
                ((WearReplyReceiver) this.f17212b).lambda$onReceive$2((AccountInstance) this.f17214f, (TLRPC.Chat) this.h, (CharSequence) this.f17215n, this.f17213c, this.e, this.d, (int[]) this.f17216r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17211a = 0;
        this.f17212b = messagesController;
        this.f17214f = zArr;
        this.h = messagesStorage;
        this.f17213c = j3;
        this.f17215n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.f17216r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17211a = i11;
        this.f17212b = wearReplyReceiver;
        this.f17214f = accountInstance;
        this.h = tLObject;
        this.f17215n = charSequence;
        this.f17213c = j3;
        this.e = j10;
        this.d = i10;
        this.f17216r = iArr;
    }
}
