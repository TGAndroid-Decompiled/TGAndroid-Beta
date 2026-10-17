package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vc implements Runnable {
    public final int f19741a;
    public final Object f19742b;
    public final long f19743c;
    public final int d;
    public final long e;
    public final Object f19744f;
    public final Object h;
    public final Object f19745n;
    public final Object f19746r;

    public vc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f19741a = 1;
        this.f19742b = messagesController;
        this.f19744f = arrayList;
        this.f19743c = j10;
        this.h = updates_channeldifference;
        this.f19745n = chat;
        this.f19746r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f19741a) {
            case 0:
                ((MessagesController) this.f19742b).lambda$ensureMessagesLoaded$463((boolean[]) this.f19744f, (MessagesStorage) this.h, this.f19743c, (Runnable[]) this.f19745n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f19746r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f19742b).lambda$getChannelDifference$346((ArrayList) this.f19744f, this.f19743c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f19745n, (a0.h) this.f19746r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f19742b).lambda$onReceive$0((AccountInstance) this.f19744f, (TLRPC.User) this.h, (CharSequence) this.f19745n, this.f19743c, this.e, this.d, (int[]) this.f19746r);
                return;
            default:
                ((WearReplyReceiver) this.f19742b).lambda$onReceive$2((AccountInstance) this.f19744f, (TLRPC.Chat) this.h, (CharSequence) this.f19745n, this.f19743c, this.e, this.d, (int[]) this.f19746r);
                return;
        }
    }

    public vc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f19741a = 0;
        this.f19742b = messagesController;
        this.f19744f = zArr;
        this.h = messagesStorage;
        this.f19743c = j10;
        this.f19745n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f19746r = messagesLoadedCallback;
    }

    public vc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f19741a = i11;
        this.f19742b = wearReplyReceiver;
        this.f19744f = accountInstance;
        this.h = tLObject;
        this.f19745n = charSequence;
        this.f19743c = j10;
        this.e = j11;
        this.d = i10;
        this.f19746r = iArr;
    }
}
