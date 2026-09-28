package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f18103a;
    public final MediaDataController f18104b;
    public final TLRPC.Document f18105c;

    public x7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18103a = i10;
        this.f18104b = mediaDataController;
        this.f18105c = document;
    }

    @Override
    public final void run() {
        switch (this.f18103a) {
            case 0:
                this.f18104b.lambda$removeRecentGif$25(this.f18105c);
                return;
            default:
                this.f18104b.lambda$addRecentGif$26(this.f18105c);
                return;
        }
    }
}
