package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rc implements Runnable {
    public final int f19864a;
    public final Object f19865b;
    public final long f19866c;
    public final int d;
    public final long f19867e;
    public final Object f19868f;
    public final Object h;
    public final Object f19869n;
    public final Object f19870r;

    public rc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f19864a = 1;
        this.f19865b = messagesController;
        this.f19868f = arrayList;
        this.f19866c = j10;
        this.h = updates_channeldifference;
        this.f19869n = chat;
        this.f19870r = hVar;
        this.d = i10;
        this.f19867e = j11;
    }

    @Override
    public final void run() {
        switch (this.f19864a) {
            case 0:
                ((MessagesController) this.f19865b).lambda$ensureMessagesLoaded$460((boolean[]) this.f19868f, (MessagesStorage) this.h, this.f19866c, (Runnable[]) this.f19869n, this.f19867e, this.d, (MessagesController.MessagesLoadedCallback) this.f19870r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.f19867e;
                ((MessagesController) this.f19865b).lambda$getChannelDifference$347((ArrayList) this.f19868f, this.f19866c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f19869n, (a0.h) this.f19870r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f19865b).lambda$onReceive$0((AccountInstance) this.f19868f, (TLRPC.User) this.h, (CharSequence) this.f19869n, this.f19866c, this.f19867e, this.d, (int[]) this.f19870r);
                return;
            default:
                ((WearReplyReceiver) this.f19865b).lambda$onReceive$2((AccountInstance) this.f19868f, (TLRPC.Chat) this.h, (CharSequence) this.f19869n, this.f19866c, this.f19867e, this.d, (int[]) this.f19870r);
                return;
        }
    }

    public rc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f19864a = 0;
        this.f19865b = messagesController;
        this.f19868f = zArr;
        this.h = messagesStorage;
        this.f19866c = j10;
        this.f19869n = runnableArr;
        this.f19867e = j11;
        this.d = i10;
        this.f19870r = messagesLoadedCallback;
    }

    public rc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f19864a = i11;
        this.f19865b = wearReplyReceiver;
        this.f19868f = accountInstance;
        this.h = tLObject;
        this.f19869n = charSequence;
        this.f19866c = j10;
        this.f19867e = j11;
        this.d = i10;
        this.f19870r = iArr;
    }
}
