package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f17286a;
    public final Object f17287b;
    public final long f17288c;
    public final int d;
    public final long e;
    public final Object f17289f;
    public final Object h;
    public final Object f17290n;
    public final Object f17291r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17286a = 1;
        this.f17287b = messagesController;
        this.f17289f = arrayList;
        this.f17288c = j3;
        this.h = updates_channeldifference;
        this.f17290n = chat;
        this.f17291r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17286a) {
            case 0:
                ((MessagesController) this.f17287b).lambda$ensureMessagesLoaded$460((boolean[]) this.f17289f, (MessagesStorage) this.h, this.f17288c, (Runnable[]) this.f17290n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17291r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.e;
                ((MessagesController) this.f17287b).lambda$getChannelDifference$347((ArrayList) this.f17289f, this.f17288c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17290n, (a0.i) this.f17291r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17287b).lambda$onReceive$0((AccountInstance) this.f17289f, (TLRPC.User) this.h, (CharSequence) this.f17290n, this.f17288c, this.e, this.d, (int[]) this.f17291r);
                return;
            default:
                ((WearReplyReceiver) this.f17287b).lambda$onReceive$2((AccountInstance) this.f17289f, (TLRPC.Chat) this.h, (CharSequence) this.f17290n, this.f17288c, this.e, this.d, (int[]) this.f17291r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17286a = 0;
        this.f17287b = messagesController;
        this.f17289f = zArr;
        this.h = messagesStorage;
        this.f17288c = j3;
        this.f17290n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.f17291r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17286a = i11;
        this.f17287b = wearReplyReceiver;
        this.f17289f = accountInstance;
        this.h = tLObject;
        this.f17290n = charSequence;
        this.f17288c = j3;
        this.e = j10;
        this.d = i10;
        this.f17291r = iArr;
    }
}
