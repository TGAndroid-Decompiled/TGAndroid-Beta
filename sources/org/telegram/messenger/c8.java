package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c8 implements Runnable {
    public final int f16918a;
    public final MediaDataController f16919b;
    public final TLRPC.Document f16920c;

    public c8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f16918a = i10;
        this.f16919b = mediaDataController;
        this.f16920c = document;
    }

    @Override
    public final void run() {
        switch (this.f16918a) {
            case 0:
                this.f16919b.lambda$removeRecentGif$25(this.f16920c);
                return;
            default:
                this.f16919b.lambda$addRecentGif$26(this.f16920c);
                return;
        }
    }
}
