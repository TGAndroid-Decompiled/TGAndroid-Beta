package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc implements Runnable {
    public final int f19836a;
    public final Object f19837b;
    public final long f19838c;
    public final int d;
    public final long f19839e;
    public final Object f19840f;
    public final Object h;
    public final Object f19841n;
    public final Object f19842r;

    public xc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f19836a = 1;
        this.f19837b = messagesController;
        this.f19840f = arrayList;
        this.f19838c = j3;
        this.h = updates_channeldifference;
        this.f19841n = chat;
        this.f19842r = iVar;
        this.d = i10;
        this.f19839e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19836a) {
            case 0:
                ((MessagesController) this.f19837b).lambda$ensureMessagesLoaded$463((boolean[]) this.f19840f, (MessagesStorage) this.h, this.f19838c, (Runnable[]) this.f19841n, this.f19839e, this.d, (MessagesController.MessagesLoadedCallback) this.f19842r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.f19839e;
                ((MessagesController) this.f19837b).lambda$getChannelDifference$346((ArrayList) this.f19840f, this.f19838c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f19841n, (a0.i) this.f19842r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f19837b).lambda$onReceive$0((AccountInstance) this.f19840f, (TLRPC.User) this.h, (CharSequence) this.f19841n, this.f19838c, this.f19839e, this.d, (int[]) this.f19842r);
                return;
            default:
                ((WearReplyReceiver) this.f19837b).lambda$onReceive$2((AccountInstance) this.f19840f, (TLRPC.Chat) this.h, (CharSequence) this.f19841n, this.f19838c, this.f19839e, this.d, (int[]) this.f19842r);
                return;
        }
    }

    public xc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f19836a = 0;
        this.f19837b = messagesController;
        this.f19840f = zArr;
        this.h = messagesStorage;
        this.f19838c = j3;
        this.f19841n = runnableArr;
        this.f19839e = j10;
        this.d = i10;
        this.f19842r = messagesLoadedCallback;
    }

    public xc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f19836a = i11;
        this.f19837b = wearReplyReceiver;
        this.f19840f = accountInstance;
        this.h = tLObject;
        this.f19841n = charSequence;
        this.f19838c = j3;
        this.f19839e = j10;
        this.d = i10;
        this.f19842r = iArr;
    }
}
