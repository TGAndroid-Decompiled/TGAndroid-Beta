package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f18872a;
    public final Object f18873b;
    public final long f18874c;
    public final int d;
    public final long f18875e;
    public final Object f18876f;
    public final Object h;
    public final Object f18877n;
    public final Object f18878r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f18872a = 1;
        this.f18873b = messagesController;
        this.f18876f = arrayList;
        this.f18874c = j3;
        this.h = updates_channeldifference;
        this.f18877n = chat;
        this.f18878r = iVar;
        this.d = i10;
        this.f18875e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18872a) {
            case 0:
                ((MessagesController) this.f18873b).lambda$ensureMessagesLoaded$460((boolean[]) this.f18876f, (MessagesStorage) this.h, this.f18874c, (Runnable[]) this.f18877n, this.f18875e, this.d, (MessagesController.MessagesLoadedCallback) this.f18878r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.f18875e;
                ((MessagesController) this.f18873b).lambda$getChannelDifference$347((ArrayList) this.f18876f, this.f18874c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f18877n, (a0.i) this.f18878r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f18873b).lambda$onReceive$0((AccountInstance) this.f18876f, (TLRPC.User) this.h, (CharSequence) this.f18877n, this.f18874c, this.f18875e, this.d, (int[]) this.f18878r);
                return;
            default:
                ((WearReplyReceiver) this.f18873b).lambda$onReceive$2((AccountInstance) this.f18876f, (TLRPC.Chat) this.h, (CharSequence) this.f18877n, this.f18874c, this.f18875e, this.d, (int[]) this.f18878r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f18872a = 0;
        this.f18873b = messagesController;
        this.f18876f = zArr;
        this.h = messagesStorage;
        this.f18874c = j3;
        this.f18877n = runnableArr;
        this.f18875e = j10;
        this.d = i10;
        this.f18878r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f18872a = i11;
        this.f18873b = wearReplyReceiver;
        this.f18876f = accountInstance;
        this.h = tLObject;
        this.f18877n = charSequence;
        this.f18874c = j3;
        this.f18875e = j10;
        this.d = i10;
        this.f18878r = iArr;
    }
}
