package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rc implements Runnable {
    public final int f19862a;
    public final Object f19863b;
    public final long f19864c;
    public final int d;
    public final long f19865e;
    public final Object f19866f;
    public final Object h;
    public final Object f19867n;
    public final Object f19868r;

    public rc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f19862a = 1;
        this.f19863b = messagesController;
        this.f19866f = arrayList;
        this.f19864c = j10;
        this.h = updates_channeldifference;
        this.f19867n = chat;
        this.f19868r = hVar;
        this.d = i10;
        this.f19865e = j11;
    }

    @Override
    public final void run() {
        switch (this.f19862a) {
            case 0:
                ((MessagesController) this.f19863b).lambda$ensureMessagesLoaded$460((boolean[]) this.f19866f, (MessagesStorage) this.h, this.f19864c, (Runnable[]) this.f19867n, this.f19865e, this.d, (MessagesController.MessagesLoadedCallback) this.f19868r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.f19865e;
                ((MessagesController) this.f19863b).lambda$getChannelDifference$347((ArrayList) this.f19866f, this.f19864c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f19867n, (a0.h) this.f19868r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f19863b).lambda$onReceive$0((AccountInstance) this.f19866f, (TLRPC.User) this.h, (CharSequence) this.f19867n, this.f19864c, this.f19865e, this.d, (int[]) this.f19868r);
                return;
            default:
                ((WearReplyReceiver) this.f19863b).lambda$onReceive$2((AccountInstance) this.f19866f, (TLRPC.Chat) this.h, (CharSequence) this.f19867n, this.f19864c, this.f19865e, this.d, (int[]) this.f19868r);
                return;
        }
    }

    public rc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f19862a = 0;
        this.f19863b = messagesController;
        this.f19866f = zArr;
        this.h = messagesStorage;
        this.f19864c = j10;
        this.f19867n = runnableArr;
        this.f19865e = j11;
        this.d = i10;
        this.f19868r = messagesLoadedCallback;
    }

    public rc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f19862a = i11;
        this.f19863b = wearReplyReceiver;
        this.f19866f = accountInstance;
        this.h = tLObject;
        this.f19867n = charSequence;
        this.f19864c = j10;
        this.f19865e = j11;
        this.d = i10;
        this.f19868r = iArr;
    }
}
