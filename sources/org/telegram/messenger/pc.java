package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f17282a;
    public final Object f17283b;
    public final long f17284c;
    public final int d;
    public final long e;
    public final Object f17285f;
    public final Object h;
    public final Object f17286n;
    public final Object f17287r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17282a = 1;
        this.f17283b = messagesController;
        this.f17285f = arrayList;
        this.f17284c = j3;
        this.h = updates_channeldifference;
        this.f17286n = chat;
        this.f17287r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17282a) {
            case 0:
                ((MessagesController) this.f17283b).lambda$ensureMessagesLoaded$460((boolean[]) this.f17285f, (MessagesStorage) this.h, this.f17284c, (Runnable[]) this.f17286n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17287r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.e;
                ((MessagesController) this.f17283b).lambda$getChannelDifference$347((ArrayList) this.f17285f, this.f17284c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17286n, (a0.i) this.f17287r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17283b).lambda$onReceive$0((AccountInstance) this.f17285f, (TLRPC.User) this.h, (CharSequence) this.f17286n, this.f17284c, this.e, this.d, (int[]) this.f17287r);
                return;
            default:
                ((WearReplyReceiver) this.f17283b).lambda$onReceive$2((AccountInstance) this.f17285f, (TLRPC.Chat) this.h, (CharSequence) this.f17286n, this.f17284c, this.e, this.d, (int[]) this.f17287r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17282a = 0;
        this.f17283b = messagesController;
        this.f17285f = zArr;
        this.h = messagesStorage;
        this.f17284c = j3;
        this.f17286n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.f17287r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17282a = i11;
        this.f17283b = wearReplyReceiver;
        this.f17285f = accountInstance;
        this.h = tLObject;
        this.f17286n = charSequence;
        this.f17284c = j3;
        this.e = j10;
        this.d = i10;
        this.f17287r = iArr;
    }
}
