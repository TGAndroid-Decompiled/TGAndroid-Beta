package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f19770a;
    public final MediaDataController f19771b;
    public final TLRPC.Document f19772c;

    public x7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f19770a = i10;
        this.f19771b = mediaDataController;
        this.f19772c = document;
    }

    @Override
    public final void run() {
        switch (this.f19770a) {
            case 0:
                this.f19771b.lambda$removeRecentGif$25(this.f19772c);
                return;
            default:
                this.f19771b.lambda$addRecentGif$26(this.f19772c);
                return;
        }
    }
}
