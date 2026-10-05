package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f18877a;
    public final Object f18878b;
    public final long f18879c;
    public final int d;
    public final long f18880e;
    public final Object f18881f;
    public final Object h;
    public final Object f18882n;
    public final Object f18883r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f18877a = 1;
        this.f18878b = messagesController;
        this.f18881f = arrayList;
        this.f18879c = j3;
        this.h = updates_channeldifference;
        this.f18882n = chat;
        this.f18883r = iVar;
        this.d = i10;
        this.f18880e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18877a) {
            case 0:
                ((MessagesController) this.f18878b).lambda$ensureMessagesLoaded$460((boolean[]) this.f18881f, (MessagesStorage) this.h, this.f18879c, (Runnable[]) this.f18882n, this.f18880e, this.d, (MessagesController.MessagesLoadedCallback) this.f18883r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.f18880e;
                ((MessagesController) this.f18878b).lambda$getChannelDifference$347((ArrayList) this.f18881f, this.f18879c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f18882n, (a0.i) this.f18883r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f18878b).lambda$onReceive$0((AccountInstance) this.f18881f, (TLRPC.User) this.h, (CharSequence) this.f18882n, this.f18879c, this.f18880e, this.d, (int[]) this.f18883r);
                return;
            default:
                ((WearReplyReceiver) this.f18878b).lambda$onReceive$2((AccountInstance) this.f18881f, (TLRPC.Chat) this.h, (CharSequence) this.f18882n, this.f18879c, this.f18880e, this.d, (int[]) this.f18883r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f18877a = 0;
        this.f18878b = messagesController;
        this.f18881f = zArr;
        this.h = messagesStorage;
        this.f18879c = j3;
        this.f18882n = runnableArr;
        this.f18880e = j10;
        this.d = i10;
        this.f18883r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f18877a = i11;
        this.f18878b = wearReplyReceiver;
        this.f18881f = accountInstance;
        this.h = tLObject;
        this.f18882n = charSequence;
        this.f18879c = j3;
        this.f18880e = j10;
        this.d = i10;
        this.f18883r = iArr;
    }
}
