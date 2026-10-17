package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19962a = 0;
    public final long f19963b;
    public final boolean f19964c;
    public final boolean d;
    public final boolean e;
    public final int f19965f;
    public final BaseController h;
    public final Object f19966n;
    public final Object f19967r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19964c = z10;
        this.f19966n = arrayList;
        this.f19965f = i10;
        this.f19963b = j10;
        this.d = z11;
        this.f19967r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19962a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19964c, (ArrayList) this.f19966n, this.f19965f, this.f19963b, this.d, (ArrayList) this.f19967r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19966n, this.f19963b, this.f19964c, this.d, this.e, this.f19965f, (CountDownLatch) this.f19967r);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19966n = chatFullArr;
        this.f19963b = j10;
        this.f19964c = z10;
        this.d = z11;
        this.e = z12;
        this.f19965f = i10;
        this.f19967r = countDownLatch;
    }
}
