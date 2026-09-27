package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f17279a;
    public final Object f17280b;
    public final long f17281c;
    public final int d;
    public final long e;
    public final Object f17282f;
    public final Object h;
    public final Object f17283n;
    public final Object f17284r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17279a = 1;
        this.f17280b = messagesController;
        this.f17282f = arrayList;
        this.f17281c = j3;
        this.h = updates_channeldifference;
        this.f17283n = chat;
        this.f17284r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17279a) {
            case 0:
                ((MessagesController) this.f17280b).lambda$ensureMessagesLoaded$460((boolean[]) this.f17282f, (MessagesStorage) this.h, this.f17281c, (Runnable[]) this.f17283n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f17284r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.e;
                ((MessagesController) this.f17280b).lambda$getChannelDifference$347((ArrayList) this.f17282f, this.f17281c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f17283n, (a0.i) this.f17284r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f17280b).lambda$onReceive$0((AccountInstance) this.f17282f, (TLRPC.User) this.h, (CharSequence) this.f17283n, this.f17281c, this.e, this.d, (int[]) this.f17284r);
                return;
            default:
                ((WearReplyReceiver) this.f17280b).lambda$onReceive$2((AccountInstance) this.f17282f, (TLRPC.Chat) this.h, (CharSequence) this.f17283n, this.f17281c, this.e, this.d, (int[]) this.f17284r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f17279a = 0;
        this.f17280b = messagesController;
        this.f17282f = zArr;
        this.h = messagesStorage;
        this.f17281c = j3;
        this.f17283n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.f17284r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f17279a = i11;
        this.f17280b = wearReplyReceiver;
        this.f17282f = accountInstance;
        this.h = tLObject;
        this.f17283n = charSequence;
        this.f17281c = j3;
        this.e = j10;
        this.d = i10;
        this.f17284r = iArr;
    }
}
