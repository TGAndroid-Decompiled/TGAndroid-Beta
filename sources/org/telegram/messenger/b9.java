package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f17926a = 0;
    public final long f17927b;
    public final boolean f17928c;
    public final boolean d;
    public final boolean e;
    public final int f17929f;
    public final BaseController h;
    public final Object f17930n;
    public final Object f17931r;

    public b9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f17928c = z10;
        this.f17930n = arrayList;
        this.f17929f = i10;
        this.f17927b = j10;
        this.d = z11;
        this.f17931r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f17926a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f17928c, (ArrayList) this.f17930n, this.f17929f, this.f17927b, this.d, (ArrayList) this.f17931r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f17930n, this.f17927b, this.f17928c, this.d, this.e, this.f17929f, (CountDownLatch) this.f17931r);
                return;
        }
    }

    public b9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f17930n = chatFullArr;
        this.f17927b = j10;
        this.f17928c = z10;
        this.d = z11;
        this.e = z12;
        this.f17929f = i10;
        this.f17931r = countDownLatch;
    }
}
