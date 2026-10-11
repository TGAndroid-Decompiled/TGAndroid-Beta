package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f19808a;
    public final MediaDataController f19809b;
    public final TLRPC.Document f19810c;

    public x7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f19808a = i10;
        this.f19809b = mediaDataController;
        this.f19810c = document;
    }

    @Override
    public final void run() {
        switch (this.f19808a) {
            case 0:
                this.f19809b.lambda$removeRecentGif$25(this.f19810c);
                return;
            default:
                this.f19809b.lambda$addRecentGif$26(this.f19810c);
                return;
        }
    }
}
