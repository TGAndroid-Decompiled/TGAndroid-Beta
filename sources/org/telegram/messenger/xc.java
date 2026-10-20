package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc implements Runnable {
    public final int f20077a;
    public final Object f20078b;
    public final long f20079c;
    public final int d;
    public final long e;
    public final Object f20080f;
    public final Object h;
    public final Object f20081n;
    public final Object f20082r;

    public xc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f20077a = 1;
        this.f20078b = messagesController;
        this.f20080f = arrayList;
        this.f20079c = j10;
        this.h = updates_channeldifference;
        this.f20081n = chat;
        this.f20082r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20077a) {
            case 0:
                ((MessagesController) this.f20078b).lambda$ensureMessagesLoaded$463((boolean[]) this.f20080f, (MessagesStorage) this.h, this.f20079c, (Runnable[]) this.f20081n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f20082r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f20078b).lambda$getChannelDifference$346((ArrayList) this.f20080f, this.f20079c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f20081n, (a0.h) this.f20082r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f20078b).lambda$onReceive$0((AccountInstance) this.f20080f, (TLRPC.User) this.h, (CharSequence) this.f20081n, this.f20079c, this.e, this.d, (int[]) this.f20082r);
                return;
            default:
                ((WearReplyReceiver) this.f20078b).lambda$onReceive$2((AccountInstance) this.f20080f, (TLRPC.Chat) this.h, (CharSequence) this.f20081n, this.f20079c, this.e, this.d, (int[]) this.f20082r);
                return;
        }
    }

    public xc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f20077a = 0;
        this.f20078b = messagesController;
        this.f20080f = zArr;
        this.h = messagesStorage;
        this.f20079c = j10;
        this.f20081n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f20082r = messagesLoadedCallback;
    }

    public xc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f20077a = i11;
        this.f20078b = wearReplyReceiver;
        this.f20080f = accountInstance;
        this.h = tLObject;
        this.f20081n = charSequence;
        this.f20079c = j10;
        this.e = j11;
        this.d = i10;
        this.f20082r = iArr;
    }
}
