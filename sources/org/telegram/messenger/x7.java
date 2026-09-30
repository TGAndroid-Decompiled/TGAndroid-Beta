package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f18105a;
    public final MediaDataController f18106b;
    public final TLRPC.Document f18107c;

    public x7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18105a = i10;
        this.f18106b = mediaDataController;
        this.f18107c = document;
    }

    @Override
    public final void run() {
        switch (this.f18105a) {
            case 0:
                this.f18106b.lambda$removeRecentGif$25(this.f18107c);
                return;
            default:
                this.f18106b.lambda$addRecentGif$26(this.f18107c);
                return;
        }
    }
}
