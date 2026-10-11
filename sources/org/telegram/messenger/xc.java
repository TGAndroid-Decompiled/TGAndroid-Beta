package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc implements Runnable {
    public final int f19800a;
    public final Object f19801b;
    public final long f19802c;
    public final int d;
    public final long f19803e;
    public final Object f19804f;
    public final Object h;
    public final Object f19805n;
    public final Object f19806r;

    public xc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f19800a = 1;
        this.f19801b = messagesController;
        this.f19804f = arrayList;
        this.f19802c = j3;
        this.h = updates_channeldifference;
        this.f19805n = chat;
        this.f19806r = iVar;
        this.d = i10;
        this.f19803e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19800a) {
            case 0:
                ((MessagesController) this.f19801b).lambda$ensureMessagesLoaded$463((boolean[]) this.f19804f, (MessagesStorage) this.h, this.f19802c, (Runnable[]) this.f19805n, this.f19803e, this.d, (MessagesController.MessagesLoadedCallback) this.f19806r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.f19803e;
                ((MessagesController) this.f19801b).lambda$getChannelDifference$346((ArrayList) this.f19804f, this.f19802c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f19805n, (a0.i) this.f19806r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f19801b).lambda$onReceive$0((AccountInstance) this.f19804f, (TLRPC.User) this.h, (CharSequence) this.f19805n, this.f19802c, this.f19803e, this.d, (int[]) this.f19806r);
                return;
            default:
                ((WearReplyReceiver) this.f19801b).lambda$onReceive$2((AccountInstance) this.f19804f, (TLRPC.Chat) this.h, (CharSequence) this.f19805n, this.f19802c, this.f19803e, this.d, (int[]) this.f19806r);
                return;
        }
    }

    public xc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f19800a = 0;
        this.f19801b = messagesController;
        this.f19804f = zArr;
        this.h = messagesStorage;
        this.f19802c = j3;
        this.f19805n = runnableArr;
        this.f19803e = j10;
        this.d = i10;
        this.f19806r = messagesLoadedCallback;
    }

    public xc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f19800a = i11;
        this.f19801b = wearReplyReceiver;
        this.f19804f = accountInstance;
        this.h = tLObject;
        this.f19805n = charSequence;
        this.f19802c = j3;
        this.f19803e = j10;
        this.d = i10;
        this.f19806r = iArr;
    }
}
