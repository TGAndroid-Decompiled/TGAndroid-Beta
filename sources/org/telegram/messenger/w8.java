package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f18013a = 0;
    public final long f18014b;
    public final boolean f18015c;
    public final boolean d;
    public final boolean e;
    public final int f18016f;
    public final BaseController h;
    public final Object f18017n;
    public final Object f18018r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f18015c = z10;
        this.f18017n = arrayList;
        this.f18016f = i10;
        this.f18014b = j3;
        this.d = z11;
        this.f18018r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f18013a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f18015c, (ArrayList) this.f18017n, this.f18016f, this.f18014b, this.d, (ArrayList) this.f18018r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f18017n, this.f18014b, this.f18015c, this.d, this.e, this.f18016f, (CountDownLatch) this.f18018r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f18017n = chatFullArr;
        this.f18014b = j3;
        this.f18015c = z10;
        this.d = z11;
        this.e = z12;
        this.f18016f = i10;
        this.f18018r = countDownLatch;
    }
}
