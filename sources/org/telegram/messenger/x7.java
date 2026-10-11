package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f19772a;
    public final MediaDataController f19773b;
    public final TLRPC.Document f19774c;

    public x7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f19772a = i10;
        this.f19773b = mediaDataController;
        this.f19774c = document;
    }

    @Override
    public final void run() {
        switch (this.f19772a) {
            case 0:
                this.f19773b.lambda$removeRecentGif$25(this.f19774c);
                return;
            default:
                this.f19773b.lambda$addRecentGif$26(this.f19774c);
                return;
        }
    }
}
