package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d8 implements Runnable {
    public final int f18211a;
    public final MediaDataController f18212b;
    public final TLRPC.Document f18213c;

    public d8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18211a = i10;
        this.f18212b = mediaDataController;
        this.f18213c = document;
    }

    @Override
    public final void run() {
        switch (this.f18211a) {
            case 0:
                this.f18212b.lambda$removeRecentGif$25(this.f18213c);
                return;
            default:
                this.f18212b.lambda$addRecentGif$26(this.f18213c);
                return;
        }
    }
}
