package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final int f18556a = 0;
    public final long f18557b;
    public final boolean f18558c;
    public final boolean d;
    public final boolean f18559e;
    public final int f18560f;
    public final BaseController h;
    public final Object f18561n;
    public final Object f18562r;

    public e9(MediaDataController mediaDataController, boolean z4, ArrayList arrayList, int i10, long j10, boolean z10, ArrayList arrayList2, boolean z11) {
        this.h = mediaDataController;
        this.f18558c = z4;
        this.f18561n = arrayList;
        this.f18560f = i10;
        this.f18557b = j10;
        this.d = z10;
        this.f18562r = arrayList2;
        this.f18559e = z11;
    }

    @Override
    public final void run() {
        switch (this.f18556a) {
            case 0:
                boolean z4 = this.f18559e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f18558c, (ArrayList) this.f18561n, this.f18560f, this.f18557b, this.d, (ArrayList) this.f18562r, z4);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f18561n, this.f18557b, this.f18558c, this.d, this.f18559e, this.f18560f, (CountDownLatch) this.f18562r);
                return;
        }
    }

    public e9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z4, boolean z10, boolean z11, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f18561n = chatFullArr;
        this.f18557b = j10;
        this.f18558c = z4;
        this.d = z10;
        this.f18559e = z11;
        this.f18560f = i10;
        this.f18562r = countDownLatch;
    }
}
