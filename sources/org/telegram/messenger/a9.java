package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f15880a = 0;
    public final long f15881b;
    public final boolean f15882c;
    public final boolean d;
    public final boolean e;
    public final int f15883f;
    public final BaseController h;
    public final Object f15884n;
    public final Object f15885r;

    public a9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f15882c = z10;
        this.f15884n = arrayList;
        this.f15883f = i10;
        this.f15881b = j3;
        this.d = z11;
        this.f15885r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f15880a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f15882c, (ArrayList) this.f15884n, this.f15883f, this.f15881b, this.d, (ArrayList) this.f15885r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f15884n, this.f15881b, this.f15882c, this.d, this.e, this.f15883f, (CountDownLatch) this.f15885r);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f15884n = chatFullArr;
        this.f15881b = j3;
        this.f15882c = z10;
        this.d = z11;
        this.e = z12;
        this.f15883f = i10;
        this.f15885r = countDownLatch;
    }
}
