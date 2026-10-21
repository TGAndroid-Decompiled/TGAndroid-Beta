package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc implements Runnable {
    public final int f20074a;
    public final Object f20075b;
    public final long f20076c;
    public final int d;
    public final long e;
    public final Object f20077f;
    public final Object h;
    public final Object f20078n;
    public final Object f20079r;

    public xc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f20074a = 1;
        this.f20075b = messagesController;
        this.f20077f = arrayList;
        this.f20076c = j10;
        this.h = updates_channeldifference;
        this.f20078n = chat;
        this.f20079r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20074a) {
            case 0:
                ((MessagesController) this.f20075b).lambda$ensureMessagesLoaded$463((boolean[]) this.f20077f, (MessagesStorage) this.h, this.f20076c, (Runnable[]) this.f20078n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f20079r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f20075b).lambda$getChannelDifference$346((ArrayList) this.f20077f, this.f20076c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f20078n, (a0.h) this.f20079r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f20075b).lambda$onReceive$0((AccountInstance) this.f20077f, (TLRPC.User) this.h, (CharSequence) this.f20078n, this.f20076c, this.e, this.d, (int[]) this.f20079r);
                return;
            default:
                ((WearReplyReceiver) this.f20075b).lambda$onReceive$2((AccountInstance) this.f20077f, (TLRPC.Chat) this.h, (CharSequence) this.f20078n, this.f20076c, this.e, this.d, (int[]) this.f20079r);
                return;
        }
    }

    public xc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f20074a = 0;
        this.f20075b = messagesController;
        this.f20077f = zArr;
        this.h = messagesStorage;
        this.f20076c = j10;
        this.f20078n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f20079r = messagesLoadedCallback;
    }

    public xc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f20074a = i11;
        this.f20075b = wearReplyReceiver;
        this.f20077f = accountInstance;
        this.h = tLObject;
        this.f20078n = charSequence;
        this.f20076c = j10;
        this.e = j11;
        this.d = i10;
        this.f20079r = iArr;
    }
}
