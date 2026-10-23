package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f17854a = 0;
    public final long f17855b;
    public final boolean f17856c;
    public final boolean d;
    public final boolean e;
    public final int f17857f;
    public final BaseController h;
    public final Object f17858n;
    public final Object f17859r;

    public a9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f17856c = z10;
        this.f17858n = arrayList;
        this.f17857f = i10;
        this.f17855b = j10;
        this.d = z11;
        this.f17859r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f17854a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f17856c, (ArrayList) this.f17858n, this.f17857f, this.f17855b, this.d, (ArrayList) this.f17859r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f17858n, this.f17855b, this.f17856c, this.d, this.e, this.f17857f, (CountDownLatch) this.f17859r);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f17858n = chatFullArr;
        this.f17855b = j10;
        this.f17856c = z10;
        this.d = z11;
        this.e = z12;
        this.f17857f = i10;
        this.f17859r = countDownLatch;
    }
}
