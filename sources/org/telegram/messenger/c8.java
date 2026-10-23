package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c8 implements Runnable {
    public final int f18089a;
    public final MediaDataController f18090b;
    public final TLRPC.Document f18091c;

    public c8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18089a = i10;
        this.f18090b = mediaDataController;
        this.f18091c = document;
    }

    @Override
    public final void run() {
        switch (this.f18089a) {
            case 0:
                this.f18090b.lambda$removeRecentGif$25(this.f18091c);
                return;
            default:
                this.f18090b.lambda$addRecentGif$26(this.f18091c);
                return;
        }
    }
}
