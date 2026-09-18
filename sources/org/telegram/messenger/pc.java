package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f17048a;
    public final Object f17049b;
    public final long f17050c;
    public final int d;
    public final long e;
    public final Object f17051f;
    public final Object h;
    public final Object f17052n;
    public final Object f17053r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17048a = 1;
        this.f17049b = messagesController;
        this.f17051f = arrayList;
        this.f17050c = j3;
        this.h = updates_channeldifference;
        this.f17052n = chat;
        this.f17053r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17048a) {
            case 0:
                ((MessagesController) this.f17049b).lambda$ensureMessagesLoaded$460((boolean[]) this.f17051f, (MessagesStorage) this.h, this.f17050c, (Runnable[]) this.f17052n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17053r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.e;
                ((MessagesController) this.f17049b).lambda$getChannelDifference$347((ArrayList) this.f17051f, this.f17050c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17052n, (a0.i) this.f17053r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17049b).lambda$onReceive$0((AccountInstance) this.f17051f, (TLRPC.User) this.h, (CharSequence) this.f17052n, this.f17050c, this.e, this.d, (int[]) this.f17053r);
                return;
            default:
                ((WearReplyReceiver) this.f17049b).lambda$onReceive$2((AccountInstance) this.f17051f, (TLRPC.Chat) this.h, (CharSequence) this.f17052n, this.f17050c, this.e, this.d, (int[]) this.f17053r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17048a = 0;
        this.f17049b = messagesController;
        this.f17051f = zArr;
        this.h = messagesStorage;
        this.f17050c = j3;
        this.f17052n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.f17053r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17048a = i11;
        this.f17049b = wearReplyReceiver;
        this.f17051f = accountInstance;
        this.h = tLObject;
        this.f17052n = charSequence;
        this.f17050c = j3;
        this.e = j10;
        this.d = i10;
        this.f17053r = iArr;
    }
}
