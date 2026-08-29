package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qc implements Runnable {
    public final int f21336a;
    public final Object f21337b;
    public final long f21338c;
    public final int d;
    public final long f21339e;
    public final Object f21340f;
    public final Object h;
    public final Object f21341n;
    public final Object f21342r;

    public qc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f21336a = 1;
        this.f21337b = messagesController;
        this.f21340f = arrayList;
        this.f21338c = j10;
        this.h = updates_channeldifference;
        this.f21341n = chat;
        this.f21342r = hVar;
        this.d = i10;
        this.f21339e = j11;
    }

    @Override
    public final void run() {
        switch (this.f21336a) {
            case 0:
                ((MessagesController) this.f21337b).lambda$ensureMessagesLoaded$460((boolean[]) this.f21340f, (MessagesStorage) this.h, this.f21338c, (Runnable[]) this.f21341n, this.f21339e, this.d, (MessagesController.MessagesLoadedCallback) this.f21342r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.f21339e;
                ((MessagesController) this.f21337b).lambda$getChannelDifference$347((ArrayList) this.f21340f, this.f21338c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f21341n, (a0.h) this.f21342r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f21337b).lambda$onReceive$0((AccountInstance) this.f21340f, (TLRPC.User) this.h, (CharSequence) this.f21341n, this.f21338c, this.f21339e, this.d, (int[]) this.f21342r);
                return;
            default:
                ((WearReplyReceiver) this.f21337b).lambda$onReceive$2((AccountInstance) this.f21340f, (TLRPC.Chat) this.h, (CharSequence) this.f21341n, this.f21338c, this.f21339e, this.d, (int[]) this.f21342r);
                return;
        }
    }

    public qc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f21336a = 0;
        this.f21337b = messagesController;
        this.f21340f = zArr;
        this.h = messagesStorage;
        this.f21338c = j10;
        this.f21341n = runnableArr;
        this.f21339e = j11;
        this.d = i10;
        this.f21342r = messagesLoadedCallback;
    }

    public qc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f21336a = i11;
        this.f21337b = wearReplyReceiver;
        this.f21340f = accountInstance;
        this.h = tLObject;
        this.f21341n = charSequence;
        this.f21338c = j10;
        this.f21339e = j11;
        this.d = i10;
        this.f21342r = iArr;
    }
}
