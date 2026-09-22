package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f15654a = 0;
    public final long f15655b;
    public final boolean f15656c;
    public final boolean d;
    public final boolean e;
    public final int f15657f;
    public final BaseController h;
    public final Object f15658n;
    public final Object f15659r;

    public a9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f15656c = z10;
        this.f15658n = arrayList;
        this.f15657f = i10;
        this.f15655b = j3;
        this.d = z11;
        this.f15659r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f15654a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f15656c, (ArrayList) this.f15658n, this.f15657f, this.f15655b, this.d, (ArrayList) this.f15659r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f15658n, this.f15655b, this.f15656c, this.d, this.e, this.f15657f, (CountDownLatch) this.f15659r);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f15658n = chatFullArr;
        this.f15655b = j3;
        this.f15656c = z10;
        this.d = z11;
        this.e = z12;
        this.f15657f = i10;
        this.f15659r = countDownLatch;
    }
}
