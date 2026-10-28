package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class f8 implements Runnable {
    public final int f20057a;
    public final MediaDataController f20058b;
    public final TLRPC.Document f20059c;

    public f8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f20057a = i10;
        this.f20058b = mediaDataController;
        this.f20059c = document;
    }

    @Override
    public final void run() {
        switch (this.f20057a) {
            case 0:
                this.f20058b.lambda$removeRecentGif$25(this.f20059c);
                return;
            default:
                this.f20058b.lambda$addRecentGif$26(this.f20059c);
                return;
        }
    }
}
