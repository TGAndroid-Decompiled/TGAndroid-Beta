package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class oc implements Runnable {

    public final int f21152a;

    public final Object f21153b;

    public final long f21154c;
    public final int d;

    public final long f21155e;

    public final Object f21156f;
    public final Object h;

    public final Object f21157n;

    public final Object f21158r;

    public oc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f21152a = 1;
        this.f21153b = messagesController;
        this.f21156f = arrayList;
        this.f21154c = j10;
        this.h = updates_channeldifference;
        this.f21157n = chat;
        this.f21158r = hVar;
        this.d = i10;
        this.f21155e = j11;
    }

    @Override
    public final void run() {
        switch (this.f21152a) {
            case 0:
                ((MessagesController) this.f21153b).lambda$ensureMessagesLoaded$460((boolean[]) this.f21156f, (MessagesStorage) this.h, this.f21154c, (Runnable[]) this.f21157n, this.f21155e, this.d, (MessagesController.MessagesLoadedCallback) this.f21158r);
                break;
            case 1:
                ((MessagesController) this.f21153b).lambda$getChannelDifference$347((ArrayList) this.f21156f, this.f21154c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f21157n, (a0.h) this.f21158r, this.d, this.f21155e);
                break;
            case 2:
                ((WearReplyReceiver) this.f21153b).lambda$onReceive$0((AccountInstance) this.f21156f, (TLRPC.User) this.h, (CharSequence) this.f21157n, this.f21154c, this.f21155e, this.d, (int[]) this.f21158r);
                break;
            default:
                ((WearReplyReceiver) this.f21153b).lambda$onReceive$2((AccountInstance) this.f21156f, (TLRPC.Chat) this.h, (CharSequence) this.f21157n, this.f21154c, this.f21155e, this.d, (int[]) this.f21158r);
                break;
        }
    }

    public oc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f21152a = 0;
        this.f21153b = messagesController;
        this.f21156f = zArr;
        this.h = messagesStorage;
        this.f21154c = j10;
        this.f21157n = runnableArr;
        this.f21155e = j11;
        this.d = i10;
        this.f21158r = messagesLoadedCallback;
    }

    public oc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f21152a = i11;
        this.f21153b = wearReplyReceiver;
        this.f21156f = accountInstance;
        this.h = tLObject;
        this.f21157n = charSequence;
        this.f21154c = j10;
        this.f21155e = j11;
        this.d = i10;
        this.f21158r = iArr;
    }
}
