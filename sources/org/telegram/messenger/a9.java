package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f15871a = 0;
    public final long f15872b;
    public final boolean f15873c;
    public final boolean d;
    public final boolean e;
    public final int f15874f;
    public final BaseController h;
    public final Object f15875n;
    public final Object f15876r;

    public a9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f15873c = z10;
        this.f15875n = arrayList;
        this.f15874f = i10;
        this.f15872b = j3;
        this.d = z11;
        this.f15876r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f15871a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f15873c, (ArrayList) this.f15875n, this.f15874f, this.f15872b, this.d, (ArrayList) this.f15876r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f15875n, this.f15872b, this.f15873c, this.d, this.e, this.f15874f, (CountDownLatch) this.f15876r);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f15875n = chatFullArr;
        this.f15872b = j3;
        this.f15873c = z10;
        this.d = z11;
        this.e = z12;
        this.f15874f = i10;
        this.f15876r = countDownLatch;
    }
}
