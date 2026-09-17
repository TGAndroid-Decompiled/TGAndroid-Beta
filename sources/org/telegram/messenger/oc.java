package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oc implements Runnable {
    public final int f18595a;
    public final Object f18596b;
    public final long f18597c;
    public final int d;
    public final long f18598e;
    public final Object f18599f;
    public final Object h;
    public final Object f18600n;
    public final Object f18601r;

    public oc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f18595a = 1;
        this.f18596b = messagesController;
        this.f18599f = arrayList;
        this.f18597c = j3;
        this.h = updates_channeldifference;
        this.f18600n = chat;
        this.f18601r = iVar;
        this.d = i10;
        this.f18598e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18595a) {
            case 0:
                ((MessagesController) this.f18596b).lambda$ensureMessagesLoaded$460((boolean[]) this.f18599f, (MessagesStorage) this.h, this.f18597c, (Runnable[]) this.f18600n, this.f18598e, this.d, (MessagesController.MessagesLoadedCallback) this.f18601r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.f18598e;
                ((MessagesController) this.f18596b).lambda$getChannelDifference$347((ArrayList) this.f18599f, this.f18597c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f18600n, (a0.i) this.f18601r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f18596b).lambda$onReceive$0((AccountInstance) this.f18599f, (TLRPC.User) this.h, (CharSequence) this.f18600n, this.f18597c, this.f18598e, this.d, (int[]) this.f18601r);
                return;
            default:
                ((WearReplyReceiver) this.f18596b).lambda$onReceive$2((AccountInstance) this.f18599f, (TLRPC.Chat) this.h, (CharSequence) this.f18600n, this.f18597c, this.f18598e, this.d, (int[]) this.f18601r);
                return;
        }
    }

    public oc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f18595a = 0;
        this.f18596b = messagesController;
        this.f18599f = zArr;
        this.h = messagesStorage;
        this.f18597c = j3;
        this.f18600n = runnableArr;
        this.f18598e = j10;
        this.d = i10;
        this.f18601r = messagesLoadedCallback;
    }

    public oc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f18595a = i11;
        this.f18596b = wearReplyReceiver;
        this.f18599f = accountInstance;
        this.h = tLObject;
        this.f18600n = charSequence;
        this.f18597c = j3;
        this.f18598e = j10;
        this.d = i10;
        this.f18601r = iArr;
    }
}
