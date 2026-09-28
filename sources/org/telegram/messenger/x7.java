package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f18104a;
    public final MediaDataController f18105b;
    public final TLRPC.Document f18106c;

    public x7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18104a = i10;
        this.f18105b = mediaDataController;
        this.f18106c = document;
    }

    @Override
    public final void run() {
        switch (this.f18104a) {
            case 0:
                this.f18105b.lambda$removeRecentGif$25(this.f18106c);
                return;
            default:
                this.f18105b.lambda$addRecentGif$26(this.f18106c);
                return;
        }
    }
}
