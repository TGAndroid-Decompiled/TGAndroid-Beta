package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ad implements Runnable {
    public final int f17078a;
    public final Object f17079b;
    public final long f17080c;
    public final int d;
    public final long f17081e;
    public final Object f17082f;
    public final Object h;
    public final Object f17083n;
    public final Object f17084r;

    public ad(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17078a = 1;
        this.f17079b = messagesController;
        this.f17082f = arrayList;
        this.f17080c = j3;
        this.h = updates_channeldifference;
        this.f17083n = chat;
        this.f17084r = iVar;
        this.d = i10;
        this.f17081e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17078a) {
            case 0:
                ((MessagesController) this.f17079b).lambda$ensureMessagesLoaded$463((boolean[]) this.f17082f, (MessagesStorage) this.h, this.f17080c, (Runnable[]) this.f17083n, this.f17081e, this.d, (MessagesController.MessagesLoadedCallback) this.f17084r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.f17081e;
                ((MessagesController) this.f17079b).lambda$getChannelDifference$346((ArrayList) this.f17082f, this.f17080c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17083n, (a0.i) this.f17084r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17079b).lambda$onReceive$0((AccountInstance) this.f17082f, (TLRPC.User) this.h, (CharSequence) this.f17083n, this.f17080c, this.f17081e, this.d, (int[]) this.f17084r);
                return;
            default:
                ((WearReplyReceiver) this.f17079b).lambda$onReceive$2((AccountInstance) this.f17082f, (TLRPC.Chat) this.h, (CharSequence) this.f17083n, this.f17080c, this.f17081e, this.d, (int[]) this.f17084r);
                return;
        }
    }

    public ad(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17078a = 0;
        this.f17079b = messagesController;
        this.f17082f = zArr;
        this.h = messagesStorage;
        this.f17080c = j3;
        this.f17083n = runnableArr;
        this.f17081e = j10;
        this.d = i10;
        this.f17084r = messagesLoadedCallback;
    }

    public ad(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17078a = i11;
        this.f17079b = wearReplyReceiver;
        this.f17082f = accountInstance;
        this.h = tLObject;
        this.f17083n = charSequence;
        this.f17080c = j3;
        this.f17081e = j10;
        this.d = i10;
        this.f17084r = iArr;
    }
}
