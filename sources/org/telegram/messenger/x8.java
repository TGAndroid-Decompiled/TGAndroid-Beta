package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f20056a = 0;
    public final long f20057b;
    public final boolean f20058c;
    public final boolean d;
    public final boolean e;
    public final int f20059f;
    public final BaseController h;
    public final Object f20060n;
    public final Object f20061r;

    public x8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f20058c = z10;
        this.f20060n = arrayList;
        this.f20059f = i10;
        this.f20057b = j10;
        this.d = z11;
        this.f20061r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f20056a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f20058c, (ArrayList) this.f20060n, this.f20059f, this.f20057b, this.d, (ArrayList) this.f20061r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f20060n, this.f20057b, this.f20058c, this.d, this.e, this.f20059f, (CountDownLatch) this.f20061r);
                return;
        }
    }

    public x8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f20060n = chatFullArr;
        this.f20057b = j10;
        this.f20058c = z10;
        this.d = z11;
        this.e = z12;
        this.f20059f = i10;
        this.f20061r = countDownLatch;
    }
}
