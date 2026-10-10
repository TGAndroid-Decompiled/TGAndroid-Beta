package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f19779a;
    public final MediaDataController f19780b;
    public final TLRPC.Document f19781c;

    public x7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f19779a = i10;
        this.f19780b = mediaDataController;
        this.f19781c = document;
    }

    @Override
    public final void run() {
        switch (this.f19779a) {
            case 0:
                this.f19780b.lambda$removeRecentGif$25(this.f19781c);
                return;
            default:
                this.f19780b.lambda$addRecentGif$26(this.f19781c);
                return;
        }
    }
}
