package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f15631a = 0;
    public final long f15632b;
    public final boolean f15633c;
    public final boolean d;
    public final boolean e;
    public final int f15634f;
    public final BaseController h;
    public final Object f15635n;
    public final Object f15636r;

    public a9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f15633c = z10;
        this.f15635n = arrayList;
        this.f15634f = i10;
        this.f15632b = j3;
        this.d = z11;
        this.f15636r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f15631a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f15633c, (ArrayList) this.f15635n, this.f15634f, this.f15632b, this.d, (ArrayList) this.f15636r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f15635n, this.f15632b, this.f15633c, this.d, this.e, this.f15634f, (CountDownLatch) this.f15636r);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f15635n = chatFullArr;
        this.f15632b = j3;
        this.f15633c = z10;
        this.d = z11;
        this.e = z12;
        this.f15634f = i10;
        this.f15636r = countDownLatch;
    }
}
