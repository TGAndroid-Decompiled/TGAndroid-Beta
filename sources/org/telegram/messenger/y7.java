package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y7 implements Runnable {
    public final int f19741a;
    public final MediaDataController f19742b;
    public final TLRPC.Document f19743c;

    public y7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f19741a = i10;
        this.f19742b = mediaDataController;
        this.f19743c = document;
    }

    @Override
    public final void run() {
        switch (this.f19741a) {
            case 0:
                this.f19742b.lambda$removeRecentGif$25(this.f19743c);
                return;
            default:
                this.f19742b.lambda$addRecentGif$26(this.f19743c);
                return;
        }
    }
}
