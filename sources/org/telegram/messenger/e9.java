package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final int f18554a = 0;
    public final long f18555b;
    public final boolean f18556c;
    public final boolean d;
    public final boolean f18557e;
    public final int f18558f;
    public final BaseController h;
    public final Object f18559n;
    public final Object f18560r;

    public e9(MediaDataController mediaDataController, boolean z4, ArrayList arrayList, int i10, long j10, boolean z10, ArrayList arrayList2, boolean z11) {
        this.h = mediaDataController;
        this.f18556c = z4;
        this.f18559n = arrayList;
        this.f18558f = i10;
        this.f18555b = j10;
        this.d = z10;
        this.f18560r = arrayList2;
        this.f18557e = z11;
    }

    @Override
    public final void run() {
        switch (this.f18554a) {
            case 0:
                boolean z4 = this.f18557e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f18556c, (ArrayList) this.f18559n, this.f18558f, this.f18555b, this.d, (ArrayList) this.f18560r, z4);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f18559n, this.f18555b, this.f18556c, this.d, this.f18557e, this.f18558f, (CountDownLatch) this.f18560r);
                return;
        }
    }

    public e9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z4, boolean z10, boolean z11, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f18559n = chatFullArr;
        this.f18555b = j10;
        this.f18556c = z4;
        this.d = z10;
        this.f18557e = z11;
        this.f18558f = i10;
        this.f18560r = countDownLatch;
    }
}
