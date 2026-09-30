package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f17302a;
    public final Object f17303b;
    public final long f17304c;
    public final int d;
    public final long e;
    public final Object f17305f;
    public final Object h;
    public final Object f17306n;
    public final Object f17307r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17302a = 1;
        this.f17303b = messagesController;
        this.f17305f = arrayList;
        this.f17304c = j3;
        this.h = updates_channeldifference;
        this.f17306n = chat;
        this.f17307r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17302a) {
            case 0:
                ((MessagesController) this.f17303b).lambda$ensureMessagesLoaded$460((boolean[]) this.f17305f, (MessagesStorage) this.h, this.f17304c, (Runnable[]) this.f17306n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17307r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.e;
                ((MessagesController) this.f17303b).lambda$getChannelDifference$347((ArrayList) this.f17305f, this.f17304c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17306n, (a0.i) this.f17307r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17303b).lambda$onReceive$0((AccountInstance) this.f17305f, (TLRPC.User) this.h, (CharSequence) this.f17306n, this.f17304c, this.e, this.d, (int[]) this.f17307r);
                return;
            default:
                ((WearReplyReceiver) this.f17303b).lambda$onReceive$2((AccountInstance) this.f17305f, (TLRPC.Chat) this.h, (CharSequence) this.f17306n, this.f17304c, this.e, this.d, (int[]) this.f17307r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17302a = 0;
        this.f17303b = messagesController;
        this.f17305f = zArr;
        this.h = messagesStorage;
        this.f17304c = j3;
        this.f17306n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.f17307r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17302a = i11;
        this.f17303b = wearReplyReceiver;
        this.f17305f = accountInstance;
        this.h = tLObject;
        this.f17306n = charSequence;
        this.f17304c = j3;
        this.e = j10;
        this.d = i10;
        this.f17307r = iArr;
    }
}
