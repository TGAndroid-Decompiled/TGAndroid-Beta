package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a8 implements Runnable {
    public final int f17050a;
    public final MediaDataController f17051b;
    public final TLRPC.Document f17052c;

    public a8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f17050a = i10;
        this.f17051b = mediaDataController;
        this.f17052c = document;
    }

    @Override
    public final void run() {
        switch (this.f17050a) {
            case 0:
                this.f17051b.lambda$removeRecentGif$25(this.f17052c);
                return;
            default:
                this.f17051b.lambda$addRecentGif$26(this.f17052c);
                return;
        }
    }
}
