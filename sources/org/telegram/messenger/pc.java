package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f17029a;
    public final Object f17030b;
    public final long f17031c;
    public final int d;
    public final long e;
    public final Object f17032f;
    public final Object h;
    public final Object f17033n;
    public final Object f17034r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17029a = 1;
        this.f17030b = messagesController;
        this.f17032f = arrayList;
        this.f17031c = j3;
        this.h = updates_channeldifference;
        this.f17033n = chat;
        this.f17034r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17029a) {
            case 0:
                ((MessagesController) this.f17030b).lambda$ensureMessagesLoaded$460((boolean[]) this.f17032f, (MessagesStorage) this.h, this.f17031c, (Runnable[]) this.f17033n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17034r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.e;
                ((MessagesController) this.f17030b).lambda$getChannelDifference$347((ArrayList) this.f17032f, this.f17031c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17033n, (a0.i) this.f17034r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17030b).lambda$onReceive$0((AccountInstance) this.f17032f, (TLRPC.User) this.h, (CharSequence) this.f17033n, this.f17031c, this.e, this.d, (int[]) this.f17034r);
                return;
            default:
                ((WearReplyReceiver) this.f17030b).lambda$onReceive$2((AccountInstance) this.f17032f, (TLRPC.Chat) this.h, (CharSequence) this.f17033n, this.f17031c, this.e, this.d, (int[]) this.f17034r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17029a = 0;
        this.f17030b = messagesController;
        this.f17032f = zArr;
        this.h = messagesStorage;
        this.f17031c = j3;
        this.f17033n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.f17034r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17029a = i11;
        this.f17030b = wearReplyReceiver;
        this.f17032f = accountInstance;
        this.h = tLObject;
        this.f17033n = charSequence;
        this.f17031c = j3;
        this.e = j10;
        this.d = i10;
        this.f17034r = iArr;
    }
}
