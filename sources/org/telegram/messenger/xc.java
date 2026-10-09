package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc implements Runnable {
    public final int f19803a;
    public final Object f19804b;
    public final long f19805c;
    public final int d;
    public final long f19806e;
    public final Object f19807f;
    public final Object h;
    public final Object f19808n;
    public final Object f19809r;

    public xc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f19803a = 1;
        this.f19804b = messagesController;
        this.f19807f = arrayList;
        this.f19805c = j3;
        this.h = updates_channeldifference;
        this.f19808n = chat;
        this.f19809r = iVar;
        this.d = i10;
        this.f19806e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19803a) {
            case 0:
                ((MessagesController) this.f19804b).lambda$ensureMessagesLoaded$463((boolean[]) this.f19807f, (MessagesStorage) this.h, this.f19805c, (Runnable[]) this.f19808n, this.f19806e, this.d, (MessagesController.MessagesLoadedCallback) this.f19809r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.f19806e;
                ((MessagesController) this.f19804b).lambda$getChannelDifference$346((ArrayList) this.f19807f, this.f19805c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f19808n, (a0.i) this.f19809r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f19804b).lambda$onReceive$0((AccountInstance) this.f19807f, (TLRPC.User) this.h, (CharSequence) this.f19808n, this.f19805c, this.f19806e, this.d, (int[]) this.f19809r);
                return;
            default:
                ((WearReplyReceiver) this.f19804b).lambda$onReceive$2((AccountInstance) this.f19807f, (TLRPC.Chat) this.h, (CharSequence) this.f19808n, this.f19805c, this.f19806e, this.d, (int[]) this.f19809r);
                return;
        }
    }

    public xc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f19803a = 0;
        this.f19804b = messagesController;
        this.f19807f = zArr;
        this.h = messagesStorage;
        this.f19805c = j3;
        this.f19808n = runnableArr;
        this.f19806e = j10;
        this.d = i10;
        this.f19809r = messagesLoadedCallback;
    }

    public xc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f19803a = i11;
        this.f19804b = wearReplyReceiver;
        this.f19807f = accountInstance;
        this.h = tLObject;
        this.f19808n = charSequence;
        this.f19805c = j3;
        this.f19806e = j10;
        this.d = i10;
        this.f19809r = iArr;
    }
}
