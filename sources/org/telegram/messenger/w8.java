package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f18029a = 0;
    public final long f18030b;
    public final boolean f18031c;
    public final boolean d;
    public final boolean e;
    public final int f18032f;
    public final BaseController h;
    public final Object f18033n;
    public final Object f18034r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f18031c = z10;
        this.f18033n = arrayList;
        this.f18032f = i10;
        this.f18030b = j3;
        this.d = z11;
        this.f18034r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f18029a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f18031c, (ArrayList) this.f18033n, this.f18032f, this.f18030b, this.d, (ArrayList) this.f18034r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f18033n, this.f18030b, this.f18031c, this.d, this.e, this.f18032f, (CountDownLatch) this.f18034r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f18033n = chatFullArr;
        this.f18030b = j3;
        this.f18031c = z10;
        this.d = z11;
        this.e = z12;
        this.f18032f = i10;
        this.f18034r = countDownLatch;
    }
}
