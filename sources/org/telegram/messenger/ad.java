package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ad implements Runnable {
    public final int f16472a;
    public final Object f16473b;
    public final long f16474c;
    public final int d;
    public final long e;
    public final Object f16475f;
    public final Object h;
    public final Object f16476n;
    public final Object f16477r;

    public ad(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f16472a = 1;
        this.f16473b = messagesController;
        this.f16475f = arrayList;
        this.f16474c = j10;
        this.h = updates_channeldifference;
        this.f16476n = chat;
        this.f16477r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f16472a) {
            case 0:
                ((MessagesController) this.f16473b).lambda$ensureMessagesLoaded$463((boolean[]) this.f16475f, (MessagesStorage) this.h, this.f16474c, (Runnable[]) this.f16476n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f16477r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f16473b).lambda$getChannelDifference$346((ArrayList) this.f16475f, this.f16474c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f16476n, (a0.h) this.f16477r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f16473b).lambda$onReceive$0((AccountInstance) this.f16475f, (TLRPC.User) this.h, (CharSequence) this.f16476n, this.f16474c, this.e, this.d, (int[]) this.f16477r);
                return;
            default:
                ((WearReplyReceiver) this.f16473b).lambda$onReceive$2((AccountInstance) this.f16475f, (TLRPC.Chat) this.h, (CharSequence) this.f16476n, this.f16474c, this.e, this.d, (int[]) this.f16477r);
                return;
        }
    }

    public ad(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f16472a = 0;
        this.f16473b = messagesController;
        this.f16475f = zArr;
        this.h = messagesStorage;
        this.f16474c = j10;
        this.f16476n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f16477r = messagesLoadedCallback;
    }

    public ad(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f16472a = i11;
        this.f16473b = wearReplyReceiver;
        this.f16475f = accountInstance;
        this.h = tLObject;
        this.f16476n = charSequence;
        this.f16474c = j10;
        this.e = j11;
        this.d = i10;
        this.f16477r = iArr;
    }
}
