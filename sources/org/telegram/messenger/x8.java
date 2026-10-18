package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f20053a = 0;
    public final long f20054b;
    public final boolean f20055c;
    public final boolean d;
    public final boolean e;
    public final int f20056f;
    public final BaseController h;
    public final Object f20057n;
    public final Object f20058r;

    public x8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f20055c = z10;
        this.f20057n = arrayList;
        this.f20056f = i10;
        this.f20054b = j10;
        this.d = z11;
        this.f20058r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f20053a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f20055c, (ArrayList) this.f20057n, this.f20056f, this.f20054b, this.d, (ArrayList) this.f20058r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f20057n, this.f20054b, this.f20055c, this.d, this.e, this.f20056f, (CountDownLatch) this.f20058r);
                return;
        }
    }

    public x8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f20057n = chatFullArr;
        this.f20054b = j10;
        this.f20055c = z10;
        this.d = z11;
        this.e = z12;
        this.f20056f = i10;
        this.f20058r = countDownLatch;
    }
}
