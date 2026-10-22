package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ad implements Runnable {
    public final int f17864a;
    public final Object f17865b;
    public final long f17866c;
    public final int d;
    public final long e;
    public final Object f17867f;
    public final Object h;
    public final Object f17868n;
    public final Object f17869r;

    public ad(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f17864a = 1;
        this.f17865b = messagesController;
        this.f17867f = arrayList;
        this.f17866c = j10;
        this.h = updates_channeldifference;
        this.f17868n = chat;
        this.f17869r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f17864a) {
            case 0:
                ((MessagesController) this.f17865b).lambda$ensureMessagesLoaded$463((boolean[]) this.f17867f, (MessagesStorage) this.h, this.f17866c, (Runnable[]) this.f17868n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17869r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f17865b).lambda$getChannelDifference$346((ArrayList) this.f17867f, this.f17866c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17868n, (a0.h) this.f17869r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f17865b).lambda$onReceive$0((AccountInstance) this.f17867f, (TLRPC.User) this.h, (CharSequence) this.f17868n, this.f17866c, this.e, this.d, (int[]) this.f17869r);
                return;
            default:
                ((WearReplyReceiver) this.f17865b).lambda$onReceive$2((AccountInstance) this.f17867f, (TLRPC.Chat) this.h, (CharSequence) this.f17868n, this.f17866c, this.e, this.d, (int[]) this.f17869r);
                return;
        }
    }

    public ad(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17864a = 0;
        this.f17865b = messagesController;
        this.f17867f = zArr;
        this.h = messagesStorage;
        this.f17866c = j10;
        this.f17868n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f17869r = messagesLoadedCallback;
    }

    public ad(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f17864a = i11;
        this.f17865b = wearReplyReceiver;
        this.f17867f = accountInstance;
        this.h = tLObject;
        this.f17868n = charSequence;
        this.f17866c = j10;
        this.e = j11;
        this.d = i10;
        this.f17869r = iArr;
    }
}
