package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kc implements Runnable {
    public final int f20778a;
    public final Object f20779b;
    public final long f20780c;
    public final int d;
    public final long f20781e;
    public final Object f20782f;
    public final Object h;
    public final Object f20783n;
    public final Object f20784r;

    public kc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i9, long j11) {
        this.f20778a = 1;
        this.f20779b = messagesController;
        this.f20782f = arrayList;
        this.f20780c = j10;
        this.h = updates_channeldifference;
        this.f20783n = chat;
        this.f20784r = hVar;
        this.d = i9;
        this.f20781e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20778a) {
            case 0:
                ((MessagesController) this.f20779b).lambda$ensureMessagesLoaded$460((boolean[]) this.f20782f, (MessagesStorage) this.h, this.f20780c, (Runnable[]) this.f20783n, this.f20781e, this.d, (MessagesController.MessagesLoadedCallback) this.f20784r);
                return;
            case 1:
                int i9 = this.d;
                long j10 = this.f20781e;
                ((MessagesController) this.f20779b).lambda$getChannelDifference$347((ArrayList) this.f20782f, this.f20780c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f20783n, (a0.h) this.f20784r, i9, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f20779b).lambda$onReceive$0((AccountInstance) this.f20782f, (TLRPC.User) this.h, (CharSequence) this.f20783n, this.f20780c, this.f20781e, this.d, (int[]) this.f20784r);
                return;
            default:
                ((WearReplyReceiver) this.f20779b).lambda$onReceive$2((AccountInstance) this.f20782f, (TLRPC.Chat) this.h, (CharSequence) this.f20783n, this.f20780c, this.f20781e, this.d, (int[]) this.f20784r);
                return;
        }
    }

    public kc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i9, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f20778a = 0;
        this.f20779b = messagesController;
        this.f20782f = zArr;
        this.h = messagesStorage;
        this.f20780c = j10;
        this.f20783n = runnableArr;
        this.f20781e = j11;
        this.d = i9;
        this.f20784r = messagesLoadedCallback;
    }

    public kc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i9, int[] iArr, int i10) {
        this.f20778a = i10;
        this.f20779b = wearReplyReceiver;
        this.f20782f = accountInstance;
        this.h = tLObject;
        this.f20783n = charSequence;
        this.f20780c = j10;
        this.f20781e = j11;
        this.d = i9;
        this.f20784r = iArr;
    }
}
