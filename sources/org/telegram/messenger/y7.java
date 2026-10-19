package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y7 implements Runnable {
    public final int f20127a;
    public final MediaDataController f20128b;
    public final TLRPC.Document f20129c;

    public y7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f20127a = i10;
        this.f20128b = mediaDataController;
        this.f20129c = document;
    }

    @Override
    public final void run() {
        switch (this.f20127a) {
            case 0:
                this.f20128b.lambda$removeRecentGif$25(this.f20129c);
                return;
            default:
                this.f20128b.lambda$addRecentGif$26(this.f20129c);
                return;
        }
    }
}
