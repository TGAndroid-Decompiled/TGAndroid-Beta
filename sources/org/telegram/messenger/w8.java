package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19677a = 0;
    public final long f19678b;
    public final boolean f19679c;
    public final boolean d;
    public final boolean f19680e;
    public final int f19681f;
    public final BaseController h;
    public final Object f19682n;
    public final Object f19683r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19679c = z10;
        this.f19682n = arrayList;
        this.f19681f = i10;
        this.f19678b = j3;
        this.d = z11;
        this.f19683r = arrayList2;
        this.f19680e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19677a) {
            case 0:
                boolean z10 = this.f19680e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19679c, (ArrayList) this.f19682n, this.f19681f, this.f19678b, this.d, (ArrayList) this.f19683r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19682n, this.f19678b, this.f19679c, this.d, this.f19680e, this.f19681f, (CountDownLatch) this.f19683r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19682n = chatFullArr;
        this.f19678b = j3;
        this.f19679c = z10;
        this.d = z11;
        this.f19680e = z12;
        this.f19681f = i10;
        this.f19683r = countDownLatch;
    }
}
