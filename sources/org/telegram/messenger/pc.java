package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc implements Runnable {
    public final int f18706a;
    public final Object f18707b;
    public final long f18708c;
    public final int d;
    public final long f18709e;
    public final Object f18710f;
    public final Object h;
    public final Object f18711n;
    public final Object f18712r;

    public pc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f18706a = 1;
        this.f18707b = messagesController;
        this.f18710f = arrayList;
        this.f18708c = j3;
        this.h = updates_channeldifference;
        this.f18711n = chat;
        this.f18712r = iVar;
        this.d = i10;
        this.f18709e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18706a) {
            case 0:
                ((MessagesController) this.f18707b).lambda$ensureMessagesLoaded$460((boolean[]) this.f18710f, (MessagesStorage) this.h, this.f18708c, (Runnable[]) this.f18711n, this.f18709e, this.d, (MessagesController.MessagesLoadedCallback) this.f18712r);
                return;
            case 1:
                int i10 = this.d;
                long j3 = this.f18709e;
                ((MessagesController) this.f18707b).lambda$getChannelDifference$347((ArrayList) this.f18710f, this.f18708c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f18711n, (a0.i) this.f18712r, i10, j3);
                return;
            case 2:
                ((WearReplyReceiver) this.f18707b).lambda$onReceive$0((AccountInstance) this.f18710f, (TLRPC.User) this.h, (CharSequence) this.f18711n, this.f18708c, this.f18709e, this.d, (int[]) this.f18712r);
                return;
            default:
                ((WearReplyReceiver) this.f18707b).lambda$onReceive$2((AccountInstance) this.f18710f, (TLRPC.Chat) this.h, (CharSequence) this.f18711n, this.f18708c, this.f18709e, this.d, (int[]) this.f18712r);
                return;
        }
    }

    public pc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f18706a = 0;
        this.f18707b = messagesController;
        this.f18710f = zArr;
        this.h = messagesStorage;
        this.f18708c = j3;
        this.f18711n = runnableArr;
        this.f18709e = j10;
        this.d = i10;
        this.f18712r = messagesLoadedCallback;
    }

    public pc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.f18706a = i11;
        this.f18707b = wearReplyReceiver;
        this.f18710f = accountInstance;
        this.h = tLObject;
        this.f18711n = charSequence;
        this.f18708c = j3;
        this.f18709e = j10;
        this.d = i10;
        this.f18712r = iArr;
    }
}
