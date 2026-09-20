package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f15875a = 0;
    public final long f15876b;
    public final boolean f15877c;
    public final boolean d;
    public final boolean e;
    public final int f15878f;
    public final BaseController h;
    public final Object f15879n;
    public final Object f15880r;

    public a9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f15877c = z10;
        this.f15879n = arrayList;
        this.f15878f = i10;
        this.f15876b = j3;
        this.d = z11;
        this.f15880r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f15875a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f15877c, (ArrayList) this.f15879n, this.f15878f, this.f15876b, this.d, (ArrayList) this.f15880r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f15879n, this.f15876b, this.f15877c, this.d, this.e, this.f15878f, (CountDownLatch) this.f15880r);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f15879n = chatFullArr;
        this.f15876b = j3;
        this.f15877c = z10;
        this.d = z11;
        this.e = z12;
        this.f15878f = i10;
        this.f15880r = countDownLatch;
    }
}
