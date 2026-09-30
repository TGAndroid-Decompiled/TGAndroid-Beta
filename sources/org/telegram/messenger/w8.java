package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f18014a = 0;
    public final long f18015b;
    public final boolean f18016c;
    public final boolean d;
    public final boolean e;
    public final int f18017f;
    public final BaseController h;
    public final Object f18018n;
    public final Object f18019r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f18016c = z10;
        this.f18018n = arrayList;
        this.f18017f = i10;
        this.f18015b = j3;
        this.d = z11;
        this.f18019r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f18014a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f18016c, (ArrayList) this.f18018n, this.f18017f, this.f18015b, this.d, (ArrayList) this.f18019r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f18018n, this.f18015b, this.f18016c, this.d, this.e, this.f18017f, (CountDownLatch) this.f18019r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f18018n = chatFullArr;
        this.f18015b = j3;
        this.f18016c = z10;
        this.d = z11;
        this.e = z12;
        this.f18017f = i10;
        this.f18019r = countDownLatch;
    }
}
