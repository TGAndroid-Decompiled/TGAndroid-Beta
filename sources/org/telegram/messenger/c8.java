package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c8 implements Runnable {
    public final int f18340a;
    public final MediaDataController f18341b;
    public final TLRPC.Document f18342c;

    public c8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18340a = i10;
        this.f18341b = mediaDataController;
        this.f18342c = document;
    }

    @Override
    public final void run() {
        switch (this.f18340a) {
            case 0:
                this.f18341b.lambda$removeRecentGif$25(this.f18342c);
                return;
            default:
                this.f18341b.lambda$addRecentGif$26(this.f18342c);
                return;
        }
    }
}
