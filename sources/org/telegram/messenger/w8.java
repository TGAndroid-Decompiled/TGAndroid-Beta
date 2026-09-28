package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f18012a = 0;
    public final long f18013b;
    public final boolean f18014c;
    public final boolean d;
    public final boolean e;
    public final int f18015f;
    public final BaseController h;
    public final Object f18016n;
    public final Object f18017r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f18014c = z10;
        this.f18016n = arrayList;
        this.f18015f = i10;
        this.f18013b = j3;
        this.d = z11;
        this.f18017r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f18012a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f18014c, (ArrayList) this.f18016n, this.f18015f, this.f18013b, this.d, (ArrayList) this.f18017r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f18016n, this.f18013b, this.f18014c, this.d, this.e, this.f18015f, (CountDownLatch) this.f18017r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f18016n = chatFullArr;
        this.f18013b = j3;
        this.f18014c = z10;
        this.d = z11;
        this.e = z12;
        this.f18015f = i10;
        this.f18017r = countDownLatch;
    }
}
