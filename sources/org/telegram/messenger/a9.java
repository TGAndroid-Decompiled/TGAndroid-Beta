package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f17137a = 0;
    public final long f17138b;
    public final boolean f17139c;
    public final boolean d;
    public final boolean f17140e;
    public final int f17141f;
    public final BaseController h;
    public final Object f17142n;
    public final Object f17143r;

    public a9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f17139c = z10;
        this.f17142n = arrayList;
        this.f17141f = i10;
        this.f17138b = j3;
        this.d = z11;
        this.f17143r = arrayList2;
        this.f17140e = z12;
    }

    @Override
    public final void run() {
        switch (this.f17137a) {
            case 0:
                boolean z10 = this.f17140e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f17139c, (ArrayList) this.f17142n, this.f17141f, this.f17138b, this.d, (ArrayList) this.f17143r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f17142n, this.f17138b, this.f17139c, this.d, this.f17140e, this.f17141f, (CountDownLatch) this.f17143r);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f17142n = chatFullArr;
        this.f17138b = j3;
        this.f17139c = z10;
        this.d = z11;
        this.f17140e = z12;
        this.f17141f = i10;
        this.f17143r = countDownLatch;
    }
}
