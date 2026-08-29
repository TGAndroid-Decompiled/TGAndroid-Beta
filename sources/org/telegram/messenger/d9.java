package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class d9 implements Runnable {
    public final int f20012a = 0;
    public final long f20013b;
    public final boolean f20014c;
    public final boolean d;
    public final boolean f20015e;
    public final int f20016f;
    public final BaseController h;
    public final Object f20017n;
    public final Object f20018r;

    public d9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f20014c = z10;
        this.f20017n = arrayList;
        this.f20016f = i10;
        this.f20013b = j10;
        this.d = z11;
        this.f20018r = arrayList2;
        this.f20015e = z12;
    }

    @Override
    public final void run() {
        switch (this.f20012a) {
            case 0:
                boolean z10 = this.f20015e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f20014c, (ArrayList) this.f20017n, this.f20016f, this.f20013b, this.d, (ArrayList) this.f20018r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f20017n, this.f20013b, this.f20014c, this.d, this.f20015e, this.f20016f, (CountDownLatch) this.f20018r);
                return;
        }
    }

    public d9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f20017n = chatFullArr;
        this.f20013b = j10;
        this.f20014c = z10;
        this.d = z11;
        this.f20015e = z12;
        this.f20016f = i10;
        this.f20018r = countDownLatch;
    }
}
