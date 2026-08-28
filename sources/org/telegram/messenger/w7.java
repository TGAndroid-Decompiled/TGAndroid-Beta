package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class w7 implements Runnable {
    public final int f21998a;
    public final MediaDataController f21999b;
    public final TLRPC.Document f22000c;

    public w7(int i9, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f21998a = i9;
        this.f21999b = mediaDataController;
        this.f22000c = document;
    }

    @Override
    public final void run() {
        switch (this.f21998a) {
            case 0:
                this.f21999b.lambda$removeRecentGif$25(this.f22000c);
                return;
            default:
                this.f21999b.lambda$addRecentGif$26(this.f22000c);
                return;
        }
    }
}
