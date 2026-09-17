package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oc implements Runnable {
    public final int f18622a;
    public final Object f18623b;
    public final long f18624c;
    public final int d;
    public final long f18625e;
    public final Object f18626f;
    public final Object h;
    public final Object f18627n;
    public final Object f18628r;

    public oc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f18622a = 1;
        this.f18623b = messagesController;
        this.f18626f = arrayList;
        this.f18624c = j3;
        this.h = updates_channeldifference;
        this.f18627n = chat;
        this.f18628r = iVar;
        this.d = i10;
        this.f18625e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18622a) {
            case 0:
                ((MessagesController) this.f18623b).lambda$ensureMessagesLoaded$460((boolean[]) this.f18626f, (MessagesStorage) this.h, this.f18624c, (Runnable[]) this.f18627n, this.f18625e, this.d, (MessagesController.MessagesLoadedCallback) this.f18628r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.f18625e;
                ((MessagesController) this.f18623b).lambda$getChannelDifference$347((ArrayList) this.f18626f, this.f18624c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f18627n, (a0.i) this.f18628r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f18623b).lambda$onReceive$0((AccountInstance) this.f18626f, (TLRPC.User) this.h, (CharSequence) this.f18627n, this.f18624c, this.f18625e, this.d, (int[]) this.f18628r);
                return;
            default:
                ((WearReplyReceiver) this.f18623b).lambda$onReceive$2((AccountInstance) this.f18626f, (TLRPC.Chat) this.h, (CharSequence) this.f18627n, this.f18624c, this.f18625e, this.d, (int[]) this.f18628r);
                return;
        }
    }

    public oc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f18622a = 0;
        this.f18623b = messagesController;
        this.f18626f = zArr;
        this.h = messagesStorage;
        this.f18624c = j3;
        this.f18627n = runnableArr;
        this.f18625e = j10;
        this.d = i10;
        this.f18628r = messagesLoadedCallback;
    }

    public oc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f18622a = i11;
        this.f18623b = wearReplyReceiver;
        this.f18626f = accountInstance;
        this.h = tLObject;
        this.f18627n = charSequence;
        this.f18624c = j3;
        this.f18625e = j10;
        this.d = i10;
        this.f18628r = iArr;
    }
}
