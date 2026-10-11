package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19674a = 0;
    public final long f19675b;
    public final boolean f19676c;
    public final boolean d;
    public final boolean f19677e;
    public final int f19678f;
    public final BaseController h;
    public final Object f19679n;
    public final Object f19680r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19676c = z10;
        this.f19679n = arrayList;
        this.f19678f = i10;
        this.f19675b = j3;
        this.d = z11;
        this.f19680r = arrayList2;
        this.f19677e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19674a) {
            case 0:
                boolean z10 = this.f19677e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19676c, (ArrayList) this.f19679n, this.f19678f, this.f19675b, this.d, (ArrayList) this.f19680r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19679n, this.f19675b, this.f19676c, this.d, this.f19677e, this.f19678f, (CountDownLatch) this.f19680r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19679n = chatFullArr;
        this.f19675b = j3;
        this.f19676c = z10;
        this.d = z11;
        this.f19677e = z12;
        this.f19678f = i10;
        this.f19680r = countDownLatch;
    }
}
