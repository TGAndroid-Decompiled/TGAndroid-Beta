package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vc implements Runnable {
    public final int f19739a;
    public final Object f19740b;
    public final long f19741c;
    public final int d;
    public final long e;
    public final Object f19742f;
    public final Object h;
    public final Object f19743n;
    public final Object f19744r;

    public vc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f19739a = 1;
        this.f19740b = messagesController;
        this.f19742f = arrayList;
        this.f19741c = j10;
        this.h = updates_channeldifference;
        this.f19743n = chat;
        this.f19744r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f19739a) {
            case 0:
                ((MessagesController) this.f19740b).lambda$ensureMessagesLoaded$463((boolean[]) this.f19742f, (MessagesStorage) this.h, this.f19741c, (Runnable[]) this.f19743n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f19744r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f19740b).lambda$getChannelDifference$346((ArrayList) this.f19742f, this.f19741c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f19743n, (a0.h) this.f19744r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f19740b).lambda$onReceive$0((AccountInstance) this.f19742f, (TLRPC.User) this.h, (CharSequence) this.f19743n, this.f19741c, this.e, this.d, (int[]) this.f19744r);
                return;
            default:
                ((WearReplyReceiver) this.f19740b).lambda$onReceive$2((AccountInstance) this.f19742f, (TLRPC.Chat) this.h, (CharSequence) this.f19743n, this.f19741c, this.e, this.d, (int[]) this.f19744r);
                return;
        }
    }

    public vc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f19739a = 0;
        this.f19740b = messagesController;
        this.f19742f = zArr;
        this.h = messagesStorage;
        this.f19741c = j10;
        this.f19743n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f19744r = messagesLoadedCallback;
    }

    public vc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f19739a = i11;
        this.f19740b = wearReplyReceiver;
        this.f19742f = accountInstance;
        this.h = tLObject;
        this.f19743n = charSequence;
        this.f19741c = j10;
        this.e = j11;
        this.d = i10;
        this.f19744r = iArr;
    }
}
