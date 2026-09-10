package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Runnable {
    public final int f15351a = 0;
    public final long f15352b;
    public final boolean f15353c;
    public final boolean d;
    public final boolean e;
    public final int f15354f;
    public final BaseController h;
    public final Object f15355n;
    public final Object f15356r;

    public h9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f15353c = z10;
        this.f15355n = arrayList;
        this.f15354f = i10;
        this.f15352b = j3;
        this.d = z11;
        this.f15356r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f15351a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f15353c, (ArrayList) this.f15355n, this.f15354f, this.f15352b, this.d, (ArrayList) this.f15356r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f15355n, this.f15352b, this.f15353c, this.d, this.e, this.f15354f, (CountDownLatch) this.f15356r);
                return;
        }
    }

    public h9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f15355n = chatFullArr;
        this.f15352b = j3;
        this.f15353c = z10;
        this.d = z11;
        this.e = z12;
        this.f15354f = i10;
        this.f15356r = countDownLatch;
    }
}
