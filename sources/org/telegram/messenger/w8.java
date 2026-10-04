package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19676a = 0;
    public final long f19677b;
    public final boolean f19678c;
    public final boolean d;
    public final boolean f19679e;
    public final int f19680f;
    public final BaseController h;
    public final Object f19681n;
    public final Object f19682r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19678c = z10;
        this.f19681n = arrayList;
        this.f19680f = i10;
        this.f19677b = j3;
        this.d = z11;
        this.f19682r = arrayList2;
        this.f19679e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19676a) {
            case 0:
                boolean z10 = this.f19679e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19678c, (ArrayList) this.f19681n, this.f19680f, this.f19677b, this.d, (ArrayList) this.f19682r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19681n, this.f19677b, this.f19678c, this.d, this.f19679e, this.f19680f, (CountDownLatch) this.f19682r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19681n = chatFullArr;
        this.f19677b = j3;
        this.f19678c = z10;
        this.d = z11;
        this.f19679e = z12;
        this.f19680f = i10;
        this.f19682r = countDownLatch;
    }
}
