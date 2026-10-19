package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wc implements Runnable {
    public final int f19979a;
    public final Object f19980b;
    public final long f19981c;
    public final int d;
    public final long e;
    public final Object f19982f;
    public final Object h;
    public final Object f19983n;
    public final Object f19984r;

    public wc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f19979a = 1;
        this.f19980b = messagesController;
        this.f19982f = arrayList;
        this.f19981c = j10;
        this.h = updates_channeldifference;
        this.f19983n = chat;
        this.f19984r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f19979a) {
            case 0:
                ((MessagesController) this.f19980b).lambda$ensureMessagesLoaded$463((boolean[]) this.f19982f, (MessagesStorage) this.h, this.f19981c, (Runnable[]) this.f19983n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f19984r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f19980b).lambda$getChannelDifference$346((ArrayList) this.f19982f, this.f19981c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f19983n, (a0.h) this.f19984r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f19980b).lambda$onReceive$0((AccountInstance) this.f19982f, (TLRPC.User) this.h, (CharSequence) this.f19983n, this.f19981c, this.e, this.d, (int[]) this.f19984r);
                return;
            default:
                ((WearReplyReceiver) this.f19980b).lambda$onReceive$2((AccountInstance) this.f19982f, (TLRPC.Chat) this.h, (CharSequence) this.f19983n, this.f19981c, this.e, this.d, (int[]) this.f19984r);
                return;
        }
    }

    public wc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f19979a = 0;
        this.f19980b = messagesController;
        this.f19982f = zArr;
        this.h = messagesStorage;
        this.f19981c = j10;
        this.f19983n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f19984r = messagesLoadedCallback;
    }

    public wc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f19979a = i11;
        this.f19980b = wearReplyReceiver;
        this.f19982f = accountInstance;
        this.h = tLObject;
        this.f19983n = charSequence;
        this.f19981c = j10;
        this.e = j11;
        this.d = i10;
        this.f19984r = iArr;
    }
}
