package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class d9 implements Runnable {
    public final int f19889a = 0;
    public final long f19890b;
    public final boolean f19891c;
    public final boolean d;
    public final boolean e;
    public final int f19892f;
    public final BaseController h;
    public final Object f19893n;
    public final Object f19894r;

    public d9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19891c = z10;
        this.f19893n = arrayList;
        this.f19892f = i10;
        this.f19890b = j10;
        this.d = z11;
        this.f19894r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19889a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19891c, (ArrayList) this.f19893n, this.f19892f, this.f19890b, this.d, (ArrayList) this.f19894r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$148((TLRPC.ChatFull[]) this.f19893n, this.f19890b, this.f19891c, this.d, this.e, this.f19892f, (CountDownLatch) this.f19894r);
                return;
        }
    }

    public d9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19893n = chatFullArr;
        this.f19890b = j10;
        this.f19891c = z10;
        this.d = z11;
        this.e = z12;
        this.f19892f = i10;
        this.f19894r = countDownLatch;
    }
}
