package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b8 implements Runnable {
    public final int f19786a;
    public final MediaDataController f19787b;
    public final TLRPC.Document f19788c;

    public b8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f19786a = i10;
        this.f19787b = mediaDataController;
        this.f19788c = document;
    }

    @Override
    public final void run() {
        switch (this.f19786a) {
            case 0:
                this.f19787b.lambda$removeRecentGif$25(this.f19788c);
                return;
            default:
                this.f19787b.lambda$addRecentGif$26(this.f19788c);
                return;
        }
    }
}
