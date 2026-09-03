package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c8 implements Runnable {
    public final int f16903a;
    public final MediaDataController f16904b;
    public final TLRPC.Document f16905c;

    public c8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f16903a = i10;
        this.f16904b = mediaDataController;
        this.f16905c = document;
    }

    @Override
    public final void run() {
        switch (this.f16903a) {
            case 0:
                this.f16904b.lambda$removeRecentGif$25(this.f16905c);
                return;
            default:
                this.f16904b.lambda$addRecentGif$26(this.f16905c);
                return;
        }
    }
}
