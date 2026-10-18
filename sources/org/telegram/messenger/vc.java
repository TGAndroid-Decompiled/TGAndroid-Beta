package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vc implements Runnable {
    public final int f19742a;
    public final Object f19743b;
    public final long f19744c;
    public final int d;
    public final long e;
    public final Object f19745f;
    public final Object h;
    public final Object f19746n;
    public final Object f19747r;

    public vc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f19742a = 1;
        this.f19743b = messagesController;
        this.f19745f = arrayList;
        this.f19744c = j10;
        this.h = updates_channeldifference;
        this.f19746n = chat;
        this.f19747r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f19742a) {
            case 0:
                ((MessagesController) this.f19743b).lambda$ensureMessagesLoaded$463((boolean[]) this.f19745f, (MessagesStorage) this.h, this.f19744c, (Runnable[]) this.f19746n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f19747r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f19743b).lambda$getChannelDifference$346((ArrayList) this.f19745f, this.f19744c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f19746n, (a0.h) this.f19747r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f19743b).lambda$onReceive$0((AccountInstance) this.f19745f, (TLRPC.User) this.h, (CharSequence) this.f19746n, this.f19744c, this.e, this.d, (int[]) this.f19747r);
                return;
            default:
                ((WearReplyReceiver) this.f19743b).lambda$onReceive$2((AccountInstance) this.f19745f, (TLRPC.Chat) this.h, (CharSequence) this.f19746n, this.f19744c, this.e, this.d, (int[]) this.f19747r);
                return;
        }
    }

    public vc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f19742a = 0;
        this.f19743b = messagesController;
        this.f19745f = zArr;
        this.h = messagesStorage;
        this.f19744c = j10;
        this.f19746n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f19747r = messagesLoadedCallback;
    }

    public vc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f19742a = i11;
        this.f19743b = wearReplyReceiver;
        this.f19745f = accountInstance;
        this.h = tLObject;
        this.f19746n = charSequence;
        this.f19744c = j10;
        this.e = j11;
        this.d = i10;
        this.f19747r = iArr;
    }
}
