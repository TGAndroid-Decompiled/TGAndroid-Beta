package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

public final class b9 implements Runnable {

    public final int f19780a = 0;

    public final long f19781b;

    public final boolean f19782c;
    public final boolean d;

    public final boolean f19783e;

    public final int f19784f;
    public final BaseController h;

    public final Object f19785n;

    public final Object f19786r;

    public b9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19782c = z10;
        this.f19785n = arrayList;
        this.f19784f = i10;
        this.f19781b = j10;
        this.d = z11;
        this.f19786r = arrayList2;
        this.f19783e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19780a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19782c, (ArrayList) this.f19785n, this.f19784f, this.f19781b, this.d, (ArrayList) this.f19786r, this.f19783e);
                break;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19785n, this.f19781b, this.f19782c, this.d, this.f19783e, this.f19784f, (CountDownLatch) this.f19786r);
                break;
        }
    }

    public b9(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19785n = chatFullArr;
        this.f19781b = j10;
        this.f19782c = z10;
        this.d = z11;
        this.f19783e = z12;
        this.f19784f = i10;
        this.f19786r = countDownLatch;
    }
}
