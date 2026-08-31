package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c8 implements Runnable {
    public final int f18338a;
    public final MediaDataController f18339b;
    public final TLRPC.Document f18340c;

    public c8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18338a = i10;
        this.f18339b = mediaDataController;
        this.f18340c = document;
    }

    @Override
    public final void run() {
        switch (this.f18338a) {
            case 0:
                this.f18339b.lambda$removeRecentGif$25(this.f18340c);
                return;
            default:
                this.f18339b.lambda$addRecentGif$26(this.f18340c);
                return;
        }
    }
}
