package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f15886a = 0;
    public final long f15887b;
    public final boolean f15888c;
    public final boolean d;
    public final boolean e;
    public final int f15889f;
    public final BaseController h;
    public final Object f15890n;
    public final Object f15891r;

    public a9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f15888c = z10;
        this.f15890n = arrayList;
        this.f15889f = i10;
        this.f15887b = j3;
        this.d = z11;
        this.f15891r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f15886a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f15888c, (ArrayList) this.f15890n, this.f15889f, this.f15887b, this.d, (ArrayList) this.f15891r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f15890n, this.f15887b, this.f15888c, this.d, this.e, this.f15889f, (CountDownLatch) this.f15891r);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f15890n = chatFullArr;
        this.f15887b = j3;
        this.f15888c = z10;
        this.d = z11;
        this.e = z12;
        this.f15889f = i10;
        this.f15891r = countDownLatch;
    }
}
