package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19681a = 0;
    public final long f19682b;
    public final boolean f19683c;
    public final boolean d;
    public final boolean f19684e;
    public final int f19685f;
    public final BaseController h;
    public final Object f19686n;
    public final Object f19687r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19683c = z10;
        this.f19686n = arrayList;
        this.f19685f = i10;
        this.f19682b = j3;
        this.d = z11;
        this.f19687r = arrayList2;
        this.f19684e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19681a) {
            case 0:
                boolean z10 = this.f19684e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19683c, (ArrayList) this.f19686n, this.f19685f, this.f19682b, this.d, (ArrayList) this.f19687r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19686n, this.f19682b, this.f19683c, this.d, this.f19684e, this.f19685f, (CountDownLatch) this.f19687r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19686n = chatFullArr;
        this.f19682b = j3;
        this.f19683c = z10;
        this.d = z11;
        this.f19684e = z12;
        this.f19685f = i10;
        this.f19687r = countDownLatch;
    }
}
