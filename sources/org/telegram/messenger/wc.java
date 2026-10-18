package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wc implements Runnable {
    public final int f19976a;
    public final Object f19977b;
    public final long f19978c;
    public final int d;
    public final long e;
    public final Object f19979f;
    public final Object h;
    public final Object f19980n;
    public final Object f19981r;

    public wc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f19976a = 1;
        this.f19977b = messagesController;
        this.f19979f = arrayList;
        this.f19978c = j10;
        this.h = updates_channeldifference;
        this.f19980n = chat;
        this.f19981r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f19976a) {
            case 0:
                ((MessagesController) this.f19977b).lambda$ensureMessagesLoaded$463((boolean[]) this.f19979f, (MessagesStorage) this.h, this.f19978c, (Runnable[]) this.f19980n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f19981r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f19977b).lambda$getChannelDifference$346((ArrayList) this.f19979f, this.f19978c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f19980n, (a0.h) this.f19981r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f19977b).lambda$onReceive$0((AccountInstance) this.f19979f, (TLRPC.User) this.h, (CharSequence) this.f19980n, this.f19978c, this.e, this.d, (int[]) this.f19981r);
                return;
            default:
                ((WearReplyReceiver) this.f19977b).lambda$onReceive$2((AccountInstance) this.f19979f, (TLRPC.Chat) this.h, (CharSequence) this.f19980n, this.f19978c, this.e, this.d, (int[]) this.f19981r);
                return;
        }
    }

    public wc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f19976a = 0;
        this.f19977b = messagesController;
        this.f19979f = zArr;
        this.h = messagesStorage;
        this.f19978c = j10;
        this.f19980n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f19981r = messagesLoadedCallback;
    }

    public wc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f19976a = i11;
        this.f19977b = wearReplyReceiver;
        this.f19979f = accountInstance;
        this.h = tLObject;
        this.f19980n = charSequence;
        this.f19978c = j10;
        this.e = j11;
        this.d = i10;
        this.f19981r = iArr;
    }
}
