package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f17917a = 0;
    public final long f17918b;
    public final boolean f17919c;
    public final boolean d;
    public final boolean e;
    public final int f17920f;
    public final BaseController h;
    public final Object f17921n;
    public final Object f17922r;

    public a9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f17919c = z10;
        this.f17921n = arrayList;
        this.f17920f = i10;
        this.f17918b = j10;
        this.d = z11;
        this.f17922r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f17917a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f17919c, (ArrayList) this.f17921n, this.f17920f, this.f17918b, this.d, (ArrayList) this.f17922r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f17921n, this.f17918b, this.f17919c, this.d, this.e, this.f17920f, (CountDownLatch) this.f17922r);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f17921n = chatFullArr;
        this.f17918b = j10;
        this.f17919c = z10;
        this.d = z11;
        this.e = z12;
        this.f17920f = i10;
        this.f17922r = countDownLatch;
    }
}
