package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f15843a = 0;
    public final long f15844b;
    public final boolean f15845c;
    public final boolean d;
    public final boolean e;
    public final int f15846f;
    public final BaseController h;
    public final Object f15847n;
    public final Object f15848r;

    public a9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f15845c = z10;
        this.f15847n = arrayList;
        this.f15846f = i10;
        this.f15844b = j3;
        this.d = z11;
        this.f15848r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f15843a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f15845c, (ArrayList) this.f15847n, this.f15846f, this.f15844b, this.d, (ArrayList) this.f15848r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f15847n, this.f15844b, this.f15845c, this.d, this.e, this.f15846f, (CountDownLatch) this.f15848r);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f15847n = chatFullArr;
        this.f15844b = j3;
        this.f15845c = z10;
        this.d = z11;
        this.e = z12;
        this.f15846f = i10;
        this.f15848r = countDownLatch;
    }
}
