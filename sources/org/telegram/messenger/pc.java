package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f17267a;
    public final Object f17268b;
    public final long f17269c;
    public final int d;
    public final long e;
    public final Object f17270f;
    public final Object h;
    public final Object f17271n;
    public final Object f17272r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17267a = 1;
        this.f17268b = messagesController;
        this.f17270f = arrayList;
        this.f17269c = j3;
        this.h = updates_channeldifference;
        this.f17271n = chat;
        this.f17272r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17267a) {
            case 0:
                ((MessagesController) this.f17268b).lambda$ensureMessagesLoaded$460((boolean[]) this.f17270f, (MessagesStorage) this.h, this.f17269c, (Runnable[]) this.f17271n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17272r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.e;
                ((MessagesController) this.f17268b).lambda$getChannelDifference$347((ArrayList) this.f17270f, this.f17269c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17271n, (a0.i) this.f17272r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17268b).lambda$onReceive$0((AccountInstance) this.f17270f, (TLRPC.User) this.h, (CharSequence) this.f17271n, this.f17269c, this.e, this.d, (int[]) this.f17272r);
                return;
            default:
                ((WearReplyReceiver) this.f17268b).lambda$onReceive$2((AccountInstance) this.f17270f, (TLRPC.Chat) this.h, (CharSequence) this.f17271n, this.f17269c, this.e, this.d, (int[]) this.f17272r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17267a = 0;
        this.f17268b = messagesController;
        this.f17270f = zArr;
        this.h = messagesStorage;
        this.f17269c = j3;
        this.f17271n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.f17272r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17267a = i11;
        this.f17268b = wearReplyReceiver;
        this.f17270f = accountInstance;
        this.h = tLObject;
        this.f17271n = charSequence;
        this.f17269c = j3;
        this.e = j10;
        this.d = i10;
        this.f17272r = iArr;
    }
}
