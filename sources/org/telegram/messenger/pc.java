package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f17285a;
    public final Object f17286b;
    public final long f17287c;
    public final int d;
    public final long e;
    public final Object f17288f;
    public final Object h;
    public final Object f17289n;
    public final Object f17290r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17285a = 1;
        this.f17286b = messagesController;
        this.f17288f = arrayList;
        this.f17287c = j3;
        this.h = updates_channeldifference;
        this.f17289n = chat;
        this.f17290r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17285a) {
            case 0:
                ((MessagesController) this.f17286b).lambda$ensureMessagesLoaded$460((boolean[]) this.f17288f, (MessagesStorage) this.h, this.f17287c, (Runnable[]) this.f17289n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17290r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.e;
                ((MessagesController) this.f17286b).lambda$getChannelDifference$347((ArrayList) this.f17288f, this.f17287c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17289n, (a0.i) this.f17290r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17286b).lambda$onReceive$0((AccountInstance) this.f17288f, (TLRPC.User) this.h, (CharSequence) this.f17289n, this.f17287c, this.e, this.d, (int[]) this.f17290r);
                return;
            default:
                ((WearReplyReceiver) this.f17286b).lambda$onReceive$2((AccountInstance) this.f17288f, (TLRPC.Chat) this.h, (CharSequence) this.f17289n, this.f17287c, this.e, this.d, (int[]) this.f17290r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17285a = 0;
        this.f17286b = messagesController;
        this.f17288f = zArr;
        this.h = messagesStorage;
        this.f17287c = j3;
        this.f17289n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.f17290r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17285a = i11;
        this.f17286b = wearReplyReceiver;
        this.f17288f = accountInstance;
        this.h = tLObject;
        this.f17289n = charSequence;
        this.f17287c = j3;
        this.e = j10;
        this.d = i10;
        this.f17290r = iArr;
    }
}
