package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f17031a;
    public final Object f17032b;
    public final long f17033c;
    public final int d;
    public final long e;
    public final Object f17034f;
    public final Object h;
    public final Object f17035n;
    public final Object f17036r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17031a = 1;
        this.f17032b = messagesController;
        this.f17034f = arrayList;
        this.f17033c = j3;
        this.h = updates_channeldifference;
        this.f17035n = chat;
        this.f17036r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17031a) {
            case 0:
                ((MessagesController) this.f17032b).lambda$ensureMessagesLoaded$460((boolean[]) this.f17034f, (MessagesStorage) this.h, this.f17033c, (Runnable[]) this.f17035n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17036r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.e;
                ((MessagesController) this.f17032b).lambda$getChannelDifference$347((ArrayList) this.f17034f, this.f17033c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17035n, (a0.i) this.f17036r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17032b).lambda$onReceive$0((AccountInstance) this.f17034f, (TLRPC.User) this.h, (CharSequence) this.f17035n, this.f17033c, this.e, this.d, (int[]) this.f17036r);
                return;
            default:
                ((WearReplyReceiver) this.f17032b).lambda$onReceive$2((AccountInstance) this.f17034f, (TLRPC.Chat) this.h, (CharSequence) this.f17035n, this.f17033c, this.e, this.d, (int[]) this.f17036r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17031a = 0;
        this.f17032b = messagesController;
        this.f17034f = zArr;
        this.h = messagesStorage;
        this.f17033c = j3;
        this.f17035n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.f17036r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17031a = i11;
        this.f17032b = wearReplyReceiver;
        this.f17034f = accountInstance;
        this.h = tLObject;
        this.f17035n = charSequence;
        this.f17033c = j3;
        this.e = j10;
        this.d = i10;
        this.f17036r = iArr;
    }
}
