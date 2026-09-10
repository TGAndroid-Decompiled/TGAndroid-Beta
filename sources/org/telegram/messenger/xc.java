package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc implements Runnable {
    public final int f16963a;
    public final Object f16964b;
    public final long f16965c;
    public final int d;
    public final long e;
    public final Object f16966f;
    public final Object h;
    public final Object f16967n;
    public final Object f16968r;

    public xc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f16963a = 1;
        this.f16964b = messagesController;
        this.f16966f = arrayList;
        this.f16965c = j3;
        this.h = updates_channeldifference;
        this.f16967n = chat;
        this.f16968r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16963a) {
            case 0:
                ((MessagesController) this.f16964b).lambda$ensureMessagesLoaded$460((boolean[]) this.f16966f, (MessagesStorage) this.h, this.f16965c, (Runnable[]) this.f16967n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f16968r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.e;
                ((MessagesController) this.f16964b).lambda$getChannelDifference$347((ArrayList) this.f16966f, this.f16965c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f16967n, (a0.i) this.f16968r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f16964b).lambda$onReceive$0((AccountInstance) this.f16966f, (TLRPC.User) this.h, (CharSequence) this.f16967n, this.f16965c, this.e, this.d, (int[]) this.f16968r);
                return;
            default:
                ((WearReplyReceiver) this.f16964b).lambda$onReceive$2((AccountInstance) this.f16966f, (TLRPC.Chat) this.h, (CharSequence) this.f16967n, this.f16965c, this.e, this.d, (int[]) this.f16968r);
                return;
        }
    }

    public xc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f16963a = 0;
        this.f16964b = messagesController;
        this.f16966f = zArr;
        this.h = messagesStorage;
        this.f16965c = j3;
        this.f16967n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.f16968r = messagesLoadedCallback;
    }

    public xc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f16963a = i11;
        this.f16964b = wearReplyReceiver;
        this.f16966f = accountInstance;
        this.h = tLObject;
        this.f16967n = charSequence;
        this.f16965c = j3;
        this.e = j10;
        this.d = i10;
        this.f16968r = iArr;
    }
}
