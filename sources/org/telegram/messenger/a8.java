package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a8 implements Runnable {
    public final int f17051a;
    public final MediaDataController f17052b;
    public final TLRPC.Document f17053c;

    public a8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f17051a = i10;
        this.f17052b = mediaDataController;
        this.f17053c = document;
    }

    @Override
    public final void run() {
        switch (this.f17051a) {
            case 0:
                this.f17052b.lambda$removeRecentGif$25(this.f17053c);
                return;
            default:
                this.f17052b.lambda$addRecentGif$26(this.f17053c);
                return;
        }
    }
}
