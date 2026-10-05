package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19670a = 0;
    public final long f19671b;
    public final boolean f19672c;
    public final boolean d;
    public final boolean f19673e;
    public final int f19674f;
    public final BaseController h;
    public final Object f19675n;
    public final Object f19676r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19672c = z10;
        this.f19675n = arrayList;
        this.f19674f = i10;
        this.f19671b = j3;
        this.d = z11;
        this.f19676r = arrayList2;
        this.f19673e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19670a) {
            case 0:
                boolean z10 = this.f19673e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19672c, (ArrayList) this.f19675n, this.f19674f, this.f19671b, this.d, (ArrayList) this.f19676r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19675n, this.f19671b, this.f19672c, this.d, this.f19673e, this.f19674f, (CountDownLatch) this.f19676r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19675n = chatFullArr;
        this.f19671b = j3;
        this.f19672c = z10;
        this.d = z11;
        this.f19673e = z12;
        this.f19674f = i10;
        this.f19676r = countDownLatch;
    }
}
