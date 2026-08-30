package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rc implements Runnable {
    public final int f18295a;
    public final Object f18296b;
    public final long f18297c;
    public final int d;
    public final long e;
    public final Object f18298f;
    public final Object h;
    public final Object f18299n;
    public final Object f18300r;

    public rc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f18295a = 1;
        this.f18296b = messagesController;
        this.f18298f = arrayList;
        this.f18297c = j10;
        this.h = updates_channeldifference;
        this.f18299n = chat;
        this.f18300r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18295a) {
            case 0:
                ((MessagesController) this.f18296b).lambda$ensureMessagesLoaded$460((boolean[]) this.f18298f, (MessagesStorage) this.h, this.f18297c, (Runnable[]) this.f18299n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f18300r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f18296b).lambda$getChannelDifference$347((ArrayList) this.f18298f, this.f18297c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f18299n, (a0.h) this.f18300r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f18296b).lambda$onReceive$0((AccountInstance) this.f18298f, (TLRPC.User) this.h, (CharSequence) this.f18299n, this.f18297c, this.e, this.d, (int[]) this.f18300r);
                return;
            default:
                ((WearReplyReceiver) this.f18296b).lambda$onReceive$2((AccountInstance) this.f18298f, (TLRPC.Chat) this.h, (CharSequence) this.f18299n, this.f18297c, this.e, this.d, (int[]) this.f18300r);
                return;
        }
    }

    public rc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f18295a = 0;
        this.f18296b = messagesController;
        this.f18298f = zArr;
        this.h = messagesStorage;
        this.f18297c = j10;
        this.f18299n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f18300r = messagesLoadedCallback;
    }

    public rc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f18295a = i11;
        this.f18296b = wearReplyReceiver;
        this.f18298f = accountInstance;
        this.h = tLObject;
        this.f18299n = charSequence;
        this.f18297c = j10;
        this.e = j11;
        this.d = i10;
        this.f18300r = iArr;
    }
}
