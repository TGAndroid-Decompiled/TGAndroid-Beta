package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a8 implements Runnable {
    public final int f16448a;
    public final MediaDataController f16449b;
    public final TLRPC.Document f16450c;

    public a8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f16448a = i10;
        this.f16449b = mediaDataController;
        this.f16450c = document;
    }

    @Override
    public final void run() {
        switch (this.f16448a) {
            case 0:
                this.f16449b.lambda$removeRecentGif$25(this.f16450c);
                return;
            default:
                this.f16449b.lambda$addRecentGif$26(this.f16450c);
                return;
        }
    }
}
