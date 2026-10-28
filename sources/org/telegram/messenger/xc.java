package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc implements Runnable {
    public final int f21832a;
    public final Object f21833b;
    public final long f21834c;
    public final int d;
    public final long e;
    public final Object f21835f;
    public final Object h;
    public final Object f21836n;
    public final Object f21837r;

    public xc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f21832a = 1;
        this.f21833b = messagesController;
        this.f21835f = arrayList;
        this.f21834c = j10;
        this.h = updates_channeldifference;
        this.f21836n = chat;
        this.f21837r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f21832a) {
            case 0:
                ((MessagesController) this.f21833b).lambda$ensureMessagesLoaded$466((boolean[]) this.f21835f, (MessagesStorage) this.h, this.f21834c, (Runnable[]) this.f21836n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f21837r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f21833b).lambda$getChannelDifference$348((ArrayList) this.f21835f, this.f21834c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f21836n, (a0.h) this.f21837r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f21833b).lambda$onReceive$0((AccountInstance) this.f21835f, (TLRPC.User) this.h, (CharSequence) this.f21836n, this.f21834c, this.e, this.d, (int[]) this.f21837r);
                return;
            default:
                ((WearReplyReceiver) this.f21833b).lambda$onReceive$2((AccountInstance) this.f21835f, (TLRPC.Chat) this.h, (CharSequence) this.f21836n, this.f21834c, this.e, this.d, (int[]) this.f21837r);
                return;
        }
    }

    public xc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f21832a = 0;
        this.f21833b = messagesController;
        this.f21835f = zArr;
        this.h = messagesStorage;
        this.f21834c = j10;
        this.f21836n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f21837r = messagesLoadedCallback;
    }

    public xc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f21832a = i11;
        this.f21833b = wearReplyReceiver;
        this.f21835f = accountInstance;
        this.h = tLObject;
        this.f21836n = charSequence;
        this.f21834c = j10;
        this.e = j11;
        this.d = i10;
        this.f21837r = iArr;
    }
}
