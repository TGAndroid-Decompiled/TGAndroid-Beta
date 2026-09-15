package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f17039a;
    public final Object f17040b;
    public final long f17041c;
    public final int d;
    public final long e;
    public final Object f17042f;
    public final Object h;
    public final Object f17043n;
    public final Object f17044r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17039a = 1;
        this.f17040b = messagesController;
        this.f17042f = arrayList;
        this.f17041c = j3;
        this.h = updates_channeldifference;
        this.f17043n = chat;
        this.f17044r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17039a) {
            case 0:
                ((MessagesController) this.f17040b).lambda$ensureMessagesLoaded$460((boolean[]) this.f17042f, (MessagesStorage) this.h, this.f17041c, (Runnable[]) this.f17043n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17044r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.e;
                ((MessagesController) this.f17040b).lambda$getChannelDifference$347((ArrayList) this.f17042f, this.f17041c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17043n, (a0.i) this.f17044r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17040b).lambda$onReceive$0((AccountInstance) this.f17042f, (TLRPC.User) this.h, (CharSequence) this.f17043n, this.f17041c, this.e, this.d, (int[]) this.f17044r);
                return;
            default:
                ((WearReplyReceiver) this.f17040b).lambda$onReceive$2((AccountInstance) this.f17042f, (TLRPC.Chat) this.h, (CharSequence) this.f17043n, this.f17041c, this.e, this.d, (int[]) this.f17044r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17039a = 0;
        this.f17040b = messagesController;
        this.f17042f = zArr;
        this.h = messagesStorage;
        this.f17041c = j3;
        this.f17043n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.f17044r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17039a = i11;
        this.f17040b = wearReplyReceiver;
        this.f17042f = accountInstance;
        this.h = tLObject;
        this.f17043n = charSequence;
        this.f17041c = j3;
        this.e = j10;
        this.d = i10;
        this.f17044r = iArr;
    }
}
