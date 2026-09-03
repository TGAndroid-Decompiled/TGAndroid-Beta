package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final int f17100a = 0;
    public final long f17101b;
    public final boolean f17102c;
    public final boolean d;
    public final boolean e;
    public final int f17103f;
    public final BaseController h;
    public final Object f17104n;
    public final Object f17105r;

    public e9(MediaDataController mediaDataController, boolean z4, ArrayList arrayList, int i10, long j10, boolean z10, ArrayList arrayList2, boolean z11) {
        this.h = mediaDataController;
        this.f17102c = z4;
        this.f17104n = arrayList;
        this.f17103f = i10;
        this.f17101b = j10;
        this.d = z10;
        this.f17105r = arrayList2;
        this.e = z11;
    }

    @Override
    public final void run() {
        switch (this.f17100a) {
            case 0:
                boolean z4 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f17102c, (ArrayList) this.f17104n, this.f17103f, this.f17101b, this.d, (ArrayList) this.f17105r, z4);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f17104n, this.f17101b, this.f17102c, this.d, this.e, this.f17103f, (CountDownLatch) this.f17105r);
                return;
        }
    }

    public e9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z4, boolean z10, boolean z11, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f17104n = chatFullArr;
        this.f17101b = j10;
        this.f17102c = z4;
        this.d = z10;
        this.e = z11;
        this.f17103f = i10;
        this.f17105r = countDownLatch;
    }
}
