package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f18873a;
    public final Object f18874b;
    public final long f18875c;
    public final int d;
    public final long f18876e;
    public final Object f18877f;
    public final Object h;
    public final Object f18878n;
    public final Object f18879r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f18873a = 1;
        this.f18874b = messagesController;
        this.f18877f = arrayList;
        this.f18875c = j3;
        this.h = updates_channeldifference;
        this.f18878n = chat;
        this.f18879r = iVar;
        this.d = i10;
        this.f18876e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18873a) {
            case 0:
                ((MessagesController) this.f18874b).lambda$ensureMessagesLoaded$460((boolean[]) this.f18877f, (MessagesStorage) this.h, this.f18875c, (Runnable[]) this.f18878n, this.f18876e, this.d, (MessagesController.MessagesLoadedCallback) this.f18879r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.f18876e;
                ((MessagesController) this.f18874b).lambda$getChannelDifference$347((ArrayList) this.f18877f, this.f18875c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f18878n, (a0.i) this.f18879r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f18874b).lambda$onReceive$0((AccountInstance) this.f18877f, (TLRPC.User) this.h, (CharSequence) this.f18878n, this.f18875c, this.f18876e, this.d, (int[]) this.f18879r);
                return;
            default:
                ((WearReplyReceiver) this.f18874b).lambda$onReceive$2((AccountInstance) this.f18877f, (TLRPC.Chat) this.h, (CharSequence) this.f18878n, this.f18875c, this.f18876e, this.d, (int[]) this.f18879r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f18873a = 0;
        this.f18874b = messagesController;
        this.f18877f = zArr;
        this.h = messagesStorage;
        this.f18875c = j3;
        this.f18878n = runnableArr;
        this.f18876e = j10;
        this.d = i10;
        this.f18879r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f18873a = i11;
        this.f18874b = wearReplyReceiver;
        this.f18877f = accountInstance;
        this.h = tLObject;
        this.f18878n = charSequence;
        this.f18875c = j3;
        this.f18876e = j10;
        this.d = i10;
        this.f18879r = iArr;
    }
}
