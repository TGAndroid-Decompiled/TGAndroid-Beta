package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c8 implements Runnable {
    public final int f18026a;
    public final MediaDataController f18027b;
    public final TLRPC.Document f18028c;

    public c8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18026a = i10;
        this.f18027b = mediaDataController;
        this.f18028c = document;
    }

    @Override
    public final void run() {
        switch (this.f18026a) {
            case 0:
                this.f18027b.lambda$removeRecentGif$25(this.f18028c);
                return;
            default:
                this.f18027b.lambda$addRecentGif$26(this.f18028c);
                return;
        }
    }
}
