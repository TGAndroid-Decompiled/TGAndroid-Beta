package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f19775a;
    public final MediaDataController f19776b;
    public final TLRPC.Document f19777c;

    public x7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f19775a = i10;
        this.f19776b = mediaDataController;
        this.f19777c = document;
    }

    @Override
    public final void run() {
        switch (this.f19775a) {
            case 0:
                this.f19776b.lambda$removeRecentGif$25(this.f19777c);
                return;
            default:
                this.f19776b.lambda$addRecentGif$26(this.f19777c);
                return;
        }
    }
}
