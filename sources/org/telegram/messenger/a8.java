package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a8 implements Runnable {
    public final int f16754a;
    public final MediaDataController f16755b;
    public final TLRPC.Document f16756c;

    public a8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f16754a = i10;
        this.f16755b = mediaDataController;
        this.f16756c = document;
    }

    @Override
    public final void run() {
        switch (this.f16754a) {
            case 0:
                this.f16755b.lambda$removeRecentGif$25(this.f16756c);
                return;
            default:
                this.f16755b.lambda$addRecentGif$26(this.f16756c);
                return;
        }
    }
}
