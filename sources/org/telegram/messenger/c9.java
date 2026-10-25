package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class c9 implements Runnable {
    public final int f19767a = 0;
    public final long f19768b;
    public final boolean f19769c;
    public final boolean d;
    public final boolean e;
    public final int f19770f;
    public final BaseController h;
    public final Object f19771n;
    public final Object f19772r;

    public c9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19769c = z10;
        this.f19771n = arrayList;
        this.f19770f = i10;
        this.f19768b = j10;
        this.d = z11;
        this.f19772r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19767a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19769c, (ArrayList) this.f19771n, this.f19770f, this.f19768b, this.d, (ArrayList) this.f19772r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$147((TLRPC.ChatFull[]) this.f19771n, this.f19768b, this.f19769c, this.d, this.e, this.f19770f, (CountDownLatch) this.f19772r);
                return;
        }
    }

    public c9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19771n = chatFullArr;
        this.f19768b = j10;
        this.f19769c = z10;
        this.d = z11;
        this.e = z12;
        this.f19770f = i10;
        this.f19772r = countDownLatch;
    }
}
