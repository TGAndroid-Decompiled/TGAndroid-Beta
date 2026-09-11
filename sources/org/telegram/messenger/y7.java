package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y7 implements Runnable {
    public final int f19714a;
    public final MediaDataController f19715b;
    public final TLRPC.Document f19716c;

    public y7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f19714a = i10;
        this.f19715b = mediaDataController;
        this.f19716c = document;
    }

    @Override
    public final void run() {
        switch (this.f19714a) {
            case 0:
                this.f19715b.lambda$removeRecentGif$25(this.f19716c);
                return;
            default:
                this.f19715b.lambda$addRecentGif$26(this.f19716c);
                return;
        }
    }
}
