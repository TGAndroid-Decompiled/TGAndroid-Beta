package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final int f17115a = 0;
    public final long f17116b;
    public final boolean f17117c;
    public final boolean d;
    public final boolean e;
    public final int f17118f;
    public final BaseController h;
    public final Object f17119n;
    public final Object f17120r;

    public e9(MediaDataController mediaDataController, boolean z4, ArrayList arrayList, int i10, long j10, boolean z10, ArrayList arrayList2, boolean z11) {
        this.h = mediaDataController;
        this.f17117c = z4;
        this.f17119n = arrayList;
        this.f17118f = i10;
        this.f17116b = j10;
        this.d = z10;
        this.f17120r = arrayList2;
        this.e = z11;
    }

    @Override
    public final void run() {
        switch (this.f17115a) {
            case 0:
                boolean z4 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f17117c, (ArrayList) this.f17119n, this.f17118f, this.f17116b, this.d, (ArrayList) this.f17120r, z4);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f17119n, this.f17116b, this.f17117c, this.d, this.e, this.f17118f, (CountDownLatch) this.f17120r);
                return;
        }
    }

    public e9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z4, boolean z10, boolean z11, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f17119n = chatFullArr;
        this.f17116b = j10;
        this.f17117c = z4;
        this.d = z10;
        this.e = z11;
        this.f17118f = i10;
        this.f17120r = countDownLatch;
    }
}
