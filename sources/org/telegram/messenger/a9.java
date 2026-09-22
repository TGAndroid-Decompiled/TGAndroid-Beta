package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f15890a = 0;
    public final long f15891b;
    public final boolean f15892c;
    public final boolean d;
    public final boolean e;
    public final int f15893f;
    public final BaseController h;
    public final Object f15894n;
    public final Object f15895r;

    public a9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f15892c = z10;
        this.f15894n = arrayList;
        this.f15893f = i10;
        this.f15891b = j3;
        this.d = z11;
        this.f15895r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f15890a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f15892c, (ArrayList) this.f15894n, this.f15893f, this.f15891b, this.d, (ArrayList) this.f15895r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f15894n, this.f15891b, this.f15892c, this.d, this.e, this.f15893f, (CountDownLatch) this.f15895r);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f15894n = chatFullArr;
        this.f15891b = j3;
        this.f15892c = z10;
        this.d = z11;
        this.e = z12;
        this.f15893f = i10;
        this.f15895r = countDownLatch;
    }
}
