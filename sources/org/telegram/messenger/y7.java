package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y7 implements Runnable {
    public final int f20125a;
    public final MediaDataController f20126b;
    public final TLRPC.Document f20127c;

    public y7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f20125a = i10;
        this.f20126b = mediaDataController;
        this.f20127c = document;
    }

    @Override
    public final void run() {
        switch (this.f20125a) {
            case 0:
                this.f20126b.lambda$removeRecentGif$25(this.f20127c);
                return;
            default:
                this.f20126b.lambda$addRecentGif$26(this.f20127c);
                return;
        }
    }
}
