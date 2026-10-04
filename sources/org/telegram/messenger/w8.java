package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19665a = 0;
    public final long f19666b;
    public final boolean f19667c;
    public final boolean d;
    public final boolean f19668e;
    public final int f19669f;
    public final BaseController h;
    public final Object f19670n;
    public final Object f19671r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19667c = z10;
        this.f19670n = arrayList;
        this.f19669f = i10;
        this.f19666b = j3;
        this.d = z11;
        this.f19671r = arrayList2;
        this.f19668e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19665a) {
            case 0:
                boolean z10 = this.f19668e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19667c, (ArrayList) this.f19670n, this.f19669f, this.f19666b, this.d, (ArrayList) this.f19671r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19670n, this.f19666b, this.f19667c, this.d, this.f19668e, this.f19669f, (CountDownLatch) this.f19671r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19670n = chatFullArr;
        this.f19666b = j3;
        this.f19667c = z10;
        this.d = z11;
        this.f19668e = z12;
        this.f19669f = i10;
        this.f19671r = countDownLatch;
    }
}
