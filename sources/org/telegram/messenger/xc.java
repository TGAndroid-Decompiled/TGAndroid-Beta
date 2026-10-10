package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc implements Runnable {
    public final int f19807a;
    public final Object f19808b;
    public final long f19809c;
    public final int d;
    public final long f19810e;
    public final Object f19811f;
    public final Object h;
    public final Object f19812n;
    public final Object f19813r;

    public xc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f19807a = 1;
        this.f19808b = messagesController;
        this.f19811f = arrayList;
        this.f19809c = j3;
        this.h = updates_channeldifference;
        this.f19812n = chat;
        this.f19813r = iVar;
        this.d = i10;
        this.f19810e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19807a) {
            case 0:
                ((MessagesController) this.f19808b).lambda$ensureMessagesLoaded$463((boolean[]) this.f19811f, (MessagesStorage) this.h, this.f19809c, (Runnable[]) this.f19812n, this.f19810e, this.d, (MessagesController.MessagesLoadedCallback) this.f19813r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.f19810e;
                ((MessagesController) this.f19808b).lambda$getChannelDifference$346((ArrayList) this.f19811f, this.f19809c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f19812n, (a0.i) this.f19813r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f19808b).lambda$onReceive$0((AccountInstance) this.f19811f, (TLRPC.User) this.h, (CharSequence) this.f19812n, this.f19809c, this.f19810e, this.d, (int[]) this.f19813r);
                return;
            default:
                ((WearReplyReceiver) this.f19808b).lambda$onReceive$2((AccountInstance) this.f19811f, (TLRPC.Chat) this.h, (CharSequence) this.f19812n, this.f19809c, this.f19810e, this.d, (int[]) this.f19813r);
                return;
        }
    }

    public xc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f19807a = 0;
        this.f19808b = messagesController;
        this.f19811f = zArr;
        this.h = messagesStorage;
        this.f19809c = j3;
        this.f19812n = runnableArr;
        this.f19810e = j10;
        this.d = i10;
        this.f19813r = messagesLoadedCallback;
    }

    public xc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f19807a = i11;
        this.f19808b = wearReplyReceiver;
        this.f19811f = accountInstance;
        this.h = tLObject;
        this.f19812n = charSequence;
        this.f19809c = j3;
        this.f19810e = j10;
        this.d = i10;
        this.f19813r = iArr;
    }
}
