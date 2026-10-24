package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f17989a = 0;
    public final long f17990b;
    public final boolean f17991c;
    public final boolean d;
    public final boolean e;
    public final int f17992f;
    public final BaseController h;
    public final Object f17993n;
    public final Object f17994r;

    public b9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f17991c = z10;
        this.f17993n = arrayList;
        this.f17992f = i10;
        this.f17990b = j10;
        this.d = z11;
        this.f17994r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f17989a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f17991c, (ArrayList) this.f17993n, this.f17992f, this.f17990b, this.d, (ArrayList) this.f17994r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f17993n, this.f17990b, this.f17991c, this.d, this.e, this.f17992f, (CountDownLatch) this.f17994r);
                return;
        }
    }

    public b9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f17993n = chatFullArr;
        this.f17990b = j10;
        this.f17991c = z10;
        this.d = z11;
        this.e = z12;
        this.f17992f = i10;
        this.f17994r = countDownLatch;
    }
}
