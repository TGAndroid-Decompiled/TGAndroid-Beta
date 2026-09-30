package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f18120a;
    public final MediaDataController f18121b;
    public final TLRPC.Document f18122c;

    public x7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18120a = i10;
        this.f18121b = mediaDataController;
        this.f18122c = document;
    }

    @Override
    public final void run() {
        switch (this.f18120a) {
            case 0:
                this.f18121b.lambda$removeRecentGif$25(this.f18122c);
                return;
            default:
                this.f18121b.lambda$addRecentGif$26(this.f18122c);
                return;
        }
    }
}
