package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f15667a = 0;
    public final long f15668b;
    public final boolean f15669c;
    public final boolean d;
    public final boolean e;
    public final int f15670f;
    public final BaseController h;
    public final Object f15671n;
    public final Object f15672r;

    public a9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f15669c = z10;
        this.f15671n = arrayList;
        this.f15670f = i10;
        this.f15668b = j3;
        this.d = z11;
        this.f15672r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f15667a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f15669c, (ArrayList) this.f15671n, this.f15670f, this.f15668b, this.d, (ArrayList) this.f15672r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f15671n, this.f15668b, this.f15669c, this.d, this.e, this.f15670f, (CountDownLatch) this.f15672r);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f15671n = chatFullArr;
        this.f15668b = j3;
        this.f15669c = z10;
        this.d = z11;
        this.e = z12;
        this.f15670f = i10;
        this.f15672r = countDownLatch;
    }
}
