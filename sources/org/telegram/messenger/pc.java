package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f18679a;
    public final Object f18680b;
    public final long f18681c;
    public final int d;
    public final long f18682e;
    public final Object f18683f;
    public final Object h;
    public final Object f18684n;
    public final Object f18685r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f18679a = 1;
        this.f18680b = messagesController;
        this.f18683f = arrayList;
        this.f18681c = j3;
        this.h = updates_channeldifference;
        this.f18684n = chat;
        this.f18685r = iVar;
        this.d = i10;
        this.f18682e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18679a) {
            case 0:
                ((MessagesController) this.f18680b).lambda$ensureMessagesLoaded$460((boolean[]) this.f18683f, (MessagesStorage) this.h, this.f18681c, (Runnable[]) this.f18684n, this.f18682e, this.d, (MessagesController.MessagesLoadedCallback) this.f18685r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.f18682e;
                ((MessagesController) this.f18680b).lambda$getChannelDifference$347((ArrayList) this.f18683f, this.f18681c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f18684n, (a0.i) this.f18685r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f18680b).lambda$onReceive$0((AccountInstance) this.f18683f, (TLRPC.User) this.h, (CharSequence) this.f18684n, this.f18681c, this.f18682e, this.d, (int[]) this.f18685r);
                return;
            default:
                ((WearReplyReceiver) this.f18680b).lambda$onReceive$2((AccountInstance) this.f18683f, (TLRPC.Chat) this.h, (CharSequence) this.f18684n, this.f18681c, this.f18682e, this.d, (int[]) this.f18685r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f18679a = 0;
        this.f18680b = messagesController;
        this.f18683f = zArr;
        this.h = messagesStorage;
        this.f18681c = j3;
        this.f18684n = runnableArr;
        this.f18682e = j10;
        this.d = i10;
        this.f18685r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f18679a = i11;
        this.f18680b = wearReplyReceiver;
        this.f18683f = accountInstance;
        this.h = tLObject;
        this.f18684n = charSequence;
        this.f18681c = j3;
        this.f18682e = j10;
        this.d = i10;
        this.f18685r = iArr;
    }
}
