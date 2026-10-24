package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ad implements Runnable {
    public final int f17927a;
    public final Object f17928b;
    public final long f17929c;
    public final int d;
    public final long e;
    public final Object f17930f;
    public final Object h;
    public final Object f17931n;
    public final Object f17932r;

    public ad(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f17927a = 1;
        this.f17928b = messagesController;
        this.f17930f = arrayList;
        this.f17929c = j10;
        this.h = updates_channeldifference;
        this.f17931n = chat;
        this.f17932r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f17927a) {
            case 0:
                ((MessagesController) this.f17928b).lambda$ensureMessagesLoaded$463((boolean[]) this.f17930f, (MessagesStorage) this.h, this.f17929c, (Runnable[]) this.f17931n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17932r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f17928b).lambda$getChannelDifference$346((ArrayList) this.f17930f, this.f17929c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17931n, (a0.h) this.f17932r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f17928b).lambda$onReceive$0((AccountInstance) this.f17930f, (TLRPC.User) this.h, (CharSequence) this.f17931n, this.f17929c, this.e, this.d, (int[]) this.f17932r);
                return;
            default:
                ((WearReplyReceiver) this.f17928b).lambda$onReceive$2((AccountInstance) this.f17930f, (TLRPC.Chat) this.h, (CharSequence) this.f17931n, this.f17929c, this.e, this.d, (int[]) this.f17932r);
                return;
        }
    }

    public ad(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17927a = 0;
        this.f17928b = messagesController;
        this.f17930f = zArr;
        this.h = messagesStorage;
        this.f17929c = j10;
        this.f17931n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f17932r = messagesLoadedCallback;
    }

    public ad(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f17927a = i11;
        this.f17928b = wearReplyReceiver;
        this.f17930f = accountInstance;
        this.h = tLObject;
        this.f17931n = charSequence;
        this.f17929c = j10;
        this.e = j11;
        this.d = i10;
        this.f17932r = iArr;
    }
}
