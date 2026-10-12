package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ad implements Runnable {
    public final int f17079a;
    public final Object f17080b;
    public final long f17081c;
    public final int d;
    public final long f17082e;
    public final Object f17083f;
    public final Object h;
    public final Object f17084n;
    public final Object f17085r;

    public ad(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17079a = 1;
        this.f17080b = messagesController;
        this.f17083f = arrayList;
        this.f17081c = j3;
        this.h = updates_channeldifference;
        this.f17084n = chat;
        this.f17085r = iVar;
        this.d = i10;
        this.f17082e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17079a) {
            case 0:
                ((MessagesController) this.f17080b).lambda$ensureMessagesLoaded$463((boolean[]) this.f17083f, (MessagesStorage) this.h, this.f17081c, (Runnable[]) this.f17084n, this.f17082e, this.d, (MessagesController.MessagesLoadedCallback) this.f17085r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.f17082e;
                ((MessagesController) this.f17080b).lambda$getChannelDifference$346((ArrayList) this.f17083f, this.f17081c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17084n, (a0.i) this.f17085r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17080b).lambda$onReceive$0((AccountInstance) this.f17083f, (TLRPC.User) this.h, (CharSequence) this.f17084n, this.f17081c, this.f17082e, this.d, (int[]) this.f17085r);
                return;
            default:
                ((WearReplyReceiver) this.f17080b).lambda$onReceive$2((AccountInstance) this.f17083f, (TLRPC.Chat) this.h, (CharSequence) this.f17084n, this.f17081c, this.f17082e, this.d, (int[]) this.f17085r);
                return;
        }
    }

    public ad(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17079a = 0;
        this.f17080b = messagesController;
        this.f17083f = zArr;
        this.h = messagesStorage;
        this.f17081c = j3;
        this.f17084n = runnableArr;
        this.f17082e = j10;
        this.d = i10;
        this.f17085r = messagesLoadedCallback;
    }

    public ad(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17079a = i11;
        this.f17080b = wearReplyReceiver;
        this.f17083f = accountInstance;
        this.h = tLObject;
        this.f17084n = charSequence;
        this.f17081c = j3;
        this.f17082e = j10;
        this.d = i10;
        this.f17085r = iArr;
    }
}
