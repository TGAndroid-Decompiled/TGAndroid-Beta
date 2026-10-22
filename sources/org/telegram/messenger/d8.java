package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d8 implements Runnable {
    public final int f18148a;
    public final MediaDataController f18149b;
    public final TLRPC.Document f18150c;

    public d8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18148a = i10;
        this.f18149b = mediaDataController;
        this.f18150c = document;
    }

    @Override
    public final void run() {
        switch (this.f18148a) {
            case 0:
                this.f18149b.lambda$removeRecentGif$25(this.f18150c);
                return;
            default:
                this.f18149b.lambda$addRecentGif$26(this.f18150c);
                return;
        }
    }
}
