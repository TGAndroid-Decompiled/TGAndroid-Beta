package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y7 implements Runnable {
    public final int f20133a;
    public final MediaDataController f20134b;
    public final TLRPC.Document f20135c;

    public y7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f20133a = i10;
        this.f20134b = mediaDataController;
        this.f20135c = document;
    }

    @Override
    public final void run() {
        switch (this.f20133a) {
            case 0:
                this.f20134b.lambda$removeRecentGif$25(this.f20135c);
                return;
            default:
                this.f20134b.lambda$addRecentGif$26(this.f20135c);
                return;
        }
    }
}
