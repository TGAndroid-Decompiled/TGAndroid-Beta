package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g8 implements Runnable {
    public final int f15253a;
    public final MediaDataController f15254b;
    public final TLRPC.Document f15255c;

    public g8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f15253a = i10;
        this.f15254b = mediaDataController;
        this.f15255c = document;
    }

    @Override
    public final void run() {
        switch (this.f15253a) {
            case 0:
                this.f15254b.lambda$removeRecentGif$25(this.f15255c);
                return;
            default:
                this.f15254b.lambda$addRecentGif$26(this.f15255c);
                return;
        }
    }
}
