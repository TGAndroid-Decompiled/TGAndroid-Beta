package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f17252a;
    public final Object f17253b;
    public final long f17254c;
    public final int d;
    public final long e;
    public final Object f17255f;
    public final Object h;
    public final Object f17256n;
    public final Object f17257r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17252a = 1;
        this.f17253b = messagesController;
        this.f17255f = arrayList;
        this.f17254c = j3;
        this.h = updates_channeldifference;
        this.f17256n = chat;
        this.f17257r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17252a) {
            case 0:
                ((MessagesController) this.f17253b).lambda$ensureMessagesLoaded$460((boolean[]) this.f17255f, (MessagesStorage) this.h, this.f17254c, (Runnable[]) this.f17256n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17257r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.e;
                ((MessagesController) this.f17253b).lambda$getChannelDifference$347((ArrayList) this.f17255f, this.f17254c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17256n, (a0.i) this.f17257r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17253b).lambda$onReceive$0((AccountInstance) this.f17255f, (TLRPC.User) this.h, (CharSequence) this.f17256n, this.f17254c, this.e, this.d, (int[]) this.f17257r);
                return;
            default:
                ((WearReplyReceiver) this.f17253b).lambda$onReceive$2((AccountInstance) this.f17255f, (TLRPC.Chat) this.h, (CharSequence) this.f17256n, this.f17254c, this.e, this.d, (int[]) this.f17257r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17252a = 0;
        this.f17253b = messagesController;
        this.f17255f = zArr;
        this.h = messagesStorage;
        this.f17254c = j3;
        this.f17256n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.f17257r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17252a = i11;
        this.f17253b = wearReplyReceiver;
        this.f17255f = accountInstance;
        this.h = tLObject;
        this.f17256n = charSequence;
        this.f17254c = j3;
        this.e = j10;
        this.d = i10;
        this.f17257r = iArr;
    }
}
