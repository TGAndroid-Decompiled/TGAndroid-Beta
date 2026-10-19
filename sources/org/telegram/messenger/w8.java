package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19968a = 0;
    public final long f19969b;
    public final boolean f19970c;
    public final boolean d;
    public final boolean e;
    public final int f19971f;
    public final BaseController h;
    public final Object f19972n;
    public final Object f19973r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19970c = z10;
        this.f19972n = arrayList;
        this.f19971f = i10;
        this.f19969b = j10;
        this.d = z11;
        this.f19973r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19968a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19970c, (ArrayList) this.f19972n, this.f19971f, this.f19969b, this.d, (ArrayList) this.f19973r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19972n, this.f19969b, this.f19970c, this.d, this.e, this.f19971f, (CountDownLatch) this.f19973r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19972n = chatFullArr;
        this.f19969b = j10;
        this.f19970c = z10;
        this.d = z11;
        this.e = z12;
        this.f19971f = i10;
        this.f19973r = countDownLatch;
    }
}
