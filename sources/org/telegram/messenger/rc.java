package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rc implements Runnable {
    public final int f18269a;
    public final Object f18270b;
    public final long f18271c;
    public final int d;
    public final long e;
    public final Object f18272f;
    public final Object h;
    public final Object f18273n;
    public final Object f18274r;

    public rc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f18269a = 1;
        this.f18270b = messagesController;
        this.f18272f = arrayList;
        this.f18271c = j10;
        this.h = updates_channeldifference;
        this.f18273n = chat;
        this.f18274r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18269a) {
            case 0:
                ((MessagesController) this.f18270b).lambda$ensureMessagesLoaded$460((boolean[]) this.f18272f, (MessagesStorage) this.h, this.f18271c, (Runnable[]) this.f18273n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f18274r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f18270b).lambda$getChannelDifference$347((ArrayList) this.f18272f, this.f18271c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f18273n, (a0.h) this.f18274r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f18270b).lambda$onReceive$0((AccountInstance) this.f18272f, (TLRPC.User) this.h, (CharSequence) this.f18273n, this.f18271c, this.e, this.d, (int[]) this.f18274r);
                return;
            default:
                ((WearReplyReceiver) this.f18270b).lambda$onReceive$2((AccountInstance) this.f18272f, (TLRPC.Chat) this.h, (CharSequence) this.f18273n, this.f18271c, this.e, this.d, (int[]) this.f18274r);
                return;
        }
    }

    public rc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f18269a = 0;
        this.f18270b = messagesController;
        this.f18272f = zArr;
        this.h = messagesStorage;
        this.f18271c = j10;
        this.f18273n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f18274r = messagesLoadedCallback;
    }

    public rc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f18269a = i11;
        this.f18270b = wearReplyReceiver;
        this.f18272f = accountInstance;
        this.h = tLObject;
        this.f18273n = charSequence;
        this.f18271c = j10;
        this.e = j11;
        this.d = i10;
        this.f18274r = iArr;
    }
}
