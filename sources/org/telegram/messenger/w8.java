package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19710a = 0;
    public final long f19711b;
    public final boolean f19712c;
    public final boolean d;
    public final boolean f19713e;
    public final int f19714f;
    public final BaseController h;
    public final Object f19715n;
    public final Object f19716r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19712c = z10;
        this.f19715n = arrayList;
        this.f19714f = i10;
        this.f19711b = j3;
        this.d = z11;
        this.f19716r = arrayList2;
        this.f19713e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19710a) {
            case 0:
                boolean z10 = this.f19713e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19712c, (ArrayList) this.f19715n, this.f19714f, this.f19711b, this.d, (ArrayList) this.f19716r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19715n, this.f19711b, this.f19712c, this.d, this.f19713e, this.f19714f, (CountDownLatch) this.f19716r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19715n = chatFullArr;
        this.f19711b = j3;
        this.f19712c = z10;
        this.d = z11;
        this.f19713e = z12;
        this.f19714f = i10;
        this.f19716r = countDownLatch;
    }
}
