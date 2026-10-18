package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19974a = 0;
    public final long f19975b;
    public final boolean f19976c;
    public final boolean d;
    public final boolean e;
    public final int f19977f;
    public final BaseController h;
    public final Object f19978n;
    public final Object f19979r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19976c = z10;
        this.f19978n = arrayList;
        this.f19977f = i10;
        this.f19975b = j10;
        this.d = z11;
        this.f19979r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19974a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19976c, (ArrayList) this.f19978n, this.f19977f, this.f19975b, this.d, (ArrayList) this.f19979r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19978n, this.f19975b, this.f19976c, this.d, this.e, this.f19977f, (CountDownLatch) this.f19979r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19978n = chatFullArr;
        this.f19975b = j10;
        this.f19976c = z10;
        this.d = z11;
        this.e = z12;
        this.f19977f = i10;
        this.f19979r = countDownLatch;
    }
}
