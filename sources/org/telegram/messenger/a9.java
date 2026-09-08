package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f17164a = 0;
    public final long f17165b;
    public final boolean f17166c;
    public final boolean d;
    public final boolean f17167e;
    public final int f17168f;
    public final BaseController h;
    public final Object f17169n;
    public final Object f17170r;

    public a9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f17166c = z10;
        this.f17169n = arrayList;
        this.f17168f = i10;
        this.f17165b = j3;
        this.d = z11;
        this.f17170r = arrayList2;
        this.f17167e = z12;
    }

    @Override
    public final void run() {
        switch (this.f17164a) {
            case 0:
                boolean z10 = this.f17167e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f17166c, (ArrayList) this.f17169n, this.f17168f, this.f17165b, this.d, (ArrayList) this.f17170r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f17169n, this.f17165b, this.f17166c, this.d, this.f17167e, this.f17168f, (CountDownLatch) this.f17170r);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f17169n = chatFullArr;
        this.f17165b = j3;
        this.f17166c = z10;
        this.d = z11;
        this.f17167e = z12;
        this.f17168f = i10;
        this.f17170r = countDownLatch;
    }
}
