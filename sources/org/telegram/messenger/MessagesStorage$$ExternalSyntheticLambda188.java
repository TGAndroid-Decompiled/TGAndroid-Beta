package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

public final class MessagesStorage$$ExternalSyntheticLambda188 implements Runnable {
    public final int $r8$classId = 1;
    public final BaseController f$0;
    public final Object f$1;
    public final long f$2;
    public final boolean f$3;
    public final boolean f$4;
    public final boolean f$5;
    public final int f$6;
    public final Object f$7;

    public MessagesStorage$$ExternalSyntheticLambda188(MediaDataController mediaDataController, boolean z, ArrayList arrayList, int i, long j, boolean z2, ArrayList arrayList2, boolean z3) {
        this.f$0 = mediaDataController;
        this.f$3 = z;
        this.f$1 = arrayList;
        this.f$6 = i;
        this.f$2 = j;
        this.f$4 = z2;
        this.f$7 = arrayList2;
        this.f$5 = z3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesStorage) this.f$0).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (CountDownLatch) this.f$7);
                break;
            default:
                ((MediaDataController) this.f$0).lambda$processLoadedFeaturedStickers$63(this.f$3, (ArrayList) this.f$1, this.f$6, this.f$2, this.f$4, (ArrayList) this.f$7, this.f$5);
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda188(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j, boolean z, boolean z2, boolean z3, int i, CountDownLatch countDownLatch) {
        this.f$0 = messagesStorage;
        this.f$1 = chatFullArr;
        this.f$2 = j;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$5 = z3;
        this.f$6 = i;
        this.f$7 = countDownLatch;
    }
}
