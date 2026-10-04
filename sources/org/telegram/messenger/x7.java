package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f19777a;
    public final MediaDataController f19778b;
    public final TLRPC.Document f19779c;

    public x7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f19777a = i10;
        this.f19778b = mediaDataController;
        this.f19779c = document;
    }

    @Override
    public final void run() {
        switch (this.f19777a) {
            case 0:
                this.f19778b.lambda$removeRecentGif$25(this.f19779c);
                return;
            default:
                this.f19778b.lambda$addRecentGif$26(this.f19779c);
                return;
        }
    }
}
