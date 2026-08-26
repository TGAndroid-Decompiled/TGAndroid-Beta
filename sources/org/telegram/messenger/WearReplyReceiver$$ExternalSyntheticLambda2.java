package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class WearReplyReceiver$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final long f$4;
    public final long f$5;
    public final int f$6;
    public final Object f$7;

    public WearReplyReceiver$$ExternalSyntheticLambda2(MessagesController messagesController, ArrayList arrayList, long j, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, LongSparseArray longSparseArray, int i, long j2) {
        this.$r8$classId = 2;
        this.f$0 = messagesController;
        this.f$1 = arrayList;
        this.f$4 = j;
        this.f$2 = updates_channeldifference;
        this.f$3 = chat;
        this.f$7 = longSparseArray;
        this.f$6 = i;
        this.f$5 = j2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((WearReplyReceiver) this.f$0).lambda$onReceive$0((AccountInstance) this.f$1, (TLRPC.User) this.f$2, (CharSequence) this.f$3, this.f$4, this.f$5, this.f$6, (int[]) this.f$7);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$ensureMessagesLoaded$460((boolean[]) this.f$1, (MessagesStorage) this.f$2, this.f$4, (Runnable[]) this.f$3, this.f$5, this.f$6, (MessagesController.MessagesLoadedCallback) this.f$7);
                break;
            case 2:
                ((MessagesController) this.f$0).lambda$getChannelDifference$347((ArrayList) this.f$1, this.f$4, (TLRPC.updates_ChannelDifference) this.f$2, (TLRPC.Chat) this.f$3, (LongSparseArray) this.f$7, this.f$6, this.f$5);
                break;
            default:
                ((WearReplyReceiver) this.f$0).lambda$onReceive$2((AccountInstance) this.f$1, (TLRPC.Chat) this.f$2, (CharSequence) this.f$3, this.f$4, this.f$5, this.f$6, (int[]) this.f$7);
                break;
        }
    }

    public WearReplyReceiver$$ExternalSyntheticLambda2(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j, Runnable[] runnableArr, long j2, int i, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.$r8$classId = 1;
        this.f$0 = messagesController;
        this.f$1 = zArr;
        this.f$2 = messagesStorage;
        this.f$4 = j;
        this.f$3 = runnableArr;
        this.f$5 = j2;
        this.f$6 = i;
        this.f$7 = messagesLoadedCallback;
    }

    public WearReplyReceiver$$ExternalSyntheticLambda2(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j, long j2, int i, int[] iArr, int i2) {
        this.$r8$classId = i2;
        this.f$0 = wearReplyReceiver;
        this.f$1 = accountInstance;
        this.f$2 = tLObject;
        this.f$3 = charSequence;
        this.f$4 = j;
        this.f$5 = j2;
        this.f$6 = i;
        this.f$7 = iArr;
    }
}
