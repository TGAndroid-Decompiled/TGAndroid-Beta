package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a8 implements Runnable {
    public final int f17847a;
    public final MediaDataController f17848b;
    public final TLRPC.Document f17849c;

    public a8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f17847a = i10;
        this.f17848b = mediaDataController;
        this.f17849c = document;
    }

    @Override
    public final void run() {
        switch (this.f17847a) {
            case 0:
                this.f17848b.lambda$removeRecentGif$25(this.f17849c);
                return;
            default:
                this.f17848b.lambda$addRecentGif$26(this.f17849c);
                return;
        }
    }
}
