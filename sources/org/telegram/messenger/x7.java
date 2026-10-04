package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f19778a;
    public final MediaDataController f19779b;
    public final TLRPC.Document f19780c;

    public x7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f19778a = i10;
        this.f19779b = mediaDataController;
        this.f19780c = document;
    }

    @Override
    public final void run() {
        switch (this.f19778a) {
            case 0:
                this.f19779b.lambda$removeRecentGif$25(this.f19780c);
                return;
            default:
                this.f19779b.lambda$addRecentGif$26(this.f19780c);
                return;
        }
    }
}
